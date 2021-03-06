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
    //function to find max element in O(n) using linear search
    public int findMax(){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<this.arr.length;i++){
            if(max<this.arr[i])
                max = this.arr[i];
        }
        return max;
    }
    //function to find min element in O(n) using linear search
    public int findmin(){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<this.arr.length;i++){
            if(min>this.arr[i])
                min = this.arr[i];
        }
        return min;
    }
    //finding first occurrence of an element and returning its index using linear search
    public int linearSearch(int num){
        int eleIndex = -1;
        for(int i=0;i<this.arr.length;i++){
            if(num == this.arr[i]) {
                eleIndex = i;
                return eleIndex;
            }
        }
        return eleIndex;
    }
    // binary search function for finding element in sorted array
    public int binarySearch(int ele,int left,int right){
        if(left<=right){
            int mid = (left + right)/2;
            if(this.arr[mid] == ele)
                return mid;
            else if(this.arr[mid]>ele)
                return this.binarySearch(ele,left,mid-1);
            else
                return this.binarySearch(ele,mid+1,right);
        }
        return -1;
    }
    // binary search function for finding an element in the sorted array implemented without recursion
    public int nonRecursiveBinarySearch(int ele,int left,int right) {
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (this.arr[mid] == ele)
                return mid;
            else if (this.arr[mid] > ele) {
                right = mid - 1;
            } else {
                left = mid  + 1;
            }
        }
        return -1;
    }
    // array rotation by value d
    public void arrayRotationBruteForce(int d){
        d = d%this.arr.length;
        for(int i = 0;i<d;i++){
            int temp = this.arr[0];
            int j;
            for(j = 0;j<this.arr.length-1;j++){
                this.arr[j] = this.arr[j+1];
            }
            arr[j] = temp;
            //this.printArray();
        }
    }

    //methods for testing weather the given array is sorted in increasing order or not
    public boolean isArraySortedInAscendingOrder(int n){
        if(n==1)
            return true;
        return (this.arr[n-1]<this.arr[n-2]?false:isArraySortedInAscendingOrder(n-1));
    }

    public boolean isArraySortedInAscendingOrder(){
        return this.isArraySortedInAscendingOrder(this.arr.length);
    }

    //method for testing weather the given array is sorted in decreasing order or not using recursion
    public boolean isArraySortedInDecreasingOrder(int n){
        if(n ==1){
            return true;
        }
        return (this.arr[n-1]>this.arr[n-2]?false:isArraySortedInDecreasingOrder(n-1));
    }
    public boolean isArraySortedInDecreasingOrder(){
        return isArraySortedInDecreasingOrder(this.arr.length);
    }

    //method for checking weather the given array is sorted in increasing order or not using loop
    public boolean isArraySortedInAscendingOrderUsingLoop(){
        int n = this.arr.length;
        if(n == 1)
            return true;
        for(int i = 0;i<this.arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    //method for checking weather the given array is sorted in decreasing order or not using loop
    public boolean isArraySortedInDescendingOrderUsingLoop(){
        int n = this.arr.length;
        if(n == 1)
            return true;
        for(int i = 0;i<this.arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
