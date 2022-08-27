package gitPackage;

public class GitProgram3 {
	public static void main(String[] args) {
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=2;j>i;j--)
			{
				System.out.print("*");
			}System.out.println();
		}
	}

}
