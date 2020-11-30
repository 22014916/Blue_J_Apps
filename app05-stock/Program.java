
/**
 * This is the program class in charge for the apps programming.
 *
 * @author (Abdul Salam)
 * @version (a version number or a date)
 */
public class Program
{
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main()
    {
        app = new StockApp();
        app.run();
    }
}
