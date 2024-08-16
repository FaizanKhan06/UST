public class freq {
    public static void sort(int[] arr) {
    	int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){
        	for(int j=1; j < (n-i); j++){  
        		if(arr[j-1] > arr[j]){
        			temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;
                }
        	}
        }  
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,2,3,4,6,7,8,5,3,6,7,8,3};
        
        int mostFreq = array[0];
        int cur = array[0];
        int maxFreq = 1;
        int curFreq= 1;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] == cur) {
            	curFreq++;
            } else {
            	cur = array[i];
            	curFreq = 1;
            }
            if (curFreq > maxFreq) {
            	maxFreq = curFreq;
                mostFreq = cur;
            }
        }
        
        System.out.println("Most Freq = "+mostFreq);
    }
}
