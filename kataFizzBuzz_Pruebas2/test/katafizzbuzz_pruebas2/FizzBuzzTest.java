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
     
}
