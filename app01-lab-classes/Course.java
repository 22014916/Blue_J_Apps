
/**
 * Write a description of class Course here.
 *
 * @author (Abdul Salam)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String title;
    
    private String codenumber;

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codenumber)
    {
      this.title = title;
      this.codenumber = codenumber;
    }
    
    /**
     * This will print out the course title and the course codenumber
     */
    public void print ()
 {
    System.out.println("Course:" + title + ", Code Number:" +codenumber);
    
 }
}

