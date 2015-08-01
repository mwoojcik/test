package algo;

public class MaxSliceSum {

	public static void main(String[] args) {
		
		int[] c = new int[] {-1, 3, -3,-1,5}; //1
		
		System.out.println(solution(c));

		int[] b = new int[] {1, 0, 2, -1, -2, 0, 1, 3};	// 4

		System.out.println(solution(b));
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
