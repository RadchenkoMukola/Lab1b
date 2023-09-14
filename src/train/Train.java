package train;


import vagon.Vagon;
import vagon.Vagoncapacity;
import vagon_functions.TrainSystem;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Vagon> vagons = new ArrayList<>();
    private TrainSystem system = new TrainSystem();

    public Train() {
        vagons.add(new Vagon("Vagon-1", 2, 6, 76.0));
        vagons.add(new Vagon("Vagon-2", 2, 49, 13.0));
        vagons.add(new Vagon("Vagon-3", 4,13, 24.0));
        vagons.add(new Vagon("Vagon-4", 2, 37, 47.0));
        vagons.add(new Vagon("Vagon-5", 3, 32, 88.0));
        vagons.add(new Vagon("Vagon-6", 4, 9, 56.0));
        vagons.add(new Vagon("Vagon-7", 3, 28, 34.0));
        vagons.add(new Vagon("Vagon-8", 5, 49, 100.0));

        system.getTracks(vagons);
        system.getTotalDuration(vagons);
        system.SortByComfort(vagons);
        Vagoncapacity min = new Vagoncapacity("mincap",2,20);
        Vagoncapacity max = new Vagoncapacity("maxcap",3,40);
        system.findByCapacity(min, max, vagons);
    }
}
