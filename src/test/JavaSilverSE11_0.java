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
	
////		9. 「10」表示になる。
//		int array[][] = new int[][] { { 1, 2 }, { 2, 3, 4 }};
//		int total = 0;
//		for (int i = 0; i < array.length; i++) {
//			for ( int j = i; j < array[i].length; j++ ) {
//				total += array[i][j];
//			}
//		}
//		System.out.println(total);
//		
//		>>> 二重ループを使った問題。
//		外側のループがまわる間に内側のループがまわる。
		
		//10.無限ループになるコード3つ
		
//		for( int i = 0; true; i++) {
		    // int i = 0; ; i++
		    // int i = 0; i < 5;
//			System.out.println(i);
//		}
		
		
		//11.
		
//		String[][] array = { { "A", "B", "C" } };
//		for ( Object obj : array ) {
//			System.out.print(obj);
//		}
//		
//		[Ljava.lang.String;@5d22bbb7
//		とコンソールに表示される。
//		
//		コードが実行されると、拡張forループはarrayの各"行"をobjとして処理します。
//		arrayには1つの行しかないため、ループは1回だけ実行されます。
//		この行（{ "A", "B", "C" }）はObject型のobjに割り当てられます。
//
//		System.out.print(obj);文はobjの文字列表現を出力します。
//		Javaでは、配列の文字列表現は配列の型とハッシュコードに基づくため、
//		このコードは人が読める形式の"A", "B", "C"を出力するのではなく、
//		配列の内部表現（例：[Ljava.lang.String;@ハッシュコード）を出力します。
//
//		したがって、このコードは"A", "B", "C"の内容を直接出力するのではなく、
//		配列オブジェクトの参照情報を出力します。
//		正確な出力は実行環境によって異なりますが、一般的には
//		[Ljava.lang.String;@に続くハッシュコードの形式になります。
		
		//！　拡張for文の構文は、「一時変数の宣言　：　コレクション/　配列」。
		//拡張for文の集合には、配列とjava.util.ArrayListが使える。
		//拡張for文で2次元配列を扱う場合、
		//1次元目の配列から要素（2次元目の配列への参照）を取り出して、一時変数に代入する。
		
		
//		//12.
//		String[] array = { "A", "B", "C" };
//		for ( String str  : array ) {
//			str = "D";
//		}
//		for (String str : array) {
//			System.out.print(str);
//		}
//		
//		⇨ 「ABC」と表示される。
		
		//13. 省略
		
		//14.
//		String[] array = { "A", "B" };
//		for ( String a  : array ) {
//			for (String b : array) {
//				if ("B".equals(b))
//					break;
//				System.out.print(b);
//		}
//		
//		⇨「AA」と表示される。
		
		//15.
//		int[] array = { 1, 2, 3, 4, 5 };
//		int total = 0;
//		for (int i : array) {
//			if (i % 2 == 0)
//				continue;
//			total += i;
//		}
//		System.out.println(total);	
//		
//		⇨「9」が表示される。
//		
//		2で割って余りが0の値、つまり偶数の値であった場合に、
//		continueを実行してスキップしている。
//		奇数の場合はその値を合計する。
//		変数totalには1、3、5の3つの数値の合計が代入される。
		
//		16.　ラベルが記述できるもの
//		if文やswitch文、式、代入、return文、tryブロック
//		
//		
		//17.
//		int total = 0;
//		a: for (int i = 0; i < 5; i++) {
//			b : for (int j =0; j <5; j++) {
//				if (i % 2 == 0) continue a;
//				if (3 < j) break b;
//				total += j;
//			}
//		}
//		System.out.println(total);
//		
//		⇨「12」が表示される。
		
		
		
		
		
		        }
		    }
