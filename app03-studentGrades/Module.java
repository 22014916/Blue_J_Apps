
/**
 * Write a description of class Module here.
 *
 * @author (Abdul Salam)
 * @version (a version number or a date)
 */
public class Module
{
   private String title;
   
   private String codenumber;
   
   private int mark;
   
   

  public Module(String title, String codenumber,int Percentagemarks)
  {
    this.title = title;
    this.codenumber = codenumber;
    this.mark = Percentagemarks;
  } 
  
  public void awardMark(int mark)
{
      if ((mark >=0) && (mark <=100))
  {   
      this.mark= mark;   
  }  
  else
  {
     System.out.print ("Invalid Mark"); 
  }    
}
  public void print()
  { 
      System.out.println("Module:" + codenumber + 
         " " + title + "Mark = " + mark);
      
  
  }
  
  public int getmark()
  {
    return mark;
  }
  
}    
   