/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author re
 */
public class ticTacToe {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            System.out.print("What's your age?\n: ");
            input = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ticTacToe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int age = Integer.parseInt(input);
        if (age > 0 && age < 100) {
            System.out.print("Your age in seconds is equal to ");
        }
        System.out.println("");
        
    }   
}