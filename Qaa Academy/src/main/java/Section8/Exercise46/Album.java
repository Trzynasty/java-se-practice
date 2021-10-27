package Section8.Exercise46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if (title.isEmpty() || duration<0) return false;
        else{
            songs.add(new Song(title,duration));
            return true;
        }
    }

    private Song findSong(String title){
        for (Song f:songs) {
            if (f.getTitle()==title) return f;
        }
        return null;
    }

    public boolean addToPlayList(int songNumber, LinkedList<Song> playlist){
        if(songs.size()<songNumber) return false;
        else{
            playlist.add(songs.get(songNumber-1));
            return true;
        }
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist){
        Song song = findSong(songTitle);
        if (song!=null){
            playlist.add(song);
            return true;
        }
        return false;
    }
}
