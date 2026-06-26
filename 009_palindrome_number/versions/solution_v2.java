class Solution {
	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(obj.isPalindrome(1001));
	}

	public boolean isPalindrome(int x) {
    	int n = x, r = 0, d = 10; // String r = "";
		if (n >= 0 && n < d){
			return true;
		}
        while(n > 0){
            int mod = n % d;
            n = n / d;
			r = r * d + mod; // r = r.concat(Integer.toString(mod));
        }
		return x == r; // return x == Integer.parseInt(r);
    }
}