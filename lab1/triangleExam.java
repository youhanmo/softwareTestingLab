package triangleTest;

public class triangleExam {
	public static int judgeTriangle(int a,int b,int c){
		int scalene = 3;
		int equilateral = 2;
		int isosceles = 1;
		
		if(a>0&&b>0&&c>0){
			if(a+b>c&&a+c>b&&b+c>a){
				if(a==b&&b==c){
					System.out.println("This is an euilateral triangle");
					return equilateral;
				}else if(a!=b&&b!=c&&c!=a){
					System.out.println("This is a scalene triangle");
					return scalene;
				}else{
					System.out.println("This is an isosceles triangle");
					return isosceles;
				}
				
			}else {
				return -1;
			}
		}
		return -1;	
	}
}
