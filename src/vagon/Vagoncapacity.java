package vagon;

public class Vagoncapacity {
    private Integer passengers = 0;
    private Integer baggage = 0;

    public Vagoncapacity(String trackName, Integer passengers, Integer baggage)
    {
            this.passengers = passengers;
            this.baggage = baggage;
    }

    public Integer getPassengers() {return passengers;}
    public Integer getBaggage() {return baggage;}

    public void setCapacity(Integer passengers, Integer baggage)
    {
            this.passengers = passengers;
            this.baggage = baggage;
    }
    public void setPassengers(Integer passengers) {
        if(passengers >= 0) this.passengers = passengers;
        else System.out.println("Incorrect value. (setMinutes(Integer passengers))");
    }
    public void setBaggage(Integer baggage) {
        if(baggage >= 0) this.baggage = baggage;
        else System.out.println("Incorrect value. (setSeconds(Integer baggage))");
    }
    public String toString(){
        return("Amount of Passengers:" + passengers + " Amount of Baggage:" + baggage);

    }

}