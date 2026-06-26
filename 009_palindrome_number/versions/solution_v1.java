class Solution {
	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(obj.isPalindrome(1001));
	}

    public boolean isPalindrome(int x) {
    	boolean solution = false;
        String number = Integer.toString(x);
        String[] aux = number.split("");
        for (int i=0; i<aux.length; i++)
        	if(aux[i].equals(aux[aux.length-(i+1)]))
        		solution = true;
        	else{
        		solution = false;
        		break;
        	}
        return solution;
    }
}