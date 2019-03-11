package com.zipcodewilmington.froilansfarm.models.persons;

import com.zipcodewilmington.froilansfarm.containers.Meal;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

import static com.zipcodewilmington.froilansfarm.utilities.IOConsole.getIOConsole;

public class FarmPilot extends Person implements Pilot, Rider {
    private Farm myFarm;

    public FarmPilot(String name, Farm myFarm) {
        super(name);
        this.myFarm = myFarm;
    }

    public String makeNoise() {
        return "Ruuun";
    }

    public void fly(Aircraft aircraft) {
        aircraft.fly();
    }

    public void mount(Rideable rideable) {
        rideable.mount();
    }

    public void dismount(Rideable rideable) {
        rideable.dismount();
    }

    public Farm getMyFarm() {
        return myFarm;
    }

    public void setMyFarm(Farm myFarm) {
        this.myFarm = myFarm;
    }

    @Override
    public void eat(Meal meal) {
        int numOfFood;
        if (meal == null) numOfFood = 0;
        else numOfFood = meal.getNumOfFood();

        String nameOfFood;
        if (meal == null) nameOfFood = "Food";
        else nameOfFood = meal.getFood().getClass().getSimpleName();

        getIOConsole().println(getName() + " ate " + numOfFood + " " + nameOfFood + "\n");
    }
}
