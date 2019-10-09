package lab5;

public class Buyer {
	
	public static void main (String [] args) {
		
		GiftList list =new GiftList();
		GiftBasket nbuyer = new GiftBasket(1000," big ",20);
		GiftBasket nbuyer1 = new GiftBasket(1001," medium ",15);
		GiftBasket nbuyer2 = new GiftBasket(1002," small ",10);
		
		list.adDGiftBasketToEnd(nbuyer);
		list.adDGiftBasketToEnd(nbuyer1);
		list.adDGiftBasketToEnd(nbuyer2);
		
		list.showAllGiftBasket();
		
	}
	
}
