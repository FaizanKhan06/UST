
public class reverse {
    public static void main(String[] args) {
        String input = "I love programming very much";
        
        String[] words = new String[100];
        int wc = 0;
        StringBuilder word = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                word.append(input.charAt(i));
            } else {
                words[wc++] = word.toString();
                word.setLength(0);
            }
        }
        words[wc++] = word.toString();

        StringBuilder res = new StringBuilder();
        for (int i = wc - 1; i >= 0; i--) {
            res.append(words[i]).append(" ");
        }
        
        System.out.println(res.toString());
    }
}
