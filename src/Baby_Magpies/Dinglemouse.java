package Baby_Magpies;

import java.util.stream.IntStream;

public class Dinglemouse {

    public static boolean child(final String bird1, final String bird2) {
        int differenceCount = IntStream.range(0, bird1.length())
                .mapToObj(x -> bird1.charAt(x) != bird2.charAt(x) ? 1 : 0)
                .reduce(0,Integer::sum);

        return differenceCount >= 1 && differenceCount <= 2;
    }

    public static boolean grandchild(final String bird1, final String bird2) {
        int differenceCount = IntStream.range(0, bird1.length())
                .mapToObj(x -> bird1.charAt(x) != bird2.charAt(x) ? 1 : 0)
                .reduce(0,Integer::sum);

        return differenceCount >= 0 && (bird1.length() == 1 ? differenceCount == 0 : differenceCount <= 4);
    }
    public static void main(String[] args) {
        String m1 = "BBWBWWBWBW";
        String m2 = "WWBWWWWWBW";

        System.out.println(child(m1,m2));
        System.out.println(grandchild(m1,m2));
    }

}