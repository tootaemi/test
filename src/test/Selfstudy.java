package test;
//
//public class Selfstudy {
//	public static void main(String[] args) {

//		String str = "Hello!";
//		System.out.println(str);
		//int num =10;
		//System.out.println(num);   //10が表示される
////		if (args.length != 0) {
		//System.out.println("emi");
//		//System.out.println("Hello");     //「Hello」という名前のクラス
		//}
	//}


//1、javaの概要
//プログラミング言語「Java」の特徴や歴史、エディションについて学ぶ。
//
//2、変数、データ型、演算子
//変数とは何か、変数の使い方など学び、簡単な演算プログラムを作る。
//
//1-1 Javaの歴史と特徴
//・一度書いたら、どこでも動く
//・オブジェクト指向プログラミングの方法論を採用している。
//・ネットワークを扱う機能を標準で備えている。
//・分散システムを扱う機能を標準で備えている。
//
//1-2
//Javaの種類と開発環境
//・Javaでソフトウェアを開発するにはJDKが必要。
//・JavaにはSE/EE/MEという3つのエディションが必要であるが
//JavaEE/MEを使うためには最も基本となるJava/SEが必要である。
//
//Java EE　（エンタープライズ・アプリケーション用）
//Java　ME　（組み込みや携帯電話用）
//Java SE　（基本的な機能を提供）

//1-3 Javaの開発環境を準備する
//（感想のみ）
//JDKインストールと環境変数の設定⇨この作業に役2.5時間
//かかってしまった。。
//ダウンロードより環境変数の設定に苦戦した。
//まだ理解が遅かったが徐々に自分で気づけて良かった。（ChatGPTありがとう）
//
////1-4　プログラミングを始める
//・プログラムの内容であるソースコードを作成し『java.』ファイルとして保存する。
//・コマンドプロンプトでjavacコマンドを使ってコンパイルする。
////・コンパイルされた『.class』ファイルをjavaコマンドで実行する。
//
//字下げはTABキを押して入力する。
//スペースを使って字下げしない。
//Javaは大文字と小文字を厳密に区別するのでスペルミスには注意する。

////※ソースコードを保存するファイルの拡張子は必ず「.java」にする。
//
//1-5　Javaのプログラムが動く仕組み
//・コンパイルとはコンピュータがソースコードを理解できるように翻訳することである。
//・コンパイルするための翻訳プログラムのことを「コンパイラ」という。
//・Javaではコンパイルを2回行い、2回目のコンパイルはプログラムの実行にJVMを使って翻訳している。
//
//コンピュータが理解できるように翻訳してあげる必要がある。
//この翻訳作業のことを『コンパイル』
//翻訳前のコードを「ソースコード」
//ソースコードをコンパイルするための翻訳プログラムのことを「コンパイラ」と呼ぶ。
//
//1-6　プログラムを構成するもの
//・1つのプログラム部品のことを「クラス」という。
//・ブロックとは、コードのかたまりを表す集合体のことで、
//『{」から「}』で表す。
//・コード中の命令のことを「ステートメント」、
//プログラムの実行中に扱うデータのことを「リテラル」という。

//System.out.println("emi");
//「"」ダブルクォーテーションで括られたデータが画面に表示される。
//表示したいデータが数値の場合には、「"」なしで記述できる。
//System.out.println(100);
//数値は”なし
//文字列は"あり　で記述する。


//コメント
/*       ここから
 * 　　　　コメント
 *        コメント
 */       //ここまでコメント


//インデント
//ブロックの開始を表す中カッコ『{』が始まったら次の行からタブを1つ入れる。
//閉じるカッコ『}』が出てきたら次の行では字下げを1つ戻す。
//


//2、変数、データ型、演算子
//2-1 変数と宣言方法
//
//public class Selfstudy {
//	public static void main(String[] args) {
		//int num;     //変数の宣言
		//num =10;     //変数の初期化
//	}
//}

