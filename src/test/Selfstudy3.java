package test;

//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Selfstudy3 {
	public static void main(String[] args) {
//		int age = 21;
//		System.out.println("私の年齢は" + age);
//		age = 28;
//		System.out.println("・・・いや、本当の年齢は" + age);
		
		//コンソールに「私の年齢は21
		//・・・いや、本当の年齢は28」と表示される
//		
		
		//エラーが出る
//		final double Tax = 1.05;
//		int fax = 5;
//		System.out.println("５万円から４万円に値下げします");
//		TAX = 4;
//		System.out.println("FAXの新価格（税込み）");
//		System.out.println( fax * TAX + "万円");
		
		//コンソールに「５万円から４万円に値下げします
		//FAXの新価格（税込み）
		//4.2万円」と表示
       
//		//修正コード
//		final double TAX = 1.05; // 定数として宣言し、変更できないようにする
//		int fax = 5;
//		System.out.println("５万円から４万円に値下げします");        
//		        // TAXを4に変更するのではなく、価格を4万円に適用するためにTAXを使います
//		        double newPrice = fax * TAX;
//		        System.out.println("FAXの新価格（税込み）");
//		        System.out.println(newPrice + "万円");
		        
		        //コンソールに
		        //「５万円から４万円に値下げします
		        //FAXの新価格（税込み）
		        //5.25万円」と表示される。
		        
		
		//計算の文
//		int a;
//		int b;
//		a = 20;
//		b = a + 5;
//		System.out.println( a );    //20
//		System.out.println( b );    //25
		
		
//		int a = 10;
//		int b = a++;
//		a = 10;
//		int c = ++a;
//		System.out.println( "変数bは" + b );  //変数bは10
//		System.out.println( "変数cは" + c );  //変数bは11
		
//		
//		//変数宣言の文
//		int age;
//		age = 30;
//		System.out.println( age );    //30
		
//		//命令実行の文
//		int a = 5;
//		int b = 3;
//		int m = Math.max(a,b);
//		System.out.println( "比較実験："+ a + "と" + b + "とで大きいのは・・・" + m );
//		
		//比較実験：5と3とで大きいのは・・・5
		
		//ランダムな数を生成する命令
//		int r = new java.util.Random ().nextInt ( 90 );
//		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		
		//キーボードから入力を受け付ける命令
//		System.out.println ( "あなたの名前を入力してください。" );
//		String name = new java.util.Scanner ( System.in).nextLine ();
//		System.out.println ( "あなたの年齢を入力してください");
//		int age = new java.util.Scanner ( System.in ).nextInt();
//		System.out.println ("ようこそ、" + age + "歳の" + name + "さん");
//		
		
		//条件式の書き方
		
//		関係演算子の種類と意味
//		
//		==　　左辺と右辺が等しい
//		!=　　左辺と右辺が異なる
//		>　　左辺が右辺より大きい
//		<　　左辺が右辺より小さい
//		>=　　左辺と右辺より大きいか等しい
//		<=　　左辺が右辺より小さいか等しい
		
//		論理演算子の種類と意味
//		&&　かつ（両方の条件が満たされた場合にtrue）
//		||　または（どちらか片方の条件さえ満たされればtrue）
//		例））
//		if ( age >= 18 && gender == 1) {・・・
//		if ( name.equals ("鈴木") || married == true) {・・・
//		
		
		//繰り返し構文
		//基本的なfor文のサンプル
//		for ( int i = 0 ; i < 10; i++) {
//			System.out.println("こんにちは");  //コンソールに10回こんにちはが表示
//			//基本形の丸暗記する。
//		}
		
		//点数管理プログラム
//		int [ ] score = {20,30,40,50,80};
//		int sum = score [1]+score[2]+score[3]+score[4]+score[5];
//		int avg = sum / score.length;
//		System.out.println("合計点：" + sum);
//		System.out.println("平均点：" + avg);
//	}

//	上記コード修正
//	配列とfor文
//	int [ ] score = {20,30,40,50,80};
//	for(int i = 0; i < score.length; i++) {
//		System.out.println(score[i]);
//		//20	30	40	50	80が表示される
//	}
	
		
//		int[ ] a = { 1,2,3 };
//		int[ ] b;
//		b = a;
//		b[0] = 100;
//		System.out.println( a[0] );
		
		//親配列と子配列の要素数を表示
//		int[ ][ ] scores = { { 10, 20, 30 } , { 30, 40, 50 } };
//		System.out.println(scores.length);  //2
//		System.out.println(scores[0].length);   //3
	
		//感想、難しいからもっと勉強したい部分
		
		
		
		//p193、194コード
		//p200練習問題
		
		//同じ配列を参照していることを確認する
		//int型配列を受け取り
		//配列内の要素すべてに1を加えるメソッド
//		public static void intArray ( int[ ] array) {
//			for ( int i = 0 ; i < array.length; i++) {
//				array[ i ]++;
//			}
//		}
//		public static void main(String[] args) {
//			int [ ] array = { 1, 2, 3};
//			incArray ( array );
//			for ( int i : array ) {
//				System.out.println ( i );
				//2,3.4が表示されるはず
				
				//戻り値が配列の場合
	
	
//				public static int[ ] makeArray ( int size ) {
//					int[ ] newArray = new int [ size ];
//					for ( int i = 0 ; i < newArray.length ; i++) {
//						newArray [ i ] = i;
//					}
//					return newArray;
//				}
//				public static void main ( String[ ]args) {
//					int[ ] array = makeArray ( 3 );
//					for ( int i : array ) {
//						System.out.println ( i );
//					}
				//0.1.2が表示される
			
		//練習問題
		//「introduceOneself」を定義する。
		
		
		//introduceOneself();
//	}
//	public static void introduceOneself() {
//		String name = "Java";
//		int age =35;
//		double height = 182.5;
//		char gender = '男';
//		System.out.println("私の名前は" + name + "です");
//		System.out.println("歳は" + age + "歳です");
//		System.out.println("身長は" + height + "cmです");
//		System.out.println("性別は" + gender + "です");
		
		//表示結果
		//私の名前はJavaです
		//歳は35歳です
		//身長は182.5cmです
		//性別は男です

//		//「email」を定義する。
//		String title = "お誘い";
//		String address = "uso800@xxxx.com";
//		String text = "今度、飲みに行きませんか";
//		email ( title, address, text );
//	}
//	public static void email( String title , String address , String text ) {
//		System.out.println (address + "に、以下にメールを送信しました");
//		System.out.println ( "件名：" + title );
//		System.out.println ( "本文：" + text );
		
		//表示結果
		//uso800@xxxx.comに、以下にメールを送信しました
		//件名：お誘い
		//本文：今度、飲みに行きませんか
		
		//計算機プログラム
		//リスト6-1
//		int a = 10; int b = 2;
//		int total = tasu(a,b);
//		int delta = hiku(a,b);
//		System.out.println("足したら" + total + "、引いたら" + delta);
//	}
//	public static int tasu(int a, int b) {
//		return (a + b);
//	}
//	public static int hiku(int a, int b) {
//		return (a - b);
		
		//足したら12、引いたら8 が表示される。
		
		
		//リスト　6-2　CalcLogic.javaに中身を追加する
//		public static int tasu(int a, int b) {
//			return (a + b);
//		}
//		public static int hiku(int a, int b) {
//			return (a - b);
//		}
		
		//オブジェクト指向
		
		//インスタンスとクラス
		//インスタンスの利用方法
		//1.勇者を生成
		//Hero h = new Hero();
		//2.フィールドに初期値をセット
//		h.name = "ミナト";
//		h.hp = 100;
//		System.out.println("勇者" + h.name + "を生み出しました！");
//		//3.勇者のメソッドを呼び出してゆく
//		h.sit(5);
//		h.slip();
//		h.sit(25);
//		h.run();
//		
		
		
		//Javaを支える標準クラス
		
		//1316622225935というlong値が2011年9月22日1時23分45秒
//		
//	        long timestamp = 1316622225935L;
//
//		        // Dateクラスを使用してlong値を日付と時刻に変換
//		        Date date = new Date(timestamp);
//
//		        // SimpleDateFormatを使用してフォーマット
//		        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
//		        String formattedDate = sdf.format(date);
//
//		        System.out.println(formattedDate);
		

		
		
//		
//		long start = System.currentTimeMillis ();
//		//ここで何かしらの時間がかかる処理
//		long end = System.currentTimeMillis ();
//		System.out.println ("処理にかかった時間は・・・" + ( end-start ) + "ミリ秒でした" );
//		
		
		//「処理にかかった時間は・・・0ミリ秒でした」と表示
		
		
	}
}




//
//オブジェクト指向
//・いくらクラスやメソッドに分けたとしても、
//ソースコードが複雑になれば
//開発者自身が把握しきれなくなる。⇨オブジェクト指向プログラミング
//
//・オブジェクト指向とは、、、ソフトウェア開発をする時に部品化をする考え方
//
//どのような基準で部品化をすればいいのかの考え方を学ぶ
//⇨
//・プログラムの把握しやすさの向上
//・プログラムの保守性の向上
//・プログラムの再利用性の向上
//この3つを達成するために部品化する。
//
//この3つを達成するために部品化をするためにどうすればいいのか
//出る１つの答えが
//⇨役割ごとに部品化する
//
//役割ごと⇨計算する人、数字を入力する人、出力する人
//役割ごとに部品化するというのがオブジェクト指向で大切な考え方。
//
//上記がオブジェクト指向の全体像。
//
//オブジェクト指向の3大機能
//・カプセル化・・・属性や操作を一部の相手から利用禁止にする
//
//・継承・・・過去に作った部品を流用し、新しい部品を簡単に作る
//
//・多様性・・・似ているものを同じようなものとみなし、再利用する
//
//
//（オブジェクト指向のさわり）



