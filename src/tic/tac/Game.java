
package tic.tac;

public class Game {
    
    private int gameBoard[][];  
    
    
    public Game(int numberOfrows, int numberOfColumns){
        this.gameBoard = new int[numberOfrows][numberOfColumns];
        for(int i = 0; i < numberOfrows; i++){
            for(int j = 0; j < numberOfColumns; j++){
                this.gameBoard[i][j] = 3;
            }
        }
    }
    
    
    public boolean CheckWhoWins(int col,int row,Player player){
        this.gameBoard[row][col] = player.getPlayerValue();
        
        int x=player.getPlayerValue();
        
            
           if(this.gameBoard[row+1][col]==x){
               if(this.gameBoard[row+2][col]==x)return true;
           }
           if(this.gameBoard[row-1][col]==x){
               if(this.gameBoard[row-2][col]==x)return true;
           }
           if(this.gameBoard[row][col+1]==x){
               if(this.gameBoard[row][col+2]==x)return true;
           }
           if(this.gameBoard[row][col-1]==x){
               if(this.gameBoard[row][col-2]==x)return true;
           }
           if(this.gameBoard[row+1][col+1]==x){
               if(this.gameBoard[row+2][col+2]==x)return true;
           }
           if(this.gameBoard[row-1][col-1]==x){
               if(this.gameBoard[row-2][col-2]==x)return true;
           }
           if(this.gameBoard[row+1][col-1]==x){
               if(this.gameBoard[row+2][col-2]==x)return true;
           }
           if(this.gameBoard[row-1][col+1]==x){
               if(this.gameBoard[row-2][col+2]==x)return true;
           }
           
           return false;

    }
        
        
    }