//	public static void main(String[] args) {
//		int num =10;
//		System.out.println(num);   //10が表示される

//※変数は使う前に必ず初期化しておく必要がある。
//初期化していない変数を使おうとするとコンパイルエラーになる。

//文字列を扱うString型
//String型はメモリーが許す限り文字数を扱える。
//char型は1文字しか扱えない。
//
//構文　String型の変数の宣言
//String 変数名 = "文字列";
//文字列は必ず「”」で囲む。

//String str = "Hello!";    //String型の変数strを宣言し「Hello」で初期化
//System.out.println(str);  //strに代入されている「Hello!」を表示
//
//※　文字、、、1文字しか扱えない。データ型はchar
//　文字列、、、何文字でも扱える。データ型はString
// 
// 定数の宣言
// 定数とは値を変更できない変数のこと。
// 
// 2-2　算術演算子
// 演算子　　使用例　　　意味
// +        a + b　　足し算
// -        a - b    引き算
// *        a * b    掛け算
// /        a / b    割り算
// %        a % b    aをbで割った余り

		//int a = 10;  //aを10で初期化
		//int b = 20;  //bを20で初期化
		//int c = a + b;  //aとbの値を足した結果をcに代入
		//System.out.println(c);  //cの値を表示→30が表示
		//}
	//}
		
		//int a = 10;
		//System.out.println(a % 3);  //aの値を3で割った余りを表示→1
		//}
	//}	
		
	//文字列演算子
	//⇨2つ以上の文字列があった時にそれらを＋演算子で足して文字列を1つに繋げること。
		
	//String a = "Hello, ";  //カンマに後ろはスペースを1つ入れる
	//String b = "Java";
	//String result = a + b + "!";  //文字列を連結しresultに代入
	//System.out.println(result);   //連結された1つの文字列を表示
//	}                             //Hello, Java!を表示
//}

//インクリメント、デクリメント
//int a = 10;
//int b = 10;
//a = a + 1;    a++;  //変数aの値は11になる
//b = b - 1;    b--;  //変数bのあたいは9になる

//インクリメント演算子「++」
//デクリメント演算子「--」	
		
		//前置、後置では動作が異なる。

//			int a = 10;
//			int b = a++;
//			int c = ++a;
//			System.out.println(b);   //10　後置のインクリメント
//			System.out.println(c);   //12　前置のインクリメント
			
//			int a = 10;
//			int b = ++a;
//			System.out.println(b);      //11が表示される。
		
		//175行目、インクリメント演算子を前置している。
		//変数aの値に1を加えた後その値が変数bに代入される。
		//そのため176行目では11が表示される。
		
		//一方、次のコードのように後置した場合、
		//変数aの値に1を加えた後,変更前の値が変数bに代入される。
		
			//int a = 10;
			//int b = a++;
			//System.out.println(b);      //10
			//System.out.println(a);      //11
		
	//このような結果になるのはインクリメント演算子やデクリメント演算子を後置した場合
	//次のような順で動作するから。（説明はインクリメントの場合）
	
	//①変数の値をコピー
	//②変数の値を増やす
	//③①でコピーしておいた値を戻す
	
//	後置した場合、変更する前にとっておいたコピーが戻される。
//	そのため、インクリメントやデクリメントの結果を代入している式の場合は、
//	変更前の値が代入される。
//	186行目では変更前の変数aの値である10をコピーしておいて
//	変数aの値を11に増やし、その後コピーしておいた10を戻す。
//	このため変数bには10が代入されることになる。
//	前置しても後置しても、変数aの値が1つ増えることには変わりない。
//	しかし、変数bに代入されるのが変更後の値（前置）なのか
//	変更前の値（後置）なのかという点が異なる。
//	
//	
//		①おさらい
//		Q1.Javaのエディションではないもの
//		Java DB
//      JavaエディションはJava SE,Java EE, Java MEである。
//		
//		Q2.実行結果として正しいもの
		
