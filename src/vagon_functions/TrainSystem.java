package vagon_functions;
import vagon.Vagon;
import vagon.Vagoncapacity;

import java.util.Comparator;
import java.util.List;

public class TrainSystem {
    private static final String TOTAL_CAP = "Total capacity of all vagons: ";
    private Double capacity = 0.0;

    public void getAllVagons(List<Vagon> vagons) {
        for(Vagon vagon : vagons)
            System.out.println(vagon.toString());
        System.out.println();
    }

    public void getTotalCap(List<Vagon> vagons){
        System.out.println("Get total ammout of cargo method.");
        Integer passengers = 0;
        Integer baggage = 0;
        for(int i = 0; i < vagons.size(); i++) {
            passengers += vagons.get(i).getOcupancy().getPassengers();
            baggage += vagons.get(i).getOcupancy().getBaggage();
        }
        Vagoncapacity buff = new Vagoncapacity("Totaloccupancy", passengers, baggage);
        System.out.println(TOTAL_CAP + buff.toString() + '\n');
    }

    public void SortByComfort(List<Vagon> vagons)
    {
        System.out.println("Sort by Comfort method.");
        Comparator<Vagon> compareByComfort =
                Comparator.comparing(Vagon::getComfort);
        vagons.sort(compareByComfort.reversed());
        for (Vagon vagon : vagons) {
            System.out.println(vagon.toString());
        }
        System.out.println();
    }
    public void findByCapacity(Vagoncapacity min, Vagoncapacity max,  List<Vagon> vagons){
        System.out.println("Find vagons with set Capacity method.");
        Boolean isEmpty = true;
        for(int i = 0; i < vagons.size(); i++){

            Integer vagonToFind1 = 0;
            Integer vagonToFind2 = 0;
            vagonToFind1 += vagons.get(i).getOcupancy().getPassengers();
            vagonToFind2 += vagons.get(i).getOcupancy().getBaggage();

            Integer startSum1 = 0;
            Integer startSum2 = 0;
            startSum1 += min.getPassengers();
            startSum2 += min.getBaggage();

            Integer finishSum1 = 0;
            Integer finishSum2 = 0;
            finishSum1 += max.getPassengers();
            finishSum2 += max.getBaggage();

            if(vagonToFind1 >= startSum1 && vagonToFind1 <= finishSum1 && vagonToFind2 >= startSum2 && vagonToFind2 <= finishSum2) {
                System.out.println(vagons.get(i).toString());
                isEmpty = false;
            }
        }
        if(isEmpty){
            System.out.println("There are no such vagons that would match your condition");
        }
    }
}