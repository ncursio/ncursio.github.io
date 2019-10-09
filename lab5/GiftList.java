package lab5;

public class GiftList {
	private Node head;
	
	public GiftList() {
		head = null;
	}
	
	public boolean isEmpty() {
		if (head== null) {
			return true;
		}
		else {return false;}
	}
	
	public boolean isFull() {
		Node temp= new Node();
		if(temp == null) {
			return true;
		}
		else {temp =null;
		return false;
		}
	}
	
	public boolean adDGiftBasketToEnd( GiftBasket gift) {
		if (isFull()) {
			System.out.println("List is full, unable to add");
			return false;
		}else {Node nextGift = new Node();
			nextGift.setData(gift);
			
			if(isEmpty()) {
				head=nextGift;
			}
			else {
				Node current = head;
				while (current.getNext()!=null) {
					current=current.getNext();
				}
				current.setNext(nextGift);
			}
		}
		return true;
	}
	
	public void showAllGiftBasket() {
		if (isEmpty()) {
			System.out.println("List is empty, nothing to display");
		}
		else {Node current = head;
			while (current !=null) {
				current.getData().display();
				current= current.getNext();
			}
		}
		
	}

}
