
public class matrix {
	public static void main(String[] args) {
        int[][] A = {
            {2, 3},
            {1, 2}
        };
        
        int[][] B = {
            {2, 4},
            {2, 1}
        };
        
        int[][] C = new int[2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
            }
        }
        
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
	}
}
