/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafizzbuzz_pruebas2;

/**
 *
 * @author ivan
 */
public class FizzBuzz {

    public String getFizzBuzz(int n) {
        String result;        
        if (n==3) result="Fizz";
        else result=String.valueOf(n);
        return result;
    }     
}
