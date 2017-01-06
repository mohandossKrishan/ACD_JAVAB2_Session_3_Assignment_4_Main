import java.lang.*;
import java.io.*;
class Student
{
	String studentName;
	int rollNumber;
	int maths,science;
	int total;
	float percentage;
	void studentDetails() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print ("Enter studentName : ");
		studentName = br.readLine();

		System.out.print ("Enter Roll No. of Student : ");
		rollNumber = Integer.parseInt(br.readLine());

		System.out.print ("Enter marks in Maths out of 100 : ");
		maths = Integer.parseInt(br.readLine());

		System.out.print ("Enter marks in Science out of 100 : ");
		science = Integer.parseInt(br.readLine());
	}
	void calculation()
	{
		total=maths+science;
		percentage=(total*100)/200;
		System.out.println ("Roll No.    = "+rollNumber);
		System.out.println ("studentName = "+studentName);
		System.out.println ("Maths       = "+maths);
		System.out.println ("Physics     = "+science);
		System.out.println ("Total Marks = "+total);
		System.out.println ("Percentage = "+percentage+"%");
                if (maths >= 40 && science >=40 && total >=50) { 
			System.out.println ("Result = Passed"); 
		} else { 
		System.out.println ("Result = Failed"); 
		}
		
	}
}
class StudentResult
{
	public static void main(String args[]) throws IOException
	{
		Student stu =new Student();
		stu.studentDetails();
		stu.calculation();
	}
}
    