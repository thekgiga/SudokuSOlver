/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.solver;

import sudoku.solver.gui.Board;

/**
 *
 * @author Gordan
 */
public class SudokuSolver {

    Cell[][] game = new Cell[9][];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Board b = new Board();
        b.setVisible(true);
    }
    
}
