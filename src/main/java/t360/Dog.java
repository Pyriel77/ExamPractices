package t360;

public abstract class Dog {

    private String name;
    private int happiness;

    public Dog(String name, int happiness) {
        this.name = name;
        this.happiness = happiness;
    }

    public String getName() {
        return this.name;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void feed() {};

    public void play(int hours) {};
}
