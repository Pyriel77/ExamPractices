package fileManagement;

public class Rabbit extends Animal{

    public Rabbit(String name, int weight) {
        super(name, weight);
        setObesity(4);
        setAlive(true);
    }

    @Override
    public void feed(FoodType foodType) {

        if (isAlive) {
            if (foodType.equals(FoodType.VEGETABLES)) {
                setWeight(2);
            } else if (foodType.equals(FoodType.FRUITS)) {
                setWeight(1);
            } else {
                setWeight(-1);
            if (getWeight() > getObesity() || getWeight() <= 0) {
                setAlive(false);
            }
        }
    }

    }
}
