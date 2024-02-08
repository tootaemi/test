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
		
		
		
//		第5章
//		配列の操作
//		・配列の宣言、初期化、インスタンスの生成
//		・多次元配列
//		・配列のコピー
		
//		//1.
//		int[] array = new int[0];
//		System.out.println(array);
		
		//2.
		
//		int[] a;
//		int b[];
//		int[][]c;
//		int d[][];
//		int[] e[];
//		int[][] f[];
//		
//		⇨　コンパイルエラーは発生しない。
//		
//		配列型変数の宣言方法に関する問題。
//		配列型変数の宣言①
//		int[] array;
//		この大カッコは、データ型の後ろに記述するだけでなく
//		変数名の後ろに記述することもできる。
//		
//		配列型変数の宣言②
//		int array[];
//		
//		2次元配列、3次元配列の配列型変数の宣言①
//		int[][] arrayA;  //2次元配列型変数の宣言
//		int arrayB[][][];   //3次元配列型変数の宣言
//		
//		2次元配列、3次元配列の配列型変数の宣言②
//		int[] arrayA[];  //2次元配列型変数の宣言
//		int[][] arrayB[];  //3次元配列型変数の宣言	

		
		//3,配列型変数の宣言として正しいもの
		//→　全て誤り。
		
		//4.コンパイルエラーになるコード
		
		//A int a[] = new int[2][3];
		//B int[] b = new int[2.3]:
		//F int f[][] = new int[][3];
		
		//5,
		
		//6,
//		String[] array = {"A","B","C","D"};
//		array[0] = null;
//		for (String str : array) {
//			System.out.print(str);
//		}
//		
//		⇨　nullBCD　が表示される。
		
//		//7,コンパイルエラーにならないコード
//		B int b[][] = {};
//		C int[][] c = new int[][] {};
//		D int[] d;
//		d = new int[] {2, 3};
//		
//		配列インスタンスの生成と初期化、配列型変数の宣言と参照の代入の書式を問う問題。
//		配列インスタンスの生成、初期化、配列型変数の宣言と参照の代入といった4つのステップを
//		一度に行うことができる。
//		一度に行うには初期化子「{}」を使う方法が一番簡単。
		
//		例　配列型インスタンスの生成・初期化と配列型変数の宣言と参照の代入①
//		int[] array = { 2, 3 };
//		int[]array = new int[] { 2, 3 };
//		
//		例　配列の要素数を指定した場合（コンパイルエラー）
//		int[] array = new int[2] { 2, 3 };
//		
//		例　要素数ゼロの配列インスタンスの生成①,②
//		int[] array = {};
//		int[]array = new int[0];
//		
//		多次元配列の場合、初期化子の中にさらに初期化子をカンマ区切りで列挙する。
//		
//		例　多次元配列の生成・宣言。初期化①
//		int[][] array = {{ 2, 3 }, { 4, 5 }}
//		
//		多次元配列は配列の要素として配列の参照を持つ配列のこと。
//		多次元配列型変数には1次元目の配列インスタンスへの参照が代入される。
//		
//		下記のコードは変数は2次元、参照先の配列インスタンスは1次元であるためコンパイルエラーになる。
//		例　多次元配列の生成・宣言・初期化②(コンパイルエラー)
//		int[][] array = new int[] {};
//		
//		このコードは下記のように修正すれば変数と配列インスタンスの次元数が一致するため
//		コンパイルエラーは発生しない。
//		
//		例　多次元配列の生成・宣言・初期化③
//		int[][] array = new int[][]	{};
//		
//		newを使わないで初期化子で記述するとコンパイルエラーは発生しない。
//		
//		例　多次元配列の生成・宣言・初期化④
//		int[][] array = {};
//		
		
		
//		8.
//		String [][] array = { { "A","B" }, null, { "C", "D", "E"} }
//		int total = 0;
//		for (String[] tmp : array) {
//			total += tmp.length;
//			}
//		System.out.println(total);
////		
//		
//		⇨　実行時に例外がスローされる。
//		
//		多次元配列に関する問題。
//		多次元配列では、2次元目以降の配列の要素数を揃える必要はない。

		//！　多次元配列は、非対応な配列を保持できる。
		
		//9.省略
		
