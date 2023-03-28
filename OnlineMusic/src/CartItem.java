public class CartItem {
    private album album;
    private Songs song;
    private double price;
    
    public CartItem(album album, Songs song, double price) {
        this.album = album;
        this.song = song;
        this.price = price;
    }
    
    public album getAlbum() {
        return album;
    }
    
    public Songs getSong() {
        return song;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void printCartInfo() {
    	album.printAlbumInfo();   	
    }
    
}
