import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class Checker implements Comparator<Student> {
    public int compare(Student A, Student B) {
        if (Math.abs(A.getCgpa() - B.getCgpa()) > 1e-6) {
            if (A.getCgpa() < B.getCgpa()) return 1;
            return -1;
        }
        if (A.getFname().compareTo(B.getFname()) != 0) return A.getFname().compareTo(B.getFname());
        return A.getId() - B.getId();
    }
}


public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Checker checker = new Checker();
        Collections.sort(studentList, checker);
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}