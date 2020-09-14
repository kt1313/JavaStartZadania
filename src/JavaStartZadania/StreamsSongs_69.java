package JavaStartZadania;

public class StreamsSongs_69 {
    private String title;
    private int length; //sec
    private String artist;
    private Genre genre;

    public StreamsSongs_69(String title, int length, String artist, Genre genre) {
        this.title = title;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    enum Genre {
        METAL,
        POP,
        ROCK,
        DANCE
    }

    @Override
    public String toString() {
        return "StreamsSongs_69{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre=" + genre +
                '}';
    }
}

