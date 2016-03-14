/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac;

/**
 *
 * @author Ezzmoaz
 */
public class Player {
    private int xOrO;
    
    public  Player(int xo){
        switch(xo){
            default:
            case 0: this.xOrO = 0; break;
            case 1: this.xOrO = 1; break;
        }
    }
    
    public int getPlayerValue(){
        return this.xOrO;
    }
    
}
