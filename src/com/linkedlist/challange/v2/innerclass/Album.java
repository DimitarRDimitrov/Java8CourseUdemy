package com.linkedlist.challange.v2.innerclass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private SongList songList;
	
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songList = new SongList();
	}
	
	private class SongList {
		
		private ArrayList<Song> playList;

		public SongList() {
			this.playList = new ArrayList<>();
		}
		
		public boolean add(Song song) {
			if(playList.contains(song)) {
				return false;
			}
			this.playList.add(song);
			return true;
		}
		
		private Song findSong(String title) {
			for(Song checkSong: this.playList) {
				if(checkSong.getTitle().equals(title)) {
					return checkSong;
				}
			}
			return null;
		}
		
		public Song findSong(int trackNumber) {
			int index = trackNumber -1;
			if ((index > 0) && (index < playList.size())) {
				return playList.get(index);
			}
			return null;
		}
		
	}
	
	
	
	public boolean addSong(String title, double duration) {
		return this.songList.add(new Song(title,duration));
	}
	
	
	
	public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
		Song checkedSong = this.songList.findSong(trackNumber);

		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		
		System.out.println("The album does not have a track " + trackNumber);
		return false; 
	}
	
	public boolean addToPlaylist(String title, LinkedList<Song> playList) {
		Song checkedSong = songList.findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song " + title + " is not in the album");
		return false;
	}
	

}
