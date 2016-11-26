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
    private int humanStr;
    private int humanHp;
    private int elfStr;
    private int elfHp;
    private Random rand;
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        armyOne = new ArrayList<Creature>();
        armyTwo = new ArrayList<Creature>();
        Random rand = new Random();
    }
    
    public void populate() {
        for(int i = 0; i < 100; i++) {
            do {
                humanStr = rand.nextInt(18)-5;
            }while(humanStr==0);
            
            do {
                humanHp = rand.nextInt(30)-10;
            }while(humanHp==0);
            
            armyOne.add(new Human(humanStr, humanHp));
            
        }
    }
}
