package lesson_33.comparable_interface.players;

public class Player implements Comparable<Player> {

    private int rank;
    private String name;
    private int age;

    public Player(int rank, String name, int age) {
        this.rank = rank;
        this.name = name;
        this.age = age;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Player o) {
//        if (getRank() - o.getRank() > 0 ) {
//            return 1;
//        } else if (getRank() - o.getRank() < 0) {
//            return -1;
//        } else return 0;
//    }

//    @Override
//    public int compareTo(Player o) {
//        return getRank() - o.getRank();
//    }

//    @Override
//    public int compareTo(Player o) {
//        return Integer.compare(getRank() ,o.getRank());
//    }

    @Override
    public int compareTo(Player o) {
        int playerName = getName().compareTo(o.getName());

        return playerName == 0 ? Integer.compare(getAge(),o.getAge()) : playerName;
    }

}
