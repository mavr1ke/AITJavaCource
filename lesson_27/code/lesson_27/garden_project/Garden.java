package lesson_27.garden_project;

public class Garden {
    public void growPlants(Plant[] plants) {
        for (Plant plant: plants) {
            plant.doSpring();
            plant.doSummer();
            plant.doAutumn();
            plant.doWinter();
            System.out.println(plant.getName() + " has height "
                    + plant.getHeight() + " and is "
                    + plant.getAge() + " years old\n");
        }
    }

    public void growPlants(Plant[] plants, int years) {
        int yearsCounter = 0;
        do {
            for (Plant plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }
            System.out.println();
            yearsCounter++;
        } while (yearsCounter < years);

        for (Plant plant : plants) {
            System.out.println(plant.getName() + " has height "
                    + plant.getHeight() + " and is "
                    + plant.getAge() + " years old");
        }
    }

}
