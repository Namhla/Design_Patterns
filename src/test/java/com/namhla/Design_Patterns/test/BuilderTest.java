/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.namhla.Design_Patterns.test;

import com.namhla.design_patterns.creational.builderpattern.ItalianMealBuilder;
import com.namhla.design_patterns.creational.builderpattern.MealBuilder;
import static org.testng.Assert.*;

/**
 *
 * @author namhla
 */
public class BuilderTest {
    
    public BuilderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
     public void BuilderTest() {
         MealBuilder mealBuilder = new ItalianMealBuilder();
         assertEquals(meal, "Meal");
     
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
}
