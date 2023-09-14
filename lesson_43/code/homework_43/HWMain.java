package homework_43;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class HWMain {
    /*
    Дан массив строк (не пустой). Написать метод, возвращающий мапу Map<String,Boolean> где
    каждая строка является ключом, а значением является true если строка в массиве встречается
    больше одного раза и false если только один раз

    Примеры:
    [a,b,a,c,b]- a:true b:true c:false
    [a,b,c]- a:false b:false c:false
    [c,c,c]- c:true
    */

    public static Map<String, Boolean> isStringsRepeating(String[] strings) {
        Map<String, Boolean> stringsInfoArray = new LinkedHashMap<>();
        for (String str : strings) {
            stringsInfoArray.put(str, stringsInfoArray.containsKey(str));
        }
        System.out.println(stringsInfoArray);
        return stringsInfoArray;
    }

    public static void main(String[] args) {

        String[] str1 = {"a", "b", "a", "c", "b"};
        String[] str2 = {"a", "b", "c"};
        String[] str3 = {"c", "c", "c"};
        String[] names = {"Jack", "Ann", "Jack", "Bill", "Ann"};

        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));
        System.out.println(Arrays.toString(str3));
        System.out.println(Arrays.toString(names));

        System.out.println("Result");
        isStringsRepeating(str1);
        isStringsRepeating(str2);
        isStringsRepeating(str3);
        isStringsRepeating(names);

    }
}
