public class P1252 {
	public static void main(String[]args) {
		int [][] indicies = {{0,1}, {1,1}};
		int m = 3;
		int n = 2;
		int returned = oddCells(n, m, indicies);
		System.out.print(returned);
	}
	public static int oddCells(int n, int m, int[][] indices) {
        int odd = 0, ri = 0, ci = 0, mcopy = m -1, ncopy = n-1, l = 0;
    
        int[][] finalM = new int[n][m];
        while(l < indices.length){
            ri = indices[l][0];
            ci = indices[l][1];
            mcopy = m - 1;
            ncopy = n - 1;
            
            while(mcopy>=0 || ncopy>=0){
                //rows
                if(mcopy>=0){
                    finalM[ri][mcopy]++;
                    --mcopy;
                }
                //columns
                if(ncopy>=0) {
                   finalM[ncopy][ci]++;
                    --ncopy; 
                }
            }
            l++;
        }
        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                if(finalM[i][j] % 2 != 0){
                    odd++;
                }
            }
        }
        return odd;
    }

}
