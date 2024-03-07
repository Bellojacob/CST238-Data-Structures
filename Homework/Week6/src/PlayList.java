/* Title: Playlist.java
 * Abstract: This program creates a Playlist class which will create and hold an array of Songs objects. User will be
 * able to create song objects, create playlist objects, and then add song objects into the playlist object array.
 * Users will then be able to search for years the song was published/made by using linear or binary searches. Users will
 * also be able to check if the array is sorted by year. There is also a general search method that will perform the
 * best available search method based on if the data is sorted. Lastly, the user will be able to linear search to find
 * the shortest song in the array, or return -1 if no songs exist in the array. Then the user will also be able to search
 * for the longest song in the array and if no songs exist, then return null.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 3 hours
 * Date: 03/5/2024
 */
public class PlayList {
    private static int defaultSize = 10;
    private int size = 0;
    private Song[] songHolder;

    public PlayList() {
        songHolder = new Song[defaultSize];
    }

    public boolean isFull() {
        return size == songHolder.length;
    }

    public void add(Song s) {
        if (isFull()) {
            resize();
        }
        songHolder[size++] = s;
    }

    private void resize() {
        Song[] temp = new Song[songHolder.length * 2];
        for (int i = 0; i < songHolder.length; i++) {
            temp[i] = songHolder[i];
        }
        songHolder = temp;
    }

    public void move(int startingPosition, int endingPosition) {
        if (startingPosition < 0 || startingPosition >= size || endingPosition < 0 || endingPosition >= size) {
            System.out.println("Invalid starting or ending position");
            return;
        }

        Song temp = songHolder[startingPosition];
        if (startingPosition < endingPosition) {
            for (int i = startingPosition; i < endingPosition; i++) {
                songHolder[i] = songHolder[i + 1];
            }
        } else {
            for (int i = startingPosition; i > endingPosition; i--) {
                songHolder[i] = songHolder[i - 1];
            }
        }
        songHolder[endingPosition] = temp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= size; i++) {
            if (songHolder[i] != null) {
                sb.append(i + 1).append(". ").append(songHolder[i]).append("\n");
            }
        }
        return sb.toString();
    }

    private int linearSearch(int year) {
        System.out.println("Running Linear Search");
        for (int i = 0; i < size; i++) {
            if (songHolder[i].getYear() == year) {
                System.out.println("Song year found at index: " + i);
                return i;
            }
        }
        System.out.println("Song year not found");
        return -1;
    }

    private int binarySearch(int year) {
        System.out.println("Running Binary Search");
        int first = 0;
        int last = size - 1;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (songHolder[middle].getYear() == year) {
                return middle;
            } else if (songHolder[middle].getYear() > year) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return -1;
    }

    private boolean isSortedByYear() {
        for (int i = 0; i < size - 1; i++) {
            if (songHolder[i] != null && songHolder[i + 1] != null) {
                if (songHolder[i].getYear() > songHolder[i + 1].getYear()) {
                    return false;
                }
            }
        }
        return true;
    }

    public int search(int year) {
        if (isSortedByYear()) {
            return binarySearch(year);
        } else {
            return linearSearch(year);
        }
    }


    // part c
    public int shortestSongIndex() {
        if (size == 0) {
            return -1;
        }

        int shortestIndex = 0;
        int shortestLength = songHolder[0].getLength();

        for (int i = 1; i < size; i++) {
            if (songHolder[i] != null && songHolder[i].getLength() < shortestLength) {
                shortestIndex = i;
                shortestLength = songHolder[i].getLength();
            }
        }

        return shortestIndex;
    }

    public Song longestSong() {
        if (size == 0) {
            return null;
        }

        Song longest = songHolder[0];

        for (int i = 1; i < size; i++) {
            if (songHolder[i].getLength() > longest.getLength()) {
                longest = songHolder[i];
            }
        }

        return longest;
    }
}

