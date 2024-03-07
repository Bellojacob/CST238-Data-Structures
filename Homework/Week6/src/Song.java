/* Title: Song.java
 * Abstract: This program creates a song class that holds attributes such as title, artist, length, and year. Also,
 * has a constructor so user can create song objects, an equals method to show if an object is exactly the same as
 * another object, and a toString method to print out attributes in a specific organized way.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 1 hour
 * Date: 03/5/2024
 */
public class Song {
    //attributes
    private String title;
    private String artist;
    private int length;
    private int year;

    // on the hw instructions it says this is the correct order
    //public Song(String title, String artist, **int length, int year**)
    // however on the example test code it is actually like this:
    // public Song(String title, String artist, **int year,int length**)
    // I went with the example test code
    public Song(String title, String artist, int year, int length) {
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



