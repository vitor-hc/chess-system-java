/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardgame.Board;
import boardgame.Piece;

/**
 *
 * @author Vitor Hugo
 */
public class ChessPiece extends Piece {
    private Color color;

    public Color getColor() {
        return color;
    }

   

    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }
    
    
}
