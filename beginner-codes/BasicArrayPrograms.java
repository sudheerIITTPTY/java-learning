public class BasicArrayPrograms {

    int[] arr;
    int[] freqs;
    //initializing arr attribute by copying input array
    public BasicArrayPrograms(int[] input_array){
        this.arr = new int[input_array.length];
        for(int i = 0;i< arr.length;i++)
            arr[i] = input_array[i];
    }

    // method for printing arr array in BasicArrayPrograms class
    public void printArray(){
        for(int i = 0;i<this.arr.length;i++)
            System.out.print(this.arr[i]+" ");
        System.out.println("");
    }

    //overloaded method for printing array by taking input an array
    public void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
    }

    //calculating frequencies of elements in the array
    public int[] getFreqs(){
        int noOfElements = this.arr.length;
        freqs = new int[noOfElements];
        for(int i = 0;i<noOfElements;i++)
            freqs[arr[i]]++;
        return freqs;
    }
    //printing frequency array
    public void printFreqs(){
        for(int i = 0;i<this.freqs.length;i++)
            System.out.println(i + " : " +freqs[i]);
    }
    //function to determine first consecutive duplicate element in an array of integers
    public int consecutiveDuplicateElement(){
        int duplicateElement = -1;
        for(int i=0;i<this.arr.length-1;i++)
            if((arr[i]^arr[i+1])==0){
                duplicateElement = arr[i];
                return duplicateElement;
            }
        return duplicateElement;
    }
}
