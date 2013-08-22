/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blanco.test.gradle;

/**
 *
 * @author asantana
 */
public class Hello {

    private String name;

    public Hello(){
        this("World");
    }
    
    public Hello(String name){
        this.name =  name;
    }
    
    public String hi(){
        return "Hello "+name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
