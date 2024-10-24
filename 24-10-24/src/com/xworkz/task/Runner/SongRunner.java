package com.xworkz.task.Runner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.Song;
public class SongRunner {
	
	    public static void main(String[] args) {
	        List<Song> songs = new ArrayList<>();
	        songs.add(new Song("Belageddu", 240));
	        songs.add(new Song("Karulu Suthikithu", 300)); 
	        songs.add(new Song("Mysore Mallige", 210));
	        songs.add(new Song("Kanna Huttidare", 200)); 
	        songs.add(new Song("Baaro Pailwaan", 260));

	
	        Comparator<Song> BY_NAME_LENGTH = Comparator.comparingInt(song -> song.getName().length());
	        Comparator<Song> BY_DURATION = Comparator.comparingInt(Song::getDuration);
	        Collections.sort(songs,BY_NAME_LENGTH);

	        System.out.println("Kannada Songs sorted by name length (ascending):");
	        for (Song song : songs) {
	            System.out.println(song);
	        }

	        System.out.println();

	        // Sort by name length and then by duration
	        Collections.sort(songs,BY_NAME_LENGTH.thenComparing(BY_DURATION));

	        System.out.println("Kannada Songs sorted by name length and then by duration:");
	        for (Song song : songs) {
	            System.out.println(song);
	        }
	    }
	}



