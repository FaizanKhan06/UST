
public class lastRep {
	public static void main(String[] args) {
	    String input = "language";
	    
	    int[] freq = new int[256];
	    for (int i = 0; i < input.length(); i++) {
	        freq[input.charAt(i)]++;
	    }
	    char lastRepeating = '\0';
	    for (int i = 0; i < input.length(); i++) {
	        if (freq[input.charAt(i)] > 1) {
	            lastRepeating = input.charAt(i);
	        }
	    }
	    System.out.println("Last repeating character: " + lastRepeating);
	}
}