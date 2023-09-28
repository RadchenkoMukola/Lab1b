package tests;

import org.junit.jupiter.api.Test;
import vagon.Plac;

public class Plactests {
    Plac testvagon = new Plac("testvagonName", 0,0,16.0);

    @Test
    void getTrackName() {
        testvagon.getVagonName();
    }

    @Test
    void gettestVagonOccupancy() {
        testvagon.getOcupancy();
    }

    @Test
    void getVagonComfort() {
        testvagon.getComfort();
    }

    @Test
    void setvagonname() {
        testvagon.setVagonName("New testvagonName");
    }

    @Test
    void setVagonOccupancy() {
        testvagon.setVagonoc(10,10);
    }

    @Test
    void setVagonComfort() {
        testvagon.setComfort(100.0);
    }

    @Test
    void testToString() {
        testvagon.toString();
    }
}
