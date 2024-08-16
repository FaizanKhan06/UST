public class secHigh {
	    
	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5,6,7,89,3,4};
		int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }
        System.out.println("The second highest value is: " + secondHighest);
	}
}
