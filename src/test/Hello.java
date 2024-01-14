package test;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        
        
//        ・配列の仕組み
//        配列
//        ・同一種類の複数データを並び順に格納するデータ構造。
//        int型   int[]score
//                 [0] [1] [2] [3] [4]        
//        ・一つの配列で複数のデータを扱える。
//        
//        ・配列の宣言　データ型[]配列名　= new データ型[要素数];
//        int[]score = new int[5]       //注意点、配列は0から始まる
        
        
        
//        int [] score = new int[6];
//        
//        score[0] = 92;     //japanese
//        score[1] = 98;     //math
//        score[2] = 88;     //geo
//        score[3] = 89;     //science
//        score[4] = 78;     //english
//        score[5] = 82;     //history   //ここ後で追加しても下のiは自動的に変わるから書き換えなくて済む。
        
//        System.out.println(score[0]);
//        System.out.println(score.length);      
//                                               
//        
//        int sum=0;         //合計の変数宣言
//        int average=0;      //平均の変数宣言
//        
//        for(int i=0; i< score.length; i++) {     //score.lengthで全て足すことができる。
//        	 //score.lengthは要素数が5,iが5から始まると, //iは5より小さい間30行目のfor文を実行する
//        	//0から4まで実行するfor文なので0から4まで足せる。
//        	sum = sum + score[i];
//        }
//        average = sum/score.length;
//        System.out.println(sum);     //445
//        System.out.println(average); //89

        
//        int [] score1 = {92,94,99,98,97};
//        int [] score2;
//        
//        score2 = score1;
//        score2[0] = 88;
//        
//        System.out.println(score1[0]);
//        
//        
//        
//        ・多次元配列
//        
//        ・2次元配列
//        int[][]scores=new int[4][4];
//        
//        データ型[][]= new データ型[行数][列数]
        
//        int [][] score = new int[2][5];
//        
//        score[0][0] = 98;      //1人目
//        score[0][1] = 96;
//        score[0][2] = 95;
//        score[0][3] = 89;
//        score[0][4] = 78;
//        
//        score[1][0] = 92;       //2人目
//        score[1][1] = 90;
//        score[1][2] = 89;
//        score[1][3] = 85;
//        score[1][4] = 79;
        
        
        //メソッド
    	
//    	
//    	hello();
//    	hello();
//    }
//    public static void hello() {
//    	System.out.println("Hello, world!");
////    	System.out.println("こんにちは");
//    	System.out.println("こんばんは");

    	
    	//引数
    	//引数の利用
    	//・任意の人の名前を出力するメソッドを作りたい。どうすろ？
    	//（出力例）こんにちは、（名前）さん。
    	
    	//public static void hello(String name) {
    		//System.out.println("こんにちは、"+name +"さん。");	
    	//}
    	//Public static void main(String args[]) {
    		
    	
    	              //実行結果
    	//hello("太郎")  //こんにちは、太郎さん。        
    	//hello("花子")  //こんにちは、花子さん。
    	//hello("次郎")  //こんにちは、次郎さん。
    	
    	//}
    	
    	
    	

    	//引数の利用の続き

    	
    			//hello("太郎");    ///helloメソッ呼び出す。
    			//hello("次郎");

//    			hello("太郎","三郎");    ///helloメソッ呼び出す。
//    			hello("次郎","四郎");
    			
    		//}
    		
    		//public static void hello(String name) {
    			//System.out.println("Helli World!");   //"Hello World!"を出力する。
    			//System.out.println("こんばんは" + name + "さん");
    		//}
    			
    		
    		
//    		public static void hello(String name1,String name2) {
//    			
//    			System.out.println("Helli World!");   //"Hello World!"を出力する。
//    			System.out.println("こんばんは" + name1 + "さん" + name2 + "さん");

    		
    		//変数のスコープ
    		
    		//int x = 10;
    		
    		//while( x>10) {
    			//int x = x;
    		//}

    		//num(x);
    		
    		
    		//}
    		
    		
    		//public static void num(int x) {
    			
    			//int x = x;
    		
    		
    			//・戻り値
    			//戻り値とは
    			//・呼び出されたメソッドから、呼び出し元のメソッドへ値を返すことを「値を戻す」といい
    			//戻されるだーたを戻り値（返り値）という。
    			
    			//値の戻し方
    			//public static 戻り値の型メソッド（引数リスト...x）{
    				
    				//メソッドの処理
    				//return 戻り値
    			//}
    			//（例）2つの整数の入力に対してその和を計算しその結果を返すメソッド
    			//public static int add(int num1,int num2) {
    				
    				//int sum= num1 + num2;
    				//return sum;
    			//}
    			
    			
//    			
//    			int x=10;
//    			int y=10;
//    			
//    			int answer = add(x,y);
//    			
//    			System.out.println(answer);
//    			
//    		}
//    		
//    		public static int add (int num1,int num2) {
//    			
//    			int sum = num1 + num2;
//    			return sum;
    			
    		}      //18が実行されるはず
    	}
    	


    
   