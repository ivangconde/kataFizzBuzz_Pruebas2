/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafizzbuzz_pruebas2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivan
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    @Test
    public void testGetFizzBuzzOneReturnsOne() {
        FizzBuzz fb= new FizzBuzz();
        String result=fb.getFizzBuzz(1);
        String expected="1";
        assertEquals(expected, result);       
    }
    
    @Test
    public void testGetFizzBuzzTwoReturnsTwo() {
        FizzBuzz fb= new FizzBuzz();
        String result=fb.getFizzBuzz(2);
        String expected="2";
        assertEquals(expected, result);       
    }
    
    @Test
    public void testGetFizzBuzzFizzReturnsFizz() {
        FizzBuzz fb= new FizzBuzz();
        String result=fb.getFizzBuzz(3);
        String expected="Fizz";
        assertEquals(expected, result);       
    }
    
    @Test
    public void testGetFizzBuzzFiveReturnsBuzz() {
        FizzBuzz fb= new FizzBuzz();
        String result=fb.getFizzBuzz(5);
        String expected="Buzz";
        assertEquals(expected, result);
    } 
    
    
    @Test
    public void testGetFizzBuzzThreeMultiplesReturnsFizz() {
        FizzBuzz fb= new FizzBuzz();
        String result=fb.getFizzBuzz(9);
        String expected="Fizz";
        assertEquals(expected, result);
    }
    
    
    @Test
    public void testGetFizzBuzzFiveMultiplesReturnsBuzz() {
        FizzBuzz fb= new FizzBuzz();
        String result=fb.getFizzBuzz(10);
        String expected="Buzz";
        assertEquals(expected, result);
    }
    

    @Test
    public void testGetFizzBuzzContains5and3ReturnsFizzBuzz() {
        FizzBuzz fb= new FizzBuzz();
        String result=fb.getFizzBuzz(532);
        String expected="FizzBuzz";
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetFizzBuzzContainsThreeReturnsFizz() {
        FizzBuzz fb= new FizzBuzz();
        String result=fb.getFizzBuzz(31);
        String expected="Fizz";
        assertEquals(expected, result);
    }   

    
    @Test
    public void testGetFizzBuzzIncludeFiveturnsBuzz() {
        FizzBuzz fb= new FizzBuzz();
        String result=fb.getFizzBuzz(50);
        String expected="Buzz";
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetFizzBuzzIncludeFivesreturnsBuzzBuzz() {
        FizzBuzz fb= new FizzBuzz();
        String result=fb.getFizzBuzz(55);
        String expected="BuzzBuzz";
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetIncludeMultiplesFizz() {
        FizzBuzz fb= new FizzBuzz();
        String result=fb.getFizzBuzz(313);
        String expected="FizzFizz";
        assertEquals(expected, result);
    }
}
