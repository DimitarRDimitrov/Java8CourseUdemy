package com.abstracty.challange;

public abstract class Bucket {
	
	protected Bucket nextBucket;
	protected Bucket prevBucket;
	
	protected Object value;
	public Bucket(Object value) {
		this.value = value;
	}
	
	abstract Bucket getPrev();
	abstract Bucket setPrev(Bucket item);
	abstract Bucket getNext();
	abstract Bucket setNext(Bucket item);
	
	abstract int compareTo(Bucket item);

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
