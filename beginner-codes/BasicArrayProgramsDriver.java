import java.util.Scanner;
public class BasicArrayProgramsDriver {
    public static void main(String[] args){
        //scanner object for reading input from user
        Scanner read = new Scanner(System.in);

        //printing message for user for entering no of elements
        System.out.print("Enter no of elements  in the array : ");

        //reading no of elements from user using created scanner input
        int noOfElements = read.nextInt();

        //creating inputArray with input size by the user
        int[] inputArray = new int[noOfElements];

        //reading and storing elements in the created array
        for(int i = 0;i<noOfElements;i++)
            inputArray[i] = read.nextInt();

        //creating object for Basic Array Programs class
        BasicArrayPrograms obj = new BasicArrayPrograms(inputArray);
        obj.printArray();
        obj.arrayRotationBruteForce(12);
        obj.printArray();
    }
}
