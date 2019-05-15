package queue;

import queue.model.QueueImpl;

public class Main {
	public static void main(String[] args) {
		var q1 = new QueueImpl<String>();
		var q2 = q1.enQueue("1");
		
		System.out.println(q1.isEmpty());	// true
		System.out.println(q2.isEmpty());	// false
		System.out.println(q2.head());		// "1"
	}
}
