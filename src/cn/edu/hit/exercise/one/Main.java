package cn.edu.hit.exercise.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public int addUp(Stream<Integer> numbers) {
		return numbers.mapToInt(s -> s).sum();
	}

	public List<String> convert(List<Artist> list) {
		return list
				.stream()
				.map(artist -> "'" + artist.getName() + ", " + artist.getCountry()
						+ "'").collect(Collectors.toList());
	}
	
	/*public List<Arbum> convert2(List<Arbum> list) {
		return list.stream().mapToInt(song -> song.getNum())
				.filter(num -> num < 3)
				.collect(Collectors.toList());
	}*/

	public static void main(String[] args) {
		Main main = new Main();
		
		//example 1
//		System.out.println(main.addUp(Stream.of(new Integer(4), new Integer(5),
//				new Integer(6))));
		
		//example 2
		List<Artist> list = new ArrayList<Artist>() {
			{
				add(new Artist("zhoujielun", "china"));
				add(new Artist("sunyanzi", "china"));
			}
		};
		
		System.out.println(main.convert(list));
		
		
		
	}
}
