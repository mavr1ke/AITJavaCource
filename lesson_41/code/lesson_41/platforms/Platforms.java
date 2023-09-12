package lesson_41.platforms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Platforms {

    public static int findMinPlatformsNumber(List<Integer> arr, List<Integer> dep) {

        Collections.sort(arr);
        Collections.sort(dep);

        int neededPlatforms = 0;
        int maxPlatforms = 0;

        int i = 0;
        int j = 0;

        while (i < arr.size() && j < dep.size()) {
            if (arr.get(i) < dep.get(j)) {

                neededPlatforms++;
                i++;

                if (neededPlatforms > maxPlatforms) {
                    maxPlatforms = neededPlatforms;
                }
            } else {
                neededPlatforms--;
                j++;
            }
        }
        return maxPlatforms;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(100,140,150,200,215,400);
        List<Integer> dep = Arrays.asList(110,300,220,230,315,600);

        System.out.println("Min platform required: " + findMinPlatformsNumber(arr,dep));
    }
}
