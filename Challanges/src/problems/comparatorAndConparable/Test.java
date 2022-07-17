package problems.comparatorAndConparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("madhu", 2, 17));
        studentList.add(new Student("mahi", 1, 21));
        studentList.add(new Student("manoj", 3, 22));
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getRollNo() > s2.getRollNo()) {
                    return 1;
                } else if (s1.getRollNo() < s2.getRollNo()) {
                    return -1;
                }
                return 0;
            }
        };
//        Collections.sort(studentList);
        Collections.sort(studentList, comparator);
        for (Student s: studentList) {
            System.out.println(s);
        }
    }
}
