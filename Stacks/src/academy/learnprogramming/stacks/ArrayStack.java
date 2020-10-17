package academy.learnprogramming.stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    //track index of the top position on the sack needed for push & pop

    private Employee[] stack;
    private int top; //top tracker

    public ArrayStack (int capacity){
        stack = new Employee[capacity]; //max # of items to be stored
    }

    public void push(Employee employee){
        if(top == stack.length){
            //need o resize the backing array
            Employee[] newArray = new Employee[2 * stack.length]; //practice to double the size to avoid having to resize it again

            //copy all of the elements from the stack to the new array
            //syntax copying from the stack starting from the first element onto the new array
            //copy from the fist element and stack.lenghth element
            System.arraycopy(stack, 0, newArray, 0, stack.length);

            //assign the newArray to the stack field
            stack = newArray;
        }

        stack[top++] = employee; //O(1) but worst case for push is linear time O(n) because the stack might be full (due to array)
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[--top]; //decrement top  (the top element of the stack is at top - 1
        stack[top]= null; //since we've popped the top element we have to null it out

        return employee;

        //if we don't worry about resizing the array after popping the stack = O(1) but if we want to take care of resizing
        // O(n) linear time
    }

    public Employee peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public void printStack(){
        for (int i = top - 1; i >= 0; i--){
            //printing stack from top to bottom
            System.out.println(stack[i]);
        }
    }



}
