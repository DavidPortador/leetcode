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
        // Se crean dos ciclos para combinar todos los datos (Optimizable)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Valida que la suma sea correcta y retorna los datos (detienen el ciclo)
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        // Retun default en caso de no encontrar coincidencias
        return new int[] {-1, -1};
    }
}