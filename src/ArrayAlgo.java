import java.util.Arrays;

public class ArrayAlgo {
int [] theArray = new int [50];
 // learn filling two dimensonal array
 int arraySize = 10;

 public void fillArray (){

     for ( int i = 0; i<arraySize; i++) {
         int random = (int) ((Math.random() * 10) + 10); // generates numbers between 10 -19
         while ( find(random)){
             random= (int) ((Math.random() * 10) + 10);
         }


         theArray[i]=random;
     }
 }

    public int getByIndex (int i) {

         if ( i <arraySize) return  theArray[i];
        return 0;


    }

    public void printArray () {

         System.out.println("--------");
         for (int i = 0; i<arraySize; i++){
         System.out.print(" | " + i + " |" );
         System.out.println(" " + theArray[i] + " | ");

         }

    }

    public void printHoriz () {

        for(int n = 0; n < 55; n++)System.out.print("-");
        System.out.println();
        System.out.print("Index: ");
        for (int c =0; c<arraySize; c++){
            System.out.print("| " + c +"  ");
        }
        System.out.println("|");


        for(int n = 0; n < 55; n++)System.out.print("-");
        System.out.println();
        System.out.print("Value: ");
        for (int c =0; c<arraySize; c++){
            System.out.print("| " + theArray[c] +" ");
        }
        System.out.println("");



    }
    public boolean find(int random ){
     for ( Integer element : theArray){
         if ( element==random) return true;
     }
     return false;

    }


    public boolean doesitContainValue (int i){

     for (Integer element : theArray)
         if (element==i) return true;


     return false;
    }

    public void deleteByIndex (int index ){
     // moves index from right to left to delete desired index
      if (index < arraySize) {
          for ( int i = index; i< (arraySize-1); i++){
            theArray[i] = theArray[i+1];
          }
        arraySize--;



      }
    }


    public void insertValua(int valua) {
     //1.check if the array size limit has been reached
     // arraySize ( self created variable ) helps you keeps track of the filled used space,you may increment or decrement
        // since arraySize ( ) start from 1 and array from 0. as long as arrraysize is less the 50, (49) there is place
     // 2. put new alua in the highest current array size valua. Because the highest arraySize is empty if not used
        if (arraySize<50){
            theArray[arraySize] = valua;
        }
        arraySize++;
    }

    public String searchLiniar (int numb){

     boolean found = false;
     String s = "The number was found in the following index(s):  ";
     int counter =0;
     for ( Integer element : theArray){
         if (element == numb) {
             found = true;
             s += counter + " ";

         }

         counter++;
     }

     if (!found) s = "Not found";
     return s;
    }



    public void bubbleSort(){
     // first loop goes backwards counting down from max arraysize,  second goes forwards. it sorts everything
     for (int i = arraySize-1; i>1; i--){

         // inner loop goes up to outerloop, compares current valua with right valua. calls swap() if neccesary
         for (int j=0;j<i;j++ ){
            if (theArray[j]>theArray[j+1]){
                swapValues (j,j+1);
                }


            }
         }
    }


    public void swapValues(int one, int two){
        int temp = theArray [one];
        theArray[one] = theArray[two];
        theArray[two] =temp;
    }


    public void deleteValue (int value){
     boolean found = false;
     for (int i = 0; i<(arraySize-1); i++){
         if(theArray[i] == value) {
             found= true;
             for ( int j = i; j<(arraySize-1); j++ ){
                 theArray[j] = theArray[j+1];

             }


         }

     }
     arraySize--;
     if( found ) {
         System.out.println("Value has been found and deleted");}
     else {
         System.out.println("Not found");
     }

    }

    public void binarySearchValue (int value){
     // Negatives : the array has to be sorted already
        int lowIndex= 0;
        int highIndex = arraySize-1; // until end of array
        while (lowIndex<=highIndex){
            int middleIndex = (highIndex + lowIndex) /2;
        }


    }


    public static void main(String[] args){
        ArrayAlgo obj = new ArrayAlgo();
        obj.fillArray();
        obj.printArray();
        int byindex = obj.getByIndex(3);
        //obj.deleteByIndex(3);

        obj.printArray();
        obj.insertValua(34);

        System.out.println(obj.searchLiniar(37));
        obj.bubbleSort();
        obj.printHoriz();
        obj.deleteValue(342);
        obj.printHoriz();
    }
}
