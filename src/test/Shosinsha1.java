package test;

public class Shosinsha1 {
	public static void main(String[] args) {
		
		//文字を出力するプログラム
		//複数行出力するプログラム
		//演算を行うプログラム

		//hello world
		//私の名前は〇〇です
		//よろしくお願いします

		//public class Main {
		//public static void main(String[] args) {
		    // ここにプログラムの処理を記述します
//		    System.out.println("Hello, world!"); // 例として文字列を出力してみます
		//}
		//}
		
		
		//条件分岐・制御文
		//プログラミングで文を実行させる順番のことを制御構造という。
//		制御構造には3つの構造がある。
//		・順次構造
//		・分岐構造
//		・繰り返し
		
//		・順次構造⇨上から順番に実行する（今まで書いていたもの）
//		・分岐構造⇨ある条件に基づいて特定の条件の場合は左の処理を行う。
//		特定の処理の場合は右の処理を行うといった形の構造
//		例））あなたが20歳以上であれば左の処理を行う、未成年であれば右の処理を行う
//		ということを実現できるようになる。
//		・繰り返し⇨何回も繰り返す処理を実行することができる。
//		例））20回行いたい処理があったり100回行いたい処理があれば
//		繰り返し構造を用いることで何度も繰り返しの処理が行える。
//	
//		・分岐
//		if(条件式) {
//			処理
//		}
//		else {
//			処理
//		}
		
				
//		int age;
//		
////		age = 22; //大人が表示される
//		age = 18; //未成年が表示される
//
//		
//		if(age >=20) {	                //真or偽　処理が変わってくる。
//			System.out.println("大人");
//		}
//		else {
//			System.out.println("未成年");	
//		}
//	}
//}

//		int age;
//		age = 22;     //この＝は代入演算子といって数値や文字列を代入ためのものになるので＝1つ
//		
//		if(age ==20) {  //関係演算子は＝＝を2つ繋げる。＝1つだとエラーになる。
//			System.out.println("成人おめでとうございます");
//		}
//		else {
//			System.out.println("未成年");	
//		}
//	}
//}
//		int age;
//		
//		age = 22; 
//		
//		if(age !=20) {      //20歳出ない時を表示したい場合は！＝でnot=となる。
//			System.out.println("20歳ではないです");
//		}
//		else {
//			System.out.println("20歳です");
//		}
//	}
//}

//System.out.println("Shosinsha1");

//おさらい
//if文は（）に入った条件式が真の値（true）　上の処理を行う
//if文は（）に入った条件式が偽の値（false）　下のelse処理を行う
// if(ture){ と書いても正常に動く。
		
//		int age;
//		age = 22; 
//		
//		if(age ==20) {
//			System.out.println("20歳");   //20歳の場合はこの行理が行われる。
//		}
//		else if(age >20) {
//			System.out.println("大人");   //20歳より歳上の場合はこの行の処理が行われる。
//		}
//		else {
//			System.out.println("子供");    //それ以外の場合、20歳より歳下の場合この行の処理が行われる。
//		}
//	}
//}
	
	//このように分岐はいくらでも作ることができる。
	//評価後の値がtureかfaiseになればいいので
    //nameでもできる。
		
//		String name;
//		name = "emi"; 
//		
//		if(name.equals("emi")){      //文字列を使う場合は＝＝が使えない このように書く←
//			//if(name.equals("em")){　この場合は名前が違うのでhelloと表示される。 
//			System.out.println("こんにちはemiさん");
//			}
//		else {
//			System.out.println("hello");   //上の場合でなかったらhello示する。
//			}

//このように条件式は値がfalseのブーリアン型になればいいので
//文字列でも数字でも比較することができる。
		
		
//繰り返し文    何度も同じ処理を行いたい時に使える。
//・while文     （ワイル文）
//
//while(条件式) {
//	繰り返し処理
//}
		
//		int num =0;
//		
//		while(num <20) {       //numが20以の時121行目の処理をする。   //始めに(num <20)この条件文を評価する。
//			                   //条件文がtureであれば{}カッコ内の処理を実行する。
//			                  //条件文がfalseであれば{}内は飛ばしてwhile文を抜けると言ったイメージになる。
//			System.out.println("値は" + num + "です");
//			
//			num++;     //処理の中でnumを1づつプラスしていく。numは1回実行するごとに1づつ増えていく。
//			}           //条件文がtureの間は上の条件文が常に実行される。結果的にnumは0からスタートするので20回実行されることになる。
                  //値は0です
	//値は1です
	//値は2です
	//値は3です
	//値は4です
	//値は5です
	//値は6です
	//値は7です
	//値は8です
	//値は9です
	//値は10です
	//値は11です
	//値は12です
	//値は13です
	//値は14です
	//値は15です
	//値は16です
	//値は17です
	//値は18です
	//値は19です   このようにコンソールに出力される。
		
		//do while 文    ループを抜け出す、評価するタイミングが違う。
		//while文では処理をする前に評価をしていた。
		//do while　文では処理をした後に評価する。最低1回以上は処理が行われる。
		
//		int num =21;    // 21にしても値は21ですと表示される。
//		                 //最低1回以上は処理を実行したい場合に使う。
//		do {
//			
//			
//			System.out.println("数値は"+ num +"です");
//			
//		}while(num <20);
			
//		・for文
//		for(初期条件; 終了条件; 繰り返し処理){
//			繰り返し処理
//		}
//		int num =0;
		
//		while(num < 20) {
//			System.out.println("数値は" + num + "です");
//			num++;
//		}
		//繰り返し処理としては20回行われる。
//		for(int i=0; i<20; i++) {
//			System.out.println("数値は" + num + "です");
//			num++;
//		}
		
		
//		for(int i=0; i<20; i++) {
//			if(i%3 ==0) {            //0の時だけこの中の処理を実行するとすると
//				                     //数値は0.3.6.9.12.15.18ですと表示される。
//				                     //%3はiを3で割った余りという意味なので
//				                     //iを3で割った余りが0の時だけこの中の処理を実行する
//				                     //ここに表示されているのは3の倍数場合だけ。
//			System.out.println("数値は" + num + "です");
//			}
//			num++;
//		}
//		
		
		
        // 3-1,九九の計算
//
//        
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                int result = i * j;
//                System.out.print(i + "×" + j + "は" + result + "\tです。");
//            }
//            System.out.println(); // 次の段へ移るための改行
//        }
//     
//        //3-2
//        
//        for(int i = 1; i <= 100; i++){
//        if(i % 5 == 0 || i % 3 == 0){
//        if(i % 15 != 0){
//        System.out.println(i);
//        }
//      }
//    }    
//   }
//} 



////System.out.println("study");
//System.out.println("hello world");
//System.out.println("Hello Java");	    
//System.out.println("私の名前は遠田江美です");
//System.out.println("よろしくお願いします。");
//System.out.println(3*5);  //3*5


//public class study {
////public class Main {　　//helloworld じゃなくてmainじゃないと表示できない！！
//public static void main(String args[]){    //Javaプログラムを実行するために必要な形式的なもの

//System.out.println("私の名前は遠田江美です");
//System.out.println("よろしくお願いします。");
//System.out.println(3*5);  //3*5
////
//int year;
//int next_year;
//
//year = 2020;
//next_year = year +1;
//
//int m = Math.min(year, next_year);   
//year++;  //year =year +1    
//year--;

//+,-,*,/,%
//5わる2を正しく出力する

//int next_year;
////
//next_year = year +1;
//year = next_year -2;
////
//year = next_year*2;
//year = year /2;

//System.out.println(year);

//
//int mod;
////
//mod = 5%3;
////
//double num;
//////
//num = 5.0/2.0;
//

//文字列結合演算子

//System.out.println("あなたの名前は？");
//String input1 = new java.util.Scanner(System.in).nextLine();      //文字列
//
//System.out.println("あなたの年齢は？");
//int input2 = new java.util.Scanner(System.in).nextInt();        //整数
//
//System.out.println("こんにちは"+ input2 +"歳の" +input1 +"さん");

//課題2
//System.out.println(1+1);  //1+1
//System.out.println(2-2);  //2-2
//System.out.println(3*3);  //3*3
//System.out.println(4/4);  //4/4
//
//int a = 2;
//int b = 9;
//int m = Math.max(a, b); // 二つの値を比較して大きい方を取得する
////int m = Math.max(2,0,9,1);
//System.out.println("大きいのは" + m + "です");
		
		
		}
	}

