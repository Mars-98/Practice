
public class matrixspiral {
	public static void main(String[]args) {
		int n = 5;
		int[][] result = matrixSpiral(n);
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println("\n");
		}
		
	}
	public static int[][] matrixSpiral(int n){
		int[][] result = new int[n][n];
		int counter = 1;
		int start_row = 0;
		int end_row = n-1;
		int start_col = 0;
		int end_col = n-1;
		
		while(start_row<= end_row && start_col <=end_col) {
			for(int i = start_col; i <= end_col; i++) {
				result[start_row][i] = counter;
				counter++;
			}
			start_row++;
			for(int j = start_row; j <= end_row; j++) {
				result[j][end_col] = counter;
				counter++;
			}
			end_col--;
			for(int k = end_col; k >= start_col; k--) {
				result[end_row][k] = counter;
				counter++;
			}
			end_row--;
			for(int l = end_row; l >= start_row; l--) {
				result[l][start_col] = counter;
				counter++;
			}
			start_col++;
		}
		return result;
	}
}
