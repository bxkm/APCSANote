
/**
 * Write a description of class School here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class School
{
    ArrayList<Student> listOfStudents;
    int nextIDnum = 1;
    int ID;
    public School(int schoolID){
        listOfStudents = new ArrayList<Student>();
        ID = schoolID;
    }
    public void addStudent(Student student){
        listOfStudents.add(student);
    }
    public void removeFirstStudent(){
        listOfStudents.remove(0);
    }
    /*
     * Removes the student frokm thelist,
     * and returns
     */
    public void removeStudent(Student student){
        //Find the index of the student to remove
        int index = -1;
        for(int i = 0; i < listOfStudents.size();i++){
            if(student.equals(listOfStudents.get(i))){
                index = i;
            }
        }
        //Remove them
        if (index >= 0){
            listOfStudents.remove(index);
        }
    }
    public void testAddStudent(int numOfStudents){
        for(int i = 0; i < numOfStudents; i++){
            addStudent(new Student("Test",nextIDnum));
            nextIDnum++;
        }
    }
    public ArrayList<Student> getStudent(){
        return listOfStudents;
    }
    public int getID(){
        return ID;
    }
    public void updateStudent(int index, Student student){
        listOfStudents.set(index, student);
        //Changes or overwrites the indes to tbe the new student
        
    }
}
