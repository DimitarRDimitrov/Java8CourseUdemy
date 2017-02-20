package com.abstracty.challange;

public class StringNode extends Bucket {

	public StringNode(Object value) {
		super(value);
	}

	@Override
	Bucket getPrev() {
		return this.prevBucket;
	}

	@Override
	Bucket setPrev(Bucket item) {
		this.prevBucket = item;
		return this.prevBucket;
	}

	@Override
	Bucket getNext() {
		return this.nextBucket;
	}

	@Override
	Bucket setNext(Bucket item) {
		this.nextBucket = item;
		return this.nextBucket;
	}

	@Override
	int compareTo(Bucket item) {
		if(item != null) {
			return ((String) super.getValue()).compareTo((String) item.getValue());
		} else {
			return -1;
			
		}
	
	}


	
	
	
}
