package queue.model;

import java.util.Arrays;

public class ImmutableQueue<T> implements Queue<T> {
	final T[] items;
	
	@SafeVarargs
	public ImmutableQueue(T... items) {
		this.items = items;
	}

	@Override
	public Queue<T> enQueue(T item) {
		var newItems = Arrays.copyOfRange(this.items, 0, this.items.length + 1);
		newItems[newItems.length - 1] = item;
		return new ImmutableQueue<T>(newItems);
	}

	@Override
	public Queue<T> deQueue() {
		if (this.isEmpty()) throw new NullPointerException();
		
		var newItems = Arrays.copyOfRange(this.items, 1, this.items.length);
		return new ImmutableQueue<T>(newItems);
	}

	@Override
	public T head() {
		if (this.isEmpty()) throw new NullPointerException();
		return this.items[0];
	}
	
	@Override
	public boolean isEmpty() {
		return this.items.length == 0;
	}
}
