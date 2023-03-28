
public class album {
	String albumName;
	String artistName;
	int year;
	
	public album(String albumName, String artistName, int year) {
		this.albumName=albumName;
		this.artistName=artistName;
		this.year=year;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return 0;
	}
	
	public void printAlbumInfo() {
		System.out.println();
		System.out.println("Album Name: " + albumName);
		System.out.println("Artist Name: " + artistName);
		System.out.println("Year: " + year);
	}
	
	
}
