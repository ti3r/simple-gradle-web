/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blanco.test.gradle;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author asantana
 */
public class HelloTest {
 
    @Test
    public void testHelloWithName(){
        Hello hello = new Hello("alex");
        assertEquals(hello.hi(), "Hello alex");
    }
    
    public void testHelloWorld(){
        Hello hello = new Hello();
        assertEquals(hello.hi(), "Hello World");
    }
    
}
