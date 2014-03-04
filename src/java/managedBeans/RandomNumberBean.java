/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBeans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import modle.CompairNumbers;

/**
 *
 * @author Corbin
 */
@Named
@SessionScoped
public class RandomNumberBean implements Serializable{

    private int random;
    private String msg;
    private String guess;
    private int guessNum;
    @Inject
    private CompairNumbers compairNumbers;

    
    public RandomNumberBean() {
    }
    
    
    public String checkNumber(){
        guessNum = Integer.parseInt(guess);
        msg = compairNumbers.CompairNumbers(guessNum);
        return "index";
    }

    public String newGame(){
       random = compairNumbers.getRandomNumber(); 
       return "index";
    }
    
    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public int getGuessNum() {
        return guessNum;
    }

    public void setGuessNum(int guessNum) {
        this.guessNum = guessNum;
    }

    public CompairNumbers getCompairNumbers() {
        return compairNumbers;
    }

    public void setCompairNumbers(CompairNumbers compairNumbers) {
        this.compairNumbers = compairNumbers;
    }
    
    
}
