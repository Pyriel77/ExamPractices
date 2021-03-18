package t360;

public class Beagle extends Dog{



    public Beagle(String name) {
        super(name, 0);

    }

    @Override
    public void feed() {
        setHappiness(getHappiness() + 2);
    }

    @Override
    public void play(int hours) {
        setHappiness(getHappiness() + hours * 2);
    }
}
