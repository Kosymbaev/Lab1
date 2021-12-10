package bsu.rfe.java.group10.lab1.Kosymbaev.varB12;

public class Cheese extends Food{
    public Cheese() {
        super("Сыр");
    }
    public String getName(){
        return name;
    }

    @Override
    public void consume() {
        System.out.println(this.name + " съеден");
    }
    public int calculateCalories(){
        return 25;
    }
}
