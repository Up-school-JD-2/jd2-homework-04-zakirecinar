
public class Songs {
	String songName;
	String artistOfSong;
	String albumOfSong;
	int longOfSong;
	
	public Songs(String songName, String artistOfSong,String albumOfSong,int longOfSong) {
		this.songName=songName;
		this.artistOfSong=artistOfSong;
		this.albumOfSong=albumOfSong;
		this.longOfSong=longOfSong;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtistOfSong() {
		return artistOfSong;
	}
	public void setArtistOfSong(String artistOfSong) {
		this.artistOfSong = artistOfSong;
	}
	public String getAlbumOfSong() {
		return albumOfSong;
	}
	public void setAlbumOfSong(String albumOfSong) {
		this.albumOfSong = albumOfSong;
	}
	public int getLongOfSong() {
		return longOfSong;
	}
	public void setLongOfSong(int longOfSong) {
		this.longOfSong = longOfSong;
	}
}
