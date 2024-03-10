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
//		
//		人は日常生活で同値性しか考えないから同一性を理解することが難しい
//		⇨　人が日常生活で同値性を頻繁に考えるのは、私たちの周囲には
//		異なるものや状況が多く存在し、それらを比較し、分類し、
//		一般化する必要があるからです。例えば、ショッピングをするとき、
//		異なるブランドや価格の商品を比較して選択します。
//		このプロセスでは、価値や機能性などの特定の基準に基づいて、
//		異なる商品を「等価」とみなすことがよくあります。
//		一方で、同一性はより抽象的な概念であり、実生活で直接的に考える機会は
//		少ないかもしれません。同一性は、対象が時間や場所を超えても変わらない、
//		不変の本質や性質を指します。この概念は、哲学や数学、論理学などの
//		分野でより深く探求されます。
//		同一性を理解することが難しい一因は、私たちの経験が常に変化し、
//		多様性に富んでいるため、全く変わらない本質や性質を見出すことが少ないからです。
//		また、同一性に関する考察は、しばしば哲学的な思考や抽象的な概念を要求するため、
//		直感的ではないことがあります。例えば、「自己同一性」という概念は、
//		時間が経過しても「私は私である」という認識がどのように維持されるか、
//		という問題を提起しますが、これは直接的な経験よりも哲学的な思考によって
//		探求されることが多いです。しかし、同一性の概念を理解することは、
//		自己や周囲の世界を深く理解する上で重要な役割を果たします。
//		例えば、個人のアイデンティティ（自己同一性）の概念を理解することは、
//		自己認識や個人の成長において中心的なテーマです。
//		同様に、科学や数学における定義や法則の同一性を理解することは、
//		世界の本質を探求する上で不可欠です。
//		日常生活での直接的な経験を超えて、同一性について深く考えることは、
//		思考を拡張し、新たな視点を得る機会を提供します。
//		同一性と同値性の違いを理解し、それぞれがいかにして私たちの認識や
//		世界観に影響を与えるかを考察することは、知識と洞察を深めるための一歩となるでしょう。
		
		
		//11日目のおさらい
		//q1
//		public class A {
//			public void hello() {
//				System.out.println("hello");
//			}
//		}
//		public class B {
//			public void hello() {
//				System.out.println("hi");
//			}
//		}
//		public class Main {
//			public static void main(String[] args) {
//				A a = new B();
//				a.hello();
		
