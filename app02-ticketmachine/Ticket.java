import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
   //Attributes
   
   private String destination;
   
   private int price;
   
   private Date issuedateTime;
   
   
    /**
     * Constructor for objects of class Ticket setting the destination and
     * price. The date will contain the current system date and time
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;
        
        
        issuedateTime = new Date();
    }  
    
    /**
     * 
     */
    public void print ()
    {
        System.out.println("Ticket" + destination + 
        "Price:" + price +
        "Issued" + issuedateTime);
    }
 }
