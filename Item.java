
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    //Implemented in your own way
    String getName;
    public Item(String name){
        getName = name;
    }
    
    public String getName(){
        return getName;
    }
}
