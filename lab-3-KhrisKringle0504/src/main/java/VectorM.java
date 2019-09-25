/**
 * Class: 44-242 Data Structures
 * Author: (Chris Pirnack)
 * Description: (return 0)
 * Due: (9/18**
 * Cla/19)
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any other student.
   I have not given my code to any other student and will not share this code
   with anyone under any circumstances.
*/
public class VectorM {
    int[] Array1;
    int g,s;
    public VectorM(){}
    public VectorM(int size){
        Array1 = new int[size];
    }
    public int size(){ 
        //displays the length of the array
        return this.Array1.length;
    }
    public int dot(VectorM v){
        if (Array1.length != v.size()){
            throw new LengthMismatchException();}
       
        for(int i = 0; i < Array1.length; i++){
            //multiplies the index and the one to the right of it
        g = Array1[i] * v.get(i);
        s = s+g;  
        }
        return s;
    }
    public VectorM add(VectorM v){
        //checks for the size exception
         if (Array1.length != v.size()) {
             throw new LengthMismatchException();}
        VectorM v2 = new VectorM(Array1.length);
        //adds array1 to v and sets it to i index in v2
        for(int i = 0; i < Array1.length; i++){
            v2.set(i,Array1[i] + v.get(i));
        }
        return v2; 
    }
    public void set(int idx, int value){
        Array1[idx] = value;
    }
    public int get(int idx){ 
        return Array1[idx];
    }
}