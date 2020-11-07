/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * This is the constructor and is got a list of 10 products.
     *
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(0, "Samsung Galaxy S10"));
        manager.addProduct(new Product(1,  "Nokia Brick"));
        manager.addProduct(new Product(2,  "Iphone X"));
        manager.addProduct(new Product(3, "Samsung Galaxy S11"));
        manager.addProduct(new Product(4, "Samsung Galaxy S9"));
        manager.addProduct(new Product(5, "Nokia Lumia"));
        manager.addProduct(new Product(6, "Samsung Galaxy S8"));
        manager.addProduct(new Product(7, "Samsung Galaxy S7"));
        manager.addProduct(new Product(8, "Samsung Galaxy S6"));
        manager.addProduct(new Product(9, "Samsung Galaxy S5"));
    }
    
    /**
     * This method will run all the tests 
     */
    public void runDemo()
    {
       demoDeliverProduct();
       sellProduct(0);
       sellProduct(0);
       sellProduct(1);
       sellProduct(0);
       sellProduct(3);
       sellProduct(3);
       sellProduct(5);
       sellProduct(7);
       sellProduct(2);
       sellProduct(7);
    } 
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProduct()
    {
      manager.delivery(0, 1);
      manager.delivery(1, 3);
      manager.delivery(2, 5);
      manager.delivery(3, 9);
      manager.delivery(4, 9);
      manager.delivery(5, 9);
      manager.delivery(6, 9);
      manager.delivery(7, 9);
      manager.delivery(8, 9);
      manager.delivery(9, 9);
     
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        manager.printProductDetails(id);
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        
        if(manager.findProduct(id) != null) 
        {
            manager.printProductDetails(id);
            manager.sellQuantity(id);
            manager.printProductDetails(id);
        }
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
    
}
