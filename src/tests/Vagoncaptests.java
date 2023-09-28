package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import vagon.Vagoncapacity;

public class Vagoncaptests {
    Vagoncapacity VagoncapTest = new Vagoncapacity("VagoncapTest",0,0);
    @Test
    void getPassengers() {
        VagoncapTest.getPassengers();
    }

    @Test
    void getBaggage() {
        VagoncapTest.getBaggage();
    }

    @Test
    void setPasengers() {
        VagoncapTest.setPassengers(100);
    }

    @Test
    void setBaggage() {
        VagoncapTest.setBaggage(20);
    }

    @Test
    void testToString() {
        VagoncapTest.toString();
    }

}
