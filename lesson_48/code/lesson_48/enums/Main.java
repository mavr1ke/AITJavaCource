package lesson_48.enums;

public class Main {
    public static void main(String[] args) {
        Directions dir = Directions.WEST;
        System.out.println(dir.getLetter());
        String letterNorth = Directions.NORTH.getLetter();
        System.out.println(letterNorth);

        Directions north = Directions.NORTH;
        System.out.println(north);
        System.out.println(Directions.EAST);

        System.out.println();
        for (Directions dir2 : Directions.values()) {
            System.out.println(dir2);
        }


        System.out.println("\n**********************");
        getDirection(Directions.EAST);
        getDirection(Directions.WEST);
        getDirection(Directions.NORTH);
        getDirection(Directions.SOUTH);

        System.out.println("**************************");
        String east = "east";
        Directions eastFromString = Directions.valueOf(east.toUpperCase());
        getDirection(eastFromString);
    }

    public static void getDirection(Directions direction) {
        switch (direction) {
            case SOUTH:
                System.out.println("go south");
                break;
            case EAST:
                System.out.println("go east");
                break;
            case WEST:
                System.out.println("go west");
                break;
            case NORTH:
                System.out.println("go north");
                break;
        }
    }
}
