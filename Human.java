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
    private int humanStr;
    private int humanHp;
    private Random rand;
    public Human(int strength, int hp){
        super(hp, strength);
        Random rand = new Random();
        strength = humanStr;
        hp = humanHp;
    }
    
    public int setStrength() {
        int humanStr = rand.nextInt((maxStr - minStr) + 1) + minStr;
        return humanStr;
    }
    
    public int setHp() {
        int humanHp = rand.nextInt((maxHp - minHp) + 1) + minHp;
        return humanHp;
    }
}