//		問題の答えは　コンパイルエラーになる。
//		AクラスとBクラスの間には何も関係性がないためコンパイルエラーになる。
////		  
//		Javaの継承とポリモーフィズムに関する理解が少し欠けているようです。
//		具体的には、クラス`A`とクラス`B`がありますが、クラス`B`はクラス`A`を
//		継承していないため、`A a = new B();`のような
//		代入はJavaでは許可されていません。これはコンパイルエラーを引き起こします。
//		正しい実装では、クラス`B`がクラス`A`を継承する必要があります。
//		以下は修正されたコード例です：
//
//		public class A {
//		    public void hello() {
//		        System.out.println("hello");
//		    }
////		}
//
//		public class B extends A { // BがAを継承
//		    @Override
//		    public void hello() {
//		        System.out.println("hi");
//		    }
//		}
//
//		public class Main {
//		    public static void main(String[] args) {
//		        A a = new B(); // BのインスタンスをA型の変数に代入
//		        a.hello(); // "hi"が出力される
//		    }
//		}
//
//		この修正により、クラス`B`はクラス`A`を継承し、
//		`hello`メソッドをオーバーライド（上書き）します。
//		`main`メソッド内で`A a = new B();`を実行すると、`a`は
//		実際には`B`のインスタンスを指しますが、`A`型の参照として扱われます。
//		`a.hello();`を呼び出すと、ポリモーフィズムにより、
//		オーバーライドされた`B`クラスの`hello`メソッドが実行され、
//		「hi」と出力されます。
//		
//	q3.Aクラスを継承したBとCがあった時CクラスのインスタンスをB型で扱おうとしています。
//		次の記述から正しいものを選んでください。
//		
//		A.  B b = new C();
//		B.  A a = new C();  B b = a;
//		C.  A a = new C();  B b = (B) a;
////		D.  選択肢A~C全て誤り
//		
//		クラス`A`を継承した`B`と`C`がある場合、`C`クラスのインスタンスを
//		`B`型で扱おうとする操作は、型の互換性に基づいて検討する必要があります。
//		`B`と`C`が共に`A`を継承している場合、それらは兄弟関係にあります。
//		Javaでは、あるクラスのインスタンスを、そのクラスが直接または間接的に
//		継承するスーパークラスの型で扱うことはできますが、異なるサブクラス間での
//		代入にはキャストが必要です。ただし、そのキャストが実際に成功するかどうかは、
//		実行時のインスタンスの実際の型に依存します。選択肢を見てみましょう：
//
//		A. `B b = new C();`  
//		この記述は、`C`が`B`を継承していない限り、コンパイルエラーになります。
//		`C`は`A`を継承しているとのことなので、この記述は誤りです。
//
//		B. `A a = new C();  B b = a;`  
//		この記述も誤りです。`A a = new C();`は正しいですが、
//		`B b = a;`は型が一致しないため、コンパイルエラーになります。
//
//		C. `A a = new C();  B b = (B) a;`  
//		この記述は構文的には正しいです。`A`型の変数`a`に`C`のインスタンスを代入し、
//		その後`a`を`B`型にキャストしています。ただし、このキャストは実
//		行時に`ClassCastException`を引き起こす可能性があります。
//		`a`の実際の型が`C`であり、`C`が`B`とは関係のない別のクラスである場合、
//		このキャストは失敗します。ただし、質問の文脈では正しいかどうかを
//		判断するための情報が不足していますが、構文上は可能です。
//
//		D. 選択肢A~C全て誤り  
//		上記の説明に基づき、選択肢Cは特定の状況下（`C`が`B`にキャスト可能な場合）でのみ
//		正しい可能性があるため、この選択肢は一概には誤りとは言えません。
//
//		したがって、最も適切な選択肢は「C. A a = new C();  B b = (B) a;」ですが、
//		実行時に`ClassCastException`が発生するリスクがあることを
//		理解しておく必要があります。
//		
//		選択肢A~C全て誤りとする参考書の答えを受けて、その解説を改めて確認しましょう。
//		クラス`A`を継承した`B`と`C`がある場合、`B`と`C`は兄弟関係にあります。
//		Javaの型システムでは、あるクラスのインスタンスを別のクラス型の変数に
//		直接代入することはできません（明示的なキャストを行った場合でも、
//		実行時に型が互換性がなければ`ClassCastException`が発生します）。
//		ここでのポイントは、`B`と`C`が同じ親クラス`A`を持っているとしても、
//		互いに型互換性がないということです。したがって、`C`のインスタンスを
//		`B`型の変数で扱おうとする試みは、型システムのルールに反しています。
//
//		- **A. `B b = new C();`** は、`C`が`B`のサブタイプではない限り、
//		型不一致でコンパイルエラーになります。
//		
//		- **B. `A a = new C();  B b = a;`** は、明示的なキャストなしに
//		異なる型間で代入しようとしているため、コンパイルエラーになります。
//		
//		- **C. `A a = new C();  B b = (B) a;`** は、構文的には可能ですが、
//		`C`のインスタンスが`B`型にキャスト可能である保証がなく、
//		実行時に`ClassCastException`を引き起こす可能性が高いです。
//
//		結論として、D. 選択肢A~C全て誤り**となります。
//		この解説がクラスの継承関係と型互換性に関する理解を深めるのに役立つことを願っています。
//		
//		どうしてA a = new C();は正しいのにB b = new C();は誤りなのでしょうか。
//		⇨　Javaにおける継承の仕組みと型の互換性に関係しています。ここで重要なのは、
//		継承関係におけるスーパークラス（親クラス）とサブクラス（子クラス）の関係です。
//
//		- `A a = new C();`が正しい理由：
//		  - `C`が`A`を継承している場合、`C`は`A`の「サブクラス」です。Javaでは、
//		  サブクラスのインスタンスはスーパークラスの型で扱うことができます。
//		  これは「アップキャスト」と呼ばれ、Javaの型システムにおいて安全な操作です。
//		  アップキャストにより、サブクラスのインスタンスをスーパークラスの参照型で保持することができます。
//		  これは、サブクラスがスーパークラスの全ての特性を継承しているため、スーパークラスとしての
//		  振る舞いが保証されるためです。
//
//		- `B b = new C();`が誤りである理由：
//		  - `B`と`C`は共に`A`を継承していますが、これは`B`と`C`が兄弟関係にあるということを意味します。
//		  `C`が`B`を継承していない限り（つまり、`C`が`B`のサブクラスでない限り）、
//		  `C`のインスタンスを`B`型の変数で直接扱うことはできません。これは、
//		  `C`が`B`の特性を継承しているわけではないため、`B`型の変数として`C`のインスタンスを扱うことが
//		  型システムにおいて不正とされるからです。これを「ダウンキャスト」と言いますが、
//		  ダウンキャストは明示的に行う必要があり（例：`B b = (B) new C();`）、
//		  実行時にはそのキャストが正当であるかどうかがチェックされます。
//		  正当でない場合は`ClassCastException`が発生します。
//
//		要するに、`A a = new C();`が許可されるのは、`C`が`A`の機能を全て持っているという継承の
//		保証があるからです。一方で、`B b = new C();`は、`C`が`B`の特定の振る舞いや
//		プロパティを持っている保証がないため、通常は誤りとなります。

