import java.util.Arrays;

public class arr {

    static String decimal2Binary (int d ){
        String binary="";

        while (d>0) {
            binary+=d%2+" ";
            d = d /2;
        }


        return binary;
    }



    public static void convertBinary(int num){
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;

            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

    public static String toBinary(int n) {
        if (n <= 1 ) {
            return String.valueOf(n);
        }
        return toBinary(n / 2) + String.valueOf(n % 2);
    }
     static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }
    public static int abs(int x)
    {
        if (x < 0) return -x;
        else return x;
    }

    public static void main(String[] args) {
        int [] myarr = {4,3,5,2,2254};
        int max = 0;
        boolean check =false;
        for (int i = 0; i< myarr.length; i++){
            for (int j = i+1; j<myarr.length; j++){
                if (myarr[j]==myarr[i]) {
                    System.out.println(myarr[j] + " and " + myarr[i] + " are the same");
                    check= true;
                }

            }


        }
        if (!check) {System.out.println("None are the same");}
        //System.out.println("Max is : " +max);
        int [] a = {4,3,5,2};
        int N = a.length;
        for (int i = 0; i < N/2; i++)
        {
            int temp = a[i];
            a[i] = a[N-1-i];
            a[N-i-1] = temp;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(decimal2Binary(4));
        convertBinary(4);
    }
}
