package cn.edu.hit;

import java.util.Arrays;
import java.util.List;

/**
 * basic use of lambda
 * 
 * @author zhou.you
 */
public class Main {

	public static void main(String[] args) {
		// new Thread(() -> {while(true) System.out.println("hello");}).start();
		// new Thread(() -> {while(true) System.out.println("world");}).start();

		String[] atp = { "Rafael Nadal", "Novak Djokovic",
				"Stanislas Wawrinka", "David Ferrer", "Roger Federer",
				"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro" };
		List<String> players = Arrays.asList(atp);
		
//		for (String player: players) {
//			System.out.println(player + "; ");
//		}
		
//		players.forEach((player) -> System.out.println(player + "; "));
		
//		players.forEach(System.out::println);
	}
}
