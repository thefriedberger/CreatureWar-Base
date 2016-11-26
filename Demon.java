import java.util.Random;
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    private int maxStr = 18;
    private int minStr = 5;
    private int maxHp = 25;
    private int minHp = 9;
    private int demonStr;
    private int demonHp;
    private int demonDmg;
    private Random rand;
    public Demon(int strength, int hp){
        super(hp, strength);
        Random rand = new Random();
        strength = demonStr;
        hp = demonHp;
    }
    
    public int setStrength() {
        int demonStr = rand.nextInt((maxStr - minStr) + 1) + minStr;
        return demonStr;
    }
    
    public int setHp() {
        int demonHp = rand.nextInt((maxHp - minHp) + 1) + minHp;
        return demonHp;
    }
    
    public int setDamage() {
        demonDmg = rand.nextInt((demonStr)+1);
        int damageMult = (demonDmg+50)*(1/10);

        if (damageMult > demonDmg) {
            return damageMult;
        }
        else {
            return demonDmg;
        }
    }
}
