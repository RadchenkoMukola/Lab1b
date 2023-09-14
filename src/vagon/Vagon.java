package vagon;

public class Vagon {
    private String trackName;
    private Vagoncapacity Ocupancy;

    private Double Comfort;

    public Vagon(String trackName, Integer vagonpassengers, Integer vagonbaggage, Double Comfort){
        this.trackName = trackName;
        this.Ocupancy = new Vagoncapacity(this.trackName ,vagonpassengers, vagonbaggage);
        this.Comfort = Comfort;
    }

    public String getTrackName(){return trackName;}
    public Vagoncapacity getOcupancy(){return Ocupancy;}
    public Double getComfort(){return Comfort;}

    public void setVagonName(String trackName) {this.trackName = trackName;}
    public void setVagonoc(Integer vagonpassengers, Integer vagonbaggage) {
        Ocupancy.setCapacity(vagonpassengers, vagonbaggage);
    }
    public void setComfort(double Comfort) {this.Comfort = Comfort;}

    public String toString(){
        return "Vagon Name: " + getTrackName() + ", Current occupancy: " + getOcupancy() + ", Comfort: " + getComfort();
    }
}
