package hello;
public class Rectangle2 {
	public static void main(String[] args) {
        int[] x= {0,1,2,3};
        int[] y= {0,1,2,3};
        int count=0;
        for (int i = 0; i <=3; i++) {
			for (int j = 0; j <=3; j++) {
				System.out.println( "("+i+","+j+")");
				for (int n =0; n<=3 ; n++) {
					
					if(x[i]+n<=3&&y[j]+n<=3&&(x[i]+n-x[i])*(x[i]+n-x[i])+(y[j]+n-y[j])*((y[j]+n-y[j]))==2*n*n&&(y[j]+n-y[j])>0) {
						System.out.print(x[i]+","+y[j]);
						System.out.print("----");
						System.out.print(x[i]+","+(y[j]+n));
						System.out.print("----");
						System.out.print((x[i]+n)+","+y[j]);
						System.out.print("----");
						System.out.print((x[i]+n)+","+(y[j]+n));
					
						count=count+1;
					System.out.println();
					}
				}
				
			}
			System.out.println(count);
		}	
//		char A=65;
//		for (int i = 0; i <=2; i++) {
//			for (int j = 0; j <=2; j++) {
////				System.out.println(A++ +"("+i+","+j+")");
//				for (int n = 0; n <=2; n++) {
////					System.out.println(point(i, j)+n);;
//					if (i+n==j+n&&i+n<=2&&j+n<=2) {
////						System.out.println(A++ +"("+i+","+j+")");
//				
//						System.out.print(i+","+j);
//						System.out.print("|");
//						System.out.print(i+","+(i+n));
//						System.out.print("|");
//						System.out.print((j+n)+","+j);
//						System.out.print("|");
//						System.out.print((i+n)+","+(j+n));
//					System.out.println();
//					}
//				}
//			}
//		}
	}
	public  static String  point(int x,int y) {
		return "("+x+","+y+")";
	}
}
