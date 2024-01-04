package test;

public class Self {
	public static void main(String[] args) {    //Javaプログラムを実行するために必要な形式的なもの
	//static void main(String[] args) {    
		
//		System.out.println("Hello, world!");
//	    System.out.println("私の名前は遠田江美です");
//	    System.out.println("よろしくお願いします。");
//	    System.out.println(1+1);  //2
//	    System.out.println("6-1");  //6-1
//	    System.out.println(3*5);  //3*5

//文字を出力するプログラム
//複数行出力するプログラム
//演算を行うプログラム ""←これ不要　””これを囲むのはその文字を出力する為のもの

//Hello world!
//私の名前は〇〇です
//よろしくお願いします

//課題1
//私の名前は〇〇です
//1たす1は（2）です。
//4わる2は（2）です。

//	    System.out.println("私の名前は遠田江美です。");
//	    System.out.println("1たす1は2です。");
//	    System.out.println("4わる2は2です。");

	    //変数宣言
	    //変数
	    //・コンピュータ内でデータを格納する箱のようなもの
	    //・数字や文字列などの情報を入れたり、出したりできる
	    
//	    int year;
//	    year = 2020;
//	    System.out.println(year);
	    
	    //・変数宣言の文
	    //型　変数名;
	    //int year;
	    
//同じ名前の変数名は使えない
	    
//大文字と小文字は区別される
//Yearとyearは区別される
	    
//予約後は使えない（50個程度）
//abstract,assert,boolean,break,byte,case,catch,char,class,const,,,,,
//
	    //データ型
	    
//	    型名  格納するデータ     変数宣言の例               利用頻度
//整数    byte  だいぶ小さい整数	    byte shoes //靴の数        △
//       short  小さい整数          short age  //年齢          △
//       int    整数               int salary  //給料         ◎
//       long   大きな整数           long people  //世界の人口  △
//小数    double  厳密な小数          double pi   //円周率      ⚪︎
//       float    小数              float weight  //体重      △
//真偽値  boolean  trueかfalse       boolean isMale  //男性か否か  ⚪︎
//文字列  String    文字の並び         String Name    //自分の名前   ◎
//文字   char       文字             char initial   //イニシャル    ⚪︎
	   
	   //算術演算子
		//+,-,*,/,%   足す、引く、かける、割る
	    
//    int year;
//	  year = 2020;
	    
//    int next_year;
//    next_year = year +1;      //2021
//	  year = next_year -1;      //2019  変数は何回でも上書きできる。
	    
//	   year = next_year:2;      //4042 (2021かける2)
//	    year = year/2;          //2021 (4042わる2)
	    
//	    System.out.println(next_year);
//	    System.out.println(year);
	    
	    
//	    int mod;	
//	    mod = 4%3;     //%の意味は4割る3の余りを表示すると言った風になる。
//	                   //4÷3は1余り1なので1が表示された。
//	    mod = 5%3;     //5÷3なら2(余り)が表示される。
//	    System.out.println(mod);
	   
	    //ミニ課題
	    //5わる2を正しく出力する
//	    int num;
//	    num = 5/2; 
//	    System.out.println(num);
	
	    //numを宣言してるのはint,intは整数型なので整数しか表示しない。
	    //５割るは2、5
	   //整数型に格納することによって小数以下が切り捨てられ2が表示される
	   
//	    double num;
//	    
//	    num = 5.0/2.0;     //2.5が表示される
//	    num = 5/2;       //2.0が表示されてしまう
//	    System.out.println(num);
	    
	    //javaは右辺（5と2）の型が左の型に格納するという現象が起こっている。
//	    5と2は整数型に表示されている。
//	    num = 5.0/2.0;     //右辺もw型になる。左辺に正常なw型が格納される。
	    
	    //文字列結合演算子
//	    int year;
//		 year = 2020;
//		 System.out.println("今年は" + year + "です");      //出力する文字列を結合するプラスを文字列結合演算子という。
	     //今年は2020ですと表示される。   文字列を結合して出力することができる。
	    
		//代入演算子　　代入するためのもの
//	    int year;
//		 year = 2020;
//		 year += year;    //このプラスイコールは左辺と右辺を足して左辺に代入   今年は4040ですと表示される。
////		 元々のyear右辺2020、左辺も2020を足して新しいyearに代入して下さい。というのをこのように書く。
//		 year -= year;      // 今年は0ですと表示される。2020と2020があって左辺引く右辺をもう一回新しい左辺に格納している。
//		 System.out.println("今年は" + year + "です");      
//		
		//インクリメント、デクリメント演算子　　2種類あり＋＋かーーになる。
		    int year;
			 year = 2020;    
			 year ++;    //year = year +1　と同じ働きになる。＋＋だと1プラスするという意味になる。  今年は2021ですと表示
//			 year --;  //今年は2019ですと表示
			 
			 System.out.println("今年は" + year + "です"); 
		 
		 
		
		
	    
//    int m = Math.min(year, next_year);   
//	year++;  //year =year +1    
//	year--;
	
	//+,-,*,/,%
	//5わる2を正しく出力する
	
//	int next_year;
////	
//	next_year = year +1;
//	year = next_year -2;
////	
//	year = next_year*2;
//	year = year /2;
	
//    System.out.println(year);

//	
//	int mod;
////	
//	mod = 5%3;
////	
//	double num;
//////	
//	num = 5.0/2.0;
//	
		
		//文字列結合演算子
		
//		System.out.println("あなたの名前は？");
//		String input1 = new java.util.Scanner(System.in).nextLine();      //文字列
//		
//		System.out.println("あなたの年齢は？");
//		int input2 = new java.util.Scanner(System.in).nextInt();        //整数
//		
//		System.out.println("こんにちは"+ input2 +"歳の" +input1 +"さん");
		
//		//課題2
//	    System.out.println(1+1);  //1+1
//	    System.out.println(2-2);  //2-2
//	    System.out.println(3*3);  //3*3
//	    System.out.println(4/4);  //4/4
//	    
//	    int a = 2;
//	    int b = 9;
//	    int m = Math.max(a, b); // 二つの値を比較して大きい方を取得する
////	    int m = Math.max(2,0,9,1);  //これは違うと思う。。
//	    
//	    System.out.println("大きいのは" + m + "です");   
	}
}