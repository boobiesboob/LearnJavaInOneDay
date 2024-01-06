package learnJavaInOneDay;
import java.util.Arrays;
public class Array {

    public static void main(String[] args) {
        int[] names00 = new int[] {2, 5, 8, 3, 11};
        int[] names01 = new int[] {2, 5, 8, 3, 11};
        int[] names1 =  {2, 5, 8, 3, 11};
        int[] names3 =  new int[5];
        System.out.println(names00[1]);
        boolean arrComp = Arrays.equals(names00, names01);
        System.out.println(arrComp);

        int[] destArr = Arrays.copyOfRange(names00, 0, names00.length);
        for (int i : destArr) {
            System.out.println(i);
        }
    }
}
