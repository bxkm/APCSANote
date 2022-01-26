
/**
 * Write a description of class ArrayListPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ArrayListPractice
{
    public void ArrayListPractice(){
        ArrayList<Integer> numArray;
        numArray = new ArrayList<Integer>();
        for(int i = 0; i < 15; i++){
            numArray.add(i);
        }
        System.out.println(numArray);
        System.out.println();
        numArray.set(4, 35);
        numArray.set(8, numArray.get(5) + numArray.get(12));
        System.out.println(numArray);
    }

    public void ArrayListPractice2(){
        ArrayList<String> weekdays;
        weekdays = new ArrayList<String>();
        weekdays.add("Sunday");
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        for(int i = 0; i < weekdays.size(); i++){
           System.out.println(weekdays.get(i)); 
        }
    }
    
    public void ArrayListPractice3(){
        
    }
}
