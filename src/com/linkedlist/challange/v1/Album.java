package com.linkedlist.challange.v1;

import java.util.ArrayList;

public class Album {
	
	private String name;
	private ArrayList<Song> tracks;
	
	public Album(String name) {
		this.name = name;
		this.tracks = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Song> getTracks() {
		return tracks;
	}
	
	public boolean addSong(Song s) {
		if (tracks.contains(s)) {
			System.out.println("Track already in the album");
			return false;
		}
		tracks.add(s);
		return true;
	}
	
	public boolean addSong(String name, int duration) {
		Song songToAdd = new Song(name, duration);
		return addSong(songToAdd);
	}
	
	public Song getSong(String name) {
		for (Song s: tracks) {
			if(s.getName().equals(name)) {
				return s;
			}
		}
		return null;
	}
	

}
