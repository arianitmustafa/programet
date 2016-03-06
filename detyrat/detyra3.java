package detyrat;

public class detyra3 {
public static void main(String[] args) {
	int count1=0;
	int count2=0;
	int count3=0;
	
	int [] vargu = {1,1,2,1,3,2,1,3,3,3,1,2,1,1,2,2,2,3,1,1,1};
	
	for (int i = 0; i < vargu.length; i++) {
		if (vargu[i]==1) {
			count1++;
		}else if (vargu[i]==2) {
			count2++;
		}
		else{
			count3++;
		}
		System.out.print(vargu [i]);
	}
	System.out.println();
	System.out.println("Numra 1 jane: "+ count1);
	System.out.println("Numra 2 jane: "+ count2);
	System.out.println("Numra 3 jane: "+ count3);

}
}
