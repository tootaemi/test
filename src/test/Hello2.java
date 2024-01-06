package test;


//引数の利用の続き

public class Hello2 {

	public static void main(String[] args) {
		hello("太郎");    ///helloメソッ呼び出す。
		hello("次郎");

//		hello("太郎","三郎");    ///helloメソッ呼び出す。
//		hello("次郎","四郎");
		
	}
	
	public static void hello(String name) {
		System.out.println("Helli World!");   //"Hello World!"を出力する。
		System.out.println("こんばんは" + name + "さん");
	}
		
	
	
//	public static void hello(String name1,String name2) {
//		
//		System.out.println("Helli World!");   //"Hello World!"を出力する。
//		System.out.println("こんばんは" + name1 + "さん" + name2 + "さん");
//	}

}
