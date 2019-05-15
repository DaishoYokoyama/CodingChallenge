package test.queue.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import queue.model.ImmutableQueue;

class QueueImplTests {
	@Test
	void enQueueTest() {
		var q1 = new ImmutableQueue<String>();
		var q2 = q1.enQueue("item1");
		assertEquals(q2.head(), "item1"); 
		assertNotEquals(q1, q2);
	}
	
	@Test
	void deQueueTest() {
		var q1 = new ImmutableQueue<Integer>(1, 2, 3);
		assertFalse(q1.isEmpty());
		assertEquals(q1.head(), 1);
		
		var q2 = q1.deQueue();
		assertEquals(q1.head(), 1);		// not changed.
		assertEquals(q2.head(), 2);
		assertNotEquals(q1, q2);
		
		var q3 = q2.deQueue();
		assertEquals(q3.head(), 3);
		
		var q4 = q3.deQueue();
		assertTrue(q4.isEmpty());
		assertThrows(NullPointerException.class, () -> q4.deQueue());
	}
	
	@Test
	void head() {
		var q1 = new ImmutableQueue<Integer>(1, 2);	// [1, 2]
		assertEquals(q1.head(), 1);
		var q2 =  q1.deQueue();					// [2]
		assertEquals(q2.head(), 2);
		var q3 = q2.deQueue();					// []
		assertThrows(NullPointerException.class, () -> q3.head());
	}
	
	@Test
	void isEmpty() {
		var q1 = new ImmutableQueue<Integer>();		// []
		assertTrue(q1.isEmpty());
		var q2 = q1.enQueue(1);					// [1]
		assertFalse(q2.isEmpty());
		var q3 = q2.deQueue();					// []
		assertTrue(q3.isEmpty());
	}
}
