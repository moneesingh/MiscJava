import java.util.LinkedHashMap;
import java.util.Map;

/*
 * This program finds the first unrepeated character in a String.
 */
public class UnRepeatedChar {
	public static void main(String [] args) {
		firstUnreapted("hehempjcjm hello world");
	}
	
	//find the first unrepeated character in given String.
	public static void firstUnreapted (String str) {
		Map <Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
		if (map.containsValue(1)) {
			for (Map.Entry<Character, Integer> e: map.entrySet()) {
				if (e.getValue()==1) {
					System.out.println("First unrepeated char: " + e.getKey());
					return;
				}
			}
		}
		else
			System.out.println("No characters are unrepeated");
	}
}
