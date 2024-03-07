public class Runner {
    public static void main(String[] args) {
        Song s1 = new Song("little birds", "Bob Marley", 40, 1990);
        Song s2 = new Song("Lovin on Me", "Jack Harlow", 180, 2023);
        Song s3 = new Song("Viva La Vida", "Coldplay", 241, 2010);

//        System.out.println(s3.toString());
//        System.out.println(s1.toString());
//        System.out.println(s1.equals(s3));

        PlayList p1 = new PlayList();
        p1.add(s1);
        p1.add(s2);
        p1.add(s3);
        p1.move(0,3);




//        p1.display();
        System.out.println(p1.toString());
//        System.out.println(p1.linearSearch(2023));
        System.out.println(p1.binarySearch(2010));
    }
}
