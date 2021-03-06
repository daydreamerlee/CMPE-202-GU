import greenfoot.*;
import javax.swing.JOptionPane;
/**
 * Write a description of class GreaterThanButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreaterThanButton extends Actor
{
    // instance variables - replace the example below with your own
    private int x;
    private OperatorStrategy os;

    /**
     * Constructor for objects of class GreaterThanButton
     */
    public GreaterThanButton()
    {
        GreenfootImage image = new GreenfootImage("Greater.png");
        setImage(image);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void act()
    {
      MouseInfo mouseInfo = Greenfoot.getMouseInfo();
      if(Greenfoot.mouseClicked(this)){
          Greenfoot.playSound("button_click.mp3");
          getWorldOfType(GamePlayWorld.class).operator= os.getOperationMode();
          LabelBox box = getWorldOfType(GamePlayWorld.class).getObjects(LabelBox.class).get(0);
          box.updateImage("Greater Than");
        }   
        
    }
    
    public void addStrategy(OperatorStrategy os){
        this.os = os;
    }
}
