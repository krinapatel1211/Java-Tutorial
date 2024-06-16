package LeetCode;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = {{1}};
        int perimeter = 0;

        for (int row=0; row<grid.length; row++){
            for (int column=0; column<grid[0].length; column++){
                if (grid[row][column]==1){
                    if (row==0){
                        perimeter++;
                    }else{
                        perimeter = (grid[row-1][column]==0) ? ++perimeter : perimeter;
                    }
                    if (row==grid.length-1){
                        perimeter++;
                    }else{
                        perimeter = (grid[row+1][column]==0) ? ++perimeter : perimeter;
                    }
                    if(column==0){
                        perimeter++;
                    }else{
                        perimeter = (grid[row][column-1]==0) ? ++perimeter : perimeter;
                    }
                    if(column==grid[0].length-1){
                        perimeter++;
                    }else{
                        perimeter = (grid[row][column+1]==0) ? ++perimeter : perimeter;
                    }
                }
            }
        }
        System.out.println(perimeter);
    }
}
