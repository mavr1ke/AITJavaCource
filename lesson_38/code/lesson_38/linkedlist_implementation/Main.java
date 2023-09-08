package lesson_38.linkedlist_implementation;

public class Main {
    public static void main(String[] args) {

        OurLinkedList<Integer> list = new OurLinkedList<>();
        list.append(5);

        list.print();

        list.set(10, 0);

        list.print();

        list.append(5);
        list.append(15);
        list.append(2);
        list.append(7);
        list.append(18);
        list.append(25);

        list.print();

        System.out.println(list.contains(15));
        System.out.println(list.contains(45));
        list.remove(15);
        list.print();
        list.removeById(2);
        list.print();

        OurList<String> ourList = new OurLinkedList<>();
        ourList.append("Jack");
        String jack = ourList.get(0);
        System.out.println(jack);


        OurList<Human> humans = makeHumanList();

        for(int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i));
        }
    }

    static OurLinkedList<Human> makeHumanList() {
        Human john = new Human("John",21);
        Human bill = new Human("Bill",24);
        Human ann = new Human("Ann",21);

        OurLinkedList<Human> result = new OurLinkedList<>();
        result.append(john);
        result.append(bill);
        result.append(ann);

        return result;
    }
}
