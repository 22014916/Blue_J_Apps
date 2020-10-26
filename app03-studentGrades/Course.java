
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
    
   private Module module1;
   private Module module2;
   private Module module3;
   private Module module4;

    /**
     * Constructor for objects of class Course
     */
    public Course(String codenumber, String title)
    {
      this.title = title;
      this.codenumber = codenumber;
      module1 = new Module("Programming Concepts", "CO452",90);
      module2 = new Module("Computer Architectures", "CO450",50);
      module3 = new Module("Networking", "CO451",70);
      module4 = new Module("Web Development", "CO456",40);
    }
    
    
    
    public void addMark(int mark,int modulenumber)
    {  
        if(modulenumber == 1)
        {
            module1.awardMark(mark);
        }
        
         if(modulenumber == 2)
        {
            module2.awardMark(mark);
        }
        
         if(modulenumber == 3)
        {
            module3.awardMark(mark);
        }
        
         if(modulenumber == 4)
        {
            module4.awardMark(mark);
        }
    }    
    
    /**
     * This will print out the course title and the course codenumber
     */
 public void print ()
 {
    System.out.println("Course:" + title + ", Code Number:" +codenumber);
    module1.print();
    module2.print();
    module3.print();
    module4.print();
 }
   

 
public Grades convertToGrade(int mark)
{  
    if((mark >=0) && (mark <40))
    
    {
        return Grades.F;    
    }
     
    return Grades.X;
}

 public Grades calculategrade()
 {
     int mark1 = module1.getmark();
     int mark2 = module2.getmark();
     int mark3 = module3.getmark();
     int mark4 = module4.getmark();
     
     float averagemarks = (mark1 + mark2 + mark3 + mark4) /4;
     
     if((averagemarks >=0) && (averagemarks <40))
    
    {
        return Grades.F;    
    } 
    
    else if((averagemarks >=40) && (averagemarks <49))
    
    {
        return Grades.D;    
    }
    
    else if((averagemarks >=50) && (averagemarks <59))
    
    {
        return Grades.C;    
    }
    
    else if((averagemarks >=60) && (averagemarks <69))
    
    {
        return Grades.B;    
    }
    
    else if((averagemarks >=70) && (averagemarks <100))
    
    {
        return Grades.A;    
    }
    
     return Grades.X;
 } 

 public void courseSummary()
 { 
    System.out.println(" module1marks " + module1.getmark());
    System.out.println(" module2marks " + module2.getmark());
    System.out.println(" module3marks " + module3.getmark());
    System.out.println(" module4marks " + module4.getmark());
    System.out.println("coursegrades" + calculategrade());
 }
  
}





