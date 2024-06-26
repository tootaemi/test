package test;

public class Study {
	public static void main(String[] args) {
//		System.out.println("Hello");

		
		//インクリメント、デクリメントの学習(黒本)
		
		//1.実行結果として正しいもの
//		int a = 3;
//		int b = a += 5;
//		System.out.println(a + b);
//		
//		このJavaプログラムは、変数aとbの値を計算し、それらの合計を出力。
//		プログラムの流れは次の通りです：
//		1.int a = 3;で、変数aに3が代入されます。
//		2.int b = a += 5;で、aに5を加えた結果（aが8になる）が
//		bにも代入されます。この時点でaとbは両方とも8です。
//		3.System.out.println(a + b);で、aとbの合計、
//		つまり8 + 8が計算され、16が出力されます。
//		したがって、このプログラムは16を出力します。
		
		//⇨理解した！
		//そういうものなんだと理解する。
		
		
		//2.実行結果として正しいもの
//		int num = -10;
//		System.out.println(10 * -num);
//
//		
//		100が表示される理由完璧に理解したはず1
		
		//3.コンパイルエラーになるもの
		//今は分からないので飛ばします。
		
		//4.実行結果として正しいもの.
		//int a = 10;
		//int b = a++ + a + a-- - a-- + ++a;
		//System.out.println(b);
		
		//32が表示される理由は沢山復習したのでOKかと思う！

		
		//5.簡単すぎて書く必要がない気がしたので省略しました。
		
		//6.結果として正しいもの。
//		int a = 10;
//		int b = 10;
//		if (10 < a && 10 < ++b) {
//			a++;
//		}
//		System.out.println(a + b);
		
		//chatGPTの解説がおかしいため、飛ばす。。
		
//		//7.結果として正しいもの。
//		int a = 100, b = 20, c = 30;
//		System.out.println(a % b * c + a / b);
//
//		a % bは、aをbで割った余りです。
//		100 % 20は0です（100は20で割り切れます）。
//		この結果0にcを掛けます。0 * 30も0です。
//		a / bは、aをbで割った商です。100 / 20は5です。
//		最終的に、0 + 5は5です。
//		したがって、System.out.println(a % b * c + a / b);の出力は5です。
//		この計算結果は、算術演算がどのように行われるか
//		（割り算と余りの計算、乗算、そして加算の順）、そして演算の優先順位に基づいています。
//		
		
		//8.結果として正しいもの
//		public class Sample {
//			private int num;
//			public Sample(int num) {
//				this.num = num;
//			}
//		}
//		
//		public class Main {
//			public static void main(String[] args) {
//				Sample s1 = new Sample(10);
//				Sample s2 = s1;
//				System.out.println(s1 == s2);
//				}
//			}
//		
//		このコードには`Sample`クラスと`Main`クラスの2つが含まれている。
//		`Sample`クラスは、プライベートな整数フィールド`num`と、
//		提供された引数で`num`を初期化するコンストラクタを持つシンプルなJavaクラス。
//		`Main`クラスにはプログラムのエントリーポイントである
//		`main`メソッドが含まれている。
//
//		`main`メソッド内で、`num`を10で初期化した`
//		Sample`のインスタンスが作成され、`s1`によって参照される。
//		次に、`s2`に`s1`の参照が割り当てられる。
//		つまり、`s1`と`s2`はメモリ内の同じ`Sample`オブジェクトを参照している。
//
//		`System.out.println(s1 == s2);`文は、
//		`s1`と`s2`が同じオブジェクトを
//		参照しているかどうかをチェックする。
//		`s2`には`s1`の参照が割り当てられており、
//		`s2`用に新しい`Sample`インスタンスが作成されていないため
//		、`s1`と`s2`は確かに同じオブジェクトを参照している。
//		したがって、比較`s1 == s2`は`true`に評価され、
//		プログラムはコンソールに`true`を出力する。
		
//
//		
//		chatGPTより。
//		Javaにおける「同一性」と「同値性」の概念を理解するための良い例。
//
//		- **同一性(identity)**: 二つの参照が同じオブジェクトを指しているかどうかを確認する。
//		この場合、`==` 演算子を使用して参照同士を比較する。
//		この問題のコードでは、`s1`と`s2`は同じオブジェクトの参照を持っているため、
//		`s1 == s2`は`true`に評価される。
//
//		- **同値性(equality)**: 二つのオブジェクトの状態や値が等しいかどうかを確認する。
//		この比較には`equals()`メソッドを使用する。
//		オブジェクトの内容や値が同じであっても、異なる参照（つまり異なるオブジェクトとしてメモリ上に存在する）を
//		持っている場合、`==`演算子では`false`になるが、`equals()`メソッドでは`true`になる可能性がある。
//
//		このコード例では、`s1`と`s2`が同じオブジェクトを参照しているため、
//		同一性の観点から`true`が出力される。しかし、同値性に関しては、
//		`equals()`メソッドの実装やオブジェクトの内容に基づく比較が行われるため、
//		この例では直接的には扱われていない。
//		Javaでは、オブジェクトの同値性を確認するには、`equals()`メソッドを適切に
		//オーバーライドして使用する必要がある。
		
//		インクリメントの問題でないため一旦黒本終了し、
//		基礎に戻ります。
		
//		
//		uzuuzuの動画の演習
//		①から⑤それぞれどのようなデータが画面に表示されるか。
		
//		①
//		int answer1 = 3 + (7 % 4) / 2;
//		System.out.println(answer1);
//		
//		②
//		int calc2 = 10 ;
//		int answer2 = ++calc2 ;
//		System.out.orintln( calc2 );
//		System.out.println( answer2 );
//
//		③
//		int calc3 = 10 ;
//		int answer3 = calc3++ ;
//		System.out.orintln( calc3 );
//		System.out.println( answer3 );
//		
//		④
//		int calc4 = 10 ;
//		int answer4* = calc4 + 1;
//		System.out.orintln( calc4 );
//		System.out.println( answer4 );
//		
//		⑤
//		System.out.println( "1" + "6" );
//
//		
//		①　6.5　→　×   4
//		② calc2= 10  answer2= 10 →　×  両方　11
//		③ calc3= 11  answer3=11　→　△　11、10
//		④ calc4= 11  answer4=110
//		⑤16　→　⚪︎
//		
//		答え　⇩
//		
//		①
//		int answer1 = 3 + (7 % 4) / 2;
//		System.out.println(answer1);
//		
//		`answer1`の値が計算されて表示されます。
//		
//		1. `7 % 4`は余りを計算し、結果は3となります。
//		2. `(7 % 4) / 2`は3を2で割った結果、1となります。
//		3. 3に1を加えるので、`answer1`の値は4となります。
//
//		したがって、コードを実行すると4が表示されます。
//		
//		
//		②
//		このコードでは、前置インクリメント演算子（++calc2）を使用して
//		変数calc2の値をインクリメントしています。
//		また、インクリメント後の値をanswer2に代入し、その値を表示しています。
//		
//		int calc2 = 10;
//		int answer2 = ++calc2;
//		System.out.println(calc2);
//		System.out.println(answer2);
//		このコードを実行すると、次のような出力が得られます：
//		11
//		11
//
//		これは、前置インクリメント演算子が変数calc2の値を1増やした後に、
//		その値をanswer2に代入しているためです。したがって、calc2とanswer2の値はともに11となります。
//		
//		
//		③
//		このコードでは、後置インクリメント演算子（calc3++）を使用して
//		変数calc3の値をインクリメントしています。ただし、後置インクリメント演算子は、
//		インクリメント前の値を返し、その後にインクリメントが行われます。したがって、
//		answer3にはインクリメント前の値が代入され、calc3の値はインクリメントされます。
//
//		int calc3 = 10;
//		int answer3 = calc3++;
//		System.out.println(calc3);
//		System.out.println(answer3);
//		
//		このコードを実行すると、次のような出力が得られます：
//
//		```
//		11
//		10
//		```
//
//		これは、後置インクリメント演算子が変数calc3の値を1増やすが、
//		インクリメント前の値をanswer3に代入するため、answer3の値は10となります。
//		その後、calc3の値はインクリメントされて11となります。
//		
//		
//		④
//		このコードにはエラーがあります。`answer4*`のように、
//		変数名にアスタリスク(*)を含めることはできません。正しいコードを以下に示します。
//
//		int calc4 = 10;
//		int answer4* = calc4 + 1;
//		System.out.println(calc4);
//		System.out.println(answer4);
//
//		このコードを実行すると、次のような出力が得られます：
//		```
//		10
//		11
//		```
//		これは、`calc4 + 1` の計算結果が `answer4` に代入され、`calc4` の値は変更されないため、
//		最初の行では `calc4` の値が出力され、2番目の行では `answer4` の値が出力されます。
//		
//		⑤
//		16
//
//		このコードは、文字列結合を行っています。
//		`System.out.println("1" + "6");`の部分では、文字列 "1" と文字列 "6" を結合しています。
//		Javaでは、`+` 演算子を文字列に対して使用すると、文字列の結合が行われます。
//
//		したがって、このコードを実行すると、コンソールには次のように文字列 "16" が表示されます。

//		
//		！！　　④　掛け算　* これはエラーになってしまうそう
//		だからそこに書いた答えは違うと思う
//		わかるかな
		
//		＜演習：Ex1_06 2>
//		以下、①～④でそれぞれどのようなデータが画面に表示されるでしょう？
//		
//		①
//		boolean answer1 = 5 == 3 + 2;
//		System.out.printin( answer1 );
//		
//		②
//		boolean answer2 = 5 >= 3 + 2;
//		System.out.printin ( answer2 );
//		
//		③
//		boolean answer3 = 5 >= 3 + 2 && 10 % 3 != 1;
//		System.out.println( answer3 );
//
//		
//		④
//		boolean answer4 = (5 >= 3 + 2 || 2 + 8!= 9) && !(6== 2 +4);
//		System.out.printin ( answer4 );
//		
//		
//		①　true →　⚪︎
//		② false　⇨　×　true　
//		③ false　⇨　×　true　
//		④ false　⇨　×　true　
//		
//		①　このコードは、`5` が `3 + 2` と等しいかどうかを評価して、
//		その結果を `answer1` というブール型の変数に代入します。
//		その後、`System.out.println(answer1);` を使用して `answer1` の値をコンソールに出力します。
//		`5 == 3 + 2` は真であるため、`answer1` には `true` が代入されます。
//		
//		②　このコードは、`5` が `3 + 2` 以上かどうかを評価して、
//		その結果を `answer2` というブール型の変数に代入します。
//		その後、`System.out.println(answer2);` を使用して `answer2` の値をコンソールに出力します。
//		`5 >= 3 + 2` は真であるため、`answer2` には `true` が代入されます。
//		
//		
//		参考
//		主な比較演算子
//		演算子	概要	例
//		==	左辺と右辺が等しければtrue	5 == 5 // true
//		!=	左辺と右辺が等しくなければtrue	5 != 5 // false
//		<	左辺が右辺より小さければtrue	5 < 7 // true
//		<=	左辺が右辺以下であればtrue	5 <= 3 // false
//		>	左辺が右辺より大きければtrue	7 > 5 // true
//		>=	左辺が右辺以上であればtrue	5 >= 7 // false
//		?:	「条件式 ? 式1 : 式2」。条件式がtrueなら式1、falseなら式2	i >= 1 ? “真” : “偽”
//				
//				
//		③　このコードは、Javaで条件式を使用していることを示しています。
//		この条件式では、次のような計算と比較が行われています：
//		1. 3に2を足した結果は5です。
//		2. 5は3以上です。
//		3. 10を3で割った余りは1ではありません。
//		したがって、条件式は `true` と評価されます。変数 `answer3` には `true` が格納される。
//		
//		boolean answer3 = 5 >= 3 + 2 && 10 % 3 != 1;
//	　　　System.out.println(answer3);
//	
//		③もう一つの説明
//		1. `5 >= 3 + 2` は真です。左辺は `5` で、右辺は `3 + 2` であり、
//		`5` は `5` 以上なので真を返します。
//		
//		2. `10 % 3 != 1` は真です。左辺は `10` を `3` で割った余りである `1` であり、
//		右辺は `1` です。この式は真を返します。
//		そして、論理積演算子 `&&` を使用して両方の条件が真であることを確認します。
//		両方の条件が真であるため、全体の結果は真となります。
//		したがって、`answer3` には `true` が代入され、コンソールには次のように表示されます。
//		
//		④
//		- 3に2を足した結果は5であり、5は3以上なので、条件式 `5 >= 3 + 2` は `true` です。
//		- 2に8を足した結果は10であり、10は9と等しくないので、条件式 `2 + 8 != 9` も `true` です。
//		- 6は2に4を足した値と等しいです。つまり、条件式 `6 == 2 + 4` は `true` と評価されます。
//				boolean answer4 = (5 >= 3 + 2 || 2 + 8 != 9) && !(6 == 2 + 4);
//				System.out.println(answer4);
//		このコードを実行すると、コンソールには `false` が表示されます。
//		最終的に、条件式 `(5 >= 3 + 2 || 2 + 8 != 9) && !(6 == 2 + 4)` は次のように評価されます：
//
//		- `(true || true) && !(false)` となります。
//		- `true && true` となります。
//
//		したがって、`answer4` 変数には `true` が格納されます。
//
//		
//		int a = 100;
//		double b = 1.5;
//		String c = "7";
//		double d = 1.2;
//		System.out.println(Integer.parseInt(String.valueOf((int)(a + b))) + c + d);
//
//		
//		⇨　109、7　→　×　　		10171.2
//		
//		このコードは、整数型の変数 `a` に100、倍精度浮動小数点型の変数 `b` に1.5、
//		文字列型の変数 `c` に"7"、倍精度浮動小数点型の変数 `d` に1.2を代入しています。
//		そして、それらの変数を用いて計算や文字列の結合を行っています。
//
//		コードを解析すると、次の手順で評価されます。
//
//		1. `(a + b)` は整数型と倍精度浮動小数点型の加算です。結果は `101.5` となります。
//		2. `String.valueOf((int)(a + b))` は `(a + b)` の結果を整数型に変換して文字列型に変換します。
//		つまり、"101" となります。
//		3. `Integer.parseInt(String.valueOf((int)(a + b)))` は文字列型の "101" を整数型に変換します。
//		結果は整数型の `101` となります。
//		4. `Integer.parseInt(String.valueOf((int)(a + b))) + c` は `101` と "7" の結合です。
//		数値の `101` と文字列の "7" が連結されて文字列型の "1017" となります。
//		5. 最後に "1017" と倍精度浮動小数点型の `d` の値 `1.2` が連結され、最終的に "10171.2" となります。
//
//		
//		２つ目の説明
//		このコードは、次の手順で動作します：
//		1. `a` と `b` を足し合わせ、その結果を整数にキャストします。これにより、`101` という整数が得られます。
//		2. `Integer.parseInt` を使って `101` を文字列に変換します。これにより、文字列 `"101"` が得られます。
//		3. 文字列 `"101"` と文字列 `"7"` を連結します。つまり、`"1017"` という文字列が得られます。
//		4. 文字列 `"1017"` と `d` の値 `1.2` を連結します。これにより、`"10171.2"` という文字列が得られます。
//		5. 最終的に、`System.out.println` を使用して `"10171.2"` をコンソールに出力します。
//
//		したがって、このコードを実行すると、コンソールには `10171.2` が表示されます。
//		
//		
//		＜演習：Ex1_14_1>
//		これまで使ってきた以下のメソッドがどのように定義されているか考えてみましょう
//		（1） Integer.parselntメソッド
//		①戻り値の型はなんでしょうか？
//		②仮引数の型はなんでしょうか？（複数思い当れば思い浮かぶだけ出しましょう）
//		③オーバロードされて定義されているでしょうか？
//		
//		（2） String.valueOf メソッド
//		①戻り値の型はなんでしょう？
//		②仮引数の数はいくつでしょう？（複数思い当れば思い浮かぶだけ出しましょう）
//		③オーバロードされて定義されているでしょうか
//		
//		解答
//		(1)　①
//		`Integer.parseInt` メソッドの戻り値の型は `int` です。
//		このメソッドは、与えられた文字列を整数に変換し、その整数値を返します。
//		例えば、`Integer.parseInt("123")` を呼び出すと、文字列 `"123"` が
//		整数の `123` に変換されて `int` 型で返されます。
//		
//		(1)　②
//		`Integer.parseInt` メソッドの仮引数（引数）は、文字列型（`String`）です。
//		このメソッドは、整数として解釈できる文字列を受け取り、それを整数値に変換して返します。
//		例えば、`Integer.parseInt("123")` のように呼び出すと、
//		文字列 `"123"` を整数の `123` に変換します。
//		
//		(1)　③		
//		はい、`Integer.parseInt` メソッドはオーバーロードされて定義されています。
//		オーバーロードされたメソッドとは、同じ名前を持ちながら異なる引数リストを持つ複数のメソッドのことです
//		。`Integer.parseInt` メソッドも複数のバージョンがあります。
//		たとえば、以下にいくつかのオーバーロードされたバージョンを示します：
//		1. `parseInt(String s)`：文字列を整数に変換します。
//		2. `parseInt(String s, int radix)`：指定された基数（進数）で文字列を整数に変換します。
//		例えば、`Integer.parseInt("FF", 16)` は16進数の文字列 "FF" を整数の `255` に変換します。
//		これらは一般的に使用される `parseInt` メソッドの一部ですが、他にも
//		さまざまなオーバーロードされたバージョンが存在します。
//		
//		
//		(2)　①
//		`String.valueOf` メソッドの戻り値の型は `String` です。このメソッドは、
//		与えられた値を文字列に変換して返します。例えば、`String.valueOf(123)` を呼び出すと、
//		整数の `123` が文字列の `"123"` に変換されて返されます。
//		同様に、`String.valueOf(true)` を呼び出すと、真偽値の `true` が文字列の `"true"` に
//		変換されて返されます。
//		
//		(2)　②
//		`String.valueOf` メソッドは、オーバーロードされており、仮引数の数は複数あります。
//		具体的には、以下のオーバーロードされたバージョンがあります：
//
//		1. `valueOf(boolean b)`：真偽値を文字列に変換します。
//		2. `valueOf(char c)`：文字を文字列に変換します。
//		3. `valueOf(char[] data)`：文字配列を文字列に変換します。
//		4. `valueOf(char[] data, int offset, int count)`：指定された範囲の文字配列を文字列に変換します。
//		5. `valueOf(double d)`：倍精度浮動小数点数を文字列に変換します。
//		6. `valueOf(float f)`：単精度浮動小数点数を文字列に変換します。
//		7. `valueOf(int i)`：整数を文字列に変換します。
//		8. `valueOf(long l)`：長整数を文字列に変換します。
//		9. `valueOf(Object obj)`：オブジェクトを文字列に変換します。
//
//		以上のように、異なる引数を取るバージョンが複数存在します。したがって、
//		`String.valueOf` メソッドの仮引数の数は複数あります。
//		
//		(2)　③
//		はい、`String.valueOf` メソッドはオーバーロードされて定義されています。
//		オーバーロードされたメソッドとは、同じ名前を持ちながら異なる引数リストを持つ複数のメソッドのことです。
//		具体的には、以下のようなオーバーロードされたバージョンがあります：
//
//		1. `valueOf(boolean b)`
//		2. `valueOf(char c)`
//		3. `valueOf(char[] data)`
//		4. `valueOf(char[] data, int offset, int count)`
//		5. `valueOf(double d)`
//		6. `valueOf(float f)`
//		7. `valueOf(int i)`
//		8. `valueOf(long l)`
//		9. `valueOf(Object obj)`
//
//		これらのバージョンは、それぞれ異なるデータ型の値を文字列に変換するために使用されます。
//		
//		＜演習：Ex1_10_2>
//		以下、どのようなデータが画面に表示されるでしょう？
//		String display = "";
//		for (int i = 1; i <= 9; i++) {
//		    display = "";
//		    for (int j = 1; j <= 9; j++) {
//		        display = display + i * j + " ";
//		    }
//		    System.out.println(display);
//		}
//
//		解答
//		このコードは、1から9までの九九の表を画面に表示します。
//		各行には1から9までの数値が掛け算された結果が表示され、数値はスペースで区切られます。
//		具体的な表示結果は以下のようになります：
//		```
//		1 2 3 4 5 6 7 8 9 
//		2 4 6 8 10 12 14 16 18 
//		3 6 9 12 15 18 21 24 27 
//		4 8 12 16 20 24 28 32 36 
//		5 10 15 20 25 30 35 40 45 
//		6 12 18 24 30 36 42 48 54 
//		7 14 21 28 35 42 49 56 63 
//		8 16 24 32 40 48 56 64 72 
//		9 18 27 36 45 54 63 72 81 
//		```
//
//		このように、九九の表が画面に正しく表示されます。
//		
		
	}
}


