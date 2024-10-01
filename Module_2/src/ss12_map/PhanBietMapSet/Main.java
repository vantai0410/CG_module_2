package ss12_map.PhanBietMapSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
        Map<Integer,Student> students = new HashMap<Integer,Student>();
        students.put(1, student1);
        students.put(2, student2);
        students.put(3, student3);
        for(Integer key : students.keySet()) {
            System.out.println(students.get(key));
        }

        System.out.println(".................set");
        Set<Student> st = new HashSet<Student>();
        st.add(student1);
        st.add(student2);
        st.add(student3);
        for(Student student : st) {
            System.out.println(student);
        }
    }
}
