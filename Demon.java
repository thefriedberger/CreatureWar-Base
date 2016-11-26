import java.util.Random;
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    private int maxStr = 25;
    private int minStr = 8;
    private int maxHp = 40;
    private int minHp = 15;
    private Random rand;
    public Demon(){
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
    
    public int setDamage() {
        super.setDamage();
        int damageMult = (setDamage()+50)*(1/10);

        if (damageMult > setDamage()) {
            return damageMult;
        }
        else {
            return setDamage();
        }
    }
}
