
/**
 * Write a description of class Variable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Variable
{
   private static int b = 100;
   // Two slashes creates a comment
   /*
   * This is a multi-line comment
   */
    
   public static void main(){
      System.out.print("This prints one one...");
      System.out.print("line");
      System.out.println("!"); //The new line appears after the new text.
      int a = 5;
   }
   public static void main2(){
      
      // THe declaration allocates memory, and variable lifespan
      int a;  //Declaration or variable a.
      
      
      
      a = 15; //Instantiating the variable "a" to 15.
      if (a == 15){
          int c = 4;
          
      }
      System.out.println(b);
   }
   public static void main3(){
       int a = 4;
       int b = 2;
       int c = 5;
       System.out.println(a + b); // 6
       System.out.println(a - b); // 2
       System.out.println(a * b); // 8
       System.out.println(a / b); // 2 (integer division. No decimals allowed)
       System.out.println(c / b); // 2 (also integer division)
       System.out.println((double)c / b); // 2.5 - c is now a double
       System.out.println(29/10); // 2 (integer division)
       System.out.println(29/10.); // 2.9 (10 is now a double)
       
       //Odd Stuff (Modulus)
       System.out.println(5 % 2);
       System.out.println(10 % 2);
       System.out.println(25 % 4);
       //If you want to check for divisibility,
       //check to seee if the remainder is 0
    }
}