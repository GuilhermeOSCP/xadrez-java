package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		    placeNewPiece('a', 1, new Rook(board, Color.White));
	 //       placeNewPiece('b', 1, new Knight(board, Color.White));
     //        placeNewPiece('c', 1, new Bishop(board, Color.White));
	 //        placeNewPiece('d', 1, new Queen(board, Color.White));
	        placeNewPiece('e', 1, new King(board, Color.White));
	 //        placeNewPiece('f', 1, new Bishop(board, Color.White));
	 //        placeNewPiece('g', 1, new Knight(board, Color.White));
	        placeNewPiece('h', 1, new Rook(board, Color.White));
	 //        placeNewPiece('a', 2, new Pawn(board, Color.White, this));
	 //        placeNewPiece('b', 2, new Pawn(board, Color.White, this));
	 //        placeNewPiece('c', 2, new Pawn(board, Color.White, this));
	 //        placeNewPiece('d', 2, new Pawn(board, Color.White, this));
	 //        placeNewPiece('e', 2, new Pawn(board, Color.White, this));
	 //        placeNewPiece('f', 2, new Pawn(board, Color.White, this));
	 //        placeNewPiece('g', 2, new Pawn(board, Color.White, this));
	 //        placeNewPiece('h', 2, new Pawn(board, Color.White, this));

	        placeNewPiece('a', 8, new Rook(board, Color.Black));
	 //        placeNewPiece('b', 8, new Knight(board, Color.Black));
	 //        placeNewPiece('c', 8, new Bishop(board, Color.Black));
	 //        placeNewPiece('d', 8, new Queen(board, Color.Black));
	        placeNewPiece('e', 8, new King(board, Color.Black));
	 //         placeNewPiece('f', 8, new Bishop(board, Color.Black));
	 //         placeNewPiece('g', 8, new Knight(board, Color.Black));
	        placeNewPiece('h', 8, new Rook(board, Color.Black));
	 //         placeNewPiece('a', 7, new Pawn(board, Color.Black, this));
	 //         placeNewPiece('b', 7, new Pawn(board, Color.Black, this));
	 //         placeNewPiece('c', 7, new Pawn(board, Color.Black, this));
	 //         placeNewPiece('d', 7, new Pawn(board, Color.Black, this));
	 //         placeNewPiece('e', 7, new Pawn(board, Color.Black, this));
	 //         placeNewPiece('f', 7, new Pawn(board, Color.Black, this));
	 //         placeNewPiece('g', 7, new Pawn(board, Color.Black, this));
	 //         placeNewPiece('h', 7, new Pawn(board, Color.Black, this));
	}
}
