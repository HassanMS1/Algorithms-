public class Trian {

    public static int getTriang (int num){

        int trianglur=0;
        while (num>0){

            trianglur= trianglur +num;
            num--;
        }


        return trianglur;
    }


    public static void main(String[] args) {

        System.out.println(getTriang(6));


    }
}
