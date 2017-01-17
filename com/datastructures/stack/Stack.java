package com.datastructures.stack;

/**
 * Created by DJ on 1/16/17.
 */

/**
 * The Class of Stack containing necessary methods to implement basic stack functionality
 */
public class Stack {

    int [] stack;
    int size;
    private int top;

    /**
     *
     * @param size Size of a Stack
     */
    public Stack(int size){
        stack = new int[size];
        top=-1;
        this.size=size;
    }

    /**
     * Remove top memer of stack
     */
    public void pop(){

        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Member is "+stack[top]);
            top=top-1;
        }

    }

    /**
     * Insert member into top of stack
     * @param number the value
     */
    public void push(int number){
        if(top==size-1){
            System.out.println("Stack is Full");
        }
        else
            top=top+1;
            stack[top]=number;
    }

    /**
     *
     * @return size of stack
     */
    public int getSize(){
        return this.size;
    }

    /**
     * Display members of stack
     */
    public void display(){
        for(int i:stack){
            System.out.print("\t" + i);
        }
    }
}
