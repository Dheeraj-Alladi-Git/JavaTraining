public class Arrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }



        /*Problem : 2
        int[] arr = {2,4,5,2,5,6,1,6,7};
        int minimum = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        System.out.println(minimum);
         */

        /*Problem : 3
        int[] arr = {24,6,4,73,3,5,76,4,3,34,6,56,23,5,65,75,342,34,567,234};
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 50){
                count++;
            }
        }
        System.out.println(count);*/
    }
}
