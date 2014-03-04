/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modle;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Corbin
 */
public class RandomNumber implements Serializable {
    private int number;
    Random rd = new Random();
    
    public int NewNumber(){
        number = rd.nextInt(10)+1;
        return number;        
    }
    
    public static void main(String[] args) {
        RandomNumber r = new RandomNumber();
        
        System.out.println(r.NewNumber());
    }
}
