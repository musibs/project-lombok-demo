package io.codefountain.project.lombok.equalsandhashcode;

public class SongsAlbumMain {
    public static void main(String[] args) {
        SongsAlbum album1 = new SongsAlbum();
        album1.setAlbumName("album1");
        album1.setNoOfSongs(10);
        album1.setPublisher("publisher1");
        album1.setSinger(new String[]{"artist1", "artist2"});
        album1.setYearOfRelease(1990);

        SongsAlbum album2 = new SongsAlbum();
        album2.setAlbumName("album2");
        album2.setNoOfSongs(20);
        album2.setPublisher("publisher2");
        album2.setSinger(new String[]{"artist2", "artist3"});
        album2.setYearOfRelease(2001);

        SongsAlbum album3 = new SongsAlbum();
        album3.setAlbumName("album1");
        album3.setNoOfSongs(10);
        album3.setPublisher("publisher1");
        album3.setSinger(new String[]{"artist1", "artist2"});
        album3.setYearOfRelease(1990);

        System.out.println("Album1 equal Album 2: "+album1.equals(album2));
        System.out.println("Album1 equal Album 3: "+album1.equals(album3));

        System.out.println("HashCode Album1: "+album1.hashCode());
        System.out.println("HashCode Album2: "+album2.hashCode());
        System.out.println("HashCode Album3: "+album3.hashCode());

    }
}
