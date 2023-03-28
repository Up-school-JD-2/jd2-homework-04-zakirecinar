import java.util.ArrayList;

public class Cart {

	private ArrayList<CartItem> cartItems;
	private double totalPrice;

	public Cart() {
		cartItems = new ArrayList<CartItem>();
		totalPrice = 0;
	}

	public void addToCart(CartItem item) {
		cartItems.add(item);
		totalPrice += item.getPrice();
	}

	public ArrayList<CartItem> getCartItems() {
		return cartItems;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void emptyCart() {
		cartItems.clear();
		totalPrice = 0;
	}

	public void printCartInfo() {
		System.out.println("Total Price: " + getTotalPrice());
		
		for (CartItem items : cartItems) {
			items.printCartInfo();
			System.out.println();	
		}
	}

}
