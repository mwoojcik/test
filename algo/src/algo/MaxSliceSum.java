package algo;

public class MaxSliceSum {

	public static void main(String[] args) {
		
		int[] A = new int[] {3, 2, -6, 4, 0}; //5	
		int[] B = new int[] {1, 0, 2, -1, 0, 1, 3};	//6
		int[] C = new int[] {1, 0, 2, -1, -2, 0, 1, 3};	// 4
		int[] D = new int[] {-1, 3, -3,-1,5}; //1
		
		System.out.println(solution(D));
	}

	public static int solution(int[] A) {
        
        Integer maxSliceSum = null;
        int currentSliceSum = 0;
        int currentMax = 0;
        
        if (A != null && A.length != 0) {
            for (int i = 0; i < A.length; i++) {
                currentSliceSum += A[i];
                currentMax = Math.max(currentSliceSum, A[i]);
                
                if (maxSliceSum == null || currentMax > maxSliceSum) {
                    maxSliceSum = currentMax;
                    currentSliceSum = maxSliceSum;
                }
            }
        }
        
        return maxSliceSum;
    }
	
}
