package fileManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {


    public static void main(String[] args) {

<<<<<<< HEAD

=======
        int day = 0;

        Bear bear = new Bear("Balu", 4);
        Bear bear2 = new Bear("Brumi", 6);
        Animal wolf = new Wolf("Akela", 3);
        Animal rabbit = new Rabbit("Tapsi", 2);
        Animal hedgehog = new Hedgehog("Durum", 4);

        List<FoodType> foodTypes = Arrays.asList(FoodType.MEAT, FoodType.VEGETABLES, FoodType.MEAT,
                FoodType.FRUITS, FoodType.MEAT);

        while (day < 5) {
            System.out.println(foodTypes.get(day));

           bear.feed(foodTypes.get(day));
           bear2.feed(foodTypes.get(day));
           wolf.feed(foodTypes.get(day));
           rabbit.feed(foodTypes.get(day));
           hedgehog.feed(foodTypes.get(day));

            day++;
        }
        System.out.println(bear.getName() + ", súlya: " + bear.getWeight());
        System.out.println(bear2.getName() + ", súlya: " + bear2.getWeight());
        System.out.println(wolf.getName() + ", súlya: " + wolf.getWeight());
        System.out.println(rabbit.getName() + ", súlya: " + rabbit.getWeight());
        System.out.println(hedgehog.getName() + ", súlya: " + hedgehog.getWeight());
>>>>>>> d0ec09d4d3db7963c5457add40943971c7a65eac

    }
}
