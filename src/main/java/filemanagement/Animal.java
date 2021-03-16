package fileManagement;

public abstract class Animal {

    private String name;
    private int weight;
    private int obesity;
    boolean isAlive;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int change) {
        this.weight += change;
    }

    public String getName() {
        return name;
    }

    public int getObesity() {
        return obesity;
    }

    public void setObesity(int obesity) {
        this.obesity = obesity;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}


