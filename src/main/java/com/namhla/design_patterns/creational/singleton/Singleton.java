/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.namhla.design_patterns.creational.singleton;

/**
 *
 * @author namhla
 */
public class Singleton {
    private static Singleton theOnlyOne;
    
    private Singleton(){
        
    }
    public synchronized static Singleton instance(){
        if(theOnlyOne == null){
            theOnlyOne = new Singleton();
        }
        return theOnlyOne;
    }
    public String sayHello(){
        return "Hello";
    }
    
}
