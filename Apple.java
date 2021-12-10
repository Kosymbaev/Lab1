package bsu.rfe.java.group10.lab1.Kosymbaev.varB12;

public class Apple extends Food{
    public String size;

    public Apple (String size) {
        super("Яблоко");
        this.size = size;
    }

    public void setSize(String name){
        this.name=name;
    }
    public String getSize(){
        return name;
    }

    public void consume() {
        System.out.println(this+" съедено");
    }
    public String toString(){
        return super.toString()+" размера '"+ size + "'";
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false; // Шаг 2
            return size.equals(((Apple)arg0).size); // Шаг 3
        } else
            return false;
    }

    public int calculateCalories() {
        int calories = 0;
        if (size.equals("маленькое") ) {
            calories+=25;
        }
        if (size.equals("среднее")) {
            calories+=50;
        }
        if (size.equals("большое")) {
            calories+=75;
        }
        return calories;
    }
}