<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>テスト</title>
		<link rel="stylesheet" href="stylesheet.css">
	</head>
	<body>
		<header>
			<nav>
				<ul>
					<li>トップページ</li>
					<li>会社概要</li>
					<li>お問合せ</li>
<!-- 					<li class="apple">りんご</li>
					<li class="color-wtihe">バナナ</li>
					<li class="color-wtihe">ぶどう</li> -->
				</ul>
<!-- 				<ol class="number">
					<li class="apple">りんご</li>
					<li>バナナ</li>
					<li>ぶどう</li>
				</ol> -->
			</nav>
		</header>
		<section id="top-wrapper" >
		<h1>今日の天気は晴れです</h1>
		<p>前日は大雨だったのですが、今朝から太陽が出てきて今日は終日晴れるそうです</p>
		<a href="https://rs.sakura.ad.jp/?gad_source=1&gclid=Cj0KCQjw0MexBhD3ARIsAEI3WHJAdjwvrWoZgi1dI9PWgxMXI7VWjydwL2n5i7UloiPMrRNDZYaeFrgaAs9yEALw_wcB">詳しくはこちら</a>
		<a href="https://rs.sakura.ad.jp/?gad_source=1&gclid=Cj0KCQjw0MexBhD3ARIsAEI3WHJAdjwvrWoZgi1dI9PWgxMXI7VWjydwL2n5i7UloiPMrRNDZYaeFrgaAs9yEALw_wcB">詳しくはこちら</a>
		<a href="https://rs.sakura.ad.jp/?gad_source=1&gclid=Cj0KCQjw0MexBhD3ARIsAEI3WHJAdjwvrWoZgi1dI9PWgxMXI7VWjydwL2n5i7UloiPMrRNDZYaeFrgaAs9yEALw_wcB">詳しくはこちら</a>

		<!-- <img src="スクリーンショット 2023-07-17 12.34.57.png"> -->
		</section>
		<table>
			<tr>
				<th>学校名</th>
				<th>男女比率</th>
				<th>人数</th>
			</tr>
			<tr>
				<td>プログラミングスクールA</td>
				<td>8：2</td>
				<td>100人</td>				
			</tr>
			<tr>
				<td>プログラミングスクール</td>
				<td>6：4</td>
				<td>50人</td>				
			</tr>					
		</table>
