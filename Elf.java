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
    private int elfStr;
    private int elfHp;
    private int elfDmg;
    private Random rand;
    public Elf(int strength, int hp){
        super(hp, strength);
        Random rand = new Random();
        strength = elfStr;
        hp = elfHp;
    }
    
    public int setStrength() {
        int elfStr = rand.nextInt((maxStr - minStr) + 1) + minStr;
        return elfStr;
    }
    
    public int setHp() {
        int elfHp = rand.nextInt((maxHp - minHp) + 1) + minHp;
        return elfHp;
    }
    
    public int setDamage() {
        elfDmg = rand.nextInt((elfStr)+1);
        int damageMult = (elfDmg*2)*(1/10);

        if (damageMult > elfDmg) {
            return damageMult;
        }
        else {
            return elfDmg;
        }
    }
}
