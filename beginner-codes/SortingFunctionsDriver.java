/*
 *  Author : DSK
 *  This java class is used to test the implemented different types of sorting functions in SortingFunctions class
 *
 *
 * */
public class SortingFunctionsDriver {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6};
        SortingFunctions obj = new SortingFunctions(arr);
        obj.printArray();
        obj.selectionSortAscendingOrder();
        obj.printArray();
        obj.selectionSortDescendingOrder();
        obj.printArray();
        obj.selectionSortAscendingOrder();
        obj.printArray();
    }
}
