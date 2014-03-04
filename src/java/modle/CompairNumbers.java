/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modle;

import java.io.Serializable;

/**
 *
 * @author Corbin
 */
public class CompairNumbers implements Serializable{
    RandomNumber random;
    private int number;
    private boolean match;
    private String winner = "Congrats you guessed right!!!";
    private String toHigh = "Sorry, to high. Try again.";
    private String toLow = "Sorry, to low. Try again.";
    private String msg;
    
    public String CompairNumbers(int guess){
        msg = "";
        if(number == guess){
        msg = winner;
        }else if(number<guess){
        msg = toHigh;
        }else if(number>guess){
         msg = toLow;   
        }
        return msg;
    }
    
    public int getRandomNumber(){
        random = new RandomNumber();
        number = random.NewNumber();
        return number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
    public static void main(String[] args) {
        CompairNumbers com = new CompairNumbers();
        
        com.getRandomNumber();
        
        System.out.println(com.CompairNumbers(4));
    }
}
