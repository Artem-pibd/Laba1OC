package com.company;

public class Main {

    public static void main(String[] args) {

        final Stack stack = new Stack(15);
        final SystemCore systemCore = new SystemCore(stack);

        systemCore.print();

        System.out.println();


        stack.push(" awdawd ");
        stack.push(1);
        systemCore.systemCall(0);

        stack.push("string");
        stack.push(4);
        stack.push("string");
        systemCore.systemCall(1);

        stack.push("string");
        stack.push(4);
        stack.push("string");
        systemCore.systemCall(2);


        stack.push("string");
        stack.push(4.3);
        stack.push(4.4);
        systemCore.systemCall(3);
    }
}
