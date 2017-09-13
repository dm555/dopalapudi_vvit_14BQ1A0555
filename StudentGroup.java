import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	//Scanner sc=new Scanner(System.in);
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		for(int i=0;i<students.length();i++)
		{
			return students[i];
		}
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
				if(student==NULL)
					throw IllegalArgumentException;				
				else
				
		}

	@Override
	public Student getStudent(int index) {
			if(inde<=0||index>=students.lenght())
				throw IllegalArguementException;
		else
			 return students[index];// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
	if(inde<=0||index>=students.length())
			throw IllegalArguementException();
	else if(students[index]==NULL)
			throw IllegalArguementException();
	else
		students[index]=student;
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		if(student==NULL)
			throw IllegalArgumentException;
		for(int i=0;i<students.length();i++)
		{	
		students[i]=student;
		students[i+1]=student[i];
		}// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
	if(student==NULL)
			throw IllegalArgumentException;
	else
		students[student.length()]=student;		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		if(student==NULL)
			throw IllegalArgumentException;
		else if(index<=0||index>=students.length())
			throw IllegalArguementException();
		else
		students[index]=student;	// Add your implementation here
	}

	@Override
	public void remove(int index) {
	 if(index<=0||index>=students.length())
			throw IllegalArguementException;
		delete(students[index]);// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		if(student==NULL)
			throw IllegalArgumentException;
		else
		{
		for(int i=0;i<students.length();i++)
		if(students[i]==student)
			{
			delete(students[i]);
			break;		
		}
		}		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
	 if(index<=0||index>=students.length())
			throw IllegalArguementException;
	else
		{
		for(int i=index;i<=students.length();i++)
		delete(students[i]);
		}	// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		if(student==NULL)
		throw IllegalArgumentException;// Add your implementation here
		else
		for(int i=0;i<students.length();i++)
		{
		if(students[i]==student)
			index=i+1;
		for(int j=index;j<students.length();i++)
			delete[j];
		}
	}

	@Override
	public void removeToIndex(int index) {
		if(index<=0||index>=students.length())
			throw IllegalArguementException;
		else
			{
				for(int i=index;i<students.length();i++)
				delete[i];
		}// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		if(student==NULL)
		throw IllegalArgumentException;
		else
		for(int i=0;i<students.length();i++)
		{	
		if(students[i]=student)
			int index=i;
		for(int i=index;i>=0;i--)
			delete(students[i]);// Add your implementation here
		}
	}
	@Override
	public void bubbleSort(Student[] students) {
			for(int i=0;i<=students.length();i++)
			{
			for(int j=i+1;j<students.length();j++)
			{	
			if(students[i]>students[j]) 
			{
				int temp=students[i];
				students[j]=students[i];
				studets[i]=temp;
			}
			}
		}// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if(date==NULL)
		throw IllegalArguementException;
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
			for(int i=0;i<students.length();i++)
				
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
