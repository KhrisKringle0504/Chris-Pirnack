/**
 * Class: 44-242 Data Structures
 * Author: (Chris Pirnack)
 * Description: (return 0)
 * Due: (9/18/19)
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any other student.
   I have not given my code to any other student and will not share this code
   with anyone under any circumstances.
*/
public class LengthMismatchException extends RuntimeException {
   
    public LengthMismatchException(){
        super();
    }
    public LengthMismatchException(String mesg){
        super(mesg);}
}