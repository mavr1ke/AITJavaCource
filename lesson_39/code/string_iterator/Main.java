package string_iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String string = "Not iterable";

//        for(char ch : string){
//            System.out.println(ch);
//        }

        IterableString xStr = new IterableString("This is a test with for each");

        for (char ch : xStr) {
            System.out.println(ch);
        }

        xStr = new IterableString("Print with our iterator");
        Iterator<Character> ourIterator = xStr.iterator();

        while (ourIterator.hasNext()) {
            System.out.println(ourIterator.next());
        }
    }
}

