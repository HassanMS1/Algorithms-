import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.add("Hassan");
        list.add("Jamal");
        list.add("Omasan");
        list.pollFirst();
        //for (String element : list) System.out.println(element);
        Iterator <String> iterator = list.iterator();
        while (iterator.hasNext()){
            //System.out.println(iterator.next());
        }


    }


}
