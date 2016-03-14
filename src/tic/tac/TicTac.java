
package tic.tac;

public class TicTac {

    public static void main(String[] args) {
        Player player1 = new Player(1);
        Player player2 = new Player(0);
        
        Game game = new Game(100,100);
        
        System.out.println(game.CheckWhoWins(4, 4, player2));
        System.out.println(game.CheckWhoWins(4, 5, player2));
        System.out.println(game.CheckWhoWins(4, 3, player2));
        
        
    }
    
}
