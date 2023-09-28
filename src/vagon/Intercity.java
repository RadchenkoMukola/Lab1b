package vagon;

public class Intercity extends Vagon
{
    String Type = "Intercity";;


    public Intercity(String Name, Integer vagonpassengers, Integer vagonbaggage, Double Comfort)
    {
        super(Name,vagonpassengers,vagonbaggage,Comfort);
    }



    public String toString(){
        return "Type: "+ Type + ", Vagon Name: " + getVagonName() + ", Current occupancy: " + getOcupancy() + ", Comfort: " + getComfort();
    }

}
