package xxx;

import java.util.Arrays;

public class HK3_3_1_1_1 {
public static void main(String[] args) {
	int i =0,rd1=0;
	int[] j ={1,2,3,4,5,6};
	int[] j1 = new int[6];
	int count1 = 0;
	for (i=1;i <=6;i++) {
				while (j[rd1 = (int) (Math.random() * j.length)] == 0) {
					;
				}
				System.out.print(j[rd1]+" ");
				j1[count1++]=j[rd1];
				j[rd1]=0;
			}
			for(i=0;i<=5;i++)System.out.print(j1[i]+" ");
	
}
}
