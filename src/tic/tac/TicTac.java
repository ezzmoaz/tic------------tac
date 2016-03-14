
package tic.tac;

import java.io.Reader;
import java.util.Scanner;

public class TicTac {

    public static void main(String[] args) {
        Player player1 = new Player(0);
        Player player2 = new Player(1);
        
        Game game = new Game(6,7);
        
        Player current = player1;
        boolean someoneWins = false;
        while(!someoneWins){
            Scanner reader = new Scanner(System.in);
            System.out.println(current.getPlayerValue() + "Enter the row: ");
            int row = reader.nextInt();
            System.out.println(current.getPlayerValue() +"Enter the column: ");
            int column = reader.nextInt();
            
            someoneWins = game.CheckWhoWins(row, column, current); 
            
            switch(current.getPlayerValue()){
                case 0: current = player2; break;
                case 1: current = player1; break;
            }
            
        }
        System.out.println(current.getPlayerValue() + "lose");
        
        
    }
    
}
