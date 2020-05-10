import java.util.Arrays;

public class Recursive {


    public static String toBinary(int n) {
        if (n <= 1 ) {
            return String.valueOf(n);
        }
        return toBinary(n / 2) + String.valueOf(n % 2);
    }




    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return  str.charAt(0)+reverseString(str.substring(1));
    }






    public static int getTriangular (int num){
        int count =0;
        int trianglur=0;
        while (num >0){

            trianglur+= num;
            num--;
        }


        return trianglur;
    }








    public static String Fibernaci (int a,int b){





        String fibernaci ="";
        fibernaci += "";
        int max =0;


       for (int i =max; i<21; i++){
           fibernaci+=  max +" ";
            max = a + b;

            a=b;
            b=max;


        }

       return fibernaci;
    }


    String fibernaci ="";
    int fib=0;

    public  void fibaRecurs(int a , int b, int max ) {



        if (fib<max){
            fib = a + b;
            if (a==0 && b==1){
                fibernaci+= a + " " + b + " ";
            }
            a = b;
            b=fib;

            fibernaci +=fib + " ";
            fibaRecurs(a,b, max);
        }
        else  {
            System.out.println(fibernaci);
        }



    }


    public static void main(String[] args) {

        //System.out.println(reverseString("Hassan"));
        int a = 5;
        double b=6;

        //System.out.println(String.valueOf(a*b));

        /*
        System.out.println(Fibernaci(0,1));
        Recursive obj = new Recursive();
        obj.fibaRecurs( 0,1, 610);
        int tria =getTriangular(6);
        System.out.println(tria);

        */


        System.out.println(reverseString("Hassan") );

    }
}
