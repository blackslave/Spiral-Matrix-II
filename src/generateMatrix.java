/**
 * 給出一個正整數n，並建立1xn的陣列出來，此陣列資料為順時針遞增。
 * 例如：
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
