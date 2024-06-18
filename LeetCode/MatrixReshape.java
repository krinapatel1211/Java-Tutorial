package LeetCode;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        int r = 2;
        int c = 4;
        int[][] result = new int[r][c];
        if (r*c != nums.length*nums[0].length){
            System.out.println("CANNOT Reshape!");
        }
        int row =0;
        int column=0;
        for (int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(column<c){
                    result[row][column] = nums[i][j];
                    column++;
                }
                else{
                    row++;
                    column=0;
                    result[row][column] = nums[i][j];
                    column++;
                }
            }
        }

    }
}
