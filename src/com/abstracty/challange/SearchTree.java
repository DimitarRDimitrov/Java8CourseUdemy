package com.abstracty.challange;

public class SearchTree implements NodeList{
	
	//Binary search tree
	
	private Bucket root = null;
	
	public SearchTree(Bucket root) {
		this.root = root;
	}
	
	

	@Override
	public Bucket getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(Bucket newItem) {
		if (this.root == null) {
			this.root = newItem;
			return true;
		}
		
		//comparing from the head of the tree
		Bucket currentItem = this.root;
		while(currentItem != null) {
			int comparison = (currentItem.compareTo(newItem));
			if(comparison < 0) {
				//new item is greater, place right if possible
				if(currentItem.getNext() !=null) {
					currentItem = currentItem.getNext();
				} else {
					//the right position is free
					currentItem.setNext(newItem);
					return true;
				}
			} else if (comparison > 0) {
				//trying to place on the left side
				if(currentItem.getPrev() !=null) {
					currentItem = currentItem.getPrev();
				} else {
					currentItem.setPrev(newItem);
					return true;
				}
			} else {
				System.out.println(newItem.getValue() + " is already present");
				return false;
			}
			
			
		}
		return false;
		
	}

	@Override
	public boolean removeItem(Bucket item) {
		if(item != null) {
			System.out.println("Deleting item " + item.getValue());
		}
		
		Bucket currentItem = this.root;
		Bucket parentItem = currentItem;
		
		while(currentItem != null) {
			int comparison = currentItem.compareTo(item);
			if(comparison <0) {
				parentItem = currentItem;
				currentItem = currentItem.getNext();
			} else if (comparison >0) {
				parentItem = currentItem;
				currentItem = currentItem.getPrev();
			} else {
				performRemoval(currentItem, parentItem);
				return true;
			}
		}
		return false;
		
	}
	
	private void performRemoval(Bucket currentItem, Bucket parentItem) {
		
		
		
		
		
	}

	@Override
	public void traverse(Bucket root) {
		//recursive
		if(root!=null) {
			traverse(root.getPrev());
			System.out.println(root.getValue());
			traverse(root.getNext());
		}
		
	}

}
