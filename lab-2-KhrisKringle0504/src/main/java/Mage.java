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
public class Mage extends PlayerCharacter{

    public Mage(String n, int m) {
        super(n, m);
    }

public String shout(){
    return "FWOOSH";
}

public int damage(){
    return 11;
}
}
