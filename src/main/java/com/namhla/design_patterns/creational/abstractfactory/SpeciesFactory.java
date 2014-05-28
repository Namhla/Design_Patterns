/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.namhla.design_patterns.creational.abstractfactory;

import com.namhla.design_patterns.creational.factorymethod.Animal;

/**
 *
 * @author namhla
 */
public abstract class SpeciesFactory {
    public abstract Animal getAnimal(String type);
}
