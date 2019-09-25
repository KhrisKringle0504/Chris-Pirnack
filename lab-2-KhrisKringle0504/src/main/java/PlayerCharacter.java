/**
 * Class: 44-242 Data Structures
 * Author: (Chris Pirnack)
 * Description: (We made characters to use as an example for inheritence)
 * Due: (9/5/19)
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any other student.
   I have not given my code to any other student and will not share this code
   with anyone under any circumstances.
*/
public abstract class PlayerCharacter implements Targetable{
    protected String name;
    protected int maxHP;
    protected int currHP;
    public abstract String shout();
    public abstract int damage();
    
    PlayerCharacter(String n, int m)
    {
        name = n;
        maxHP = m;
        currHP = maxHP;
    }
    
    public void hurt(int hp){
        currHP = currHP - hp;
        if (currHP < 0){
            currHP = 0;
        }
    }
    
    public void heal(int hp){
        currHP = currHP + hp;
        if (currHP > maxHP){
            currHP = maxHP;
        }
    }
    public int getHP(){
        return currHP;
    }
}
    