<section>
	<div class="parent">
        <div class="children01">子要素01</div>
        <div class="children02">子要素02</div>
        <div class="children03">子要素03</div>
        <div class="children04">子要素04</div>
    </div>
</section>
<section id="over">
<p>ああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああ</p>
</section>
<from>
	<div>お名前</div>
	<input type="text">
		<div>電話番号</div>
	<input type="tel">
		<div>メールアドレス</div>
	<input type="email">
		<div>パスワード</div>
	<input type="password">
			<div>性別</div>
	<input type="radio">男性
	<input type="radio">女性
	<div>年齢</div>
	<input type="checkbox">10代
	<input type="checkbox">20代
	<input type="checkbox">30代
	<div>都道府県</div>
	<select>
		<option>東京都</option>
		<option>大阪府</option>
	</select>
	<div>お問い合わせ内容</div>
	<textarea></textarea>
	<input type="submit">
</from>
		<footer></footer>
	</body>
</html>


h1 {
    color: red;
    background-color: #fff;
    font-size: 30px;
    font-weight: normal;
    font-style: italic;
/*    text-align: center;*/
/*    text-align: right;*/
    text-align: left;
/*    text-align: justify;*/
/*height:  300pt;*/
/*width: 50px;*/
padding: 15px 5px;
margin: 0;
/*border: 1pt solid red;*/
/*border-top: 5pt solid red;*/
/*border-right: 5pt solid red;*/
/*border-bottom: 5pt solid red;*/
border-left: 5px solid;
/*position: relative;
top: 200pt;
left: 300pt;*/
/*position: absolute;
top: 100pt;
left: 500pt;
*/
/*position: fixed;　　/* 固定 */
/*top: 0px;*/
}


