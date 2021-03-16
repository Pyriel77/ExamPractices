package fileManagement;

public class Bear extends Animal{


    private boolean isAlive = true;


    public Bear(String name, int weight) {
        super(name, weight);
        setObesity(10);
        setAlive(true);
    }
}
