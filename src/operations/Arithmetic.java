/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author admin
 */
public class Arithmetic {
    public Arithmetic() {
        this.first_number=10;
        this.second_number=5;
    }
     //data members
    private int first_number,second_number;
    //setters

    public void setFirst_number(int first_number) {
        this.first_number = first_number;
    }

    public void setSecond_number(int second_number) {
        this.second_number = second_number;
    }
    // getters
    public int getFirst_number() {
        return first_number;
    }

    public int getSecond_number() {
        return second_number;
    }
    //member functions
    public int sum (){
        return first_number + second_number;
    }
    public int difference () {
        return first_number - second_number;
        
    }
          
    }
    

