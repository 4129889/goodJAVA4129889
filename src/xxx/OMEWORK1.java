package xxx;

public class OMEWORK1 {
	public static void main(String[]args) {
		int inter1=6,inter2=12;
		System.out.println(inter1+inter2);
		System.out.println(inter1*inter2);
		
		int b1=200;
		System.out.println(b1/12+"打又"+b1%12+"顆");
		
		int days=256559/86400,hours=256559%86400/3600,minutes=256559%86400%3600/60,seconds=256559%86400%3600%60;
		System.out.println(days+"日"+hours+"時"+minutes+"分"+seconds+"秒");
		
		final double PI = 3.1415;
		System.out.printf("面積%.2f周長%.2f%n",Math.pow(5, 2)*PI,5*2*PI);
		
		//150*1.02^10
		System.out.printf("%.2f",150*Math.pow(1.02, 10));
//		請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println(5+5);
		
		for (int i = 0; i < 5; i++) {
		    if (i == 3) {
		        break; // 终止循环
		    }
		    System.out.println(i);
		}
		
			for (int i = 0; i < 5; i++) {
			    for (int j = 0; j < 5; j++) {
			        if (i == 2 && j == 2) {
			            break ; // 跳出外部循环
			        }
			        System.out.println("i: " + i + ", j: " + j);
			    }
			}
		
	} 

}
