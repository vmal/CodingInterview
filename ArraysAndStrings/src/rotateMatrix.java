public class rotateMatrix
{
    private static int[][] rotate(int[][] matrix)
    {
        int n= matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                //Save the top
                int top = matrix[first][i];
                //left->top
                matrix[first][i] = matrix[last - offset][first];
                //bottom->left
                matrix[last - offset][first] = matrix[last][last - offset];
                //right->bottom
                matrix[last - offset][last] = matrix[i][last];
                //top->right
                matrix[i][last] = top;
            }
        }

        return matrix;
    }
    public static void main(String args[])
    {
        int[][] arr = new int[][]{
                {1,2,3}, //7,4,1
                {4,5,6}, //8,5,2
                {7,8,9} // 9,6,3
        };

        arr = rotate(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.print('\n');
        }

    }
}
