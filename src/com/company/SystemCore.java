package com.company;


public class SystemCore {

    private final int count = 5;
    private  SystemCall[] systemCalls = new SystemCall[count];
    private Stack stack;

    public SystemCore(Stack stack) {
        this.stack = stack;

        systemCalls [0] = new SystemCall(0 ,"Integer String");
        systemCalls [1] = new SystemCall(1 ,"String Integer String");
        systemCalls [2] = new SystemCall(2 ,"Double Double");
        systemCalls [3] = new SystemCall(3 ,"Double Double String");
        systemCalls [4] = new SystemCall(4 ,"Double String");

    }

    public void print () {
        for (int i = 0; i < count; i++) {
            System.out.println(" Id системного вызова: " + systemCalls[i].getIndex() + ". Параметры:  " + systemCalls[i].getParameters() );
        }
    }


    public  void systemCall (int id) {

        if(id > count || id < 0){
            System.out.println("Вызова не существует");
            return;
        }
        for (int i = 0; i < systemCalls[id].getParameters().split(" ").length; i++) {
            if(!stack.pop().getClass().getSimpleName().equals(systemCalls[id].getParameters().split(" ")[i])){
                System.out.println("Неверный набор аргументов");
                return;
            }
        }
        systemCalls[id].call();
    }

}
