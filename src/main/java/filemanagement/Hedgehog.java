package fileManagement;

public class Hedgehog extends Animal {

    public Hedgehog(String name, int weight) {
        super(name, weight);
        setObesity(5);
        setAlive(true);
    }

    @Override
    public void feed(FoodType foodType) {

        if (isAlive) {
            if (foodType.equals(FoodType.VEGETABLES)) {
                setWeight(0);
            } else if (foodType.equals(FoodType.FRUITS)) {
                setWeight(2);
            } else {
                setWeight(-1);
                if (getWeight() > getObesity() || getWeight() <= 0) {
                    setAlive(false);
                }
            }
        }
    }

}