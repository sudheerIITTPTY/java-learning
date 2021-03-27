/*
 *  Author : DSK
 *  This java class is used to implement the different types of sorting which I have learned
 *
 *
 * */
public class SortingFunctions {
    int arr[];

    // initializer for initializing arr member in SortingFunctions class
    public SortingFunctions(int arr[]){
        this.arr = new int[arr.length];
        for(int i = 0;i<this.arr.length;i++)
            this.arr[i] = arr[i];
    }

    //function for printing an array
    public void printArray(){
        for(int i = 0;i<this.arr.length;i++){
            System.out.print(this.arr[i]+" ");
        }
        System.out.println("");
    }

    // function to sort integer of arrays in ascending order using insertion sort algorithm
    public void insertionSortAscendingOrder(){
        for(int i = 1;i<this.arr.length;i++){
            int key = this.arr[i];
            int j = i-1;
            while(j>=0 && this.arr[j]>key){
                arr[j+1] = this.arr[j];
                j--;
            }
            this.arr[j+1] = key;
        }
    }
    public void insertionSortDescendingOrder(){
        for(int i = 1;i<this.arr.length;i++){
            int key = this.arr[i];
            int j = i-1;
            while(j>=0 && this.arr[j]<key){
                arr[j+1] = arr[j];
                j--;
            }
            this.arr[j+1] = key;
        }
    }
    // bubble sorting function for sorting array into ascending order
    public void bubbleSortAscendingOrder(){
        for(int i = 0;i<this.arr.length-1;i++){
            for(int j = 0;j<this.arr.length-i-1;j++){
                if(this.arr[j]>this.arr[j+1]){
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
            }
        }
    }
    // bubble sort function for sorting array into descending order
    public void bubbleSortDescendingOrder(){
        for(int i = 0;i<this.arr.length-1;i++){
            for(int j = 0;j<this.arr.length-1-i;j++){
                if(this.arr[j]<this.arr[j+1]){
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
            }
        }
    }
    //selection sort function for sorting array into ascending order
    public void selectionSortAscendingOrder(){
        int min_index;
        for(int i = 0;i<this.arr.length;i++){
            min_index = i;
            for(int j = i+1;j<this.arr.length;j++){
                if(this.arr[min_index]>this.arr[j]){
                    min_index = j;
                }
            }
            if(min_index!=i){
                int temp = this.arr[i];
                this.arr[i] = this.arr[min_index];
                this.arr[min_index] = temp;
            }
        }
    }
    //selection sort function for sorting array into descending order
    public void selectionSortDescendingOrder(){
        int max_index;
        for(int i = 0;i<this.arr.length;i++){
            max_index = i;
            for(int j = i+1;j<this.arr.length;j++){
                if(this.arr[max_index]<this.arr[j]){
                    max_index = j;
                }
            }
            if(max_index!=i){
                int temp = this.arr[i];
                this.arr[i] = this.arr[max_index];
                this.arr[max_index] = temp;
            }
        }
    }
}
