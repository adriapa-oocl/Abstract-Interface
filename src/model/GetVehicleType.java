package model;

interface Transportation_Type{
    void getTransportationType(int budgetCount);
}

class Transportation implements Transportation_Type{

    public void getTransportationType(int budgetCount) {
        System.out.println("Budget: "+budgetCount);
        System.out.println("Xiaoming can take below transportation:");
        if (budgetCount >= 300){
            System.out.println("Bus");
        }
        if (budgetCount >= 400 ){
            System.out.println("Train");
        }
        if (budgetCount >= 500 ){
            System.out.println("Driving");
        }
        if (budgetCount<300){
            System.out.println("Not enough yuan for any transportation mode");
        }
    }
}

public class GetVehicleType {
    public static void main(String[] args) {
        Transportation transportation = new Transportation();
        transportation.getTransportationType(500);
    }
}
