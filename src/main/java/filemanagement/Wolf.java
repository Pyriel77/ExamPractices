package fileManagement;

public class Wolf extends Animal{

    public Wolf(String name, int weight) {
        super(name, weight);
        setObesity(6);
        setAlive(true);
    }

    @Override
    public void feed(FoodType foodType) {
        if (isAlive) {
            if (foodType.equals(FoodType.MEAT)) {
                setWeight(3);
            } else {
                setWeight(-1);
            }
            if (getWeight() > getObesity() || getWeight() <= 0) {
                setAlive(false);
            }
        }
    }
    }

