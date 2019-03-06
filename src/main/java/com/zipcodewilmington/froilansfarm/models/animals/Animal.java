package com.zipcodewilmington.froilansfarm.models.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {

    @Override
    public String toString() {
        return '\n' + this.getClass().getSimpleName() + "{}";
    }
}
