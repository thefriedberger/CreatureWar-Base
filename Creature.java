import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   private int hp = 10;
   private int strength = 10;
   private int damage;
   
   public Creature(int hp, int strength){
       this.hp = hp;
       this.strength = strength;
       damage = damage;
   }
    
   /**
    * calculates the damage dealt by any creature
    */
   public int setDamage(){
       Random rand = new Random();
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
