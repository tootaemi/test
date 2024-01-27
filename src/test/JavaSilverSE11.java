package test;

//import java.util.ArrayList;
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

		
		
		
	
	
	
	
	
	
	
	
	
	
		
		
		
		
			}
		}
		
		
		
		
		
		
