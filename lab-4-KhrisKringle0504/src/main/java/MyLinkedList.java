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
public class MyLinkedList implements MyListInterface {
    private class Node
    {
        public Node next;
        Integer data;
        public Node(Integer data)
        {
            this.data = data;
            this.next = null;
        }

        public Node(Integer data, Node n)
        {
            this.data=data;
            this.next = n;
        }
    }

    private Node head, tail;
    private int m_size;
    public MyLinkedList()
    {
        head = null;
        tail = null;
        m_size = 0;
    }

    public Integer get(int index) throws IndexOutOfBoundsException
    {
        if (index >= m_size)
            throw new IndexOutOfBoundsException();
        if(size() == 0){
            add(index);
        }
            Node iter = head;
            for(int i = 0; i<index; i++){
                iter = iter.next;
            }
        return iter.data;
    }

    public int size()
    {
        return m_size;
    }
    public void addAtFront(Integer data)
    {
        Node newnode = new Node(data);
        if (m_size == 0)
        {
            head = newnode;
            tail = newnode;
        }
        else
        {
            newnode.next = head;
            head = newnode;
        }
        m_size ++;
    }

    public void addAtBack(Integer data)
    {
        Node newnode = new Node (data);
        if (m_size == 0)
        {
            head = newnode;
            tail = newnode;
        }
        else
        {
            tail.next = newnode;
            tail = newnode;
        }
        m_size ++;
    }

    public void add(Integer data)
    {
        addAtBack(data);
    }

    public int indexOf(Integer data)
    {
        // TODO Milestone 6
        Node iter = head;
        for (int i = 0; i<size(); i++){
            if(iter.data == data){
                return i;
            }
            //it makes the iter to the next index
            iter = iter.next;
        }
        return -1;
    }

    public void set(int idx, Integer data) throws IndexOutOfBoundsException
    {
        if (idx >= m_size)
            throw new IndexOutOfBoundsException("Index too large.");
        Node n = head;
        for (int i=0; i<idx; i++)
        {
            n = n.next;
        }
        n.data = data;
    }

    public void add(int idx, Integer data) throws IndexOutOfBoundsException
    {
        if (idx > m_size)
            throw new IndexOutOfBoundsException();
        if(idx == size()){
            add(data);
        }else if(idx == 0){
            //If there is no data it adds it to the front
            addAtFront(data);
        }else{
            Node n = new Node(data);
            Node iter = head;
            for(int i = 0; i<idx-1; i++){
                iter = iter.next;
            }
            n.next = iter.next;
            iter.next = n;
            m_size++;
        }
    } 
    Integer removeFront() throws IndexOutOfBoundsException
    {
        if (m_size == 0)
            throw new IndexOutOfBoundsException("Cannot pop from empty list");
        Integer data = head.data;
        m_size --;
        head = head.next;
        if (head == null)
        {
            tail = null;
        }
        return data;
    }

    Integer removeLast() throws IndexOutOfBoundsException
    {
        if (m_size == 0)
            throw new IndexOutOfBoundsException("Cannot pop from empty list");
        Integer data = tail.data;
        Node n = head;
        m_size--;
        if (m_size == 0)
        {
            head = null;
            tail = null;
        }
        else {
            for (int i = 0; i < m_size; i++)
                n = n.next;
            tail = n;
            tail.next = null;
        }
        return data;
    }

    public void remove(int idx) throws IndexOutOfBoundsException
    {
        // TODO Milestone 7
        if (idx >= m_size){
            throw new IndexOutOfBoundsException();
        }
        //If it doesn't have any data it removes the front
        if (idx == 0){
            removeFront();
        }
        //the for for iterating through the list
        else{
            Node iter = head;
            for (int i = 0; i< idx-1;i++){
                iter = iter.next;
            }
            Node toremove = iter.next;
            iter.next = toremove.next;
            if (toremove == tail){
                tail = iter;
            }
        }
        m_size--;
    }
    public Integer front()
    {
        return head.data;
    }

    public Integer back()
    {
        return tail.data;
    }

}

