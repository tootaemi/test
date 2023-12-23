package test;

//文字を出力するプログラム
//複数行出力するプログラム
//演算を行うプログラム

//hello world
//私の名前は〇〇です
//よろしくお願いします

public class helloworld {
    public static void main(String args[]){    //Javaプログラムを実行するために必要な形式的なもの
//	    System.out.println("hello world");
//	    System.out.println("私の名前は遠田江美です");
//	    System.out.println("よろしくお願いします。");
//    	System.out.println(3*5);  //3*5
    	
    	int year;
    	
    	year = 2020;
    	
    	//+,-,*,/,%
    	//5わる2を正しく出力する
    	
    	int next_year;
    	
    	next_year = year +1;
    	year = next_year -2;
    	
    	year = next_year *2;
    	year = year /2;
    	
    	int mod;
    	
    	mod = 4%3;
    	
    	double num;
    	
    	num = 5.0/2.0;
    	
    	System.out.println(mod);
    	
	}
}
