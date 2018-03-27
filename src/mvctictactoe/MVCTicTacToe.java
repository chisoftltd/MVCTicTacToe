/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctictactoe;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Benjamin Chinwe 2018. 
 * A project to implement TicTacToe 
 * game using MVC design, Observable/Observable, Singleton, Pair programming
 * och error handling.
 */
public class MVCTicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instantiate the View and Controller classes
        TicTacToeView theView = new TicTacToeView();
        TicTacToeController ticTacToeController = new TicTacToeController(theView);
        ticTacToeController.addObserver(theView); // Adding the Observer 
        // to the Observable

        // Setting up location of UI relative to the screen size
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - theView.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - theView.getHeight()) / 2);
        theView.setLocation(x, y);
        theView.setVisible(true); // Makes the view (UI) visiable 

    }

}
