public class Main {

	public static void main(String[] args) {
		
		//Scanner sc=new Scanner(System.in);
		Student s=new Student();
		StudentGroup sg=new StudentGroup();
		sg.StudentGroup(10);//You may test that your code works find here
		sg.getStudents();
		sg.setStudents();
		sg.getStudent(5);
		sg.setStudent(new Student(12,Madhuri,12-10-1991,84.4),6);//Please check that your code works and has no 
		sg.addFirst(new Student(12,Madhuri,12-10-1991,84.4));//compilation problems before to submit
		sg.addLast(new Student(	12,Madhuri,12-10-1991,84.4));
		sg.add(new Student(12,Madhuri,12-10-1991,84.4),6);
		sg.remove(3);
		sg.remove(new Student(12,Madhuri,12-10-1991,84.4));
		sg.removeFromIndex(5);
		sg.removeFromElement(new Student(12,Madhuri,12-10-1991,84.4));
		sg.removeToIndex(2);
		sg.removeFromElement(new Student(12,Madhuri,12-10-1991,84.4));
		sg.bubbleSort(Student[] student);
}
		
}
