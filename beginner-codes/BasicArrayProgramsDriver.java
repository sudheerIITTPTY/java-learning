import java.util.Scanner;
public class BasicArrayProgramsDriver {
    public static void main(String[] args){

        int[] arr = new int[]{1,1,1,2};
        BasicArrayPrograms obj = new BasicArrayPrograms(arr);
        System.out.println(obj.isArraySortedInAscendingOrderUsingLoop());
        System.out.println(obj.isArraySortedInDescendingOrderUsingLoop());
    }
}
