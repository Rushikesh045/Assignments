//question no 5
class matricesAreEqualOrNot
{
    public static void main(String[] args) 
    {
        int[][] matrix1 = { {1, 2}, {3, 4} };
        int[][] matrix2 = { {1, 2}, {3, 4} };

        boolean isEqual = true; 

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    isEqual = false; 
                    break; 
                }
            }
            if (!isEqual) {
                break; 
            }
        }
        if (isEqual) {
            System.out.println("Matrices are equal");
        }
       else {
            System.out.println("Matrices are not equal");
        }
    }
}
