package train;


import vagon.Intercity;
import vagon.Plac;
import vagon.Vagon;
import vagon.Vagoncapacity;
import vagon_functions.TrainSystem;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Vagon> vagons = new ArrayList<>();
    private TrainSystem system = new TrainSystem();

    public Train() {


        vagons.add(new Intercity("Vagon-1",10,90,70.0));
        vagons.add(new Plac("Vagon-2",80,50,40.0));
        vagons.add(new Intercity("Vagon-3",60,60,55.0));
        vagons.add(new Plac("Vagon-4",30,40,12.0));

        system.getAllVagons(vagons);
        system.getTotalCap(vagons);
        system.SortByComfort(vagons);
        Vagoncapacity min = new Vagoncapacity("mincap",10,20);
        Vagoncapacity max = new Vagoncapacity("maxcap",70,60);
        system.findByCapacity(min, max, vagons);
    }
}
