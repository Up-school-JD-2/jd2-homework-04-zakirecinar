import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		UserAccount user=new UserAccount("z@gmail.com","zakirecinar","123",1);
		MusicApplicationSystem app = new MusicApplicationSystem();
	    System.out.println("Hoş Geldiniz..."); 
	    app.addUser(user);
	    System.out.println(user.getUserName()); 
	    Songs song1=new Songs("Song1","Singer1","Album1",5);
	    Songs song2=new Songs("Song2","Singer2","Album2",4);
		album album1=new album("Album1","song1",20);
		album album2=new album("Album2","song2",30);
		app.addAlbum(album1);
		app.addAlbum(album2);
		//System.out.println(album1.getAlbumName()); // eklenip eklenmediği hakkında kontrol ediyorum	
		
		CartItem cartitem=new CartItem(album1,song1,500.0);
		CartItem cartitem2=new CartItem(album2,song2,400.0);

		Cart cart=new Cart();
		cart.addToCart(cartitem);
		cart.addToCart(cartitem2);
		//Cart cart1=new Cart();
		//app.AddToCart(cart);
		//app.AddToCart(cart1);
		
		System.out.println("sepete eklendi: "+album1.getAlbumName()+" Price: "+cartitem.getPrice()+" TL");
		System.out.println("sepete eklendi: "+album2.getAlbumName()+" Price: "+cartitem2.getPrice()+" TL");
		//app.listOfCart();
		
		cart.printCartInfo();
		
		System.out.println("Albüm aramak için s harfine basın: ");
		String search=input.nextLine();
		if(search.equals("s")) {
		app.SearchAlbum();}
		
		
		
		
	}

}
