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
    private Human h;
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        armyOne = new ArrayList<Creature>();
        armyTwo = new ArrayList<Creature>();
        rand = new Random();
        h = new Human();
    }
    
    public void populate() {
        for(int i = 0; i < 100; i++) {
            armyOne.add(h);
        }
        
        for(int i = 0; i < 100; i++) {
            armyTwo.add(h);
        }
    }
}
