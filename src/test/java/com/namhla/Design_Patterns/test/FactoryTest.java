/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.namhla.Design_Patterns.test;

import com.namhla.design_patterns.creational.factorymethod.Animal;
import com.namhla.design_patterns.creational.factorymethod.AnimalFactory;
import static org.testng.Assert.*;

/**
 *
 * @author namhla
 */
public class FactoryTest {
    
    public FactoryTest() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
     public void FactoryTest() {
         AnimalFactory animalFactory = new AnimalFactory();
         
         Animal a1 = animalFactory.getAnimal("Feline");
         assertEquals(a1, "Woof");
         
         Animal a2 = animalFactory.getAnimal("canine");
         assertEquals(a2, "Meeuw");
     }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    private void assertEquals(Animal a1, String woof) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
