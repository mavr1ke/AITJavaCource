package lesson_26.stringbuilder;

public class Main26 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ").append("Java");
        System.out.println(sb);

        sb.insert(1,"World");
        System.out.println(sb);

        sb.replace(1,6,"");
        System.out.println(sb);

        sb.delete(5,10);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }

}
