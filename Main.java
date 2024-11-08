import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();
        TreeSet<Student> Tset = new TreeSet<>();
        Stack<Student> stack = new Stack<>();

        Student a = new Student(1,"Andres","Andres@georgian");
        Student b = new Student(2,"Ivan","Ivan@georgian");
        Student c = new Student(3,"Martinez","Martinez@georgian");
        Student d = new Student(2,"test","test@georgian");
        
        Tset.add(a);
        Tset.add(b);
        Tset.add(c);
        Tset.add(d);

        for (Student s : Tset) {
            System.out.println(s.toString());
        }




    }

}
