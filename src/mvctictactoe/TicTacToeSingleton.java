/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvctictactoe;

import java.util.Random;

/**
 *
 * @author Benjamin Chinwe 2018. A singleton class.
 */
public class TicTacToeSingleton {

    private static TicTacToeSingleton singleton = null;
    private static int colorValue;

    /* A private Constructor prevents any other 
    * class from instantiating.
     */
    private TicTacToeSingleton() {
    }

    /* Static 'instance' method */
    public static int getInstance() {
        colorMethod();
        return colorValue;
    }

    /* Other methods protected by singleton-ness. This method 
    randomise the background color of the gameButton in the
    TicTacToeView class */
    protected static void colorMethod() {
        Random buttonColor = new Random();

        for (int i = 0; i < 10; i++) {
            colorValue = buttonColor.nextInt(250) + 1;
        }

    }
}
