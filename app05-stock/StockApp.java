
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * author (Abdul Salam)
 * @version 0.1
 */
public class StockApp
{
    public static final char CLEAR_CODE = '\u000c';
    
    public static final String QUIT = "quit";
    public static final String ADD = "add";

    public final int FIRST_ID = 200;
    // Use to get user input
    private InputReader input;

    private StockManager manager;
    
    private StockDemo demo;

    private int nextID = FIRST_ID;
    
    private String [] menuChoices;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager= new StockManager();
        demo = new StockDemo(manager);
         
        setUpMenu();
    }  
    
    private void setUpMenu()
    {
         menuChoices = new String[]
        {
        "Add a new product",
        "Remove an old product",
        "Deliver a quantity of product",
        "Sell a quantity of product",
        "Print all products",
        "Search for products",
        "Restock the product",
        "Quit the program",
        };
    }    
    
    /** Run method that prints out the heading
     * 
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();
            String choice = input.getInput().toLowerCase();
            
            
            
            if(choice.equals(QUIT))
                finished = true;
            else
             executeMenuChoice(choice);
        }
    }

    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
            
            String choice = input.getInput();
            choice = choice.toLowerCase();
            
            if (choice.equals("quit"))
            {
              finished = true;
            } 
            else
            {
                executeMenuChoice(choice);
            }    
        }   
    }
    
    /**
     * 
     */
    private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct();
        }    
        else if (choice.equals("remove"))
        {
            removeProduct();
        } 
         else if (choice.equals("printall"))
        { 
          printAllProducts();
        }  
         else if (choice.equals("deliver"))
        { 
          deliverProduct();
        } 
         else if (choice.equals("sell"))
        { 
          sellProduct();
        }
        else if (choice.equals("low stock"))
        { 
          displaylowstockProduct();
        }
        else if (choice.equals("restock"))
        { 
          restockProduct();
        }
        else if (choice.equals("search"))
        { 
          searchProduct();
        }
    }

    public void addProduct()
    {       
        System.out.println ("Add a new Product");
        System.out.println ();

        System.out.println ("Please enter the name of the product.");
        String name = input.getInput();

        Product product = new Product(nextID, name);
        manager.addProduct(product);
        
        System.out.println("\nAdded " + product + " to the stock");
        nextID++;
    }    

    public void removeProduct()
    {
        System.out.println ("Remove an old Product");
        System.out.println ();

        System.out.println ("Please enter the id of the product");
        String number = input.getInput();
        
        int id = Integer.parseInt(number);

         manager.removeProduct(id);
         
        nextID++; 
    }
    
    public void sellProduct()
    {
        System.out.println ("Sell a quantity of Product");
        System.out.println ();

        System.out.println ("Please enter the id of the product");
        String number = input.getInput();
        
        int id = Integer.parseInt(number);

         manager.sellQuantity(id);
         
        nextID++; 
    }
    
     public void displaylowstockProduct()
    {
        System.out.println ("The product stock is low ");
        System.out.println ();

         manager.displaylowstock();
         
        nextID++; 
    }
    
    public void deliverProduct()
    {
        System.out.println ("Deliver a quantity of Product");
        System.out.println ();

        System.out.println ("Please enter the id of the product");
        String number = input.getInput();
        
        int id = Integer.parseInt(number);
        
        System.out.println ("Please enter the amount of the product");
        String amount = input.getInput();
        
        int amount1 = Integer.parseInt(amount);
        
         manager.delivery(id, amount1);
         
        System.out.println("\nAdded " + amount + " product to the stock");
        nextID++; 
    }
    
    public void restockProduct()
    {
      System.out.println ("The product stock has been restocked ");
        System.out.println ();

         manager.restock();
         
        nextID++;  
    }    
    
    public void searchProduct()
    {
        System.out.println ("Search a new Product");
        System.out.println ();

        System.out.println ("Please enter the id of the product");
        String number = input.getInput();
        
        int id = Integer.parseInt(number);
        
        Product p1 = manager.findProduct(id);
        System.out.println(p1.getID() + p1.getName());
        
    }    
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Sell:       Sell a quantity of product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Low Stock:  The stock is low");
        System.out.println("    Search:     Search for product");
        System.out.println("    Deliver:    Deliver a quantity of product");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }

    public void printAllProducts()
    {
        manager.printAllProducts();  
    }    

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Abdul Salam");
        System.out.println("******************************");
    }
}
