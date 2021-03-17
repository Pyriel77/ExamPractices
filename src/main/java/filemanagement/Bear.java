package fileManagement;

public class Bear extends Animal {


    public Bear(String name, int weight) {
        super(name, weight);
        setObesity(10);
        setAlive(true);
    }

    @Override
    public void feed(FoodType foodType) {

        if (isAlive) {
            if (foodType.equals(FoodType.MEAT) || foodType.equals(FoodType.FRUITS)) {
                setWeight(1);
            } else {
                setWeight(-1);
            }
            if (getWeight() > getObesity() || getWeight() <= 0) {
                setAlive(false);
            }
        }
    }
}
