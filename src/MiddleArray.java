public class MiddleArray {

    public int binarysearch (int [] arr,int x){

        int low =0;
        int high=arr.length -1;
        int middle=0;
        while (low<=high){
            middle= (low +high) /2;
            if (arr[middle]==x) {
                return middle;

            }
            else if (arr[middle] >x){
                high=middle-1;
            }
            else if (arr[middle]<x){
                low=middle+1;
            }

        }
        return 0;
    }




    public static void main(String[] args) {
        int [] array = {3,4,5,6,4,3,4,2,24,252,5235,235};
        MiddleArray obj = new MiddleArray();
        int binaryValue =obj.binarysearch(array,6);
        int lengt = array.length;
        int middle =0;
        if (array.length%2==0){
            middle= array.length /2 -1;
            System.out.println(array[middle]);
        }
        else {
            middle= Math.round(lengt /2 );
            System.out.println("Uneven array "+array[middle]);
        }

        System.out.println("Binary value" + binaryValue);


    }
}
