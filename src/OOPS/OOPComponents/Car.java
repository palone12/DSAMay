package OOPS.OOPComponents;

public class Car extends  Vehicle {
    String type ;
    int Bhp;

    public Car () {
        System.out.println("Car Constructor");
    }

    public void print (){
        super.print();
//        System.out.println("Car Details "+ type + Bhp);
    }

}
