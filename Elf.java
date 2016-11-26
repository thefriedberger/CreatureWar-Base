import java.util.Random;
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    private int maxStr = 18;
    private int minStr = 5;
    private int maxHp = 25;
    private int minHp = 9;
    private Random rand;
    public Elf(){
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
        int damageMult = (setDamage()*2)*(1/10);

        if (damageMult > setDamage()) {
            return damageMult;
        }
        else {
            return setDamage();
        }
    }
}
