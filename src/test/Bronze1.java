package test;

public class Bronze1 {
	public static void main(String[] args) {
//		  System.out.println("終");
		  
		  
	//9日目
	//クラスの継承
//	
//		public class A {
//			private int num;
//			public void setNum(int num) {
//				this.num = num;
//			}
//		}
//		
//		public class B extends A {
//			private int num;
//			public int getNum() {
//				return num;
//			}
//		}
//		
//		public class InheritanceTest {
//			public static void main(String[] args) {
//				B b = new B();
//				b.setNum(10);
//				System.out.println(b.getNum());
//			}
//		}
//		  
//		  
//		このJavaのコードサンプルは、継承とカプセル化の概念を使用しています。
//		クラスAは、`num`という名前のprivate変数を持ち、
//		この変数の値を設定するpublicメソッド`setNum`を提供します。
//		クラスBは、クラスAを拡張し、同じ名前の`num`という新しいprivate変数を持っています。
//		クラスBは、この新しい`num`変数の値を返すpublicメソッド`getNum`を提供します。
//
//		`InheritanceTest`クラスの`main`メソッドでは、クラスBの
//		インスタンスが作成され、`setNum`メソッドを通じて`num`に`10`が設定されます。
//		しかし、`setNum`メソッドはスーパークラスAの`num`変数に値を設定しますが、
//		`getNum`メソッドはサブクラスBの`num`変数の値を返します。
//		サブクラスBの`num`変数は、別に初期化されていないので、
//		`getNum`メソッドはデフォルト値`0`を出力します。
//
//
//		このコードは、継承とカプセル化を示しています。
//		`A`クラスは`num`というprivate変数を持ち、この変数の値を設定するための
//		`setNum`というpublicメソッドがあります。
//		`B`クラスは`A`クラスを継承し、新たに`num`というprivate変数を持っています。
//		また、`B`クラスはこの`num`変数の値を取得するための
//		`getNum`というpublicメソッドを持っています。
//
//		`InheritanceTest`クラスの`main`メソッドでは、
//		`B`クラスのインスタンスが生成され、`setNum`メソッドを使って
//		`num`に`10`を設定します。しかし、`setNum`は
//		スーパークラス`A`の`num`に値を設定し、
//		`getNum`メソッドはサブクラス`B`の`num`の値を返します。
//		`B`の`num`は別途初期化されていないため、
//		`getNum`メソッドはデフォルト値の`0`を出力します。
//		  
		  
		 // 10日目
		  //例外処理
		
		//11日目
		//ポリモーフィズム
		
//		型の相換性を調べるinstanceof演算子
//		「型」について。
//		
//		
//		構文　instanceof演算子
//		調査対象　instanceof 型
		
//		
//		同一性を確認する＝＝演算子
//		２つ目の「同じ」は、参照について。
//		2つの参照型変数があった時、同じインスタンスへの参照を
//		それぞれが同時に保持することができる。
//		この時の2つは「同一である」といい、
//		このような性質を「同一性」と呼ぶ。
//		同一であるかどうかは、＝＝演算子で確認できる。
		
////
////public class Bronze1 {
////	public static void main(String[] args) {
//		A a = new A();
//		A b = a;
////		System.out.println(a == b); //変数aとBの参照が同一かどうか調べる
////	}
////}
//→　「A b = a;」で変数aとbは同じ参照を持っていることになり
//「System.out.println(a == b);」ここのコードはtrueをコンソールに表示する。
//
//オブジェクトの参照比較に関する基本的な概念を示しています。
//`Bronze1`クラスの`main`メソッドでは、`A`クラスの
//新しいインスタンスが変数`a`に代入され、その後、`a`の参照が
//変数`b`にコピーされます。この時点で、`a`と`b`は
//同じ`A`クラスのインスタンスを指しています。
//
//プログラムが`System.out.println(a == b);`を実行すると、
//この式は`a`と`b`が同じオブジェクトを参照しているかどうかをチェックします。
//この場合、`a`と`b`は同じインスタンスを指しているので、結果は`true`になります。
//
//つまり、このプログラムは`true`を出力します。
//これは、Javaにおいて`==`演算子が
//参照の等価性（つまり、二つの変数が同じオブジェクトを指しているかどうか）を
//チェックするために使用されることを示しています。
//オブジェクトの内容の等価性をテストするには、`equals`メソッドを使用する
//必要があります（ただし、このプログラムでは
//オブジェクト内容の等価性のテストは行われていません）。


		//同値性を確認するequalsメソッド
		//３つ目の「同じ」は値について。
//		2つの顧客インスタンスがあったとする。
//		基になった顧客クラスは、顧客番号、名前、住所など
//		顧客に関するデータを扱っているクラス。
//		２つのインスタンスは異なるインスタンスだが
//		同じ顧客番号、同じ指名、同じ住所など、全く同じデータを保持していたとする。
//		このようにインスタンスが異なっていても
//		同じ値を持っている場合、これも「同じ」であると表現できる。
//		これを「同値」といい、このような性質を「同値性」と呼ぶ。
////		
//		
//		同値性（equivalence）は、2つの対象がある特定の基準において
//		等しいとみなされることを指します。これは数学やコンピュータ科学だけでなく、
//		日常生活の中でも見つけることができます。ここでは、同値性の日常生活での
//		具体的な例をいくつか紹介します。
//
//		1. **通貨の同値性：** 5枚の100円玉と1枚の500円玉は、
//		金額としては等しいです。つまり、交換価値において同値です。
//
//		2. **時間の同値性：** 60分と1時間は、時間として等しいです。
//		これは時間の計測における同値性の一例です。
//
//		3. **交通手段の同値性：** 目的地までの距離が同じであれば、
//		車で行くことと電車で行くことは、目的地に到達する
//		という目的において同値とみなすことができます。ただし、コストや時間、
//		利便性など他の要素は考慮に入れていません。
//
//		4. **食品の同値性：** カロリー表示を例に取ると、
//		ある食品と別の食品が同じカロリーを持っている場合、
//		エネルギー摂取量という観点では同値です。
//
//		5. **教育の同値性：** 異なる大学や教育機関が提供する同じ内容のコースや
//		プログラムは、知識やスキル習得という目的において同値と考えることができます。
//
//		6. **サイズの同値性：** 衣服のサイズで考えると、異なるブランドでも
//		「Mサイズ」と表記されているものは、ある基準において
//		同じ寸法を示すことを意味しています（実際にはブランドによって
//		若干の差がありますが、概念的にはこのように理解されます）。
//
//		これらの例は、日常生活における同値性の概念を理解するのに役立ちます。
//		同値性は、対象を比較し、特定の条件や基準に基づいて
//		「等しい」と判断する際に用いられる考え方です。
//		  
//		  
//		同一性（identity）とは、全く同じ対象や概念を指します。
//		これは同値性と異なり、厳密に「同じもの」という意味合いを持ちます。
//		日常生活での同一性に関する具体例をいくつか紹介します。
//
//		1. **個人の同一性：** 同一の人物は、どんな状況でもその人自身です。
//		例えば、ある人物が異なる場所や異なる時点で見られたとしても、その人物は同一の存在です。
//
//		2. **物理的なオブジェクトの同一性：** ある特定の本、
//		例えば特定の版の「ハリーポッターと賢者の石」は、どこに置かれていても、
//		それはその特定のコピー、つまり同一のオブジェクトです。
//
//		3. **デジタルデータの同一性：** コンピュータ上のファイルは、
//		そのデータ内容が全く同じであれば、コピーを複製しても
//		同一の内容を持つと言えます。ただし、ファイルの場所や名前が
//		異なる場合がありますが、内容が全く同じであれば、
//		そのデータは「同一」のものと見なされます。
//
//		4. **双子の区別：** 卵生双生児でさえも、遺伝的にはほぼ同一と言えますが、
//		指紋や個性、経験などによって個々人としての同一性を持ちます。
//		つまり、遺伝子レベルでほぼ同一であっても、
//		それぞれが独自の同一性を持つことになります。
//
//		5. **思想や概念の同一性：** 特定の数学的定理や法則は、
//		どの文脈で語られても、その内容は変わりません。
//		例えば、ピタゴラスの定理はどの教科書に書かれていても、
//		その定理自体は同一のものです。
//
//		これらの例からわかるように、同一性は「全く同じ」という意味を持ち、
//		対象が時間や空間を超えても変わらない性質を示します。
//		同一性は、個人の認識、物理的なオブジェクト、データ、概念など、
//		多岐にわたる分野で見られる基本的な概念です。 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		  
	}
}