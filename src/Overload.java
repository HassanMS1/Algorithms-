public class Overload {

    public static void overload1 (int a ){
        System.out.println("Im the first");

    }

    public static String overload1 (String a){
        System.out.println("Im the second");
        return a;
    }



    public static void main(String[] args) {

        String a = overload1("Yo");
        overload1(4);
        String c = "Hassan";
        System.out.println(c.charAt(1));



    }


}
