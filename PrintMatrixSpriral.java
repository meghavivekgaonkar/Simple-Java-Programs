import java.util.Scanner;

public class PrintMatrixSpriral {
	// Function print matrix in spiral form
    static void spiralPrint_Clockwise(int rows, int cols, int arr[][])
    {
        int i, r = 0, c = 0;
        /*  r - starting row index
            c - starting column index
            i - iterator
        */    
        while (r < rows && c < cols)
        {
            // Print the first row from the remaining rows
            for (i = c; i < cols; ++i)
            {
                System.out.print(arr[r][i]+" ");
            }
            r++;
  
            // Print the last column from the remaining columns 
            for (i = r; i < rows; ++i)
            {
                System.out.print(arr[i][cols-1]+" ");
            }
            cols--;
  
            // Print the last row from the remaining rows */
            if ( r < rows)
            {
                for (i = cols-1; i >= c; --i)
                {
                    System.out.print(arr[rows-1][i]+" ");
                }
                rows--;
            }
            // Print the first column from the remaining columns */
            if (c < cols)
            {
                for (i = rows-1; i >= r; --i)
                {
                    System.out.print(arr[i][c]+" ");
                }
                c++;    
            }        
        }
    }
	public static void main(String[] args) {
		PrintMatrixSpriral p=new PrintMatrixSpriral();
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter rows\n");
		int rows =s.nextInt();
		System.out.print("Enter columns\n");
		int cols =s.nextInt();
		System.out.print("Enter Matrix Elements\n");
		int arr[][] =new int[rows][cols];
		for(int i=0;i<rows;i++)
	    {
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=s.nextInt();
			}
	    }
		p.spiralPrint_Clockwise(rows, cols, arr);
				
		
		
		
	}

}