//		
//		A a = new C();とB b = new C();　記述は似ているが
//		継承が違うからA a = new C();は正しくてB b = new C();は誤りなのですね
//		⇨　その通りです。`A a = new C();`と`B b = new C();`の記述は表面上似ていますが、
//		背後にある継承の構造が異なるため、一方が正しく、もう一方が誤りとなるのです。
//		- `A a = new C();`は、`C`が`A`のサブクラスである場合に正しいです。
//		これは継承の階層において、`C`が`A`から派生しているため、`C`のインスタンスは
//		`A`型の変数に代入することができます。これにより、`C`のインスタンスは
//		`A`のすべての性質を持つとみなされ、`A`型の参照を通して`A`に定義された振る舞いにアクセスできます。
//
//		- `B b = new C();`は、`C`が`B`のサブクラスである場合にのみ正しいです。しかし、
//		質問の文脈では`A`を共通のスーパークラスとして`B`と`C`が存在するとされており、
//		`B`と`C`は兄弟関係にあるため、この代入は不適切です。`C`のインスタンスを`B`型の変数に
//		代入するためには、`C`が実際に`B`のサブクラスである（つまり、`C`が`B`を継承している）必要があります。
//
//		この違いは、オブジェクト指向プログラミングにおける継承の基本的な原則に基づいています。
//		Javaの型システムはこの原則を厳密に守っており、型の安全性を保証するために、
//		継承関係にないクラス間での不正確な代入を禁止しています。
//		
		//12日目
		//抽象化プログラミング
		
		//12日目のおさらい
//		
//		Q3. 次のコードの修正方法として正しいもの
//		
//		public class AbstractSample {
//			public abstract void hello();
//			public void test() {
//				hello();
//			}
//		}
//		
//		public class ConcreteSample extends AbstractSample {
//			public void hello() {
//				System.out.println("hello");
//			}
//		}
//		⇨　AbstractSampleクラスを宣言する時にabstractキーワードをつけて宣言する
//		が正解なのですがどの部分に修正を加えるのでしょうか。
//		
//		指摘されたコードに関して、`AbstractSample`クラスが`abstract`メソッドを持っているため、
//		`AbstractSample`クラス自体も`abstract`で宣言する必要があります。
//		`abstract`メソッド（この場合は`hello`メソッド）を持つクラスは、
//		そのクラスのインスタンスを直接作成することができないため、クラス自体を
//		`abstract`として宣言しなければなりません。このようなメソッドは、
//		サブクラスでオーバーライドされることを意図しています。
//
//		修正するべき部分は、`AbstractSample`クラスの宣言部分です。以下のように修正します：
//
//		public abstract class AbstractSample {
//		    public abstract void hello();
//		    public void test() {
//		        hello();
//		    }
//		}
//
//		この変更により、`AbstractSample`クラスは`abstract`クラスとして正しく宣言され、
//		`abstract`メソッド`hello`を含むことができるようになります。
//		そして、`ConcreteSample`クラスがこの`abstract`メソッドを実装（オーバーライド）することで、
//		`AbstractSample`クラスの具象実装を提供します。
		
		//13日目
		//コレクション
		
