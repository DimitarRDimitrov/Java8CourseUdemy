package com.linkedlist.challange.v1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
	
	private String name;
	private ArrayList<Album> ownedAlbums;
	private LinkedList<Song> trackList;
	
	public Playlist(String name) {
		this.name = name;
		ownedAlbums = new ArrayList<>();
		trackList = new LinkedList<>();
	}
	
	public static void main(String[] args) {
		Playlist winamp = new Playlist("myList");
		
		Album album = new Album("Slayer");
		Song first = new Song("edno", 5);
		Song second = new Song("dve", 5);
		Song third = new Song("tri", 5);
		Song fourth = new Song("chetiri", 5);
		Song fifth = new Song("pet", 5);
		Song sixth = new Song("shest", 5);
		Song seventh = new Song("sedem", 5);
		album.addSong(first);
		album.addSong(second);
		album.addSong(third);
		album.addSong(fourth);
		album.addSong(fifth);
		album.addSong(sixth);
		album.addSong(seventh);
		
		winamp.addAlbum(album);
		
		winamp.addSongToPlaylist("edno");
		winamp.addSongToPlaylist("tri");
		winamp.addSongToPlaylist("chetiri");
		winamp.addSongToPlaylist("sedem");
		
		winamp.printTrakcs();
		
		winamp.initializePlaylist();
		
		
	}
	
	public void addAlbum(Album a) {
		ownedAlbums.add(a);
		System.out.println("Added album to the library: " + a.getName());
	}
	
	public boolean addSongToPlaylist(String name) {
		for (Album a : ownedAlbums) {
			Song newSong = a.getSong(name);
			if(newSong != null) {
				trackList.add(newSong);
				return true;
			}
		}
		return false;
	}
	
	public void printTrakcs() {
		for(Song s: trackList) {
			System.out.println(s.getName());
		}
	}
	
	public void initializePlaylist() {
		ListIterator<Song> listIterator = trackList.listIterator();
		Scanner scanner = new Scanner(System.in);
		
		boolean playNext = true;
		boolean quit = false;
		
		printOptions();
		while(!quit) {
			int option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option) {
			case 0:
				System.out.println("Exiting...");
				quit = true;
				break;
			case 1:
				//play next song
				if(!playNext) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					playNext = true;
				}
				if(listIterator.hasNext()){
					System.out.println("Now playing: " + listIterator.next().getName());
				} else {
					System.out.println("No more tracks to play..");
					playNext = false;
				}
				break;
			case 2:
				//play previous
				if(playNext){
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					playNext = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing : " + listIterator.previous().getName());
				} else {
					System.out.println("No previous song found");
					playNext = true;
				}
				break;
			case 3:
				if(playNext && listIterator.hasPrevious()) {
					listIterator.previous();
					System.out.println("Now playing: " + listIterator.next().getName());
				} else if (!playNext && listIterator.hasNext()) {
					listIterator.next();
					System.out.println("Now playing: " + listIterator.previous().getName());
				}
				break;
			case 4:
				printOptions();
				break;
			}
			
		}
		
		
		
	}
	
	private void printOptions() {
		System.out.println("Please select an option:\n");
		System.out.println("0 - to quit");
		System.out.println("1 - to play next song");
		System.out.println("2 - to play previous song");
		System.out.println("3 - to play current song again");
		System.out.println("4 - to print options");
	}
	

}
