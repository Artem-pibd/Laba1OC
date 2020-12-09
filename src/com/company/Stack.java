package com.company;

public class Stack {

    private int size;
    private int i = 0;
    private Object[] objects;

    public Stack(int size){
        this.size = size;
        objects = new Object[size];
    }

    public void push(Object o){
        if(i < size){
            objects[i] = o;
            i++;
            return;
        }
    }
    public Object pop(){
        if(i > 0){
            i--;
            return objects[i];
        }
        return null;
    }

}
