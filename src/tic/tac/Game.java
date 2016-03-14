
package tic.tac;

public class Game {
    
    int gameBoard[][] = new int[6][7];  
    
    public boolean CheckWhoWins(int col,int row,Player player){
        
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