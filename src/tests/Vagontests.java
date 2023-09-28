package tests;

import org.junit.jupiter.api.Test;
import vagon.Vagon;

class Vagontests {
    Vagon testvagon = new Vagon("testvagonName", 0,0,16.0);

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