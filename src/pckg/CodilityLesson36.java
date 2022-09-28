package pckg;

//had to google - this is really complicated but i finally get it...

public class CodilityLesson36 {
	public static void main(String[] args) {
		//{0,0,0,1,1,0,1,0,0,0,0}; example
		int[] array = {1,1,0,0,0};
		solution(array);
	}
	
	public static int solution(int[] A) {
		
	    int n = A.length + 1;
	    
	    int dp[] = new int[n];
	    
	    for(int i=0;i<n;i++) {
	        dp[i] = -1;
	    }
	    
	    int f[] = new int[100005];
	    f[0] = 1;
	    f[1] = 1;
	    
	    for(int i=2;i<100005;i++) {
	        f[i] = f[i - 1] + f[i - 2];
	    }
	    
	    for(int i = -1; i < n; i++) {
	    	
	        if(i == -1 || dp[i] > 0) {
	        	
	            for(int j = 0; i+f[j] <n; j++) {
	                if(i + f[j] == n -1  || A[i+f[j]] == 1) {
	                    if(i == -1) {
	                    	System.out.println(i + f[j]);
	                        dp[i + f[j]] = 1;
	                    } else if(dp[i + f[j]] == -1) {
	            
	                        dp[i + f[j]] = dp[i] + 1;
	                    } else {
	                    	
	                        dp[i + f[j]] = Math.min(dp[i + f[j]], dp[i] + 1);
	                    }
	                }
	            }
	            }
	    }

	    return dp[n - 1];
	}
	}
