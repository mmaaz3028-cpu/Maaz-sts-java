package Maaz;
import java.util.Scanner;
class Pattern {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter number of rows: ");
        n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j<=i; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        sc.close();
    }
}