//		public class Selfstudy {
//			public static void main(String[] args) {
//				int num = 10;
//				int result = num++ % 4;
//				System.out.println("result");
//				
//				インクリメント演算子は前置と後置で動作が異なる。
//				後置した場合、変数の値をコピーした後に1増やし、
//				コピーしておいた元の値を戻す。
//			　　　⇨10を4で割った時の余りを求めるという式になる。
//				
//	}
//}

//		3、条件分岐
//		処理の流れを分岐する「条件分岐」について学ぶ。
//		条件によって分岐するif文
//		合致する値によって分岐するswitch文がある。
//		条件を組み合わせて使うための論理演算子や条件分岐を制御するキーワードの使い方について学ぶ。
//		
//		3-1
//		読みやすいコードを書くために
//		・順次、分岐、反復の3つの構文を組み合わせた「構造化プログラミング」主流。
//		・誰が読んでも理解しやすいコードにするために
//		　構造化プログラミングの原則に従ってコードを書く。
		
//		・順次、、、上から下に向かって順番にコードを書く。
//		・分岐、、、条件を指定して、プログラムの流れを分岐する。
//		・反復、、、条件を指定して条件に合致する間、プログラムを繰り返す。
//		
//		3-2
//	　if文を使った条件分岐
//	 
//	 ・if文は、条件に一致するかしないかによって処理を分岐する構文。
//	 ・else,else ifを追加して分岐を増やす。
//	 ・論理演算子を使うと、複数の条件を組み合わせることができる。
//	 
//	 if文の基本的な構文
//	 if (条件) {
//		 条件に一致した時に実行したい処理
//	 }
//
//public class Selfstudy {
//	public static void main(String[] args) {
//		if (true) {
//			System.out.println("Hello");   //Hello表示
//		}
//	}
//}
//		public class Selfstudy {
//			public static void main(String[] args) {
//				if (false) {
//					System.out.println("Hello");    //falseに記述すると常に条件が
//					                               //一致しないため267行目のコードが実行されることはない。
//
//				}
//			}
//		}
//
//比較演算子
//
//演算子　　　　　意味　　　　　　　例　　　　　　　　説明
//>          より大きい　　　　a > b     　aがbよりも大きければtrue
//>=         以上　　　　　　　a >= b      aがb以上であればtrue
//<          より小さい　　　　a < b       aがbよりも小さければtrue
//<=         以下　　　　　　　a <= b　　　　aがb以下であればtrue
//== 　　　　　等しい          a == b　　　　aとbが等しければtrue
//!=         等しくない       a != b 　　　　aとbが等しくなければtrue

//			public class Selfstudy {
//				public static void main(String[] args) {
//					int a = 10;
//					int b = 20;
//					boolean result = a < b;       //aよりもbが大きいか調べ結果をresultに代入
//					System.out.println("result");   //trueが表示⇨result表示されてしまうなぜ、、
//					}
//				}
			
//			
//			比較演算子を使って処理を分岐する。
//			下記は、変数aの値が10よりも大きければコンソールに「大きい」と表示する。
//			

//			public class Selfstudy {
//				public static void main(String[] args) {
//					int a = 20;
//					if (10 < a) {     
//					System.out.println("大きい");    //大きいが表示される。
//					}
//				}
//			}
//上記のままでは変数aの値が固定されているのであまり実感がない。


//import java.io.Console;
//			public class Selfstudy {
//				public static void main(String[] args) throws Exception{
//					Console console = System.console();
//					int a = Integer.parseInt(console.readLine());
//					if (10 < a) {
//						System.out.println("大きい");
//						}
//					}
//				}
//上記はエラーになってしまう。(Macだから？Windowsじゃないとできないのかな？)
//下記で動いたがコードをコンパイルしjavaコマンドを実行し数字を入力ができなかった。
//		import java.util.Scanner;
//			public class Selfstudy{
//				public static void main(String[] args) {
//					Scanner scanner = new Scanner(System.in);
//					System.out.print("Enter something: ");
//					String input = scanner.nextLine(); // ユーザーからの入力を受け取る
//					System.out.println("You entered: " + input);
//					scanner.close(); // 必要に応じてScannerをクローズする
//				}
//			}
			
