import java.util.Objects;
// In this program we compare objects with different refrence but same values
// we use this by catching equality by equaly method (by nature only checks refs)
// and hashcode metod this can be metods can be edit by your self or generated by the IDE
// there is contract between equal metod and hashcode . If one is changed without the other
// it is violation. The hash code is a number (location) in the hash table
class Person {

    private String name;
    private String fname;
    private int fnummer;

    public Person(String name, String fname, int fnummer) {
        this.name = name;
        this.fname = fname;
        this.fnummer = fnummer;
    }

    public String getName() {
        return name;
    }

    public String getFname() {
        return fname;
    }

    public int getFnummer() {
        return fnummer;
    }

     // now we will override the inherit object.equals () metod. Akkurat som toString
     // By equals ()  compares only the refrence of objects, therefor two objects with
     // same valus can slipe through

     /* @Override
     public boolean equals(Object obj) {
         if (obj == null) return  false;
         if ( !(obj instanceof Person))return false;
         Person p2 = (Person) obj;
         return this.name.equalsIgnoreCase(p2.name) && fname.equalsIgnoreCase(p2.fname)
                 && fnummer == p2.fnummer;

     }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fnummer == person.fnummer &&
                Objects.equals(name, person.name) &&
                Objects.equals(fname, person.fname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fname, fnummer);
    }
}



public class Equalss {


    public static void main(String[]args){
    Person p1 = new Person("Hassan", "Sheikh", 231084);
    Person p2 = new Person("Hassan", "Sheikh", 231084);

     /*Vi må unngå at det personer kan registrer seg med like variabler.
         For samlinge dem to objekter bruker innbygd equel () metode*, problemet det gir false return /
     */
      int p11= p1.hashCode(); //Person@1b6d3586 460141958
      int p22 = p2.hashCode(); // Person@4554617c 1163157884
        System.out.println("Objects hashcodes are now: " +  (p1.hashCode() ==p2.hashCode()));

        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1 == s2); // compares the refrence. Each new call creates is new object
        System.out.println(s1.equals(s2)); // compares value of s2, only the values gets passed



            }


}



