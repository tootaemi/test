package test;

public class JavaSilverSE11_0 {
	public static void main(String[] args) {
//		System.out.println("JavaSilverSE11_0");

		
		
		//第4章4から
		
		//4.
//		//public class Main {
//			//public static void main(String[] args) {
//				for (int i = 1, long j = 2; i < 5; i++) {
//					System.out.println(i * j);
//		
//		⇨　コンパイルエラーになる。
//		初期化文としてint型とlong型の異なる型の変数を
//		同時に宣言しているためコンパイルエラーになってしまう。
//		
		//！　for文の初期化式では同じ型の変数を複数宣言できる。
		//異なる型の変数を同時に宣言することはできない、コンパイルエラーになる。
		
////		　　　　　　　　　　↓　直すとしたら下記のように書く。
//					
//					
////		public class Main {
////		    public static void main(String[] args) {
//		        int j = 2; // jをforループの外で宣言
//		        for (int i = 1; i < 5; i++) 
		//System.out.println(i * j);
		
		
////		5.
//		int a = 1;
//		for (int b = 2, total = 0; b <= 5; b++) {
//			total = a * b;
//		}
//		System.out.println(total);
//		
//		
//		→　コンパイルエラーになる。
//		下記のように直す。
		
		
//		int a = 1;
//		int total = 0; // total を for ループの外で宣言し、初期化
//		for (int b = 2; b <= 5; b++) {
//		    total = a * b;
//		}
//		System.out.println(total); // ここで total の値を出力できる
//
//		コンソールに5が表示される。
		
		
		//6.コンソールに「0」と表示したい。
//		
//		for (int i = 0; i == 0; i++) {
//			System.out.println(i);
//		}
//		
//		!　条件文は繰り返し処理を実行する前に判定される。
//		　　条件文の結果がtrueなら繰り返し処理を実行、faiseならfor文を抜ける。
		
//		7.
//		for (int i = 0, j = 0; i < 3, j < 5; i++) {
//			System.out.println(i++);
//			j += i;
//		}
		
//		　↓　　下記のように直す。
//		
//		for (int i = 0, j = 0; i < 3 && j < 5; i++) {
//		    System.out.println(i++);
//		    j += i; // ここでコロンをセミコロンに修正
//		}
//
//		!for文で複数の条件文を記述する場合は論理演算子を使う。
//		初期化文や更新文のようにカンマ「,」で区切って複数の条件を記述すると
//		コンパイルエラーになる。
		
		
//		8,
//		
//		for (int i = 0; i < 3; i++, period()) {
//			System.out.println(i);
//		}
//	}
//	private static void period() {
//		System.out.println(",");
//		
//		→「0,1,2,」と表示される。
//		
//		!　　更新文は繰り返し処理が終わってから実行される。
//	初期化文→条件文⇨繰り返し処理⇨更新文（⇨条件文）これが実行順。
//		
//		
	
		9.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		        }
		    }
		

				








		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

