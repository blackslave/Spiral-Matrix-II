/**
 * 建立大小為N的二維陣列，順時間列出的方式，分為四段，印出左上至右上、右上至右下、右下至左下、左下至左上，之後將行列扣除再循環印出
 * 直到行列扣至0以下。
 * 過程中記錄資料於陣列之中。
 * @author black
 *
 */
public class Solution {
	public int[][] generateMatrix(int n) {
		int [][]result = new int[n][n];
		int row =0;
        int column=0;
        int tmp=1;
        while(n>0)
        {
        	if(n==1)
        	{
        		for(int i=0;i<n;i++)
        		{
        			result[row][column++]=tmp++;
        		}
        		break;
        	}
        	//          左上至右上列印  
        	for(int i=0;i<n-1;i++)
        	{
        		result[row][column++]=tmp++;
        	}
        	//          右上至右下列印     
        	for(int i=0;i<n-1;i++)
        	{
        		result[row++][column]=tmp++;
        	}
        	//          右下至左下列印 
        	for(int i=0;i<n-1;i++)
        	{
        		result[row][column--]=tmp++;
        	}
        	//          左下至右上列印   
        	for(int i=0;i<n-1;i++)
        	{
        		result[row--][column]=tmp++;
        	}
        	row++;
        	column++;
        	n=n-2;
        }
        return result;
    }
}
