package test;
//
//public class Selfstudy2 {
//	public static void main(String[] args) {
//	
//	}
//}

//
//5、配列
//6、メソッド
//
//5-1　配列と配列型変数
//・配列は「要素」と呼ばれる値の集合。
//・複数の値を一度に扱える。
//・同じ型の集合だけ扱うことができる。
//・要素の値には添字を使ってアクセスする。
//
//変数を使うことで複数の値を一度に扱うことができるようになる。
//
//配列使うと1行で書ける。
//→  int[] scores = { 80, 90, 85};
//
//配列を使う時は配列を使うための変数を宣言しないといけない。
//この時のデータ型は配列型。
//
//構文　配列型変数の宣言
//[]変数名;
//
//[]　角カッコがデータ型を宣言している場所。
//配列型変数の場合は[]を使う。
//[]array;   このコードだとコンパイルエラーになる。
//なぜなら配列には次のような特徴があるから。
//・同じ型の集合だけ扱える。
//・扱える数は後から変更できない。
//・値には添字を使ってアクセスする。
//
//配列は複数の値の集合を扱えるのだが、異なる型のデータを混在されて扱うことはできない。
//同じ型の集合のみ扱える。
//どの型の集合を扱うかを変数宣言時に指定する。　それが配列型宣言の前に記述する型。
//下記のように宣言する。（int型だけを扱う配列型変数のarrayを宣言する。という意味）
//int[] array;
//
//int型の集合だけ扱うのでその他の型のデータを入れることはできない。
//int[] array = 10;   コンパイルエラー
//配列型変数arrayにint型の値10を代入しようとしてるが
//配列型とint型には互換性がないからこのコードはコンパイルエラーになる。
//
//[]の前にある記述は「どの型の集合だけを扱うか」を宣言していることを意味する。
//正しい構文は下記のようになる。
//構文　配列型変数の宣言
//制約[]　変数名;
//
//
//int[] array;　　基本的な書き方
//int array[]:　　こっちも同じ意味
//
//int型だけを扱う配列型変数→int[]
//		int[]　　これが基本。
////
////5-2　配列を作る
//・「new 制約[要素数]」と記述する。
//・指定する要素数は後から変更できない。
//・配列と配列型変数は別もの。
//要素を持っているのが配列で、配列型変数は配列を扱うために使うためのもの。
//
//構文　配列の作成
//new 制約[要素数];
//
//配列を作る時は扱える上限数を指定する。
//値の集合である配列が管理している値のことを「要素」と呼ぶ。
//
//→int型の要素3つを扱う配列を作ってる。
//new int[3];
//
//int[] array = new int[3];
//⇧配列型変数arrayの宣言　　　⇧int型の要素3つを扱う配列の作成

//配列の要素数は後から変えることはできない。
//変えたい時は新しい配列を作って既存の配列から要素をコピーする。
//
//5-3　配列の要素にアクセスする
//・添字という番号で管理される。
//・添字は0から始まる。
//
//int[] array = new int[3];
//array[0] = 10;　　　　←添字番号0の要素にint型の値10を代入
//array[1] = 20;
//array[2] = 30;

//
//public class Selfstudy2 {
//	public static void main(String[] args) {
//		int[] array = new int[3];//　　  //int 型の要素3つを持つ配列型を作成
//		array[0] = 10;//　　　         //添字番号0〜2の要素に値を代入
//		array[1] = 20;                //添字番号0〜2の要素に値を代入
//		array[2] = 30;                //添字番号0〜2の要素に値を代入
//		for (int i = 0; i < 3; i++) {   //添字番号が0〜2の間繰り返す
//			int val = array[i];//　　　　　　//取り出した値をint型の変数valに代入
//			System.out.println(val);       //valの値をコンソールに表示
//		}
//	}
//}
//99行目のように変数名の後ろに続けて添字番号を指定する。
//
//5-4　要素数を数える
//・添字を使って要素数を数えたり、要素にアクセスしたりする。
//・lengthを使って配列が持っている要素数を数えることができる。
//・for文の条件式でlengthを使い、要素の数だけ繰り返し処理を行う。
//
//構文　配列の要素数を数える
//配列型変数.length
//
//lengthをお使うと配列が持つことができる要素数が戻される。

//
//int[] array = new int[3];
//array[0] = 10;
//array[1] = 20;
//array[2] = 30;
//int length = array.length;    要素数を数えて変数に代入
//System.out.println(length);

