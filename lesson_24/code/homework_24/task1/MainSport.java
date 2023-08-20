package homework_24.task1;

public class MainSport {
    public static void main(String[] args) {

        System.out.println("\n***Task 1***\n");
        Human human = new Human();
        AmateurSportsman amateurSportsman = new AmateurSportsman();
        ProSportsman proSportsman = new ProSportsman();

        Human[] humans = new Human[3];
        humans[0] = human;
        humans[1] = amateurSportsman;
        humans[2] = proSportsman;

        for (Human sportsman: humans ) {
            sportsman.run();
        }
    }
}
