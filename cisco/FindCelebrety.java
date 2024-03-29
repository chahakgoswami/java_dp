public class FindCelebrety {
static int[][] MATRIX={{0, 0, 1, 0},
	                   {0, 0, 1, 0},
	                   {0, 0, 0, 0},
	                   {0, 0, 1, 0}};
	
	public static int findCelebrety(int n) {
		int candidate = 0;
		for(int i=1;i<n;i++) {
			if(MATRIX[candidate][i]==1) {
				candidate = i;
			}
		}
		
		for(int i=0;i<n;i++) {
			if(i!=candidate && (MATRIX[candidate][i]==1 || MATRIX[i][candidate]==0)) {
				return -1;
			}
		}
		
		return candidate;
	}

	public static void main(String[] args) {
		System.out.println(findCelebrety(4));

	}

}