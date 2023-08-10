package lesson_07;

public class Lesson07 {
    public static void main(String[] args) {

//        int x = 3;
//
//        switch (x) {
//            case 1: {
//                System.out.println("x is 1");
//                break;
//            }
//            case 2: {
//                System.out.println("x is 2");
//                break;
//            }
//            case 3: {
//                System.out.println("x is 3");
//                break;
//            }
//            default: {
//                System.out.println("Out of diapason");
//            }
//        }
//
//        int myMoney = 100;
//
//        int incoming = 20;
//
//        System.out.println("start my money: " + myMoney);
//
//        switch (incoming) {
//            case 0: {
//                myMoney += 5;
//                break;
//            }
//            case 10: {
//                myMoney += 25;
//                break;
//            }
//            case 20: {
//                myMoney += 75;
//                break;
//            }
//            default: {
//                myMoney += incoming;
//            }
//        }
//
//        System.out.println("end my money: " + myMoney);

//        System.out.println("У меня загадка");
//        System.out.println("Текст загадки");
//        System.out.println("Что это?");
//
//        Scanner scanner = new Scanner(System.in);
//        String answer = scanner.nextLine();
//
//        answer = answer.trim().toLowerCase();
//
//        switch (answer) {
//            case "троллейбус":
//            case "троллейбус!":
//         //   case "Троллейбус":
//            {
//                System.out.println("Правильно, ты наверно нагуглил?");
//                break;
//            }
//        //    case "Сдаюсь":
//            case "сдаюсь":
//            case "сдаюсь!":
//            {
//                System.out.println("Жаль, правильный ответ Троллейбус");
//                break;
//            }
//            default: {
//                System.out.println("Неправильно");
//            }
//        }

        String result = "";
        int myChoice = 1;

        switch (myChoice) {
            case 1: result = "Вы ввели 1"; break;
            case 2: result = "Вы ввели 2"; break;
            case 3: result = "Вы ввели 3"; break;
            case 4:
            case 5: result = "Вы ввели 4 или 5"; break;
            default: result = "Неверное число";
        }
        System.out.println(result);
    }
}
