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

        String result=String.valueOf(n);
        if (result.indexOf("3")!=result.lastIndexOf("3")) result="FizzFizz";
        if (result.contains("3") && result.contains("5")) result="FizzBuzz";
        if (n%3==0 || result.contains("3")) result="Fizz";
        if (n%5==0 || result.contains("5")) result="Buzz";
        return result;
    }     
}
