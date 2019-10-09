package lab5;

public class Node {
	private GiftBasket data;
	private Node next;
	
	public void setData(GiftBasket data) {
		this.data=data;
	}
	
	public GiftBasket getData() {
		return data;
	}
	
	public void setNext(Node next) {
		this.next=next;
	}
	
	public Node getNext() {
		return next;
	}
	
	public Node(){
		this.data= new GiftBasket();
		this.next= null;
	}
	
	public Node(GiftBasket data,Node next){
		this.data= data;
		this.next= next;
	}
	
	public Node(GiftBasket data){
		this.data= data;
		this.next= null;
	}

}
