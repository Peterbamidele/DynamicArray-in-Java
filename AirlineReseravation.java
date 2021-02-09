package AirlineReservationwitMain;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AirlineReseravation {
    private int array[]; // The current size of array

    private int size; //  total capacity of array

    private int capacity; //

    public AirlineReseravation(){
        array = new int[2];
        size=0;
        capacity=2;
    }

    public void addElement(int element){
                if (size == capacity){
            ensureCapacity(2);
        }
        array[size] = element;
        size++;
    }


    public void addElement(int index, int element){  //add an element at a particular index

        if (size == capacity){      // double the capacity if all the allocated space is utilized
            ensureCapacity(2);
        }

        for(int i=size-1;i>=index;i--){ // Moving all elements from the given index to right
            array[i+1] = array[i];
        }
        // insert the element at the specified index
        array[index] = element;
        size++;

    }


    public int getElement(int index){  // get an element at an index
        return array[index];
    }


    public void remove(int index){  // to remove an element at a particular index
        if(index>=size || index<0){
            System.out.println("No element at this index");
        }
        else
            {

            for(int i=index;i<size-1;i++){
                array[i] = array[i+1];
            }
            array[size-1]=0;
            size--;
        }
    }

        public void ensureCapacity(int minCapacity) {   //method to increase the capacity and know the minimum capacity it can add
            int number[] = new int[capacity*minCapacity];

            for (int i=0; i < capacity; i++){
                number[i] = array[i];
            }
            array = number;
            capacity = capacity * minCapacity;
        }

    public void trimToSize(){
        System.out.println("the array");
        int person[] = new int[size];
        for (int i=0; i < size; i++){
            person[i] = array[i];
        }
        array = person;
        capacity = array.length;

    }

    public int size(){  // to get the current size
        return size;
    }

    // to get the current capacity
    public int capacity(){
        return capacity;
    }


    public void printElements(){ // method to print elements in array
        System.out.println("elements in array are :" + Arrays.toString(array));
    }
}
