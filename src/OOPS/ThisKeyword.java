package OOPS;

public class ThisKeyword {
    String name ;
    int mob ;

    public void setName (String name){
        if(name.length()<0){
            return;
        }
        this.name= name;
    }
}
