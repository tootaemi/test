package test;


//引数の利用の続き

public class Hello2 {

	public static void main(String[] args) {
		//hello("太郎");    ///helloメソッ呼び出す。
		//hello("次郎");

//		hello("太郎","三郎");    ///helloメソッ呼び出す。
//		hello("次郎","四郎");
		
	//}
	
	//public static void hello(String name) {
		//System.out.println("Helli World!");   //"Hello World!"を出力する。
		//System.out.println("こんばんは" + name + "さん");
	//}
		
	
	
//	public static void hello(String name1,String name2) {
//		
//		System.out.println("Helli World!");   //"Hello World!"を出力する。
//		System.out.println("こんばんは" + name1 + "さん" + name2 + "さん");

	
	//変数のスコープ
	
	//int x = 10;
	
	//while( x>10) {
		//int x = x;
	//}

	//num(x);
	
	
	//}
	
	
	//public static void num(int x) {
		
		//int x = x;
	
	
		//・戻り値
		//戻り値とは
		//・呼び出されたメソッドから、呼び出し元のメソッドへ値を返すことを「値を戻す」といい
		//戻されるだーたを戻り値（返り値）という。
		
		//値の戻し方
		//public static 戻り値の型メソッド（引数リスト...x）{
			
			//メソッドの処理
			//return 戻り値
		//}
		//（例）2つの整数の入力に対してその和を計算しその結果を返すメソッド
		//public static int add(int num1,int num2) {
			
			//int sum= num1 + num2;
			//return sum;
		//}
		
		
		
		int x=10;
		int y=10;
		
		int answer = add(x,y);
		
		System.out.println(answer);
		
	}
	
	public static int add (int num1,int num2) {
		
		int sum = num1 + num2;
		return sum;
		
	}      //18が実行されるはず

}
