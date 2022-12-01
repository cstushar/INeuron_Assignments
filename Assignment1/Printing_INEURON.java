
public class Printing_INEURON {

	public static void main(String[] args) {
		int n = 5;
		for (int i=0;i<n;i++)
		{	
			for(int j=0;j<n;j++)  // For printing I
			{
				if(i==0 || i==n-1 || j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			for(int j=0;j<n;j++) // For printing N
			{
				if(j==0 || j==n-1 || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			} System.out.print(" ");
			
			for(int j=0;j<n;j++)	// For printing E
			{
				if(j==0 || i==0 || i==n-1 || i==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			for(int j=0;j<n;j++) 	// For printing U
			{
				if((j==0 && i!=n-1) || (j==n-1 && i!=n-1) || (i==n-1 && j>0 && j<n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			for(int j=0;j<n;j++) 	// For printing R
				{
				if(j==0 || (i==0 && j!=n-1) || (j==n-1 && i!=0 && i<=(n-1)/2) || (i==j && i>=(n-1)/2 ))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			for(int j=0;j<n;j++) 	// For printing O
			{
				if((i==0 && j!=0 && j!=n-1) || (i==n-1 && j!=0 && j!=n-1) || 
					(j==0 && i!=0 && i!=n-1)|| (j==n-1 && i!=0 && i!=n-1)	)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.print(" ");
			
			for(int j=0;j<n;j++) 	// For printing N			
			{
				if(j==0 || j==n-1 || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}

	}

}
