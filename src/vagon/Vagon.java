package vagon;

public class Vagon {
     String Name;
     Vagoncapacity Ocupancy;
     Double Comfort;


    public Vagon(String trackName, Integer vagonpassengers, Integer vagonbaggage, Double Comfort){
        this.Name = trackName;
        this.Ocupancy = new Vagoncapacity(this.Name ,vagonpassengers, vagonbaggage);
        this.Comfort = Comfort;
    }

    public String getVagonName(){return Name;}
    public Vagoncapacity getOcupancy(){return Ocupancy;}
    public Double getComfort(){return Comfort;}

    public void setVagonName(String trackName) {this.Name = trackName;}
    public void setVagonoc(Integer vagonpassengers, Integer vagonbaggage) {
        Ocupancy.setCapacity(vagonpassengers, vagonbaggage);
    }
    public void setComfort(double Comfort) {this.Comfort = Comfort;}

    public String toString(){
        return "Vagon Name: " + getVagonName() + ", Current occupancy: " + getOcupancy() + ", Comfort: " + getComfort();
    }
}
