package com.abstracty.challange;

public interface NodeList {
	
	Bucket getRoot();
	boolean addItem(Bucket item);
	boolean removeItem(Bucket item);
	void traverse(Bucket root);

}
