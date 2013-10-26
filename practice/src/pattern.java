import java.util.Scanner;
public class pattern {
	void printPattern(int i, int j) {
		int counter = 0;
		int temp = i;
		int dif = i - j;
		int value = i + j - dif;
		int br=0;
		for (int m = 0; m <= value; m++) {					
				if(br<=value/2){
					br++;
			if(counter<=value/2){++counter;}}else counter--;
			for (int k = 1; k <= counter; k++) {
				
				System.out.print(temp);
				--temp;
			}
	System.out.println();
			temp=5;
		}
	}

	public static void main(String[] args) {
		pattern p = new pattern();
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		p.printPattern(a, b);
	}
}
