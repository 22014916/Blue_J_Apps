
import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Abdul Salam) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        stock.get(id).increaseQuantity(amount);
    }

    /**
     * Sell a product by it's ID.
     * Decrease the quantity of the product by the given amount.
     * @param id The ID of the product.
     */
    public void sellQuantity(int id)
    {
        stock.get(id).sellOne();
    }    

    /**
     * Renaming the product. The product id and also
     * setting the parameters of them.
     * @param int id and String name. 
     */
    public void renameProduct(int id, String name)
    {
        stock.get(id).renameProducts(name);
    }    

    /**
     * Remove product method.
     */
    public void removeProduct(int id)
    {
        stock.remove(id);
    }    

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {   
        Product product = stock.get(id);
        if(stock.contains(product) == true){
            return product;
        }
        else {
            System.out.println("No product found");
            return product;
        }
        
    }

    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails(int id)
    {
        System.out.println(stock.get(id).toString());
    }

    /**
     * This is a method that prints a list of products
     * based on their indivdual names.
     */
    public void productlistprint(String name)
    {   
        int count = 0;
        while (stock.size() > count) {
            String productName = stock.get(count).getName();
            if (name.toLowerCase().contains(productName.toLowerCase())) {
                System.out.println (stock.toString());
            } 
            count++;

        }
    }   

    /**
     * This is a method that prints a statement
     * when the stock level runs low.
     */

    public void displaylowstock()
    {
        int count = 0;
        while (stock.size() > count) {
            int stocklevel = stock.get(count).getQuantity();
            if (stocklevel <5) {
                System.out.println (stock.toString());
            } 
            count++;

        }
    }    
}
