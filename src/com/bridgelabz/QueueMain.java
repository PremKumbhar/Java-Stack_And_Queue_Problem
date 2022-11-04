package com.bridgelabz;

public class QueueMain {
	public static void main(String[] args)
    {
        System.out.println("***** Create a Queue *****");
        Queue<Integer> queueObject = new Queue<>();
        queueObject.enQueue(56);
        queueObject.enQueue(30);
        queueObject.enQueue(70);
        System.out.println("***** Display Queue Elements *****");
        queueObject.displayQueue();
    }
}
