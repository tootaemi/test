package test;

////import java.util.ArrayList;
public class JavaSilverSE11 {
	public static void main(String[] args) {
//}
//				System.out.println("JavaSilverSE11");
				
				
			
		
		
//		第1章
//		簡単なjavaプログラムの作成
//		・パッケージ
//		・クラスのインポート
//		・mainメソッド
//		・javaコマンド
//		
//		
//		1.パッケージの説明として正しいもの
//		→A.C.D
				//生異空間を提供する
				//アクセス制限を提供する
				//クラスの分類を可能にする
		
//		2.パッケージ宣言が正しく記述されてるコード
//		B
//		→
//		package aaa;
//		import java.io.*;
//		public class Sample {}
		
				
		//3.インポート宣言しなくても自動的にインポートされるもの
		//A,C	
		//java.langパッケージに属するクラス
		//同じパッケージに属するクラス
				
		
		//4.どうなるか
		
//		public class Sample {
//			protected int num = 10;
//		}
//		
//		package ex4;
//		
//		public class SampleImpl extends Sample {
//			public static void main(String[] args) {
//				System.out.println(num);
//
//				→コンパイルエラーがj発生する。
	
//
//				5.アプリケーションのエントリーポイントとなるメソッドの
//				条件として正しいもの
//				
//				A.B.E
//				→publicであること
//				staticであること
//				引数はString配列型もしくはString型の可変長引数であること

				
//				6.次のプログラムを以下に示したコマンドで実行した時の結果として正しいものは？

//				> java Main java one two
//				
//				public class Main {
//					public static void main(String[] args) {
//						System.out.println(args[0] + " " + args[1]);
//					}
//				}
//				
//				→「java one」と表示される。
//				
//				構文
//				java 完全修飾クラス名 [引数　引数　・・・]
//				
//						
//				7.javaのクラスを実行するコマンドとして正しいもの
//				→
//				java Test
//				java Test.java
////		
//
//				8.Sampleクラスを実行した時の結果として正しいもの
//				
//				> java Sample a ¥" a¥" "a "b c
//				
//				public class SAmple {
//					public static void main(String[] args) {
//						System.out.println(args.length);
//						}
//					}
				
//				①　a
//				② "
//				③ a"
//				④ a b
//				⑤ c
//				
//				""がエスケープされているので文字として扱われている。
//				４つ目の""が「a」というスペースを含む文字列と
//				「b」という文字が連結されて１つの文字に。
//				起動パラメータの数は5つとなる。
				
//				
//				→5が表示される
//				3つのポイント
//				・スペースが区切り記号として扱われる。
//				・スペースを含む文字列はダブルクォーテーションで括ることで1つとして扱われる。
//				・ダブルクォーテーションそのものは文字として扱わない。

				
		
//		
//		第2章
//		javaの基礎データ型と文字列操作
//		・プリミティブ型のデータ
//		・レテラル
//		・varを使ったローカル変数の型推論
//		・Stringクラス、Stringクラスのメソッド
//		・文字列同志の連結
//		・StringBuilderクラス、StringBuilderクラスのメソッド
		
		
//				1.コンパイル、実行結果は？
				
//				public class Main {
//					public static void main(String[] args) {
//						int val = 7;
////						bool flg = true;
//						 boolean flag = true;
//						if (flag == true) {
//						 do {
//								System.out.println(val);
//							} while (val > 10);
//								
//							}
//						}
//		}
		
//		→コンパイルエラーが発生する。
//		
//		bool flg = true;　これを
//        boolean flag = true;　に変更
//
//		
////		
//		if (flg == true) {　を
//		if (flag == true) {　に変更
//		これでコンソールに　「7」が表示される。

		
		//2.コンパイルエラーになるもの
		
		//int e = 0827;
		//→8進数は0〜7の８つの数なので8は使えない。
		//だからコンパイルエラーになる。
				
				//3.コンパイルエラーになるもの
				
				
//				C　→　int c = _123_456_789;
//				D　→　int d = 123_456_789_;
//				E　→　float e = 3_.1415F;
//				F　→　long f = 999_99_9999_L;
//				I　→　byte i = 0x_52;
//				
//				・リテラルの先頭と末尾には記述できない。
//				・記号の前後には記述できない。
//				上記2つのルールに従えば出現する場所や回数は基本的に自由。
//				
//				記号には小数点を表すドット「.」
//				long型やfloat型リテラルを表す「L」、「F」
//				2進数を表す「0b」
//				16進数を表す「0x」などが含まれる。
//				
//				
//		因みにコンパイルエラーにならないのは
//		
//		A　→　int a = 123_456_789;
//		B　⇨　int b = 5_______2;
//		G　→　byte g = 0b0_1;
//		H　→　int h = 0_52;
//		
//		4.char型の変数の初期化として正しいもの
//		⇨　char c = 89;
//		
//		文字リテラル「''」
//		文字列リテラル「""」
//		
//		
//		5.コンパイルエラーになるもの
//		⇨
//		D　 int ${d} = 400;
//		E int g.a = 700;
//		
//		・予約語を識別子として扱えない。
//		・使える記号は「_」アンダースコアと通貨記号のみ。
//		・数字から初めてはいけない。（2文字目以降であれば使用可）
//		
//		※ ! @ # % ^ & * ( ) ' : ; [ / } 使えない。
		
		
				
				//6.変数宣言でコンパイルエラーにならないもの
//				ver e = new ArrayList<>();
//		
//				
//				コンパイルエラーになるもの
//				ver a;
//				var b = null;
//				var c = () -> {};
//				var d = {1, 2, 3};
//				
//				varを使った変数宣言
//				例：））
//				var a = 10;
//				
//				メソッドの戻り値からローカル変数の型を推論する。
//				例：））
//				var a = sample();
//				
//				ラムダ式からは変数の型を推論できない（コンパイルエラー）
//				例：））
//				var a = () -> {};
//				
//				配列の初期化式を使うと型推論できない
//				例：））
//				int[] array = {1,2,3};  //変数の型からintj配列型のインスタンスを生成してる
//				var a = {1,2,3};  //型を特定できない
//				
//				ダイヤモンド演算子で型が推論できない場合にはObject型が使われる。
//				例：））
//				ver e = new ArrayList<>();
//				
//				7.どんな結果になるか
				
//				public class Sample {
//					private var value;
//					public Sample(var value) {
//						this.value = value;
//					}
//					public void test() {
//					System.out.println(value);
//					}
//				}
//				
//				public class Main {
//					public static void main(String[] args) {
//						Sample s = new Sample("sample");
//						s.test();
//					}
//
//				}
				
//				→コンパイルエラーになる。
//				varを使った変数宣言に関する問題。
//				varによる型推論はローカル変数の宣言にしか使えない。
//				
//				例：））フィールドの宣言に型推論は使えない（コンパイルエラー）
////		
//				public class Sample {
//					var name = "";
//					var price = 0;
//				}
	
	
	//　例：））引数の型宣言に型推論は使えない（コンパイルエラー）
	       
//	       public class Sample {
//		     public void test(var value) {
//		    	 System.out.println(value);
//		     }
//	　　　　　　　}
//	       
//	       varは値の代入式をみて代入する値の型から変数の型を推論する。
//	       メソッドの定義をコンパイルしようとした時に
//	       どのコードからこのメソッドが使われているかを探して型推論できないため
//	       コンパイルエラーになる。
	       
	       //8.コード略。
	
//	
//	9. Stringオブジェクトを作成するコードとして正しいもの。
//	
//	String a = new String("sample");
//	String b = "sample";
//	
//	複数の文字を集めたものを「文字列」
//	文字列操作の為のメソッドを提供するクラスが用意されている。
//	→　java.lang.Stringクラス
//	
//	Stringクラスのインスタンス生成方法の代表的なのは次の2通り
//	・newを使ってインスタンス化する。
//	・”ダブルクォーテーションで括った文字列リテラルを記述する。
	
	
	
	//10.結果として正しいもの
	
	//public class Main {
//		public static void main(String[] args) {
//			String str = "hoge, world.";
//			hello(str);
//			System.out.println(str);
//		}
//		private static void hello(String msg) {
//			msg.replaceAll("hoge", "hello");
//		}
		
//		→　「hoge, world.　」と表示される。
//	
//		Stringオブジェクトが不変なオブジェクトであることを理解する為の問題。
//		
//		変更できるオブジェクト→「mutable(可変)なオブジェクト
//		変更できないオブジェクト→「immutable(不変)なオブジェクト」
//	
//	
//	immutableなオブジェクトを定義するには
//	下記のようにする。
//	
//	・全てのフィールドをprivateで修飾する。
//	・オブジェクト内部の状態を変更可能なメソッドを提供しない
//	（例えばsetterメソッドを提供しない）
//	・クラスをfinalで宣言し、メソッドがオーバーライドされないことを保証する。
//	（サブクラスからの変更を防ぐ）
//	・内部に可変オブジェクトを保持している場合
//	そのオブジェクトを外部に提供しない
//	（例えばgetterメソッドを提供しない）
//	   
//	      ！　 試験対策
//	       String クラスについて以下の2点を確認しおきましょう。
//	       ・Stringはimmutableなオブジェクトであるため文字列を変更するには
//	       新しくインスタンスを作らなければならない。
//	      ・replaceAllメソッドをはじめとするStringクラスメソッドの挙動
	       
	       
	       
	       
//	      ※例外がスローされる意味　→ 
//	      例外とは、プログラム実行中に発生する予期せぬエラーのこと。
//	       このエラーが発生することを「例外がスローされる」という。
//	       
//	       ※コンパイルエラーとは、プログラミング言語で記述されたソースコードを
//	       機械語のコードに変換（コンパイル）する際に、
//	       何らかの致命的な問題が発生して失敗・中断すること。
//	       コンパイル・エラーがなくなるまで、実行プログラムを生成することはできない。
	       
	       //11.結果として正しいもの
	       //public class Main {
//	    		public static void main(String[] args) {
//	    			String str = "abcde";
//	    			System.out.println(str.charAt(5));
//	    		}
//	       }
//
//　　　　　　　→実行時に例外がスローされる。
//       StringsクラスのcharAtメソッドに関する問題。
//       6番目の文字はない。
//       そのため実行すると文字列の範囲外にアクセスしたことを示す
//       例外　java.lang.StringlndexOutOfBoundsExceptionがスローされる。
//       
//       ！charAtメソッドの引数に指定する文字番号は0から始まる。
//       5番目の文字を取り出す場合は、引数には4を指定する。
	      
		
		//12.結果として正しいもの

	       //public class Main {
	    		//public static void main(String[] args) {
	    			//String str = "abcde";
	    			//System.out.println(str.index0f("abcdef"));
		
		
		//→　-1が表示される。
		
		//StringクラスのindexOfメソッドに関する問題。
		//indexOfメソッドは引数で指定された文字が文字列のどの位置に存在するかを
		//調べるためのメソッド。
		//引数で指定した文字が存在しなければ-1が戻される。
		
		
		//String str = "abcde";
		//System.out.println(str.index0f('c'));
		
		//このメソッドはオーバーロードされていて
		//位置を調べたい文字をchar型で渡す以外にも文字列で渡すこともできる。
		//文字列を引数に渡した場合、このメソッドはその文字列が始まる
		//最初の文字位置に戻す。
		
		//※オーバーロードとは、同じクラスの中でメソッド名と戻り値の型が同じで、
		//引数の型や数、並び順が違うメソッドを2つ以上定義すること
		
		//13.結果として正しいもの
		
//	       public class Main {
//	    		public static void main(String[] args) {
//	    			String str = "abcde";
//	    			System.out.println(str.substring("2,4"));
//	       
//	    			⇨　「cd」と表示される。
//	    			Stringクラスのsubstringメソッドに関する問題。
//	    			java.lang.Stringクラスのsubstringメソッドは文字列から
//	    			任意の文字列を抽出するメソッド。
	    			
	    			//14.結果として正しいもの
	    			
	    			//public class Main {
	    				//public static void main(String[] args) {
//	    				String str = "aaaa";
//	    				System.out.println(str.replace("aa", "b"));
//	    			
//	    				⇨「bb」と表示される。
//		    			Stringクラスのreplaceメソッドに関する問題。
//		    			java.lang.Stringクラスのreplaceメソッドは文字列を
//		    			置き換えるためのメソッド。
//		    			
//		    			・先頭の2文字「aa」が「b」に置き換わり「baa」という文字列が戻される。
//		    			・置き換え後の文字列「baa」のうち「aa」が「b」に置き換わり
//		    			「bb」という文字列が戻される。
//		    			
		    			
	       //15.結果として正しいもの
	       
	       //public class Main {
	    	   //public static void main(String[] args) {
//			String str = "abcde";
//			System.out.println(str.charAt(str.length()));		
//	       
//			→　実行時に例外がスローされる。
//			
//			Stringクラスのlengthメソッドに関する問題。
//			lengthメソッドは文字数を戻すメソッド。
			
		
			//16.結果として正しいもの

		       //public class Main {
				//public static void main(String[] args) {
//					String str = "abcde";
//					System.out.println(str.substring(1,3).startsWith("b"));
//		
//					→　true　が表示される。
//					
//					StringクラスのstartsWithメソッドに関する問題。
//					startsWithメソッドは文字列が引数で指定された文字で
//					始まるかどうかを調べる為のメソッド。
//					調べた結果は真偽値で戻される。
//					
////		
//	17. 略

		
		
//	18.結果として正しいもの。
	//public class Main {
		//public static void main(String[] args) {
//			System.out.println(10 + 20 + "30" + 40);
//		
//			3→　303040　が表示される。
//			
//			＋演算子と文字列の連結に関する問題。
//			①　10 + 20 = 30
//			② 30 + "30" = "3030"
//			③ "3030" + 40 = "303040"
		
		
		//19.結果として正しいもの。
		
	    //public class Main {
			//public static void main(String[] args) {
//				String str = null;
//				str += "null";
//				System.out.println(str);
//				
//				⇨「nullnull」と表示される。
//				
//				＋＝演算子と文字列の連結に関する問題。
//				＋＝演算子も文字列を連結する。
//				
//				
//				20.結果として正しいもの。
	    //public class Main {
//				//public static void main(String[] args) {
//		           StringBuilder sb = new StringBuilder("abcde");
//		           System.out.println(sb.capacity());
//				
//	       
//	       ⇨　21が表示される。
//	       StringBuilderクラスに関する問題。
	       
//	       public StringBuilder(String str) {
//	    	   super(str.length() +16);
//	    	   append(str);
//	       }
//	       初期状態で16文字分。
//	       「文字列の長さ＋16文字分」のバッファを持っている。
	       
	       //21.結果として正しいもの。
		//public class Main {
			//public static void main(String[] args) {
//		        StringBuilder sb = new StringBuilder();
//		        sb.append("abcde");
//		        sb.reverse();
//		        sb.replace(1, 3, "a");
//		        System.out.println(sb);
//		        
//		        ⇨　eaba　と表示される。
//	       
//	       appendメソッドは文字列に新しい文字列を追加するメソッド。
//	       追加された文字列は既存の文字列の後ろに追加される。
//	       
//	       reverseメソッドは文字列を反転するメソッド。
//
//StringBuilder sb = new StringBuilder();
//新しい StringBuilder インスタンスを作成しますが、ここでは初期文字列は指定されていません。
//sb.append("abcde");
//StringBuilder に "abcde" を追加します。この時点で sb の内容は "abcde" です。
//sb.reverse();
//StringBuilder の内容を逆順にします。"abcde" が逆になり、"edcba" になります。
//sb.replace(1, 3, "a");
//インデックス 1 から 3 までの範囲を "a" で置き換えます。ここで重要なのは、replace メソッドの第二引数（この場合は 3）が置換される範囲の終わりのインデックスを指し、このインデックスの文字は置換の対象に含まれないということです。つまり、インデックス 1（'e'）と 2（'d'）が "a" で置き換えられます。したがって、"edcba" は "eaba" になります。
//System.out.println(sb);
//現在の StringBuilder の内容を出力します。この時点での内容は "eaba" です。
//

		
		
		//22.結果として正しいもの。
		//public class Sample {
		//public static void main(String[] args) {
//		    StringBuilder sb = new StringBuilder("abcde");
//	        System.out.println(sb.indexOf("bcd"));
//	
//	⇨　「1」が表示される。
//	StringBuilderクラスのindexOfメソッドに関する問題。
//	StringBuilderクラスのindexOfメソッドはStringBuilderの
//	インスタンスが保持している文字列のうち
//	引数で受け取った文字列の「開始位置」を戻す。
//	
	
	
	
//	第3章
//	演算子と判定構造
//	・代入演算子
//	・マイナス演算子
//	・インクリメント演算とデクリメント演算
//	・関係演算子
//	・論理演算子
//	・演算子の優先順位
//	・同一性と同値性、equalsメソッド
//	・intermメソッド
//	・if文、if-else if-else文
//	・switch文
	
		//1、結果として正しいもの。
		//public class Main {
		//public static void main(String[] args) {
//		     int a = 3;
//		     int b = a += 5;
//		     System.out.println(a + b);
		
//		     →　16が表示される。
//		
//		     代入演算子と演算子の動作についての問題。
//		    代入演算子「＝」は値を変数に代入するための演算子だが、
//		    加算代入「＋＝」や減算代入「ー＝」のようなバリエーションがある。
////		    
//		    [代入演算子]
//		    演算子　　　　使用例　　　　　　　　　　　　意味　　　　　　　　　　　
//		    ＝　　　　　　a = 10;           変数aに10を代入する
//		    ＋＝　　　　　a -= 10;          「a = a + 10」と同じ。変数aの値に10を足してから
//		    　　　　　　　　　　　　　　　　　　変数aに結果を代入する
//		　　ー＝　　　　　a -= 10;           「a = a - 10」と同じ。　変数aの値から10を引いてから
//		　　　　　　　　　　　　　　　　　　　　　変数aに結果を代入する。
//		   *=           a *= 10;          「a = a* 10」と同じ。　変数aの値に10をかけてから
//		   　　　　　　　　　　　　　　　　　　　　変数aに結果を代入する。
//		   /=           a /= 10;            「a = a /10」と同じ。変数aの値を10で割ってから、
//		   　　　　　　　　　　　　　　　　　　　　　変数aに結果を代入する。
//		                        
		                        
//		     ① a = a + 5;  (a += 5)
//		     ② b = a;
//		     
//		     ①は「a = 3 + 5」と同じ。
//		    bも8になる。	 
		
		
		//2、結果として正しいもの
		//public class Sample {
		//public static void main(String[] args) {
//		     int num = -10;
//		     System.out.println(10 * -num);
//		
//		→　100 が表示される。
//		
		
		//マイナス演算子に関する問題。
		
//		このコードが 100 を表示する理由は、単純な算術演算によるものです。
//
//		int num = -10;
//		この行では、変数 num に -10 を代入しています。
//		System.out.println(10 * -num);
//		ここで、num の値（-10）に - を付けています。この - は単項マイナス演算子で、
		//オペランドの符号を反転させます。つまり、-num は -(-10) となります。
//		-(-10) は 10 となります。単項マイナス演算子が -10 の符号を反転させるためです。
//		その後、10（-num の結果）を 10 と掛け算します。つまり、10 * 10 となります。
//		10 * 10 は 100 です。
//		したがって、System.out.println(10 * -num); は 100 を表示します
		
		
		
		//3.コンパイルエラーになるもの
		
//		⇨　byte a = 0b10000000;
//		short b = 128 + 128;
//		⇨　int c = 2 * 3L;
//		⇨　float d = 10.0;
//		
//		
//		これらのコードスニペットがコンパイルエラーを引き起こす理由を説明します。
//
//		1. `byte a = 0b10000000;`
//		   - このコードでは、2進数リテラル `0b10000000` を 
//		   `byte` 型の変数 `a` に代入しようとしています。しかし、
//		   2進数リテラル `0b10000000` は、10進数で128に相当し、
//		   これは `byte` 型が表現できる範囲（-128 から 127）を超えています。
//		   そのため、コンパイルエラーが発生します。
//
//		2. `int c = 2 * 3L;`
//		   - この式では、整数リテラル `2`（`int` 型）と
//		   長整数リテラル `3L`（`long` 型）の積を計算しています。
//		   Javaでは、異なる型の数値を演算する際には、より大きいサイズの
//		   型に自動的に型変換されます。この場合、`2` が `long` 型に変換され、
//		   結果も `long` 型になります。その後、この `long` 型の結果を 
//		   `int` 型の変数 `c` に代入しようとしていますが、
//		   `long` から `int` への暗黙の型変換は許されていないため、コンパイルエラーが発生します。
//
//		3. `float d = 10.0;`
//		   - この式で `10.0` はデフォルトで `double` 型として扱われます。
//		   `double` 型から `float` 型への代入は、暗黙の型変換では許されていません。
//		   精度が失われる可能性があるためです。そのため、このコードもコンパイルエラーが発生します。
//
//		それぞれのエラーを修正するには、型変換（キャスト）を明示的に行うか、
//		リテラルの型を適切なものに変更する必要があります。例えば：
//
//		- `byte a = (byte)0b10000000;`
//		- `int c = (int)(2 * 3L);`
//		- `float d = 10.0f;` (または `float d = (float)10.0;`)
//		
//		
//		
//		
		
		//型変換に関する問題。
		
//		例：））　明示的なキャスト（型変換）
//		int a = 10;
//		short b = (short) a;
//		整数の数値リテラルはint型は浮動小数点数はdouble型が基本。
//		
//		例：））　int 型のリテラルをshort型へ代入
//		short b = 10;　⇨　int型のリテラルをshort型の変数に代入しようとしている
//		
//		例：））　int型のリテラルをbyte型へ代入
//		byte a = 128; ⇨　byteの範囲に収まらないint型のリテラルのためコンパイルエラー
//		byte b = 127; ⇨　byteの範囲に収まるint型のリテラルのためコンパイルできる
//	
		
		//4.結果として正しいもの。
		//public class Main {
		//public static void main(String[] args) {
//		     int a = 10;
//		     int b = a++ + a + a-- - a-- + ++a;
//		     System.out.println(b);
		
//		     //⇨　32が表示される。
//		
//		     インクリメント「++」とデクリメント「--」に関する問題。
//		     
//		     インクリメント演算子の利用
//		     int a = 10;
//		     a++;   a = 10 + 1; と同じ
//		     ++a; a = 11 + 1; と同じ
//		
//		
//		     初期状態：int a = 10;
//
//		     式：int b = a++ + a + a-- - a-- + ++a;
//
//		     a++ は、a の現在の値（10）を返し、その後 a をインクリメント（1 増やし）します。つまり、この部分の結果は 10 で、a は 11 になります。
//		     次に + a は、a の新しい値（11）を返します。
//		     a-- は、a の現在の値（11）を返し、その後 a をデクリメント（1 減らし）します。つまり、この部分の結果は 11 で、a は 10 になります。
//		     次の - a-- は、a の現在の値（10）を返し、その後 a を再びデクリメントします。この部分の結果は 10 で、a は 9 になります。
//		     最後の + ++a では、まず a をインクリメントして 10 にし、その値（10）を返します。
//		     したがって、式は次のように評価されます：
//
//		     int b = 10 + 11 + 11 - 10 + 10;
//
//		     これを計算すると：
//
//		     b = 10 + 11 + 11 - 10 + 10 = 32;
//
//		     最終的に、System.out.println(b); は 32 を出力します。
		     
		     
		     //5.結果として正しいもの。
		     
				//public class Main {
				//public static void main(String[] args) {
		
		
//		
//		     boolean a = true;
//		     boolean b = true;
//		     System.out.println(a <= b);
//		     
//		     ⇨コンパイルエラーが発生する。
//		     
//		     関係演算子についての質問。
//		     関係演算子は左右のオペランドの値を比較し真偽値を戻す演算子。
//		     等しいならtrue, 等しくないならfalseを戻す。
//		     
		
//		下記のコードならエラーにならずtrueが出力される。
//		     boolean a = true;
//		     boolean b = true;
//		     System.out.println(a == b); // trueが出力される
//
//		
		//6.結果として正しいもの。
		
		//public class Main {
		//public static void main(String[] args) {
//		     int a = 10;
//		     int b = 10;
//		     if (10 < a && 10 < ++b) {
//		    	 a++;
//		     }
//		     System.out.println(a + b);
//		
//		     →　20が表示される。
//		     論理演算子に関する問題。
//		     
//		     複数の関係演算子を組み合わせ、複雑な条件を指定するために使うのが論理演算子。

		
//		7.結果として正しいもの
//		public class Main {
//			public static void main(String[] args) {
//				int a = 100, b = 20, c = 30;
//				System.out.println(a % b * c + a / b);
//			
////				5が表示される。
//		　　　　演算子の優先順位についての問題。
//		    (a % b * c) + (a / b)
//		    (100 % 20 * 30) + (100 / 20)
//		    
//		    100%20の剰余算。　１００割る20の余りは0
//		    (0 * 30) + (100 / 20)
//		    0*30=0  100割る20は5
//		    0＋5＝5

		    
//				Javaでは演算子には優先順位があり、割り算と剰余演算は乗算よりも優先順位が高いです。
//				したがって、この式は以下のように評価されます：
//
//				a % b：100 % 20 は100を20で割った余りですが、
//				100は20で割り切れるので、結果は0です。
//				a / b：100 / 20 は100を20で割った商で、結果は5です。
//				a % b * c：前のステップの結果（0）に c（30）を掛けます。
//				結果は 0 * 30 = 0 です。
//				最後に a % b * c + a / b は 0 + 5 となり、結果は5です。
//				この計算により、結果として5が出力されることがわかります。		
		
//				！　・カッコやインクリメント、デクリメントが最優先である。
//				　　・数字と同じで乗算や徐算、剰余算が加算や減算よりも優先される。
//			
		
		//8.結果として正しいもの。
//		
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
//				s1 = new Sample(10);
//				System.out.println(s1 == s2);
//			}
//		}
//		
//		→　false が表示される。
//		
//		同一性と同値性に関する問題。
//		同じインスタンスであること、同じ値。
//		前者を同一、後者を同値と呼ぶ。
//		
//	同一であることは、複数の変数が同じインスタンスを参照していることを指す。
//	
//	同一性は　＝＝演算子で判定する。
//	
	
//
//Sample s1 = new Sample(10);
//ここで、Sample クラスの新しいインスタンスが作成され、
//変数 s1 にその参照が割り当てられます。
//
//Sample s2 = s1;
//この行で、変数 s2 に s1 の参照が割り当てられます。
//つまり、s1 と s2 は同じオブジェクトを指しています。
//
//s1 = new Sample(10);
//ここで s1 に新しい Sample インスタンスの参照が割り当てられます。
//これにより、s1 は元々参照していたオブジェクトから新しいオブジェクトへと参照が変わります。
//しかし、s2 は引き続き最初のオブジェクトを参照しています。
//
//System.out.println(s1 == s2);
//この時点で s1 と s2 は異なるオブジェクトを参照しています。
//== 演算子はオブジェクトの参照が同じかどうかを確認するため、
//この場合は false を返します。なぜなら、s1 と s2 は異なるオブジェクトを指しているからです。
//したがって、false が出力されるのは、s1 と s2 が異なるオブジェクトの参照を持っているためです。
//		
		
		
		//9。
//		public class Sample {
//			private int num;
//			private String name;
//			public Sample(int num, String name) {
//				this.num = num;
//				this.name = name;
//			}
//			public boolean equals(Object obj) {
//				if (obj == null) {
//					return false;
//				}
//				if (obj instanceof Sample) {
//					Sample s = (Sample) obj;
//					return s.num == this.num;
//				}
//				return false;
//			}
//		}
//		
//		
//		public class Main {
//			public static void main(String[] args) {
//				Sample a = new Sample(10, "a");
//				Sample b = new Sample(10, "b");
//				System.out.println(a.equals(b));
//				
//				trueが表示される

//　　　　　　同値性についての問題。
//      同値性とは、インスタンスは異なるが、同じ値を持っている性質のこと。
//
//nameの値は異なるもののnumの値は同じ。
//ewualsメソッドで比較すると「同値である」ことになり、
//その結果「true」と表示される。
//
//！　異なるインスタンス同士が同じ値を持っているか（同値であるか）を
//確認するにはequalsメソッドを使う。
//！　equalsメソッドはオーバーライドを前提としているメソッド。


//			
//`true`が表示される理由は、`Sample`クラスの`equals`メソッドの実装にあります。
//このメソッドは、渡されたオブジェクトが`null`でなく、
//`Sample`のインスタンスである場合にのみ`true`を返すように設計されています。
//さらに重要なことは、このメソッドが等価性のチェックに`num`フィールドのみを使用している点です。
//`name`フィールドは等価性の評価には使用されません。
//
//具体的には、`equals`メソッドは以下の手順で動作します：
//
//1. 渡されたオブジェクトが`null`であれば`false`を返します。
//2. 渡されたオブジェクトが`Sample`クラスのインスタンスであるかどうかをチェックします。
//3. オブジェクトが`Sample`のインスタンスであれば、キャストを行い、
//渡されたオブジェクトの`num`フィールドと現在のオブジェクトの`num`フィールドが
//同じ値であるかどうかをチェックします。
//4. `num`フィールドが等しければ`true`を、そうでなければ`false`を返します。
//
//この例では、`Sample a`と`Sample b`はそれぞれ`num`フィールドに`10`を持っていますが、
//`name`フィールドは異なります（それぞれ"a"と"b"）。`equals`メソッドは
//`num`フィールドのみを比較するため、この二つのオブジェクトは等しいと見なされ、
//結果として`true`が出力されます。
//
//この実装では、`name`フィールドの値にかかわらず、
//`num`フィールドの値が同じであれば二つの`Sample`オブジェクトは等しいとみなされます。
//これが`true`が表示される理由です。

		//10,
//public class Sample {
//	private int num;
//	public Sample(int num) {
//		this.num = num;
//	}
//	public boolean equals(Sample obj) {
//		if (obj == null) {
//			return false;
//		}
//		return this.num == obj.num;
//	
//		public class Maim {
//			public static void main(String[] args) {
//				Object a = new Sample(10);
//				Object b = new Sample(10);
//				System.out.println(a.equals(b));
//			}
//		}
//
//		→ false と表示される。
		//インスタンスの同値性に関する問題。
//!　objectクラスのequalsメソッドはobject型を引数に受け取りboolean型の戻り値を戻す。


		//11,
//		Object a = new Object();
//		Object b = null;
//		System.out.println(a.equals(b));
//		
//		→　false　が表示される。
		
		//12,
//		String a = "sample";
//		String b = "sample";
//		System.out.print(a == b);
//		System.out.print(",");
//		System.out.print(a.equals(b));
		
		//→　true,trueと表示される。
		
		
		//13.
//		String a = new String("sample");
//		String b = "sample";
//		System.out.print(a == b);
//		System.out.print(",");
//		System.out.print(a.equals(b));
//		
//		→　false,true　と表示される。
		
		
		
		
		
		
		
		
		
		//13〜18（仮）
		
		
		
		//19.switch文の条件式が戻せる型として正しいもの。
		
//		→
//		A char
//		B byte
//		C short
//		D int
//		F String
//		G enum
//		
//		switch文に関する問題。
//		
//		構文
//		switch (条件式) {
//		case 値　:　処理
//		　　break;
//		case 値　:　処理
//		　　break;
//		default 値　:　処理
//		　　break;
//	}
//		
//		switch文は、条件式が戻す値と一致するcase式を実行する。
//		・char
//		・ byte
//		・ short
//		・ int
//		・ Character
//		・ Byte
//		・ Short
//		・ Integer
//		・ String
//		・ Enum
//		
//		→
//		・　int型以下の整数型とそのラッパークラス
//		・　文字と文字列
//		・列挙型
//		
//		20.略
//		
//		21.もう一度復習する
		
//		明日（1/31）するとメモしたが
//		体調不良になってしまったため
//		他の日にしようと思う
		//してない分の3章の問題は土日に必ず戻ってやる。
    
		
//		第4章
//		制御構造
//		・while文
//		・do-while文
//		・for文
//		・二重ループを使った繰り返し処理
//		・無限ループ
//		・拡張for文
//		・break,continue,ラベル
		
		
		//1,
//		public class Main {
//			public static void main(String[] args) {
//				int a = 11;
//				int b = 0;
//				while (b < 5) {
//					if (5 < a) {
//						System.out.println(b);
//					}
//					a--;
//					b++;
//				}
//			}
//		
//		
//		while文に関する問題。
//		Javaの繰り返し構文は4つ。
//		⇨
//		・ while文
//		・do-while文
//		・ for文
//		・ 拡張for文
//		
//		1。の問題は、while文についての問題。
//		while文は条件式がtrueを戻す間、処理を繰り返すための構文。
//		条件式は必ず真偽値を戻さなければいけない。
//		while文の繰り返し条件として記述できる式は１つのみ。
//		
//		設問はコンソールに0〜4の値を表示しないといけない。
//		条件には「変数bの値が0〜4の間、繰り返す」ことを指定するといい。
//		⇨「b < 5」これになる。
//		
//		!　　while文の条件式は必ず真偽値を戻さなければいけないことを覚えておく。
//		繰り返し処理に使う変数と繰り返す回数に着目して条件式を考える。
		
		
		//2.
//		public class Main {
//			public static void main(String[] args) {
//				int a = 0;
//				do {
//					System.out.println(a++);
//				} while ( a < 5 );
//			}
//		
//	　　　　→　do-while文に関する問題。
//	         do-while文はwhile文と同様に条件に合致している間、処理を繰り返す構文。
//	         構文
//	         do {
//	        	 //繰り返し処理
//	         } while (　条件式　);
//		
//		do-while文の構文のポイントは3つ。
//		・doのうしろにはカッコ「()」が付かない。
//		・whileの後ろに条件式を記述する。
//		・セミコロン「;」で終了する。
//		
//		！　do-while文では、条件に合致するかに関係なく最低1回は繰り返し処理が実行される。
//		do-while文の条件式の後ろにはセミコロンが必要。
		
		
		//3.
//				public class Main {
//			public static void main(String[] args) {
//				int a = 0;
//				while (a < 5)
//					do
//						a++;
//					System.out.println(a);
//					while (true);
		
		
//
//					int cnt = 0;
//					while (cnt++ < 5)
//						System.out.println("A");
//					    System.out.println("B");
//		なぜAが5回、Bが1回表示されるのでしょうか
//	→
//	提供されたコードでは、`while` ループが `cnt` の値が5より小さい間、
//	"A"を出力し続けるようになっています。ループの条件により、
//	`cnt` が0から始まり、ループの各繰り返し後に
//	インクリメント（1増加）されるため、"A"が5回出力されます。
//	その後、`cnt` の値が5になるとループの条件が `false` と評価され、ループから抜け出します。
//
//	このコードには波括弧 `{}` が使用されていないため、
//	`while` ループには直後の1行（`System.out.println("A");`）のみが含まれます。
//	これがループの本体となります。`while` ループの後に続く
//	`System.out.println("B");` は、ループの外にあり、
//	ループの実行が完了した後に1回だけ実行されます。
//
//	したがって、このコードの実行結果は以下の通りです：
//
//	1. "A"が5回出力されます。これは、`cnt` が0から始まり、
//	`cnt++ < 5` が `true` と評価される間、ループが続くためです。
//	`cnt++` はポストインクリメント演算子を使用しているため、
//	比較の後に `cnt` の値がインクリメントされます。このため、
//	最初の比較では `cnt` が0ですが、5回目の比較では `cnt` が4となり、ループが終了します。
//	2. "B"が1回出力されます。これは、ループが終了した後に実行されるからです。
//
//	コードの動作は以下のようにまとめることができます：
//
//	- ループが開始され、`cnt` が0から4までインクリメントされる間、"A"が出力され続けます。
//	- `cnt` が5になると、ループの条件が `false` と評価され、ループが終了します。
//	- ループが終了した後、"B"が1回出力されます。
//	
		
			
		}
	}
