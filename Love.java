import java.util.Scanner;
public class Love{
	public static void main(String[] args){
		//爱心
		int x2 = 13;//最多星数
		int p1 = x2 / 2;
		int p2 = p1 + 1;
		int p3 = ( x2 + 1 )/ 2;
		int p4 = ( p3 - 3 )/ 2;//第一行与最多星行差几层
		int p5 = (x2 - p4*2);
		int p6 = p4+2 ;
		int p7 = x2 -p4 -1;
		for(int i =1 ;i <= (p3-3)/2 ;i++){
			for(int j =1;j < x2; j++ ){
				if( (j >= p6 -i && j <= p6 +i) || (j >= p7-i && j <= p7+i)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = p2 ; i >=1  ; i--){
			for(int j = x2 ; j >= 1 ; j--){	
				if(j >= (p2 -i+1) && j <= (p2 +i-1) ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("爱你哦~");
	}
}