//		10.

//		int[][] arrayA = { { 1, 2 }, { 1, 2 },{ 1, 2, 3 } };
//		int[][] arrayB = arrayA.clone();
//		int total = 0;
//		for (int[] tmp : arrayB) {
//			for (int val : tmp) {
//				total += val;
//			}
//		}
//		System.out.println(total);
//	}
////}
//
//→　12が表示される。
//
//このコードでは、2次元配列`arrayA`が初期化され、
//その後、`arrayA.clone()`を使用して`arrayB`にクローンされています。
//そして、二重の拡張forループを使って`arrayB`のすべての要素の合計`total`を計算しています。
//
//`arrayA`（そしてクローンされた`arrayB`）の内容は以下のとおりです：
//- 最初の行: `{1, 2}`の合計は3。
//- 2行目: `{1, 2}`の合計も3。
//- 3行目: `{1, 2, 3}`の合計は6。
//
//これらの合計をすべて足し合わせると、`3 + 3 + 6 = 12`となります。
//
//クローンについて補足説明すると、`arrayA.clone()`は
//`arrayA`の浅い（shallow）コピーを作成します。
//これは、`arrayA`と`arrayB`が異なるオブジェクトを参照していることを意味しますが、
//クローンされた配列内の各行（内部配列）は元の配列と同じ行（内部配列）を参照します。
//このケースでは、内部配列の共有は問題にならず、要素の合計を計算するロジックに影響を与えません。
//
//したがって、プログラムが出力する`total`の値は12です。
//これは、`arrayB`のすべての数値要素の合計に相当します。
//

		
//		第6章
//		インスタンスとメソッド
//		・クラスとインスタンス
//		・参照型変数
//		・ガベージコレクション
//		・staticなフィールドとメソッド
//		・メソッドの呼び出しと定義
//		・メソッドのオーバーロード
//		・可変長引数
//		・return文
//		・コンストラクタ
//		・アクセス修飾子
//		・カプセル化とデータ隠蔽
//		・値渡しと参照渡し
		
		//1.結果として正しいもの。
//		
//		public class Item {
//			private int num = 10;
//			public void setNum(int num) {
//				this.num = num;
//			}
//			public int getNum() {
//				return this.num;
//			}
//		}
//		
//		public class Main {
//			public static void main(String[] args) {
//				Item a = new Item();
//				Item b = new Item();
//				b.setNum(20);
//				System.out.println(a.getNum());
//			}
//		}
//		
//		→　10が表示される。
//		
//		このプログラムでは、`Item`クラスが定義されており、
//		`num`という名前の`private`な整数フィールドを持っています。
//		また、このフィールドの値を設定するための`setNum`メソッドと、
//		その値を取得するための`getNum`メソッドがあります。
//
//		`Main`クラスの`main`メソッドでは、`Item`型の2つのオブジェクト`a`と`b`が作成されます。
//		`a`オブジェクトはデフォルトコンストラクタによって初期化され、
//		その`num`フィールドは初期値`10`を保持しています。
//		`b`オブジェクトについては、`setNum(20)`メソッドを呼び出して
//		`num`フィールドの値を`20`に設定しています。
//
//		この時点で、`a`オブジェクトと`b`オブジェクトは互いに独立しており、
//		`b`オブジェクトの`num`フィールドの値を変更しても、
//		`a`オブジェクトの`num`フィールドの値には影響しません。
//		そのため、`a.getNum()`メソッドを呼び出すと、`a`オブジェクトの
//		`num`フィールドの現在の値である`10`が返されます。
//
//		プログラムが「10」と表示するのは、`a`オブジェクトの
//		`num`フィールドの値が変更されていないためです。
		