//参考書通りなら
//コードをコンパイルしjavaコマンド（java IfTest）を実行して
//何か数字を入力してエンターキーを押す。
//↓
//> java IfTest     javaコマンドでIfTestクラスを実行
//11                 「11」と入力しエンターキーを押す
//大きい               10よりも大きいことを示す結果

//何か数字を入力してエンターキーを押すとその値が10よりも大きい時だけ「大きい」と表示されるはず。

//IfTestクラスの実行時に入力できるのは数字だけ。
//数字以外を入力するとエラーになるので数字だけを入力すること。
//
//分岐を増やす
//条件に一致しなかった時の処理を記述するにはelseブロックを追する。
//if-else文の基本的な構文は以下の通りです。
//		if(条件) {
//			条件に一致した時に実行したい処理
//		}else {
//			条件に一致しなかった時の処理
//		}


//			import java.io.Console;
//
//			public class Selfstudy {
//				public static void main(String[] args) throws Exception{
//					Console console = System.console();
//					int a = Integer.parseInt(console.readLine());
//					if (10 < a) {
//						System.out.println("大きい");
//					} else {
//						System.out.println("小さい");
//					}
//				}
//			}
//10以下の数字を入力すると「小さい」と表示される。
//これで条件に一致した時、一致しなかった時の処理を分岐させることができるようになった。
//
//今度は条件を増やす。
//else ifブロックを追加する。
//if else if-else文の基本的な構文⇩
//
//if(条件1) {
//	条件1に一致した時に実行したい処理
//} else if(条件2) {
//	条件2に一致した時に実行したい処理
//} else {
//	条件に一致しなかった時の処理
//}

//
//import java.io.Console;
//
//public class Selfstudy {
//	public static void main(String[] args) throws Exception{
//		Console console = System.console();
//		int a = Integer.parseInt(console.readLine());
//		if (10 < a) {
//			System.out.println("大きい");
//		} else if (a < 0){
//			System.out.println("エラー");
//		} else {
//			System.out.println("小さい");
//		}
//	}
//}
//
//else ifブロックを追加することで391行目の１つ目の条件に一致しなかった場合、
//393~395行目のelse if ブロックで指定した２つ目の条件に合致するかどうか判断される。
//もし条件に合致すれば「エラー」と表示され合致しなければ
//395~397行目のelseブロックが実行されて「小さい」と表示される。

//
//論理演算子
//演算子　　　意味　　　　　　　　例　　　　　　　　説明
//&       　論理積（AND演算)　　　a % b    aとbが両方ともtrueの場合にtrue　（日本語で「AかつB」）
//|       　論理和 (OR演算)     a | b    aとbの少なくとも1つがtrueの場合にtrue
//!       　否定　　　　　 　　　　 !a     aがtrueの場合にfalse、aがfalseの場合にtrue


//テストの点を調べるためのコード

//import java.io.Console;
//public class Selfstudy {
//	public static void main(String[] args) throws Exception{
//		Console console = System.console();
//		int score = Integer.parseInt(console,readLine());
//		if (0 < score & score <= 100) {　　//0以上でかつ100以下かどうか調べる
//			System.out.println("範囲内です");
//		} else {
//			System.out.println("範囲外です");
//		}
//	}
//}
//
//左辺と右辺の組み合わせと演算の結果（AND演算）
//左辺　　　　右辺　　　　結果
//true      true     true
//true      false    false
//false     true     false
//false     false    false
//
//論理和「OR演算」
//左右どちらかがtrueであればtrueを戻す。
//日本語は「Aもしくは」

//import java.io.Console;
//
//public class Selfstudy {
//	public static void main(String[] args) throws Exception{
//		Console console = System.console();
//		int score = Integer.parseInt(console,readLine());
//		if (score < 0 | 100 < score) {  //0よりも小さいかもしくは100よりも大きいかを調べる
//			System.out.println("範囲内です");
//		} else {
//			System.out.println("範囲外です");
//		}
//	}
//}

