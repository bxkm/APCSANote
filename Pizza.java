
/**
 * Write a description of class Keyboard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pizza
{
    private String crust;
    private String sauce;
    private String cheese;
    private String topping;
    private int size;
    private boolean isCook;
    //Constructors
    public Pizza(String theCrust, String theSauce, String theCheese,
    String theTopping, int theSize, boolean isCook){
        crust = theCrust;
        sauce = theSauce;
        cheese = theCheese;
        topping = theTopping;
        size = theSize;
        this.isCook = isCook;
    }
    public Pizza(){
        crust = "stuff";
        sauce = "tomato";
        cheese = "mozzarella";
        topping = "peperoni and sausage";
        size = 16;
        isCook = false;
    }
    //Accesor Methods
    public String getCrust(){
        return crust;
    }
        public String getSauce(){
        return sauce;
    }
        public String getCheese(){
        return cheese;
    }
        public String getTopping(){
        return topping;
    }
        public int getSize(){
        return size;
    }
        public boolean isCook(){
        return isCook;
    }
    //Mutator Methods
    public void setCrust(String newCrust){
        crust = newCrust;
    }
        public void setSauce(String newSauce){
        sauce = newSauce;
    }
        public void setCheese(String newCheese){
        cheese = newCheese;
    }
        public void setTopping(String newTopping){
        topping = newTopping;
    }
    public void sizeofPizza(){
        if (size >= 18){
            System.out.println("You ordered an extra large pizza!");
        } else if (size >= 14) {
            System.out.println("You ordered a large pizza!");
        } else if (size >= 12) {
            System.out.println("You ordered a medium pizza!");
        } else {
            System.out.println("You ordered a small pizza!");
        }
    }
    public void cookPizza(){
        if (isCook){
            isCook = false;
        } else {
            isCook = true;
        }
    }
}
