/**
 * Class: 44-242 Data Structures
 * Author: (Chris Pirnack)
 * Description: (return 0)
 * Due: (9/19/19)
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any other student.
   I have not given my code to any other student and will not share this code
   with anyone under any circumstances.
*/
public class MyArrayList implements MyListInterface {
    private int m_size;
    private Integer m_data[];

    public MyArrayList()
    {
        m_size = 0;
        m_data = new Integer[2];
    }

    public int max_size()
    {
        return m_data.length;
    }
    public int size()
    {
        return m_size;
    }
    public void doubleCapacity()
    {
        Integer temp[] = m_data;
        m_data = new Integer[temp.length*2];
        for (int i=0; i<m_size; i++)
            m_data[i] = temp[i];
    }
    public void halveCapacity()
    {
        Integer temp[] = m_data;
        m_data = new Integer[temp.length/2];
        for (int i=0; i<m_size; i++)
            m_data[i] = temp[i];
    }

    public void add(Integer val)
    {
        add(m_size, val);
    }

    public void add(int index, Integer val) {
        if (index > size()){
            throw new IndexOutOfBoundsException();
        }
        if (size() == max_size()){
            doubleCapacity();
        }
        for (int i = size(); i > index;i--){
            m_data[i] = m_data[i-1];
        }
        m_data[index] = val;
        m_size++;
    }

    public void remove(int index) {
        if(index >= size()){
            throw new IndexOutOfBoundsException();
        }
        for(int i = index; i<size()-1; i++){
            //shifts the data
            m_data[i] = m_data[i+1];
        }
        m_size--;
        //multiply instead of divide .25!!  TO half the capacity
        if(size() <= (max_size()*.25)){
            halveCapacity();
        }
        
    }

    public int indexOf(Integer value) {
        for(int i = 0; i<m_size;i++){
            //if the index has the right value it stops and returns the index
            if(m_data[i] == value){
                return i;
            }
        }
        return -1;
    }

    public Integer get(int index) {
        if (index >= m_size){
            throw new IndexOutOfBoundsException();
        }
        return m_data[index];
    }

    public void set(int index, Integer value) {
        if (index >= m_size)
            throw new IndexOutOfBoundsException();
        m_data[index] = value;
    }
}

