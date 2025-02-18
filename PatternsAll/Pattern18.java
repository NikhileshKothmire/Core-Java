class Pattern18 {
	public static void main(String args[]) {
		int n = 5;
		//Loop to iterate over each row in reverse order
		for(int i=n;i>=1;i--){
			//Loop to iterate over each column of the ith row in reverse order
			for(int j=i;j>=1;j--){
				System.out.print(j+ " "); 
			}
			System.out.println();
		}
	}
}

/*                              O/P

C:\Users\Admin\Documents\GitHub\Core-Java\PatternsAll>javac Pattern18.java

C:\Users\Admin\Documents\GitHub\Core-Java\PatternsAll>java Pattern18
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1

C:\Users\Admin\Documents\GitHub\Core-Java\PatternsAll>

*/