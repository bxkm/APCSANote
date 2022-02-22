
/**
 * Abstract class Ammo - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Ammo
{
    String ammoTypes;
    public Ammo(String ammo){
        ammoTypes = ammo;
    }
    
    public Ammo(){
        ammoTypes = "bullet";
    }
}
