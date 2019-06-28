package linledListt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private static ArrayList<Album> albums = new ArrayList<Album>();
	
	public static void main(String[] args) {
		Album album = new Album("Storb", "Deer");
		album.addSong("Stor", 4.6);
		album.addSong("Ret", 4.22);
		album.addSong("Yui", 4.3);
		album.addSong("Fer", 5.6);
		album.addSong("Lop", 3.21);
		album.addSong("Rees", 6.23);
		album.addSong("rEPS", 4.27);
		album.addSong("pop", 4.2);
		album.addSong("wer", 3.13);
		albums.add(album);
		
		
		album = new Album("For those about to rock", "AC/DC");
		album.addSong("Stor", 5.6);
		album.addSong("Ret", 5.22);
		album.addSong("Pkv", 5.3);
		album.addSong("Ert", 5.6);
		album.addSong("car", 5.21);
		album.addSong("red", 5.23);
		album.addSong("gerts", 6.27);
		album.addSong("ewww", 2.2);
		album.addSong("poppo", 7.13);
		albums.add(album);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlayList("You can't do it right", playList);
		albums.get(0).addToPlayList("Holy man", playList);
		albums.get(0).addToPlayList("Speed king", playList);
		albums.get(0).addToPlayList(9, playList);
		albums.get(1).addToPlayList(8, playList);
		albums.get(1).addToPlayList(3, playList);
		albums.get(1).addToPlayList(2, playList);
		albums.get(1).addToPlayList(24, playList);
		
		play(playList);
	}
	
	private static void play(LinkedList <Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit =false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size()== 0) {
			System.out.println(" no songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
		}
		while(!quit) {
			int action =scanner.nextInt();
			scanner.nextLine();
			switch(action) {
			case 0:
				System.out.println("Playlist complete");
				quit=true;
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward =true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing" + listIterator.next().toString());
				}else {
					System.out.println("We have reached thr end");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward =false;
				} 
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				}else {
					System.out.println("We are at the start of the playlist");
				}
				break;
			case 3:
				break;
			case 4:
			//	printList(playList);
				break;
			case 5:
				//printMenu();
				break;
			}
		}
		
	}
	
	
	
	
	
	
	
}
