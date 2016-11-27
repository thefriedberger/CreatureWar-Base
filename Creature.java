import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   public int hp;
   public int strength;
   private int damage;
   public int humanHp;
   public int humanStr;
   private int maxStr;
   private int minStr;
   private int maxHp;
   private int minHp;
   private Random rand;
   public Creature(){
       this.hp = hp;
       this.strength = strength;
       damage = damage;
       rand = new Random();
   }
   
   public void setStrength() {
       strength = rand.nextInt(maxStr - minStr + 1) + minStr;
   }
   
   public void setHp() {
       hp = rand.nextInt(maxHp - minHp + 1) + minHp;
    }
    
   /**
    * calculates the damage dealt by any creature
    */
   public int setDamage(){
       damage = rand.nextInt(strength)+1;
       return damage;
   }
    
   /**
    * checks if creature is alive, as long as hp is over 0
    */
   public boolean isAlive() {
       boolean state = false;
       if (hp > 0) {
           state = true;
       }
       return state;
   }
}
