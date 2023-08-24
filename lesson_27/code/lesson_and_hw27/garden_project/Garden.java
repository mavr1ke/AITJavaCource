package lesson_and_hw27.garden_project;

public class Garden {

    public void growPlants(Plant[] plants, int years) {
        System.out.println("Growing plants for "
                + years + ((years > 1) ? " years" : " year") + "\n");
        int yearsCounter = 0;
        do {
            for (Plant plant : plants) {
                plant.seasonsForYear();
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
