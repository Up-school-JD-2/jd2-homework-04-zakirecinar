import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class MusicApplicationSystem {
	private List<Songs> songs;
    private List<album> albums;
	private List<Cart> itemsAddedToCart;
	private List<UserAccount> userAccount;
	private List<CartItem> cartItem;
	
	
	public MusicApplicationSystem() {
		userAccount=new ArrayList<>();
		songs = new ArrayList<>();
		itemsAddedToCart = new ArrayList<>();
		albums = new ArrayList<>();
		cartItem=new ArrayList<>();
	}
	 public void addAlbum(album a) {
	        albums.add(a);
	    }
	
	
	 public void SearchAlbum() {
		    Scanner input = new Scanner(System.in);
		    System.out.println("Aramak istediğiniz Albüm nedir: ");
		    String search = input.nextLine();
		    boolean found = false;
		    for (album a : albums) {
		        if (a.getAlbumName().equals(search)) {
		            System.out.println("Aradığınız albüm: " + search);
		            found = true;
		            break;
		        }
		    }
		    if (!found) {
		        System.out.println("Aradığınız albüm bulunamadı......");
		    }
		}

	
	public void AddToCart(Cart cart) {
		this.itemsAddedToCart.add(cart);
	}
	
	
	public void addUser(UserAccount user) {
		this.userAccount.add(user);
	}
	/*public void listOfCart() {
		System.out.println("******");
		for(Cart cart:this.itemsAddedToCart) {
			cart.printCartInfo();
			
			
		}
	}*/
}
