public class TernaryOperator {
    // curly brackets are not needed in if condion but good practice, use it.
    // ? : works almost like if else. condtion ? else assesings variable : new value
    // its stores variable or to somethings if condiont true else oldvar : new vab
    public static void main(String[] args) {
        int a = 1 ;
        int b = 2 ;
        int c = new Integer(2);
         a = a== b ? 2 : 6;
        if ( a ==1)
            b = a;

        else
            b = b;
        System.out.println(b);
    }
}
