/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.namhla.design_patterns.creational.factorymethod;

/**
 *
 * @author namhla
 */
public class AnimalFactory {
    public Animal getAnimal(String type){
        if ("canine".equals(type)){
            return new Dog();
        } else {
            return new Cat();
        } 
    }  
}
