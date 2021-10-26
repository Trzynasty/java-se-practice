package Section8.Exercise46;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String name, double duration){
        songs.add(new Song(name,duration));
        return true;
    }


}
