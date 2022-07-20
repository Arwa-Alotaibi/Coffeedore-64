import java.util.ArrayList;

public class Order {

    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();
    public Order() {
    }

    public Order(String name, double total , boolean ready ,ArrayList<Item> items ) {
        this.name = name;
        this.total = total ;
        this.ready = ready ;
        this.items = items ;
    }


    // Get 

    public String getName(){
        return name;

    }
    public double getTotal(){
        return total;
    }

    public boolean isready(){
        return ready;
    }

    public ArrayList <Item> getItems(){
        return items;
    }

    //Set 

    public void setName(String name){
        this.name = name; 
    }

    public void setTotal(double total ){
        this.total = total ;
    }

    public void setReady(boolean ready){
        this.ready = ready ;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;

    }

    
}