//AND演算とは異なりOR演算は片方だけでもtrueがあればtrueを戻す。
//演算子の左辺と右辺の組み合わせによって結果は次のようになる
//結果のほとんどがfalseとなるAND演算と異なりほとんどがtrueとなるのが特徴。
//
//左辺と右辺の組み合わせと演算の結果（OR演算）
//
//左辺　　　　右辺　　　結果
//true   true    true
//true    false    true
//false   true   true
//false   false    false
//
//AND演算は左辺と右辺が両方ともtrueの時だけtrueとなり
//OR演算は左辺と右辺が両方ともfalseの時だけfalseになる！


//public class Selfstudy {
//	public static void main(String[] args) throws Exception{
//		int a = 1;
//		int i = 4;
//		if (a == 1 | i++ < 5) {   //左辺の比較演算の後に右辺を実行し、iの値は5になる
//			                      //その後条件全体の結果を戻す。
//			// do something
//		}
//		System.out.println(i);   //5を表示
//	}
//}
//
//public class Selfstudy {
//	public static void main(String[] args) throws Exception{
//		int a = 1;
//		int i = 4;
//		if (a == 1 || i++ < 5) {    //演算子を「||」に書き換え
//			// do something
//		}
//		System.out.println(i);   //4を表示
//	}
//}
//
//ショートサーキット演算子「||」を使ってるため右辺の式は実行されない。
//その結果、変数iの値がインクリメントされることはないため
//コンソールで「4」が表示される。

//できるだけシンプルに条件を組み合わせるようにしよう。


//「&」「|」を2つ重ねて記述する。
//・AND演算、、、、「＆＆」と記述し、左辺がfalseを戻す場合は右辺の演算を省略
//・OR演算、、、、、「||」と記述し、左辺がtrueを戻す場合は右辺の演算を省略


//public class Selfstudy {
//	public static void main(String[] args) throws Exception{
//		int a = 1;
//		int i = 4;
//		i++;                //論理演算の外にインクリメントを出しておく
//		if (a == 1 || i < 5) {    //左辺がtrueを戻し、右辺の演算は省略
//			}
//		System.out.println(i);   //「5」を表示
//		}
//	}

//このようにシンプルな論理演算であれば
//ショートサーキット演算子を使った方が効率的に処理を進められる。

//
//中カッコの省略
//
//if文では条件に合致した時の処理が一つしかない場合は
//ブロックを表す中「｛｝」を省略することができる。

//import java.io.Console;
//public class Selfstudy {
//	public static void main(String[] args) throws Exception{
//		
//Console console = System.console();
//int score = Integer.parseInt(console,readLine());
//if (10 <  a)                       //←ifブロックの中カッコを省略している。
//	System.out.println("大きい"); //←ifブロックの中カッコを省略している。
//	}
//}
//
//import java.io.Console;
//
//public class Selfstudy {
//public static void main(String[] args) throws Exception{
//Console console = System.console();
//int score = Integer.parseInt(console,readLine());
//if (10< a)
//	System.out.println("大きい");      //分岐処理の対象になる
//	System.out.println("常に実行される");   //分岐処理の対象にならない
//
//}
//}

//544行目のコードは条件に合致してもしなくても実行される。
//if文では条件に合致した時の処理が１つしかない場合ブロックを表す｛｝を省略できる。
//｛｝を省略した時の処理対象となるのはif文の条件式の直後にあるステートメントだけ。

//ifブロックだけでなく、else ifブロックやelseブロックでも中カッコ｛｝を省略できる。

//
//プログラミングクイズ
//
//if文の空欄に入る条件式を、考えてみて下さい。
//ここのコードは後ほど書く。。


