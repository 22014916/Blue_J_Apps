
/**
 * Write a description of class Student here.
 *
 * @author (Abdul Salam)
 * @version (a version number or a date)
 */
public class Student
{
 private String name;
 
 private String id;
    //
    private int credits;

    private Course course;
    /**
     * Constructor for objects of class Student
     */
    public Student(String fullName,String studentID)
    {
        name = fullName;
        id = studentID;
        credits= 0;
    }
public void addCourse(Course course)
{
  this.course = course;
} 
}