body {
    height: 1000px;
    margin: 0;
    padding: 0;
}

nav{
    margin: 0;
    padding: 0;
}

nav ul{
    display: flex;
    justify-content: center;
}

nav li{
    padding: 10px 15px;
    transition: all 0.2s;
}

header {
/*    display: none;*/
    display: block;
    background-color: rgba(0, 0, 0,0.7);
    color: #fff;
    position: fixed;
    width: 100%;
    z-index: 1;
    opacity: 0.5;
}

section{
	position: relative;
}

/*li{
    background-color: blue;
}*/

a:hover,li:hover{
    background-color: red;
}

li:active{
    background-color: blue;
}

/*td:first-child {
    background-color: red;
}*/
/*td:last-child {
    background-color: red;
}*/
td:nth-child(2) {
    background-color: red;
}


a{
	display: inline-block;
	/*display: block;
	display: none;
*/
    text-decoration: none;
    transition: all 0.2s;

}



p{
	font-weight: bold;
	text-align: justify;
}

body {
/*    background-image: url('スクリーンショット 2023-07-17 12.34.57.png');*/
    background-repeat: no-repeat;
/*    background-size: contain;*/
     /*background-size:  cover;
     background-position: pottom center;
/*   */  background-position: top center;*/

}


/*body{
	background-color: blue;
}
*/


.apple{
    background-color: red;
} 


/*ol li{
    background-color: blue;
}*/

.number li div{
    background-color: blue;
}

.color-wtihe{
    color: #fff;
}


#top-wrapper{
    background-color: #fff;
}


.parent{
        display: flex;
        width: 100%;
    text-align: center;
/*    flex-direction: row;*/
/*    flex-direction: row-reverse;*/
/*    flex-direction: column;*/
/*    flex-direction: column-reverse;*/
/*justify-content: center;*/
/*justify-content: flex-end;*/
/*justify-content: space-between;*/
/*justify-content: space-around;*/
flex-wrap: wrap;
/*flex-wrap: wrap-reverse;*/
/*align-items: center;*/
align-items: flex-start;
height: 100px;
}


.parent div{
/*    width: 50%;*/
    width: 33%;
    background-color: red;
}

#over{
    width: 300px;
    background-color: #000;
    color: #fff;
    height: 100px;
    overflow: hidden;
/*    overflow: scroll;*/
/*    overflow: auto;*/
/*    margin: auto;*/
    margin-left: auto;
    margin: 0 auto;
}

ul,ol{
    list-style: none;
    padding: 0;
    margin: 0;
}