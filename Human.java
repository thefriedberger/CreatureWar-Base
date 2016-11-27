import java.util.Random;
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    private int maxStr = 18;
    private int minStr = 5;
    private int maxHp = 30;
    private int minHp = 10;
    private Random rand;
    public Human(){
        Random rand = new Random();
    }
    
    public void setStrength() {
        super.setStrength();
        strength = rand.nextInt(maxStr - minStr + 1) + minStr;
    }
    
    public void setHp() {
        super.setHp();
        hp = rand.nextInt(maxHp - minHp + 1) + minHp;
    }
}
