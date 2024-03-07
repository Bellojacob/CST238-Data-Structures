public class Song {
    //attributes
    private String title;
    private String artist;
    private int length;
    private int year;

    public Song(String title, String artist, int length, int year) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getLength() {
        return length;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        Song song = (Song) obj;
        return length == song.length && year == song.year && title.equals(song.title) && artist.equals(song.artist);
    }

    public String toString() {
        int minutes = length / 60;
        int seconds = length % 60;

            return title + " (" + artist + ", " + year + ") " + minutes + ":" + String.format("%02d", seconds);
        }
    }



