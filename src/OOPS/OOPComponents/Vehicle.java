package OOPS.OOPComponents;

public class Vehicle {
    int wheels;
    String name;

    public Vehicle () {
        System.out.println("Vehicle Constructor");
    }


    public void print(){
        System.out.println("Vehicle Name "+ name +" No of wheels "+ wheels);
    }

}
