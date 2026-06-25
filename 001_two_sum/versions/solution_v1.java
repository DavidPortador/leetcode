class Solution {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] aux = {2,7,11,15};
        int[] num = obj.twoSum(aux, 9);
        for (int i=0; i<num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        // Se crean dos ciclos para combinar todos los datos (Optimizable)
        for (int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++){
                // Valida que no se sume un numero consigo mismo
                if(i!=j){
                    // Valida que la suma sea correcta y guada los datos (No detiene el ciclo)
                    if(nums[i]+nums[j]==target){
                        solution[0]=j;
                        solution[1]=i;
                    }
                }
            }
        }
        // Retorna el arreglo con la solucion
        return solution;
    }
}