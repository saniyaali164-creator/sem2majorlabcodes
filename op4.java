public class op4 {
    public static void main(String[] args){
        /*
        int []arr={10,20,30,40,50};
        System.out.println("Original Array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println();
        System.out.println("Reversed Array:");
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        */
        int []arr={10,20,30,40,50};
        System.out.println("Original Array:");{
        for(int i = 0; i<=arr.length-1;i++)
        System.out.print(arr[i]+ ",");
        System.out.println();
    }
         System.out.println("Reverse  Array:");
        {
        for(int i = arr.length-1; i>=0;i--)
            
      System.out.print(arr[i]+ ",");
      System.out.println();
    }

}
}