//		//2.
//		public class Item {
//			public String name;
//			public int price;
//			public void printInfo() {
//				System.out.println(name + "," + price);
//			}
//		}
//		
//		public class Main {
//			public static void main(String[] args) {
//				Item a = new Item();
//				Item b = new Item();
//				a.name = "apple";
//				b.price = 100;
//				a.price = 200;
//				b.name = "banana";
//				a = b;
//				a.printInfo();
//			}
//		}
//		
//		→　banana,100と表示される。
		
		//3.省略
		//4.省略
		
		//5,
//		public class Sample {
//			static int num = 0;
//		}
//		
//		public class Main {
//			public static void main(String[] args) {
//				Sample.num = 10;
//				Sample s = new Sample();
//				Sample s2 = new Sample();
//				s.num += 10;
//				s2.num = 30;
//				System.out.println(Sample.num);
//
//				
//			}
//		}
//		
//		→30が表示される。
//		
//		このプログラムでは、`Sample`クラスに`static int num = 0;`という
//		静的（クラス）変数`num`が定義されています。
//		静的変数は、クラスの全インスタンス間で共有され、クラス自体に属しています
//		。つまり、この変数の値は`Sample`クラスのどのオブジェクトからも
//		アクセス可能であり、変更されるとそれが全オブジェクトに反映されます。
//
//		`Main`クラスの`main`メソッドでは、次の操作が行われます：
//
//		1. `Sample.num = 10;`により、`Sample`クラスの静的変数`num`の値を10に設定します。
//		2. `Sample`クラスのインスタンス`s`と`s2`を作成しますが、
//		これは`num`変数の値には直接影響しません。
//		3. `s.num += 10;`により、`num`の値に10を加えます。
//		`num`は静的変数なので、この時点で`num`の値は20になります。
//		4. `s2.num = 30;`により、`num`の値を30に設定します。
//		再度、`num`は静的変数であるため、この操作は
//		`Sample`クラスに属する`num`の単一の値を変更します。
//
//		したがって、`System.out.println(Sample.num);`で
//		`num`の値を出力すると、最後に設定された値である30が表示されます。
//
//		このプログラムが`30`を出力する理由は、`num`が`Sample`クラスの静的変数であり、
//		最後にその値が30に設定されたためです。静的変数はクラスレベルで共有されるため、
//		どのインスタンスからのアクセスも、またはクラス名を通じた直接のアクセスも、
//		同じ変数に対して行われます。
		
		
		//6.正しい説明のもの。
//		staticなメソッドからは、staticなフィールドにアクセスできる。
//		staticではないメソッドからはstaticなフィールドにアクセスできる。
		
//		1. **staticなメソッドからstaticなフィールドにアクセスできる**
//		：static（静的）メソッドは、クラスのインスタンス化なしに呼び出すことができるメソッドです。
//		staticメソッド内では、同じクラスのstaticフィールド（変数）に
//		直接アクセスすることが可能です。これは、staticフィールドもまたクラスレベルで共有され、
//		クラスのどのインスタンスにも属さないためです。
//
//		2. **staticではないメソッドからstaticなフィールドにアクセスできる**
//		：非static（インスタンス）メソッドは、クラスのインスタンスに属するメソッドです。
//		インスタンスメソッドからも、クラスに属するstaticフィールドにアクセスすることができます。
//		staticフィールドはクラスに紐付いているため、
//		クラスの任意のインスタンス（オブジェクト）からそのフィールドにアクセスすることが可能です。
//
//		要するに、staticフィールド（変数）はクラス全体で共有されており、
//		クラスのstaticメソッドだけでなく、非staticメソッドからもアクセスできるのです。
//		しかし、非staticフィールドにはstaticメソッドから直接アクセスすることはできません。
//		なぜなら、非staticフィールドは特定のインスタンスに属しており、
//		staticメソッドはインスタンス化されたオブジェクトに紐付かないからです。
		
		
		//7.
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
		
		
		
		
		