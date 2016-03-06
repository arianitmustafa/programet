package detyrat;

public class detyra1 {

	public static void main(String[] args) {

		String s = "*";
		

		int a = 5;
		int b = 5;

		String[][] ylli = new String[a][b];


		for (int i = 0; i < ylli.length; i++) {
			for (int j = 0; j < i+1 ; j++) {
				System.out.print(ylli[i][j]=s);
			}
			System.out.println("");

		}

	}

}
