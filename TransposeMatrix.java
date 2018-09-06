public class TransposeMatrix{
    public static int[][] transpose (int[][] A){
        int[][] array = new int[A[0].length][A.length]; //here we take the column size from A and set it as the row size of a new 2D array, and take A's row size to set column size for array
        //A.length returns A's row size
        //A[0].length returns A's column size
        for (int r=0; r<A.length; r++) {
            for(int c=0; c<A[0].length; c++) {
                array[c][r]=A[r][c]; //so we set transpose here...example, for an element in A[1][2] will be in array[2][1]
            }
        }
        return array; 
    }
     public static void main(String []args){
        int[][] inputArray = {{1, 2, 3}, {4, 5, 6}}; 
        int[][] myArray = transpose(inputArray); 
        for (int r=0; r<myArray.length; r++) {
            for(int c=0; c<myArray[0].length; c++) {
                System.out.print("myArray["+r+"]["+c+"] is "+myArray[r][c]+"\n");
            }
        }
    }
}
