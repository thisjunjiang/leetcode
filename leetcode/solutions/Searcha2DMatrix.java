class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int start = 0, end = matrix.length-1;
        while(start+1<end){
            int mid = start + (end-start)/2;

            if(matrix[mid][0] == target)
                return true;
            else if(matrix[mid][0] > target){
                end = mid;
            }else{
                start = mid;
            }
        }

        if(matrix[start][0] == target || matrix[end][0] == target)
            return true;

        int row = start;
        if(target > matrix[end][0])
            row = end;
        start = 0;
        end = matrix[0].length-1;
        while(start+1<end){
            int mid = start + (end-start)/2;

            if(matrix[row][mid] == target)
                return true;
            else if(matrix[row][mid] > target){
                end = mid;
            }else{
                start = mid;
            }
        }

        if(matrix[row][start] == target || matrix[row][end] == target)
            return true;
        return false;

    }
}
