package test;

//import java.util.ArrayList;
//
public class JavaSilverSE11 {
//			public static void main(String[] args) {
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
				
				public class Sample {
					private var value;
					public Sample(var value) {
						this.value = value;
					}
					public void test() {
					System.out.println(value);
					}
				}
				
				public class Main {
					public static void main(String[] args) {
						Sample s = new Sample("sample");
						s.test();
					}

				}
				
				→コンパイルエラーななる。
				
		
		
		
		
		
			}
		//}
		
		
		
		
		
		
