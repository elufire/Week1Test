import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequency {

    public static void main(String [] args){
        String userString = "Hello there! Apple!";
        getFrequency(userString);
    }

    public static void getFrequency(String raw){
        Map<Character, Integer> freq = new HashMap<Character, Integer>();
        freq.put('a', 0);
        freq.put('b', 0);
        freq.put('c', 0);
        freq.put('d', 0);
        freq.put('e', 0);
        freq.put('f', 0);
        freq.put('g', 0);
        freq.put('h', 0);
        freq.put('i', 0);
        freq.put('j', 0);
        freq.put('k', 0);
        freq.put('l', 0);
        freq.put('m', 0);
        freq.put('n', 0);
        freq.put('o', 0);
        freq.put('p', 0);
        freq.put('q', 0);
        freq.put('r', 0);
        freq.put('s', 0);
        freq.put('t', 0);
        freq.put('u', 0);
        freq.put('v', 0);
        freq.put('w', 0);
        freq.put('x', 0);
        freq.put('y', 0);
        freq.put('z', 0);

        String rawnew = raw.toLowerCase().replaceAll("[^a-z]", "");
        char charArray [] = rawnew.toCharArray();
        for(int i=0; i<rawnew.length();i++){
            freq.put(charArray[i], (freq.get(charArray[i])+1));
        }

        System.out.println(Arrays.asList(freq));


    }


}
