package lab5;

public class GiftBasket {
	private int id; 
	private String type;
	private float cost;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setCost(float cost) {
		this.cost=cost;
	}
	
	public float getCost() {
		return cost;
	}
	
	public GiftBasket() {
		super();
		this.id=0;
		this.type="";
		this.cost=0;
	}
	
	public GiftBasket(int num,String type, float price) {
		super();
		this.id=num;
		this.type=type;
		this.cost=price;
	}
	
	public String ToString() {
		return "ID [id=" + id+", type= "+ type+"and cost= "+cost+"]";
	}
	
	public void display() {
		
		System.out.println(ToString());
	}

}
