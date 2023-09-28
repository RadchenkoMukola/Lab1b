package tests;

import vagon.Intercity;
import vagon.Plac;
import vagon.Vagon;
import vagon.Vagoncapacity;


import java.util.List;

import org.junit.jupiter.api.Test;
import vagon_functions.TrainSystem;

import java.util.ArrayList;


public class Trainsystests {
    TrainSystem trainSystemTest = new TrainSystem();
    List<Vagon> testVagons = new ArrayList<>();

    {
        testVagons.add(new Intercity("Vagon-1", 10, 90, 70.0));
        testVagons.add(new Plac("Vagon-2", 80, 50, 40.0));
        testVagons.add(new Intercity("Vagon-3", 60, 60, 55.0));
        testVagons.add(new Plac("Vagon-4", 30, 40, 12.0));
    }


    @Test
    void getVagons() {
        trainSystemTest.getAllVagons(testVagons);
    }

    @Test
    void getTotalcargo() {
        trainSystemTest.getTotalCap(testVagons);
    }

    @Test
    void sortingByComfort() {
        trainSystemTest.SortByComfort(testVagons);
    }

    @Test
    void findByCap() {
        Vagoncapacity min = new Vagoncapacity("mincap",10,20);
        Vagoncapacity max = new Vagoncapacity("maxcap",70,60);
        trainSystemTest.findByCapacity(min,max,testVagons);
    }
}
