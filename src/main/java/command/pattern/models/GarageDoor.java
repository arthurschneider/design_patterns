package command.pattern.models;


/**
 * @author aschneider
 * @since 19.06.2018
 */

public class GarageDoor {

    public void up(){
        System.out.println("Opens garage door");
    }
    
    public void down(){
        System.out.println("Closes garage door");
    }
    
    public void stop(){
        System.out.println("Stops garage door motor");
    }
    
    public void lightOn() {
        System.out.println("Turns on light in garage");
    }
    
    public void lightOff() {
        System.out.println("Turns off light in garage");
    }
}
