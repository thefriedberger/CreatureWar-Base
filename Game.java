import java.util.ArrayList;
import java.util.Random;
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
            strength = rand.nextInt(18 - 5 + 1) + 5;
            hp = rand.nextInt(30 - 10 + 1) + 10;
            armyOne.add(new Human(strength, hp));
        }
        
        for(int i = 0; i < 100; i++) {
            strength = rand.nextInt(18 - 5 + 1) + 5;
            hp = rand.nextInt(25 - 9 + 1) + 9;
            armyTwo.add(new Elf(strength, hp));
        }
    }
}
