package com.company;

public class SystemCall {

    private int index;
    private Object[] objects;
    private String parameters;

    public SystemCall(int index, String parameters) {
        this.index = index;
        this.parameters = parameters;
    }


    public void call(){
        System.out.println("Системный вызов " + index + " прошел успешно.");
    }

    public int getIndex() {
        return index;
    }

    public String getParameters() {
        return parameters;
    }

    public Object[] getObjects() {
        return objects;
    }

}
