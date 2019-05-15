package queue;

import queue.model.ImmutableQueue;

public class Main {
	public static void main(String[] args) {
		var q1 = new ImmutableQueue<String>();
		var q2 = q1.enQueue("1");
		
		System.out.println(q1.isEmpty());	// true
		System.out.println(q2.isEmpty());	// false
		System.out.println(q2.head());		// "1"
	}
}
