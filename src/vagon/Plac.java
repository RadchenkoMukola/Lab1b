package vagon;

public class Plac extends Vagon
{
    String Type = "Plac-cart";;


    public Plac(String Name, Integer vagonpassengers, Integer vagonbaggage, Double Comfort)
    {
        super(Name,vagonpassengers,vagonbaggage,Comfort);
    }



    public String toString(){
        return "Type: "+ Type + ", Vagon Name: " + getVagonName() + ", Current occupancy: " + getOcupancy() + ", Comfort: " + getComfort();
    }

}