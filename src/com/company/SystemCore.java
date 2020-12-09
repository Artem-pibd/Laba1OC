package com.company;

import java.util.HashMap;

public class SystemCore {

    private final int count = 6;
    private HashMap<Integer,SystemCall> systemCalls;
    private Stack stack;

    public SystemCore(Stack stack ) {
        this.stack = stack;
        systemCalls = new HashMap<>();

        systemCalls.put(1,new SystemCall(1 ,"Integer Integer"));
        systemCalls.put(2,new SystemCall(2 ,"String Integer String"));
        systemCalls.put(3,new SystemCall(3 ,"Double Double"));
        systemCalls.put(4,new SystemCall(4 ,"Double Double String"));
        systemCalls.put(5,new SystemCall(5 ,"Double String"));
    }

    public void print () {
        for (int i = 1; i < count; i++) {
            System.out.println(" Id системного вызова: " + systemCalls.get(i).getIndex() + ". Параметры:  " + systemCalls.get(i).getParameters());
        }
    }


    public  void systemCall (int id) {

        if(!systemCalls.containsKey(id)){
            System.out.println("Вызова не существует");
            return;
        }
        for (int i = 0; i < systemCalls.get(id).getParameters().split(" ").length; i++) {
            if(!stack.pop().getClass().getSimpleName().equals(systemCalls.get(id).getParameters().split(" ")[i]) ){
                System.out.println("Неверный набор аргументов");
                return;
            }
        }
        systemCalls.get(id).call();
    }

}
