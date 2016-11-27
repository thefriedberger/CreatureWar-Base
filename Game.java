import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    private ArrayList<Creature> armyOne;
    private ArrayList<Creature> armyTwo;
    private int strength;
    private int hp;
    private Random rand;
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        armyOne = new ArrayList<Creature>();
        armyTwo = new ArrayList<Creature>();
        rand = new Random();
    }
    
    public void populate() {
        for(int i = 0; i < 100; i++) {
            hp = rand.nextInt(30 - 10 + 1) + 10;
            strength = rand.nextInt(18 - 5 + 1) + 5;
            armyOne.add(new Human());
        }
        
        for(int i = 0; i < 100; i++) {
            armyTwo.add(new Elf());
        }
    }
    
    public void war() {
        Iterator it = armyOne.iterator();
        Iterator itr = armyTwo.iterator();
        for (int i = 0; i < 100; i++){
            while (it.hasNext()){
                while(armyOne == isAlive() && armyTwo == isAlive()){
                    
                }                
            }
        }
    }
}
