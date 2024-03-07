public class PlayList {
    private static int defaultSize = 10;
    private int size = -1;
    private Song[] songHolder;

    public PlayList(){
        songHolder = new Song[defaultSize];
    }

    public boolean isFull(){
        return size == songHolder.length;
    }

    public void add(Song s){
        if (isFull()){
            resize();
        }
        songHolder[++size] = s;
    }

    private void resize(){
        Song [] temp = new Song[songHolder.length * 2];
        for (int i = 0; i < size; i++){
            temp[i] = songHolder[i];
        }
        songHolder = temp;
    }

    public void move(int startingPosition, int endingPosition){
        if (endingPosition > size){
            endingPosition = size;
        }
        if (endingPosition > startingPosition){
            Song temp = songHolder[startingPosition];
            for (int i = startingPosition; i < endingPosition; i++){
                songHolder[i] = songHolder[i + 1];
            }
            songHolder[endingPosition] = temp;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= size; i++) {
            if (songHolder[i] != null) {
                sb.append(i + 1).append(". ").append(songHolder[i].toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public int linearSearch(int year){
        System.out.println("Running Linear Search");
        for (int i = 0; i < size; i++){
            if (songHolder[i].getYear() == year){
                System.out.print("Song year found at index: ");
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int year){
        System.out.println("Running Binary Search");
        int first = 0;
        int last = size - 1;
        while (first <= last){
            int middle = (first + last)/2;
            if (songHolder[middle].getYear() == year){
                return middle;
            } else if (songHolder[middle].getYear() > year) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return -1;
    }


}
