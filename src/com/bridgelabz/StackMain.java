package com.bridgelabz;

public class StackMain {
	public static void main(String[] args)
    {
        System.out.println("Create Stack Using Linked list methods ");
        System.out.println("Push the elements into the Stack ");
        Stack<Integer> stackObject = new Stack<>();
        stackObject.push(70);
        stackObject.push(30);
        stackObject.push(56);
        stackObject.show();
    }
}
