//Write a Java program to swap the first and last elements of an array.
public class task3 {
    public static void main(String[] args){
        int []arr = {1,2,3,4,5};
        int size = arr.length;
        
        System.out.println("Elements after swapping:");
        int temp = arr[0];
        arr[0]=arr[size-1];
        arr[size-1]=temp;
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " , ");
        }
    }
}
