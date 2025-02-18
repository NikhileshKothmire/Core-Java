class Pattern17 {
	public static void main(String args[]) {
		int n = 5;

		//Loop to iterate over each row
		for(int i=1;i<=n;i++){
			//Loop to iterate over each column
			int counter = i;
			for(int j=1;j<=i;j++){
				System.out.print(counter+ " ");
				counter = counter+n-j; 
			}
			System.out.println();
		}
	}
}

/*                         O/P

C:\Users\Admin\Documents\GitHub\Core-Java\PatternsAll>javac Pattern17.java

C:\Users\Admin\Documents\GitHub\Core-Java\PatternsAll>java Pattern17
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

C:\Users\Admin\Documents\GitHub\Core-Java\PatternsAll>

*/