//           Student Management System Console Based Interface!!!
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Student
{
    String name;
    int rollNumber;
    String grade;
    Student(String name,int rollNumber,String grade)//Initializing parameter values to the corresponding variables
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    //Getter methods which returns corresponding field...
    public String getStudent()
    {
        return name;
    }
    public int getRollNumber()
    {
        return rollNumber;
    }
    public String getGrade()
    {
        return grade;
    }
}
class StudentManagementSystem
{
    //Declaring List...
    public List<Student> students;
    StudentManagementSystem()
    {
        //Creating instance of the class to list...

        this.students = new ArrayList<>(); //ArrayList is used for the creation of list...
    }
    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void removeStudent(int rollNumber)
    {
        students.removeIf(student -> student.getRollNumber()==rollNumber);
    }
    public Student searchStudent(int rollNumber)
    {
        for(Student student : students)
        {
            if(student.getRollNumber() == rollNumber)
            {
                return student;
            }
        }
        return null;
    }
    public void displayAllStudents()
    {
        for(Student student : students)
        {
            System.out.println("Name: "+student.getStudent()+", Roll Number: "+student.getRollNumber()+", Grade: "+student.getGrade());
        }
    }
}
//     Main Class
public class StudentManagementSystemUI
{
    public static int choice;
    //Making these static to read them first...
    public static Scanner s = new Scanner(System.in);
    public static StudentManagementSystem system = new StudentManagementSystem();

    public static void main(String[] arg)
    {
        do
        {
            System.out.println("1.Add a Student\n2.Remove a Student\n3.Search a Student\n4.Display all Students\n5.Exit");
            System.out.println("Enter your choice:");
            choice = s.nextInt();
            switch(choice)
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting Student Management System!");
                    System.exit(0);
            }
        } while (choice != 5);
    }
    public static void addStudent()
    {
            System.out.print("Enter Student Details:\n");
            System.out.print("Enter Name:");
            //Consumes newline character...
            s.nextLine();
            String name = s.nextLine();
            System.out.print("Enter Roll Number:");
            int rollNumber = s.nextInt();
            System.out.print("Enter Grade:");
            //Consumes newline character...
            s.nextLine();
            String grade = s.nextLine();
            Student newStudent = new Student(name,rollNumber,grade);
            system.addStudent(newStudent);
            System.out.println("Student Added Successfully!\n");
    }
    public static void removeStudent()
    {
        System.out.println("Enter the RollNumber of the student to removed:");
        int rollNumber = s.nextInt();
        system.removeStudent(rollNumber);
        System.out.println("Student Removed Successfully!\n");
    }
    public static void searchStudent()
    {
        System.out.println("Enter the RollNumber of the student to search:");
        int rollNumber = s.nextInt();
        Student foundStudent = system.searchStudent(rollNumber);
        if(foundStudent!=null)
        {
            System.out.println("Student found!");
            System.out.println("Name: "+foundStudent.getStudent()+", Roll Number: "+foundStudent.getRollNumber()+", Grade: "+foundStudent.getGrade()+"\n");
        }
        else
        {
            System.out.println("Student not found!\n");
        }
    }
    public static void displayAllStudents()
    {
        System.out.println("All Students Detail:\n");
        system.displayAllStudents();
    }
}
