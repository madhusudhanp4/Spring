import chess
import random
import time

# Material piece values
PIECE_VALUES = {
    chess.PAWN: 100,
    chess.KNIGHT: 320,
    chess.BISHOP: 330,
    chess.ROOK: 500,
    chess.QUEEN: 900,
    chess.KING: 20000
}

def evaluate_board(board: chess.Board) -> int:
    """Evaluates the board state relative to White (+ advantage) or Black (- advantage)."""
    if board.is_checkmate():
        return -99999 if board.turn == chess.WHITE else 99999
    if board.is_stalemate() or board.is_insufficient_material():
        return 0

    score = 0
    for square in chess.SQUARES:
        piece = board.piece_at(square)
        if piece:
            val = PIECE_VALUES.get(piece.piece_type, 0)
            score += val if piece.color == chess.WHITE else -val

    return score

def minimax(board: chess.Board, depth: int, alpha: float, beta: float, is_maximizing: bool) -> int:
    """Minimax search with Alpha-Beta pruning."""
    if depth == 0 or board.is_game_over():
        return evaluate_board(board)

    if is_maximizing:
        max_eval = -float('inf')
        for move in board.legal_moves:
            board.push(move)
            eval_score = minimax(board, depth - 1, alpha, beta, False)
            board.pop()
            max_eval = max(max_eval, eval_score)
            alpha = max(alpha, eval_score)
            if beta <= alpha:
                break
        return max_eval
    else:
        min_eval = float('inf')
        for move in board.legal_moves:
            board.push(move)
            eval_score = minimax(board, depth - 1, alpha, beta, True)
            board.pop()
            min_eval = min(min_eval, eval_score)
            beta = min(beta, eval_score)
            if beta <= alpha:
                break
        return min_eval

def get_best_computer_move(board: chess.Board, depth: int = 3) -> chess.Move:
    """Calculates the optimal move for Black using alpha-beta minimax."""
    best_move = None
    min_eval = float('inf')
    moves = list(board.legal_moves)
    random.shuffle(moves)

    for move in moves:
        board.push(move)
        eval_score = minimax(board, depth - 1, -float('inf'), float('inf'), True)
        board.pop()

        if eval_score < min_eval:
            min_eval = eval_score
            best_move = move

    return best_move

def print_board_pretty(board: chess.Board):
    """Outputs the board with rank and file labels."""
    print("\n    a b c d e f g h")
    print("  +-----------------+")
    lines = str(board).split("\n")
    for i, line in enumerate(lines):
        rank = 8 - i
        print(f"{rank} | {line} | {rank}")
    print("  +-----------------+")
    print("    a b c d e f g h\n")

def main():
    board = chess.Board()
    print("=== Welcome to Terminal Chess: Human (White) vs Computer (Black) ===")
    print("Moves can be entered using Standard UCI notation (e.g., 'e2e4', 'g1f3').")
    
    depth = 3  # Lookahead depth (increase for harder opponent)

    while not board.is_game_over():
        print_board_pretty(board)

        if board.turn == chess.WHITE:
            while True:
                user_input = input("Enter your move (e.g. e2e4) or 'q' to quit: ").strip().lower()
                if user_input == 'q':
                    print("Game aborted.")
                    return
                try:
                    move = chess.Move.from_uci(user_input)
                    if move in board.legal_moves:
                        board.push(move)
                        break
                    else:
                        print("Illegal move! Please try again.")
                except ValueError:
                    print("Invalid format. Use standard UCI notation like e2e4 or e7e8q.")
        else:
            print("Computer is thinking...")
            start_time = time.time()
            ai_move = get_best_computer_move(board, depth=depth)
            elapsed = time.time() - start_time
            print(f"Computer played: {ai_move.uci()} (in {elapsed:.2f}s)")
            board.push(ai_move)

    print_board_pretty(board)
    print("Game Over!")
    result = board.result()
    if result == "1-0":
        print("Congratulations! You won!")
    elif result == "0-1":
        print("Computer won!")
    else:
        print("Game ended in a draw!")

if __name__ == "__main__":
    main()
