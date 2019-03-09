package com.zipcodewilmington.froilansfarm.simulations;

import com.zipcodewilmington.froilansfarm.containers.Stable;
import com.zipcodewilmington.froilansfarm.containers.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.FarmSimulation;
import com.zipcodewilmington.froilansfarm.models.animals.Horse;
import com.zipcodewilmington.froilansfarm.models.foods.EarCorn;
import com.zipcodewilmington.froilansfarm.utilities.IOConsole;

public abstract class WorkDay implements FarmSimulation {
    protected void println(String val, Object... args) {
        IOConsole.getIOConsole().println(val, args);
    }

    protected void userPressEnterToContinue() {
        IOConsole.getIOConsole().userPressEnterToContinue();
    }

//    protected void morningRoutineHorses(Farm farm){
//        for(Stable s : farm.getStables()){
//            for(Horse h : stable.getStable()){
//                horseFeed = storeHouse.getFood(new EarCorn(), 3);
//                h.mount();
//                System.out.println(h.makeNoise());
//                h.ride(farm.gfarmer);
//                h.eat(horseFeed);
//            }
//        }
//    }
}