//
//
//
//3-3  switch文を使った条件分岐
//・値によって処理を振り分ける
//・値が合致するcaseがない場合のデフォルトよ処理にはdefaultキーワードを使う。
//・breakキーワードを使ってswitch文を抜けるように命令する。
//
//Javaには、if文の他にswitch文が用意されている。
//switch文の特徴は条件式ではなく値によって処理を振り分ける点。
//例えば「1の場合はこう、2の場合ならこう、3の場合なら、、、、、」という具合に
//値によって処理を振り分けることができる。
//
//switch文の式には、byte.char,short,int,enum（列挙型を表すデータ型）
//
//caseには値を記述する。
//この値は、switchの式が戻す値に応じてどのような処理を行うのかを示すためのもの。
//
//
//switch文の基本構文↓
//switch（式）｛
//case 値:
//値に合致した時の処理
//case 値:
//値に合致した時の処理
//｝
//
//下記のコードは
//入力された数値が1の場合「one」
//2の場合は「two」と表示する。
//
//
//import java.io.Console;
//public class Selfstudy {
// public static void main(String[] args) throws Exception{
//  Console console = System.console();
//  int score = Integer.parseInt(console,readLine());
//  switch (a) {
//  case 1;
//   System.out.println("one");
//   break;
//  case 2;
//  System.out.println("two");
//  break;
//   }
// }
//}
//
//switch式が戻す値がどのcase式にも
//合致しなかった場合は何も実行してされない。
//そのdefaultキーワードを使ってデフォルトの処理を追加し
//case式の値に合致しなかった場合でも何らかの処理が実行されるようにする。
//
//
//import java.io.Console;
//public class Selfstudy {
// public static void main(String[] args) throws Exception{
//  Console console = System.console();
//  int score = Integer.parseInt(console,readLine());
//  switch (a) {
//  case 1;
//   System.out.println("one");
//   break;
//  case 2;
//  System.out.println("two");
//  break;
//  default;
//  System.out.println("other");
//  bresk;
//   }
// }
//}
//入力された数値が1の場合は「one」、2の場合は「two」、
//それ以外は「other」が表示される。
//
//
//・if文とswitch文の使い分け
//どちらも特性の異なる分岐構文。
//scoreの値が0以上100以下　のように式の結果がある程度の範囲を持ったり
//特定の値に絞り込めないような場合にはif文の方が適してる。
//一方、特定の値の時に何らかの処理をしたい場合式の結果の種類が
//少ない場合にはswitch文が適している。
//実際のソフトウェア開発では、特定の値に絞り込める状況よりも、
//ある程度の範囲を持った条件の方が多いためif文の方が使う場面が多い。
//
//switch文を使う時の注意点
//caseに合致した時の処理の最後にbreakと書かれてる。
//breakは「そのブロックを抜けなさい」という命令です。
//もしbreakがなかった場合breakが現れるまで
//次々と順番に次のcaseの処理を、実行してしまう。
//
//「one」と表示した後
//switch文を抜けることなく次のcaseの処理を実行する。
//つまり「two」「other」と順に表示されてしまう。
//もし「2」を入力すると「two」「other」と表示される。
//3や4を入力すれば「other」とだけ表示される。
//
//このようにbreakを忘れるとswith文のブロックを抜けるまでの間
//その後の処理も続けて実行されてしまうことを忘れないで。
//breakを書かずに次々と順番にcaseの処理を実行することを「フォールスルー」と呼ぶ。
//
//
//②おさらい
//
//1.変数aの値が変数bの値より小さいことを表す式
//→a < b
//
//2.Bを入力したらコンソールに何が表示される？
//
//
//4、繰り返し構文
//３つの構文はそれぞれ使い方が異なる。
//4-1 for文を使った繰り返し
//・for文では条件式がtrueを戻す限り、繰り返し処理を実行し続ける。
//・初期化式、条件式、遷移式は省略可能だが;は省略できない。
//・二重ループは内側のfor文をその意味で置き換えるとわかりやすくなる。
//
//
//繰り返し構文
//javaにはfor文、while文、do-whie文、拡張for文の4つの繰り返し構文がある。
//
////例1
//public class  Selfstudy {
//	public static void main(String[] args) {
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//	}
//}
//
//
//for文は繰り返し回数を指定してその回数分だけ同じ処理を繰り返す構文。
//
//例2はfor文を使って置き換えたもの
//
//例2
//public class  Selfstudy {
//	public static void main (String[] args) {
//		for (int i = 0; i < 5; i++) {
//		System.out.println(i);
//		}
//	}
//}
//コンパイプ、実行すると0.1.2.3.4と順に表示されるはず。
//

