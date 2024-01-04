package test;

public class Shosinsha1 {
	public static void main(String[] args) {
		//制御構造
		
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
		
		String name;
		name = "emi"; 
		
		if(name.equals("emi")){      //文字列を使う場合は＝＝が使えない このように書く←
			//if(name.equals("em")){　この場合は名前が違うのでhelloと表示される。 
			System.out.println("こんにちはemiさん");
			}
		else {
			System.out.println("hello");   //上の場合でなかったらhello示する。
			}
		}
	}
//このように条件式は値がfalseのブーリアン型になればいいので
//文字列でも数字でも比較することができる。

	
