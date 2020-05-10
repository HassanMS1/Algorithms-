import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

class Student {
    String name ;
    int age ;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}





public class HashMapp {
// Hashmap can creates a tables between different variable / objects  / strings / and associate them
    public static void main(String[] args) {
        String name = "Hassan" ;
        int age =35;
        String adresse = "Stolmakergata 9d";
        Student hassan = new Student("Hassan",35 );
        Student p2 = new Student ("Jamal", 36);

        HashMap<Integer, Student> myHash = new HashMap <Integer, Student>();
        HashMap <Integer, String>  simHash = new HashMap<Integer, String> ();
        myHash.put(1,hassan);

        for ( Student element : myHash.values()){
            System.out.println(element.age);
        }


        System.out.println(myHash);
        int c =  4200000; // value
        int d = 4200000; // value
        Integer i = new Integer(4200000); // Integer is a refrence
        Integer b = new Integer(4200000); // refrence will equal the same neccerly
        System.out.println(b.hashCode());
    }
}
