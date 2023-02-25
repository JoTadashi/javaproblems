import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getCGPA() {
        return this.cgpa;
    }
} 

class Checker implements Comparator<Student> {
    public int compare(Student A, Student B) {
        int tf = Double.compare(A.getCGPA(), B.getCGPA());
        if (tf != 0)  return -tf;
        tf = A.getName().compareTo(B.getName());
        if (tf != 0) return tf;
        return A.getID() - B.getID();
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>(events.size(), new Checker());
        for (String x : events) {
            String[] lt = x.split(" ");
            if (lt[0].equals("ENTER")) {
                pq.add(new Student(Integer.parseInt(lt[3]), lt[1], Double.parseDouble(lt[2])));
            } else pq.poll();
        }
        List<Student> ret = new ArrayList<>();
        int len = pq.size();
        while(len -- > 0) ret.add(pq.poll());
        return ret;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}