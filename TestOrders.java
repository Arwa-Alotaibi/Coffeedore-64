import java.util.ArrayList;

public class TestOrders {
    
    public static void main(String[] args) {

        //inisializing CoffeeKiosk object
        CoffeeKiosk coffeKiosk = new CoffeeKiosk();
        coffeKiosk.addMenuItem("mocha", 10.0);
        coffeKiosk.addMenuItem("latte", 15.0);
        coffeKiosk.addMenuItem("drip coffee", 20.0);
        coffeKiosk.addMenuItem("capuccino", 55.0);
        coffeKiosk.displayMenu();
        coffeKiosk.neworder();
    }
}
