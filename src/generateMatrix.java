/**
 * ���o�������n�C������1xn�I�w��o�ҁC���w�񎑗��׏����j����B
 * ��@�F
 	Input: 3
	Output:
	[
 		[ 1, 2, 3 ],
 		[ 8, 9, 4 ],
 		[ 7, 6, 5 ]
	]
 * @author black
 *
 */
public class generateMatrix {
	public static void main(String []args){
		Solution Solution = new Solution();
		int n=6;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(Solution.generateMatrix(n)[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
