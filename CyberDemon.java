import java.util.Random;
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CyberDemon extends Creature
{
    private int maxStr = 40;
    private int minStr = 20;
    private int maxHp = 100;
    private int minHp = 25;
    private Random rand;
    public CyberDemon(){
        Random rand = new Random();
    }
    
    public int setStrength(int strength) {
        strength = rand.nextInt((maxStr - minStr) + 1) + minStr;
        return strength;
    }
    
    public int setHp(int hp) {
        hp = rand.nextInt((maxHp - minHp) + 1) + minHp;
        return hp;
    }
}
