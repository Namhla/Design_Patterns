/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.namhla.design_patterns.creational.abstractfactory;

import com.namhla.design_patterns.creational.factorymethod.Animal;
import com.namhla.design_patterns.creational.factorymethod.Dog;

/**
 *
 * @author namhla
 */
public class MammalFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type){
        if ("dog".equals(type)){
            return new Dog();
        }
        else {
            return new Cat();
        }
    }
    
    
}
