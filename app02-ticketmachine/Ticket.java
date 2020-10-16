import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author (Abdul Salam)
 * @version (a version number or a date)
 */
public class Ticket
{
   //Attributes
   
   //The Journey destination
   private String destination;
   
   // The ticket price in british pence
   private int price;
   
   // Date and time of the issued ticket
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
    
    public int getPrice()
    { return price;
        
    }   
    
    
    public String getDestination()
    { 
        return destination;
    }
    
    /** This is a print of the ticket informatiin printing 
     * destination of the ticket the price and 
     * dateTime.
     * 
     */
    public void print ()
    {
        System.out.println("Ticket" + destination + 
        "Price:" + price +
        "Issued" + issuedateTime);
    }
    
    
    
    
 }
