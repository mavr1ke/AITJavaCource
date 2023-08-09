package homework_17;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        Phone phone4 = new Phone(23243432324L, "Nokia 2323", (short) 322);
        phone4.phoneInfo();

        phone1.number = 37532323422L;
        phone1.model = "Iphone 7";
        phone1.weight = 180;

        phone2.number = 74342131213L;
        phone2.model = "Iphone 13";
        phone2.weight = 220;

        phone3.number = 88005553535L;
        phone3.model = "Samsung Galaxy S20";
        phone3.weight = 200;

        phone1.phoneInfo();
        phone2.phoneInfo();
        phone3.phoneInfo();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Petya");
        phone2.receiveCall("John");
        phone3.receiveCall("Obama");

        phone1.receiveCall("Vasya", 3434343434L);
        phone2.receiveCall("Gena", 5452311134L);
        phone3.receiveCall("Misha", 54545454134L);


    }
}
