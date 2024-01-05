package test;

public class Hello {
    public static void main(String[] args) {
        //System.out.println("Hello, world!");
        
        
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
        
        int [][] score = new int[2][5];
        
        score[0][0] = 98;      //1人目
        score[0][1] = 96;
        score[0][2] = 95;
        score[0][3] = 89;
        score[0][4] = 78;
        
        score[1][0] = 92;       //2人目
        score[1][1] = 90;
        score[1][2] = 89;
        score[1][3] = 85;
        score[1][4] = 79;
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    