//例3
//public class  Selfstudy {
//public static void main (String[] args) {
//	for (int i = 0; i < 11; i++) {
//	System.out.println(i);
//	}
//}
//}
//繰り返しの上限を決めている部分で「条件式」と呼ぶ。
//for文では条件式がtrueを戻す限り、繰り返し処理を実行する。
//
//例4
//public class  Selfstudy {
//public static void main (String[] args) {
//	for (int i = 2; i < 11; i++) {
//	System.out.println(i);
//	}
//}
//}
//
//2〜10が表示されるように修正する。
//修正一カ所のみ。
//
//
//ここが最初の値を決めている部分で「初期化式」と呼ぶ。
//
////例5のコード後ほど書く
//public class  Selfstudy {
//public static void main (String[] args) {
//	for (int i = 2; i < 11; i =i + 2) {
//	System.out.println(i);
//	}
//}
//}
//2.4.6.8.10と偶数だけ表示するように修正する。

//「i++」というインクリメントは「i ＝ i + 1」と同じ意味。
//偶数だけ表示するには変数の値を2ずつ増やせばいい。
//
//for文は左から順に、初期化式、条件式、遷移式の３つで構成されてる。
//３つの式の間はセミコロンで区切ることに注意。
//
//
//構文　for文
//for (初期化式; 条件式; 遷移式) {
//	繰り返し実行したい処理
//}
//
//4-2　while文を使った繰り返し
//・条件式がtrueを戻す限り、繰り返し処理を実行し続ける。
//・繰り返しの回数が決まっていない場合に使うと便利。
//
//for文と同じように繰り返し処理を実行するための構文。
//for文は繰り返しの上限を指定してた
//while文は繰り返しの回数が決まっっていない時に使う。
//
//構文　while文
//while (条件式) {
//	繰り返し処理
//}
//条件式は真偽値（trueかfalse）そのものを記述するか
//真偽値を戻す式でないといけない。
//条件式がtrueを戻す限り繰り返し処理を続ける。
//
//下記のコード
////条件式は固定の値となるため永遠に実行し続ける無限ループになる。
////無限に「hello」が表示され続ける。
//
//while (true) {
//	//System.out.println("hello");    //実行しないでほしい。
//	}
//}
//}
//
//4-3　do-while文を使った繰り返し
//・繰り返しの回数が決まっていない時に使うと便利。
//・条件式が最後にあるため、必ず1回はdoブロック内の処理が実行される。
//do-while文もwhile文と同じように繰り返し回数を指定していない繰り返し構文の1つ。
//while文と異なるのは条件式の位置。
//
//構文 do-while文
//do {
//	繰り返し処理
//} while(条件式);
//
//
//while文では条件式が繰り処理よりも前にあったが
//do-while文ではブロックがdoから始まり条件式が最後にある。
//真偽値そのものか真偽値を戻す式でないとだめ。
//
//下記は無限ループを実現しているコード。
//
//public class Selfstudy {
//	public static void main(String[] args) {
//		do {
//			System.out.println("hello");
//		} while(true);
//	}
//}
//条件式が後ろにあるためdo-while文には条件式の結果に関わらず
//必ず1回は繰り返し処理が実行される。
//これがwhile文と異なる点です。

public class Selfstudy {
	public static void main(String[] args) {
		while (false) {
		System.out.println("hello.");
	}
	}
}


