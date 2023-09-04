package lesson_35.anonym_classes;

public class Main {
    public static void main(String[] args) {

        SomeInterFace someInterFace = new SomeInterFace(){
            @Override
                public void doSomething(String str) {
                System.out.println(str.toLowerCase());
            }
        };

        someInterFace.doSomething("HELLO");
    }
}
