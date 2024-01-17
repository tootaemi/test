package test;

public class Selfstudy3 {
	public static void main(String[] args) {
//		int age = 21;
//		System.out.println("私の年齢は" + age);
//		age = 28;
//		System.out.println("・・・いや、本当の年齢は" + age);
//		System.out.println("Selfstudy3");
		
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
		for ( int i = 0 ; i < 10; i++) {
			System.out.println("こんにちは");  //コンソールに10回こんにちはが表示
			//基本形の丸暗記する。
		}
		
		
		
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