//コンソールに3を表示する。
//
//public class Selfstudy2 {
//	public static void main(String[] args) {
//		int[] array = new int[3];
//		array[0] = 10;
//		array[1] = 20;
//		array[2] = 30;
//		
//		for (int i = 0; i < array.length; i++) {
//			int val = array[i];
//			System.out.println(val);
//		}
//	}
//}
//
//
//5-5　初期化子を使って初期式子を簡略化する
//・初期化子「{}」は必ず変数宣言と同時に行う。
//・初期化子を使うと配列を作るコードを簡潔に記述できる。
//
//
//初期化子（イニシャライザ）
//int [] array = {10, 20, 30};
//int length = array.length;
//System.out.println(length);


//初期化子は変数宣言と同時でしか使えない。

//5-6　拡張for文
//・集合から1つずつ値を取り出し、全ての値を取り出したら自動的に繰り返し処理を終了する。
//・1つおきに値を取り出すような細かな制御には不向き。
//
//構文　拡張for文
//for (　データ型　変数名　:　集合) {
//	繰り返し処理
//}
//
//コロンを挟んで左側には、繰り返している間にだけ使う一時変数
//右側には値の集合を記述する。
//値の集合には、配列を記述する。
//集合から値を取り出すべき値がなくなるまで自動で繰り返すのが拡張for文。

//public class Selfstudy2 {
//	public static void main(String[] args) {
//		int[] array = {10, 20, 30};
//		for ( int i = 0; i < array.length; i++) {
//			int val = array[i];
//			System.out.println(val);
//		}
//	}
//}

//※最初から最後まで全ての値を1つずつ取り出す時に便利な構文だと覚える。

//
//6、メソッド
//6-1　処理をまとめる「メソッド」
//・長いコードを分割することで分かりやすく、再利用しやすいコードになる。
//・メソッドとは、一連の処理の流れをまとめたもの。
//
//6-2　メソッドを定義する
//
//6-3　プログラムの実行順とmainメソッド
//
//6-4　メソッドを呼び出す
//・「メソッド名();」と記述する。
//・呼び出し先のメソッドでさらに別のメソッドを呼び出すことができる。
//
//構文　メソッドの呼び出し
//メソッド名();
//
//public class Selfstudy2 {
//		public static void sample() {
//			System.out.println("B");
//		}
//		public static void main(String[] args) {
//			System.out.println("A");
//			sample();
//		}
//	}
//「A」下に「B」が表示される。



//
//7、オブジェクト指向
//大事な内容。しっかり理解して。。
//
//7-1　オブジェクト指向とは？
//・ソフトウェア設計手法の1つ。
//・構造化設計は開発コストの削減を目的とし、
//オブジェクト指向設計は保守コストの削減を目的とした設計手法。
//・構造化設計は「どのような処理をすべきか」から設計を開始し
//オブジェクト指向設計は「どのようなデータを扱うか」から設計を開始する。
//・データの扱い方のルールをコードで表現したものを「ビジネスロジック」と呼ぶ。
//
//オブジェクト指向とはソフトウェア設計手法の1つで
//「ソフトウェアの作り方」であり、
//具体的には「分解と結合を考える」行動。
//
//
//オブジェクト指向設計が必要な理由
//どのような設計手法でも設計工程で考えなければならないことは2つのみ
//・どのような処理をしなければいけないのか
//・どのようなデータを扱わなければいけないのか

//
//7-3　オブジェクト指向プログラミング
//・実際に動作するものを「インスタンス」、その元になるものを「クラス」で表す。
//・クラス内にはインスタンスが持つべきデータの種類（フィールド）と
//そのデータを使った処理（メソッド）を記述する。
//・使う側と使われる側のクラスが存在する。
//・インスタンスの生成はnewキーワードを使って行う。
//・アクセサメソッドを使うことでデータ隠蔽できるようになる。
//・ローカル変数とフィールドの変数名が重複した場合はローカル変数が優先される。
//
//◎オブジェクト指向は「考え方」
//ソフトウェアをオブジェクトという単位で分割しオブジェクト同士が連携して
//全体を動作させるという考え方。
//
//◎オブジェクト指向プログラミングは「開発手法」
//効率よく開発をするためのことだがオブジェクト指向の考え方を実現する具体的な方法。
//
//◎オブジェクト指向プログラミング言語はオブジェクト指向プログラミングの
//手法を「取り入れた言語」
//重要なのはオブジェクト指向プログラミングを取り入れたというところ。
//
//オブジェクト指向プログラミングでは、実際に動作するもの（コピー　＝　インスタンス）と
//その元（コピー元　＝　クラス）となるものに分けて考える。

//
//6、モデリングとUML
//ソフトウェア開発ではコミュニケーションも大切。
//効率よくなおかつ情報を分かりやすく伝えるための手法として使われている
//「UML」について学ぶ。
//
//8-2　UMLとは？
//
//クラス図、オブジェクト図、シーケンス図
//
//
//9、インスタンスの扱い方
//
//10、オブジェクト型配列
//11、パッケージのよるクラスの分類
//
//〜
//
//17、標準クラスのライブラリ






