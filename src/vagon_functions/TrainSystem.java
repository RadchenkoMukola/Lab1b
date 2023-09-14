package vagon_functions;
import vagon.Vagon;
import vagon.Vagoncapacity;

import java.util.Comparator;
import java.util.List;

public class TrainSystem {
    private static final String TOTAL_DURATION = "Total capacity of all vagons: ";
    private Double duration = 0.0;

    public void getTracks(List<Vagon> vagons) {
        for(Vagon vagon : vagons)
            System.out.println(vagon.toString());
        System.out.println();
    }

    public void getTotalDuration(List<Vagon> vagons){
        System.out.println("Get total ammout of cargo method.");
        Integer passengers = 0;
        Integer baggage = 0;
        for(int i = 0; i < vagons.size(); i++) {
            passengers += vagons.get(i).getOcupancy().getPassengers();
            baggage += vagons.get(i).getOcupancy().getBaggage();
        }
        Vagoncapacity buff = new Vagoncapacity("Totaloccupancy", passengers, baggage);
        System.out.println(TOTAL_DURATION + buff.toString() + '\n');
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
    public void findByCapacity(Vagoncapacity min, Vagoncapacity max, List<Vagon> vagons){
        System.out.println("Find vagons with set Capacity method.");
        Boolean isEmpty = true;
        for(int i = 0; i < vagons.size(); i++){

            Integer vagonToFind = 0;
            vagonToFind += vagons.get(i).getOcupancy().getPassengers();
            vagonToFind += vagons.get(i).getOcupancy().getBaggage();

            Integer startSum = 0;
            startSum += min.getPassengers();
            startSum += min.getBaggage();

            Integer finishSum = 0;
            finishSum += max.getPassengers();
            finishSum += max.getBaggage();

            if(vagonToFind >= startSum && vagonToFind <= finishSum) {
                System.out.println(vagons.get(i).toString());
                isEmpty = false;
            }
        }
        if(isEmpty){
            System.out.println("There are no such vagons that would match your condition (>" + min.toString() + ", <" + max.toString() + ")");
        }
    }
}