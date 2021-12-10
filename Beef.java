package bsu.rfe.java.group10.lab1.Kosymbaev.varB12;

public class Beef extends Food {
    String preparedness;

    public Beef(String preparedness) {
        super("Мясо");
        this.preparedness = preparedness;
    }

    public String getPreparedness() {
        return preparedness;
    }

    public void setPreparedness(String preparedness) {
        this.preparedness = preparedness;
    }

    public void consume() {
        System.out.println(this + "съеденo");
    }

    public String toString() {
        return super.toString() + " " + preparedness + " ";
    }

    public boolean equals(Object b) {
        if (super.equals(b)) {
            if (!(b instanceof Beef)) {
                return false;
            }
            if (preparedness.equals(((Beef) b).preparedness)) {
                return true;
            }
            else return false;
        } else return false;
    }

    public int calculateCalories() {
        int calories=0;
        if (this.preparedness.equals("с кровью")) {
            calories+=75;
        }
        if (this.preparedness.equals("норма")) {
            calories+=150;
        }
        if (this.preparedness.equals("прожаренное")) {
            calories+=200;
        }
        return calories;
    }

}
