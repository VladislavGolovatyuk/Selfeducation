import java.util.Arrays;

/**
 * Created by Cvladislav on 26.06.2017.
 */
public class ArraysSorte {
    public static void main (String [] args){

        double [] myFirstSortedArray = new double[10];

            for (int i = 0; i<myFirstSortedArray.length;i++){
                myFirstSortedArray[i] = Math.random();
                System.out.println();
                System.out.println(myFirstSortedArray[i]);
                System.out.println();
            }
            Arrays.sort(myFirstSortedArray);
            for (int i = 0; i<myFirstSortedArray.length; i++){
                System.out.println(myFirstSortedArray[i]);
            }
    }
}
