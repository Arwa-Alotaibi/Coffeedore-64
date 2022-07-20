import java.util.ArrayList;

public class CoffeeKiosk {

    //Member variables:
    private ArrayList <Item> menu;
    private ArrayList<Order> orders;


    //Constructors
    //Constructor - no params, initializes items and orders to empty arrays.
    public CoffeeKiosk(){
        menu= new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }
//Get
    public ArrayList<Item> getMenu(){
        return menu;
    }

    public ArrayList<Order> getOrder(){
        return orders;
    }

// set

public void setMenu(ArrayList <Item> menu){
    this.menu = menu ;
}

public void setOrder( ArrayList<Order> orders){
    this.orders = orders ;
}

public void addMenuItem(String name , double price){
    Item item = new Item ();
    item.setName(name);
    item.setPrice(price);
    menu.add(item);
}
public void displayMenu(){
    for(int i =0 ; i < menu.size();i++){
        System.out.println(i +" "+menu.get(i).getName()+"----"+"$"+menu.get(i).getPrice());
    }
}

public void neworder(){
    System.out.println("Please enter customer name for new order:");
    String name = System.console().readLine();

    Order order = new Order();
    order.setName(name);
    displayMenu();

    System.out.println("Please enter a menu item index or q to quit:");
    String itemNumber = System.console().readLine();
    int i = Integer.parseInt(itemNumber);

    while(!itemNumber.equals("q")) {
        Item item = menu.get(i);
        ArrayList<Item> orderItems = order.getItems();
        orderItems.add(item);

        System.out.println("Please enter a menu item index or q to quit:");
        itemNumber = System.console().readLine();
    }
        
    

        System.out.println(order.getName()+"order details");

        for(Item item : order.getItems()){
            System.out.println(item.getName()+" "+item.getPrice());

        }
}


}
