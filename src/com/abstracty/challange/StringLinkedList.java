package com.abstracty.challange;

public class StringLinkedList implements NodeList{
	
	private Bucket root = null;
	private int size = 0;
	
	public StringLinkedList(Bucket root) {
		this.root = root;
	}
	
	
	
	@Override
	public Bucket getRoot() {
		return this.root;
	}
	@Override
	public boolean addItem(Bucket newItem) {
		if(this.root == null) {
			this.root = newItem;
			return true;
		}
		
		Bucket currentNode = this.root;
		while(currentNode != null) {
			int comparison = (currentNode.compareTo(newItem));
			if(comparison <0) {
				//newItem is grater, we should move right if possible
				if(currentNode.getNext() != null) {
					currentNode = currentNode.getNext();
				} else {
					currentNode.setNext(newItem).setPrev(currentNode);
					return true;
				}
			} else if (comparison >0) {
				//newItem is less, insert before
				if(currentNode.getPrev() != null) {
					currentNode.getPrev().setNext(newItem).setPrev(currentNode.getPrev());
					newItem.setNext(currentNode).setPrev(newItem);
				} else {
					// the node with a previous is the root
					newItem.setNext(this.root).setPrev(newItem);
					this.root = newItem;
				}
				return true;
			} else {
				// equal
				System.out.println(newItem.getValue() + " is already present, not added.");
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
		while(currentItem != null) {
			int comparison = currentItem.compareTo(item);
			if(comparison == 0) {
				//found the item to delete
				if(currentItem == this.root) {
					this.root = currentItem.getNext();
				} else {
					currentItem.getPrev().setNext(currentItem.getNext());
					if(currentItem.getNext() !=null) {
						currentItem.getNext().setPrev(currentItem.getPrev());
					}
					
				}
				return true;
			} else if(comparison <0) {
				currentItem = currentItem.getNext();
			} else { // comparision > 0 ; we are past the point in the sorted linked list where the item should have been placed
				return false;
			}
		}
		return false;
	}



	@Override
	public void traverse(Bucket root) {
		if(root == null) {
			System.out.println("The list is empty");
		} else {
			while(root != null) {
				System.out.println(root.getValue());
				root = root.getNext();
			}
			
			
		}
		
		
	}
	
	
	
	
}
