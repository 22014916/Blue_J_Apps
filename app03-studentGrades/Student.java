
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
        this.name = fullName;
        this.id = studentID;
        this.credits= 0;
    }
    
    public void changeName(String replacementName) {
        this.name = replacementName;
    }
    
    public String getStudentID() {
        return id;
        
    }
    
    public void addCredits (int additionalPoints) {
    this.credits=additionalPoints;
    }
    
    public String getLoginName() {
    return name.substring(0,4) + id.substring(0,3);
  }

  /**
   * This will add the course to student which will be the course the student
   * is enrolled to.
   */
    public void EnrolCourse (String codeNumber, String title) {
     course = new Course (codeNumber, title);
} 
  
  public void print () {
      System.out.println("Student Name:" +name);
      System.out.println("Student id:" +id);
      System.out.println("Student credits:" +credits);
    }


    public void printFinalGrade () {
        
        course.courseSummary ();
    }
    
    public void calculateGrade() {
        
        course.calculategrade ();
    }
    
}
    
    
    
 
 
  