//		14日目
//		標準クラスライブラリ
//		文字列、日付・時刻、データの入出力を扱う基本的なクラスの使い方を学習。
////		
//		String a = "Hello, Java!";
//		String b = "Hello, Java!";
//		System.out.println( a == b );
//		
//		このJavaコードは、文字列の比較を行っています。具体的には、`a == b`を使用して、
//		二つの文字列オブジェクトが同じオブジェクトを参照しているかどうかを確認しています。
//		Javaにおいて、文字列リテラル（この場合の`"Hello, Java!"`）は、コンパイル時に
//		文字列プール（String Pool）に格納されます。同じ文字列リテラルがプログラム内で
//		複数回使用される場合、JVMは新しいオブジェクトを作成するのではなく、既存の文字列オブジェクトを
//		再利用します。したがって、`a`と`b`はどちらも文字列プール内の同じ`"Hello, Java!"`オブジェクトを参
//		照しています。このため、`a == b`の比較は`true`を返します。これは、`a`と`b`がメモリ上で
//		同じ場所を指している（つまり、同じオブジェクトを参照している）ためです。
//		しかし、文字列の内容の比較には通常、`equals`メソッドを使用することが推奨されます。
//		`==`演算子はオブジェクトの参照を比較するため、異なるオブジェクトが
//		同じ値を持っている場合には`false`を返します。`equals`メソッドはオブジェクトの内容が
//		等しいかどうかを比較するため、内容が同じであれば異なるオブジェクト間であっても`true`を返します。
//		
//		
////		String a = STR;
////		String b = STR;
////		System.out.println( a == b );
//		
//		
//		このJavaコードの動作は、`STR`がどのように定義されているかによります。
//		ただし、一般的に`STR`が文字列リテラルや定数として定義されている場合を考えてみましょう。
//		もし`STR`が次のように文字列リテラルまたは同等の定数値として定義されている場合：
//
//		final String STR = "Hello, Java!";
//
//		このとき、`String a = STR;`と`String b = STR;`により、
//		`a`と`b`はどちらも同じ文字列オブジェクト`STR`を参照します。
//		Javaでは、文字列リテラルや文字列に関連する定数は、コンパイル時に文字列プールに格納され、
//		同じ文字列リテラルまたは定数値はプログラム実行中に同じオブジェクトを参照します。
//
//		したがって、`a == b`の比較は`true`を返します。これは、`a`と`b`が
//		メモリ上で同じ場所（同じ文字列オブジェクト）を指しているためです。
//		重要なのは、`==`演算子がオブジェクトの参照（メモリ上の場所）を比較するということです。
//		したがって、`STR`がどのように定義されているかに関わらず、`a`と`b`が同じオブジェクトを
//		参照している場合、この比較は`true`を返します。内容に基づく比較を行いたい場合は、
//		`equals`メソッドを使用することが適切です。
//		
//
//		String a = new String( "Hello, Java!");
//		String b = new String("Hello, Java!");
//		System.out.println( a == b );
//
//		このJavaコードでは、`new String("Hello, Java!");`を使用して二つの
//		新しい文字列オブジェクト`a`と`b`を作成しています。`new`キーワードを使用すると、
//		Javaのヒープメモリ上に新しいオブジェクトが確実に生成されます。これは、
//		文字列プール（String Pool）を使って再利用される文字列リテラルとは異なります。
//		したがって、`a`と`b`は内容（"Hello, Java!"）は同じですが、異なるメモリ上の場所に
//		存在する二つの独立したオブジェクトを指しています。
//		`==`演算子はオブジェクトの参照（つまり、オブジェクトがメモリ上に存在する場所）を比較するため、
//		この場合`a == b`は`false`を返します。
//
//		文字列の内容が等しいかどうかを確認するには、`equals`メソッドを使用するのが適切です。
//		`a.equals(b)`は`true`を返します、なぜなら`equals`メソッドは
//		オブジェクトの内容を比較するからです。
//		
//		どうしてaとbは内容（"Hello, Java!"）は同じですが、
//		異なるメモリ上の場所に存在する二つの独立したオブジェクトを指しているのですか。
//		⇨　`a`と`b`が異なるメモリ上の場所に存在する独立したオブジェクトを指している理由は、
//		`new`キーワードの使用方法に起因します。Javaにおいて、`new`キーワードはヒープメモリ上に
//		新しいオブジェクトを確実に生成します。このプロセスは、指定されたクラスの新しいインスタンスを作成し、
//		そのインスタンスに一意のメモリアドレスを割り当てます。
//
//		String a = new String("Hello, Java!");
//		String b = new String("Hello, Java!");
//
//		上記のコードでは、`new String("Hello, Java!");`が二度呼び出されています。
//		各呼び出しは、文字列"Hello, Java!"の内容を持つ新しい`String`オブジェクトの作成を指示しています。
//		しかし、それぞれの呼び出しは独立しており、
//		それぞれがヒープメモリ上に新しい`String`オブジェクトを生成します。
//		結果として、`a`と`b`は内容は同じですが、異なるオブジェクトを指し、
//		それぞれが異なるメモリアドレスに配置されます。
//		この挙動は、文字列リテラルを直接使用する場合（例：`String s = "Hello, Java!";`）とは異なります。
//		文字列リテラルの場合、Javaは文字列プール（String Pool）という特別なメモリ領域を使用して、
//		同じ文字列リテラルに対しては同一の`String`オブジェクトを再利用します。これにより、
//		メモリの効率的な使用とパフォーマンスの向上が図られます。
//
//		しかし、`new`キーワードを使うと、この再利用メカニズムはバイパスされ、
//		明示的に新しいオブジェクトが作成されるため、`a`と`b`が異なるオブジェクトを指すことになるのです。
//
//		new String を使っているからですか？
//		はい、正確にはその通りです。`new String("Hello, Java!");`を使うことで、
//		`String`オブジェクトの新しいインスタンスがヒープメモリ上にそれぞれ独立して生成されます。
//		この操作は、Javaの`new`キーワードが新しいオブジェクトインスタンスの生成を
//		行う際の一般的な挙動です。
//
//		`new`キーワードを使用すると、以下のことが起こります：
//
//		1. **新しいオブジェクトの割り当て**：`new`はヒープメモリ上に
//		新しいオブジェクトのためのスペースを割り当てます。このスペースは、オブジェクトが使用する
//		データを格納するために予約されます。
//		   
//		2. **コンストラクタの呼び出し**：`new`に続くクラス名（この場合は`String`）は、
//		そのクラスのコンストラクタを指します。`new String("Hello, Java!");`は、
//		文字列"Hello, Java!"を内容とする新しい`String`オブジェクトを作成するために、
//		`String`クラスのコンストラクタを呼び出します。
//
//		3. **独立したインスタンスの生成**：`new`キーワードの使用は、それぞれの呼び出しで
//		独立したオブジェクトインスタンスを生成します。そのため、
//		`String a = new String("Hello, Java!");`と
//		`String b = new String("Hello, Java!");`が行われると、内容は同じであっても、
//		`a`と`b`はそれぞれ異なるメモリアドレスを持つ別々のオブジェクトを指します。
//
//		これが、`a == b`が`false`を返す理由です。
//		`==`演算子はオブジェクトの参照（メモリアドレス）を比較するため、
//		異なるオブジェクトインスタンス（たとえ内容が同一でも）は異なる参照値を持ちます。
//		文字列の内容が等しいかどうかを比較する場合は、
//		`equals`メソッド（例：`a.equals(b)`）を使用するのが適切です。
//		`equals`メソッドはオブジェクトの内容が等しいかどうかを判断しますので、この場合`true`を返します。
//
//		！！　　以下の違いをよく覚える
//		同値性（同じ値を持ってる）・・・equalsメソッドで確認
//		同一性（インスタンスへの参照が同じ）・・・==演算子で確認
//		
//		String sample = "abcde";
//		System.out.println(sample.substring(2,4));
//
//		`substring`メソッドは、指定された開始インデックスから
//		終了インデックスの直前までの部分文字列を返します。
//		ここで、`sample.substring(2,4);`は`sample`文字列の3番目（インデックスは2から始まる）から
//		4番目の文字までの部分文字列を取得します。Javaでは文字列のインデックスは0から始まるので、
//		「abcde」のインデックス2は「c」、インデックス3は「d」に相当します。
//		したがって、このコードは「cd」を出力します。
//		
//		`substring`メソッドの動作を説明しますと、
//		`substring(int beginIndex, int endIndex)`メソッドは、
//		指定された`beginIndex`から始まり、`endIndex`の直前までの部分文字列を取得します。
//		つまり、`beginIndex`は含まれますが、`endIndex`は含まれません。
//		例で挙げた`sample.substring(2,4)`において、`sample`は文字列"abcde"です。
//		ここで、インデックス2は文字'c'に対応し（0から数えて3番目の文字）、
//		インデックス4は文字'e'に対応しますが、`endIndex`の文字は含まれないため、
//		結果として得られる部分文字列は'c'と'd'、すなわち「cd」になります。
//
//		したがって、「2から4まで」ではなく、「2から4の直前まで」が正しい表現で、結果は「cd」になります。
//		
//		理解の過程での混乱はよくあることです。プログラミングにおいては、
//		特にメソッドや関数のパラメータがどのように機能するか（例えば、どの範囲が含まれるかや、
//		どの値が結果に含まれるか）を正確に理解することが重要です。
//		`substring`メソッドの場合、第一パラメータ（`beginIndex`）は部分文字列に含まれる
//		最初の文字のインデックスを指定し、第二パラメータ（`endIndex`）は部分文字列に含まれない
//		最初の文字のインデックスを指定します。したがって、`substring(2, 4)`はインデックス2から
//		インデックス3までの文字を取り出します。この場合、「cde」と勘違いしてしまったのは、
//		`endIndex`が結果に含まれないという挙動の理解が混乱していたからかもしれませんね。
//		例として「abcde」の`substring(2, 4)`を考えると、インデックス2（'c'）から
//		インデックス4の直前（'d'）までの文字が取り出され、「cd」となります。このような挙動は、
//		文字列操作をする上で基本的な部分であり、多くのプログラミング言語で似たような仕組みを持っています。
//		プログラミング学習では、このような特定の動作を試してみること、
//		ドキュメントやリファレンスを読むことが大変役立ちます。また、自分でコードを書いてみることで、
//		より深く理解が進むこともあります。質問や実験を重ねることで、
//		より多くを学び、成長していくことができます。
//		
//		
//		イミュータブル（immutable）は「不変」という意味
//		「mutable」は「ミュータブル」(可変)
//		
////
////		配列と`substring`メソッドは似てますか
//
//		⇨　配列と`substring`メソッドは、いずれも要素や文字を扱う点で共通していますが、
//		扱う対象や具体的な用途が異なります。ここで、それぞれの特徴と使い方の基本を比較してみましょう。
//
//		### 配列
//
//		- **定義と用途**：配列は、同じ型の複数の要素を一つの変数で格納するために使用されます。
//		配列の各要素は、インデックス（通常、0から始まる）を使ってアクセスします。
//		- **操作**：配列では、特定のインデックスの要素を読み取ったり、変更したりすることができます。
//		また、配列の長さ（要素数）は作成時に決定され、Javaでは変更することができません。
//		- **例**：`int[] numbers = {1, 2, 3, 4, 5};` この配列から特定の要素を取得するには、
//		`numbers[0]`（最初の要素を取得）のようにします。
//
//		### `substring`メソッド
//
//		- **定義と用途**：`substring`メソッドは、`String`オブジェクトのメソッドであり、
//		文字列の一部を抽出するために使用されます。このメソッドは、開始インデックスと（オプションで）
//		終了インデックスを指定して、部分文字列を生成します。
//		- **操作**：`substring`メソッドは、指定された範囲の文字列を
//		新しい`String`オブジェクトとして返します。開始インデックスは結果に含まれ、
//		終了インデックスの文字は結果に含まれません。
//		- **例**：`String text = "hello";` この文字列から部分文字列を取得するには、
//		`text.substring(1, 3)`（`"el"`を取得）のようにします。
//
//		### 似ている点と異なる点
//
//		- **共通点**：配列と`substring`メソッドは、特定の範囲の要素や文字を選択して
//		取得するという点で似ています。また、どちらも0から始まるインデックスを使用してアクセスを行います。
//		- **相違点**：配列は複数の型（数値、オブジェクトなど）の要素を格納するのに対し、
//		`substring`メソッドは文字列内の文字のみを扱います。また、配列の操作は要素の読み取りや
//		更新が可能ですが、`substring`は元の文字列を変更せず、新しい文字列を作成します。
//
//		要するに、配列と`substring`メソッドは、集合から部分集合を取得するという点で類似していますが、
//		操作するデータの種類（配列は任意の型、`substring`は文字列のみ）や
//		挙動（配列は要素の更新が可能、`substring`は新しい文字列の作成）において異なります。
//		
//		
//		
		
		
		
		
		
		
		
		
//	}
//}