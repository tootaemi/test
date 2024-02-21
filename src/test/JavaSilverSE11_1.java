package test;
//
//public class JavaSilverSE11_1 {
//	public static void main(String[] args) {
//		System.out.println("Hello, world!");
		
//		第7章
//		クラスの継承、インターフェース、抽象クラス
//		・クラスの継承
//		・インターフェース
//		・抽象クラスと具象クラス
//		・抽象メソッドの実装
//		・メソッドのオーバーライド
//		・ポリモーフィズム
//		・型の互換性、アップキャスト、ダウンキャスト
//		・thisの使用
//		・superの使用
		
		
		//1.
//		public class Child extends Parent {
//			Child() {
//				name = "Java";
//			}
//			void hello() {
//				System.out.println("hello, " + name);
//			}
//		}
		
		//このクラスが継承しているParentクラスの説明として正しいもの
		//⇨
		//Parentクラスには、nameフィールドを定義しなければいけない。
//		
//		クラスの継承に関する問題。
//		継承は、あるクラスを機能拡張した新しいクラスを定義すること。
//		拡張元になるクラスのことを基底クラスやスーパークラス、
//		拡張したクラスのことを派生クラスやサブクラスと呼ぶ。
//		
//		継承は生産性を向上させる強力なプログラミング手法。
//		共通部分のプログラム⇨差分プログラミングと呼ぶ。
////		
//		！　継承をすることでサブクラスはスーパークラスの特徴を引き継ぎます。
//		サブクラスのインスタンスは、スーパークラスのインスタンスと
//		差分のインスタンスの両方で構成されていることを理解しよう。
		
//		2. 継承の説明として正しいもの
//		⇨　サブクラスであってもコンストラクタは引き継ぎができない
//		
//		継承では何を引き継ぐかについて問う問題。
//		下記の2つは継承していても引き継げない
////		・コンストラクタ
////		・privateなフィールドやメソッド
//		
//		privateなフィールドやメソッドは、アクセス修飾子privateで修飾され、
//		同じクラスのインスタンス同志でしか使えない。
//		
//		デフォルトは「パッケージアクセス」とも呼ばれ、
//		同じパッケージに属するクラスのインスタンスからのアクセスだけを許可するもの。
//		継承関係でもスーパークラスとサブクラスのそれぞれが属するパッケージが異なれば
//		アクセスできない。
//		
//		protectedは異なるパッケージであっても
//		継承関係にあればアクセスを許可する
//		というもの。
//		
//		！　継承関係にあってもスーパークラスのコンストラクタと
//		privateなフィールドやメソッドはサブクラスには引き継がれない。
		
//		3.インターフェースに関する説明として正しいもの。
//		⇨
//		・アクセス修飾子を省略してもpublicなメソッドとして扱われる
//		・抽象クラスは、インターフェースに定義されているメソッドを実現しなくてもよい
//		
//		解説；
////		インターフェースの基礎知識を問う問題。
//		インターフェースは、クラスから「型」だけを取り出したもの。
//		型とはそのものの「扱い方」を決めるための情報
//		変数を宣言する時に型を指定するのはその変数の扱い方を決めるため。
//		注意すべきなのは扱う対象そのものの種類と型で指定する
//		「扱う対象の種類」は異なる概念であること。
//		インスタンスの種類と変数の型を分けて考えられるためポリモーフィズムが成り立つ。
	
//		インターフェースは他のクラスからの「扱い方」を規定したもの。
//		他のクラスから扱えるようにするために規定する抽象メソッドは
//		すべてpublicであると解釈される。
//		アクセス修飾子を記述しなくてもインターフェースは
//		コンパイルエラーによって自動的にpublicで修飾される。
//		
//		！　インターフェースに宣言する抽象メソッドには、
//		処理内容をいっさい記述することはできない。
//		
//		継承に関するルール
//		⇨　・クラス同士は単一継承のみ可能
//		　　・インターフェース同士は多重継承が可能
		
		//4.
//		public interface A {
//			void sample() {
//				System.out.println("sample");
//			}
//		}
//		public class B implements A {
//		
//		}
//		
//		public class Main {
//			public static void main(String[] args) {
//				A a = new B();
//				a.sample();
//			}
//		}
//
//		⇨　インターフェースAのsampleメソッドをdefaultで修飾しなければいけない。
//		解説；デフォルトメソッドに関する問題。
//		インターフェースに定義されている抽象メソッドはそのインターフェースを
//		実現したクラスが必ず実装しなければいけない。
		
		//5.結果として正しいもの
//		public interface A {
//			@Override
//			default String toString() {
//				return "A";
//			}
//		}
//				
//		public class B implements A {
//			@Override
//			public String toString() {
//				return "B";
//			}
//		}
//		
//		public class Main {
//			public static void main(String[] args) {
//				A a = new B();
//				System.out.println(a);
//			}
//		}
//		⇨　Aインターフェースでコンパイルエラーとなる。
//		解説；　インターフェースに定義するデフォルトメソッドは、
//		実現クラスが持つべきデフォルトの実装を定義するもの。
//		Aインターフェースでjava.lang.Objectクラスに
//		定義されているtoStringメソッドをデフォルトメソッドとして
//		オーバーライドしているためコンパイルエラーが発生する。
		
		//6.省略
		
		//7.結果として正しいもの。
//		public interface A {
//			default void test() {
//				System.out.println("A");
//			}
//		}
//		public interface B {
//			default void test() {
//				System.out.println("B");
//			}
//		}
//		public class Main implements A, B {
//			public static void main(String[] args) {
//				new Main().test();
//			}
//		}
//		//→　コンパイルエラーが発生する。
//		このコード例では、MainクラスがAインターフェースとBインターフェースの両方を実装していますが、
//		両方のインターフェースにtestメソッドのデフォルト実装が存在します。
//		Javaでは、同一のシグネチャを持つメソッドの複数のデフォルト実装を持つインターフェースを
//		一つのクラスが実装しようとすると、どちらのデフォルトメソッドを使用すべきか
//		Javaコンパイラが決定できないため、コンパイルエラーが発生します。
//		
//このコードには、Main クラスが A と B 両方のインターフェースを実装しており、
//それぞれのインターフェースには同じシグネチャのデフォルトメソッド test() が定義されています。
//Javaでは、異なるインターフェースのデフォルトメソッド間で名前とシグネチャが衝突する場合、
//コンパイルエラーが発生します。これは、Javaコンパイラがどちらの test() メソッドを
//Main クラスで呼び出すべきかを自動的に判断できないためです。
//
//この問題を解決するには、Main クラス内で test() メソッドをオーバーライドして、
//どちらのインターフェースのメソッドを使用するか明示的に指定する必要
//		
//		javaでは２つ以上のクラスを同時に継承する多重継承が禁止されているが
//		インターフェースの多重継承は可能。
//		
//		呼び出すデフォルトメソッドを特定する。
//		public class Main implements A.B {
//			public static void main(String[] args) {
//				new Main().test();
//			}
//			@Override
//			public void test() {
//				A.super.test();
//			}
//		}
//
//		8.抽象クラスに関する説明として正しいもの。
//		
//		→　・インスタンスを生成することはできない。
//		　　・サブクラスから抽象クラスの公開フィールドに自由にアクセスできる。
//		  　・抽象クラスを継承した抽象クラスを定義できる。
//		
//		   解説；　抽象クラスの基礎知識を問う問題。
//		   ！　抽象クラスはインスタンス化できない。
//		   　　抽象メソッドは、具象クラスが実装しないといけない。
		
		//9.
//		abstract class AbstractSample {
//			public void sample() {
//				System.out.println("A");
//				test();
//				System.out.println("C");
//			}
//			protected abstract void test();
//		}
//		class ConcreteSample extends AbstractSample {
//			protected void test() {
//				System.out.println("B");
//			}
//		}
//		
//		public class Main {
//		public static void main(String[] args) {
//			AbstractSample s = new ConcreteSample();
//			s.sample();
//		}
//	}
//		
		//→「A」「B」「C」と表示される。
		//抽象クラスからのメソッド呼び出しに関する問題。
		
		
		
//このコードでは、AbstractSampleという抽象クラスと、
//それを継承するConcreteSampleという具象クラスが定義されています
//。抽象クラスAbstractSampleには、具象メソッドsample()と抽象メソッドtest()が定義されています。
//sample()メソッドは、コンソールに"A"を出力し、test()メソッドを呼び出した後、"C"を出力します。
//test()メソッドは抽象メソッドであり、サブクラスでの実装を必要とします。
//
//ConcreteSampleクラスはAbstractSampleを継承し、test()メソッドをオーバーライドしています。
//このオーバーライドされたtest()メソッドは、"B"を出力します。
//
//Mainクラスのmainメソッドでは、AbstractSample型の変数sを宣言し、
//ConcreteSampleのインスタンスを代入しています。その後、s.sample()を呼び出しています。
//
//このsample()メソッドの実行フローは以下の通りです：
//
//"A"を出力。
//test()メソッドを呼び出し、ConcreteSampleクラスにおけるtest()メソッドの実装が実行され、"B"を出力。
//"C"を出力。
//したがって、このコードを実行すると、コンソールには"A"、"B"、"C"の順に出力されます。
//		
		
		//10.オーバーライドに関する説明として正しいもの。
		//→　引数リストの定義は、型、数、順番の全てが同じでなければいけない。
//		解説；　メソッドのオーバーライドの基礎知識を問う問題。
//		オーバーライドはサブクラスでスーパークラスに定義されたメソッドを
//		「再定義」すること。
//		「多重定義」を表すオーバーロードと間違えやすいので注意！！
//		メソッドを再定義するため、メソッドのシグニチャ（メソッド名、引数リストの型、数、順番）は
//		同じでないといけない。
//		
//		！サブクラスでは、オーバーロードされたメソッドが使われる。
		
	
//		メソッドをオーバーライドする際には、サブクラスでオーバーライドされるメソッドの
//		シグネチャが、スーパークラスのメソッドシグネチャと完全に一致している必要があります。
//		メソッドのシグネチャには、メソッド名と引数リストが含まれます。
//		したがって、オーバーライドするメソッドでは、以下の条件が一致していなければなりません：
//
//		メソッド名：オーバーライドされるメソッドと同じ名前である必要があります。
//		引数リスト：
//		型：引数の型が全て同じである必要があります。
//		数：引数の数が同じである必要があります。
//		順番：引数の順番が同じである必要があります。
//		これらの条件を満たすことで、サブクラスのメソッドはスーパークラスのメソッドを正しくオーバーライドすることができます。
//		オーバーライドは、サブクラスがスーパークラスの特定の振る舞いを特定の方法で再定義したい場合に使用されます。
//		また、オーバーライドするメソッドは、アクセス修飾子においても制限があります。
//		例えば、スーパークラスのメソッドがprotectedである場合、サブクラスでオーバーライドするメソッドは
//		protectedまたはそれよりもアクセス範囲が広い修飾子（public）を使用することができますが、
//		より狭い範囲の修飾子（private）を使用することはできません。
//		
//		11.　以下のクラスを継承したサブクラスを定義する時
//		hellpメソッドをオーバーライドしようとしている。
//		サブクラスに定義するhelloメソッドに
//		付けられるアクセス修飾子として正しいものは？
//		public class Sample {
//			protected void hello() {
//				System.out.println("hello");
//			}
//		}
//		⇨　public
//		オーバーライドには3つのルールがある。
//		・シグニチャが同じである。
//		・戻り値型は同じ型か、サブクラス型であること。
//		・アクセス修飾子は同じか、より緩いものを指定すること
//		
		//！オーバーライドしたメソッドは元の定義よりも
		//アクセス制御を緩くすることはできるが厳しきはできない。
		
		//12.
//		class A {
//			String val = "A";
//			void print() {
//				System.out.print(val);
//				}
//		}
//		
//		class B extends A {
//			String val = "B";
//		}
//		
//		public class Main {
//			public static void main(String[] args) {
//				A a = new A();
//				A b = new B();
//				System.out.print(a.val);
//				System.out.print(b.val);
//				a.print();
//				b.print();
//			}
		//}

	//→　「AAAA」と表示される。
	
		//継承関係にある2つのクラスで同名のフィールドが使われている時どちらが優先されるかを問う問題。

		
//		このJavaプログラムは、クラスの継承とポリモーフィズムの基本的な概念を示しています。
//		ここには3つのクラスが定義されています：`A`、`B`（`A`を継承）、そして`Main`クラス。
//
//		- `A`クラスには`val`という文字列変数があり、その値は`"A"`です。
//		また、`print`メソッドがあり、`val`の値を出力します。
//		- `B`クラスは`A`クラスを継承しており、自身の`val`変数を持っていますが、その値は`"B"`です。
//		`B`クラスでは`print`メソッドをオーバーライドしていないため、`A`クラスの`print`メソッドを継承します。
//
//		`Main`クラスの`main`メソッドでは、以下の操作が行われます：
//
//		1. `A`型のオブジェクト`a`を作成し、`A`クラスのインスタンスを代入します。
//		2. `A`型のオブジェクト`b`を作成し、`B`クラスのインスタンスを代入します。
//		3. `a.val`と`b.val`を出力します。Javaでは、フィールド（変数）の参照は静的な型に基づくため、
//		これらはそれぞれ`"A"`と`"A"`を出力します。
//		`b`は`A`型として宣言されているため、`B`クラスの`val`ではなく、`A`クラスの`val`が参照されます。
//		4. `a.print()`と`b.print()`を呼び出します。
//		`print`メソッドは動的にバインドされるため（ランタイム時のオブジェクトの型に基づく）、
//		`a.print()`は`"A"`を出力し、`b.print()`も`"A"`を出力します。
//		これは、`b`が`B`のインスタンスであっても、`print`メソッドが`A`クラスの`val`フィールドを参照しているためです。
//
//		したがって、このプログラムの出力は次のようになります：
//
//		```
//		AAA
//		```
//
//		最初の2つの`A`は、`a.val`と`b.val`の出力です。
//		後ろの2つの`A`は、`a.print()`と`b.print()`による出力です。
//		
		//13.結果として正しいもの。
//		interface Worker {
//			void work();
//		}
//		
//		class Employee {
//			public void work() {
//				System.out.println("work");
//			}
//		}
//		1. class Engineer extends Employee implements Worker { }
//		
//		public class Main {
//			public static void main(String[] args) {
//				Worker worker = new Engineer();
//				worker.work();
//			}
//		}
		
		//→　「work」と表示される。
		//インターフェースの実装に関する問題。
		
		//14.結果として正しいもの。
//		public interface Worker {
//			void work();
//		}
//		class Employee implements Worker {
//			public void work() {
//				System.out.println("report");
//			}
//			public void report() {
//				System.out.println("report");
//			}
//		}
//		class Engineer extends Employee {
//			public void create() {
//				System.out.println("create future");
//			}
//		}
//		
//		public class Main {
//			public static void main(String[] args) {
//				Worker a = new Engineer();
//				Employee b = new Engineer();
//				Employee c = new Engineer();
//				a.create();
//				b.work();
//				c.report();
//				}
//			}
//	
//		→　Mainクラスの「	a.create();」ここでコンパイルエラーになる。
//		
		//ポリモーフィズムを使った問題。
//		mainメソッドでは次にcreateメソッド、workメソッド、reportメソッドを呼び出している。
//		変数aを使ってcreateメソッドを呼び出している。しかし、変数aはWorker型であり
//		このインターフェースにはcreateメソッドが定義されていない。なのでそこでコンパイルエラーになる。
//		
//		！　フィールドやメソッドの呼び出しは。変数で定義されたものしか使えない。
//		ポリモーフィズムを使った問題では変数が何型かを確認するようにして。
		
		//15.実行結果として正しいもの。
		
//		1. public interface A { }
//		1. public class B implements A { }
//		1. public class C extends B { }
//		1. public class D { }
//		
//		public class Main {
//			public static void main(String[] args) {
//				A[] array = {
//						new B(),
//						new C(),
//						new A(),
//						new D()
//				};
//			}
//		
//		⇨「new A(),」と「new D()」でコンパイルエラーが発生する。　
//		
//		Mainクラスのmainメソッド内でコンパイルエラーが2つ発生します。
//new A(),：Aはインターフェースであり、インターフェースのインスタンスを直接生成することはできません。
//Javaでは、インターフェースは実装されなければインスタンス化することができません。
//この行はコンパイルエラーを引き起こします。
//new D()：配列A[] arrayはAインターフェースの型のオブジェクトのみを格納することができます。
//DクラスはAインターフェースを実装していないため、この配列に追加することはできません。
//したがって、この行もコンパイルエラーを引き起こします。
//正しく動作するコードに修正するには、new A(),とnew D()の行を削除する必要があります。
//修正後のコードは以下のようになります：
//
//
//public class Main {
//    public static void main(String[] args) {
//        A[] array = {
//            new B(),
//            new C()
//        };
//    }
//}
//この修正により、Aインターフェースを実装するBとCのインスタンスのみが
//A[] array配列に含まれることになり、コンパイルエラーが解消されます。
		
		//16.
//		class A { }
//		
//		class B extends A {
//			void hello() {
//				System.out.println("hello");
//			}
//		}
//		
//		public class Main {
//			public static void main(String[] args) {
//				A a = new B();
//				B b = (B) a;
//				b.hello();
//			}
//		}
//
//このコードはJavaにおけるクラスの継承とポリモーフィズムに関するものです。
//クラス`A`とクラス`B`があり、`B`は`A`を継承しています。
//そして、`Main`クラスに`main`メソッドが含まれています。
//
//- **クラスA**：メソッドやプロパティを持たない空のクラスです。
//
//- **クラスB**：クラスAを継承しており、`hello()`メソッドを含んでいます。
//このメソッドはコンソールに`"hello"`という文字列を出力します。
//
//- **Mainクラス**：プログラムのエントリーポイントである`main`メソッドが定義されています。
//
//`main`メソッドの処理は以下の通りです：
//
//1. `B`クラスのインスタンスが作成され、`A`型の変数`a`に代入されます（`A a = new B();`）。
//これは、スーパークラスの変数がサブクラスのインスタンスを参照できるポリモーフィズムの例です。
//
//2. 変数`a`に代入されたオブジェクトは`B`型にキャストされ、変数`b`に代入されます（`B b = (B) a;`）。
//このキャストは、`a`が実際には`B`型のインスタンスを参照していることを明示的に示しています。
//
//3. `b.hello();`の呼び出しにより、`B`クラスの`hello`メソッドが実行され、"hello"という文字列がコンソールに出力されます。
//
//このコードは、Javaの継承、ポリモーフィズム、および型キャストの基本的な使用方法を示しています。
//サブクラスのインスタンスをスーパークラスの型で扱い、必要に応じて
//サブクラスの型にキャストすることで、サブクラス固有のメソッドにアクセスすることができます。
//		
		//17.
//		class A {
//			void hello() {
//				System.out.println("A");
//			}
//		}
//		
//		class B extends A {
//			void hello() {
//			System.out.println("B");
//		}
//	}
//	
//	public class Main {
//		public static void main(String[] args) {
//			A a = new A();
//			B b = (B) a;
//			b.hello();
//			}
////		}
//このコードは、Javaにおけるクラスの継承とメソッドのオーバーライドに関連するものですが、実行時に問題が発生します。
//具体的には、`ClassCastException`が発生します。ここで何が起こっているかを説明します：
//
//- **クラスA**: `hello()`メソッドを持ち、このメソッドはコンソールに`"A"`を出力します。
//
//- **クラスB**: クラスAを継承し、`hello()`メソッドをオーバーライドしています。このメソッドはコンソールに`"B"`を出力します。
//
//- **Mainクラス**: `main`メソッド内で、まず`A`クラスのインスタンス`a`が作成されます。
//その後、`a`を`B`型にキャストしようとしますが、`a`は実際には`A`のインスタンスであるため、
//このキャストは実行時に`ClassCastException`を引き起こします。
//
//コードの問題点は、`A`型のインスタンスを`B`型にキャストしようとしている点にあります。
//このキャストは、`a`が実際には`B`のインスタンス、つまり`B`のオブジェクト
//または`B`のサブクラスのオブジェクトを参照している場合にのみ成功します。
//しかし、`a`は`A`のインスタンスを直接参照しており、`B`のインスタンスではないため、キャストは失敗し、例外が投げられます。
//
//正しく動作させるためには、`A`のインスタンスを`B`にキャストする代わりに、
//`B`のインスタンスを作成し、それを使用する必要があります。例えば、以下のように修正することができます：
//
//public class Main {
//    public static void main(String[] args) {
//        B b = new B();
//        b.hello();
//    }
//}
//
//この修正により、`B`クラスのインスタンスが作成され、
//オーバーライドされた`hello`メソッドが呼び出され、"B"がコンソールに出力されます。

//
//		//18.コンソールに「10」を表示させる。
//         class Sample {
//        	 private int num;
//        	 public Sample(int num) {
//        		 this.num = num;
//        		 //setNum(num);
//        	 }
//        	 public int getNum() {
//        		 return num;
//        	 }
//        	 public void setNum(int num) {
//        		 this.num = num;
//        	 }
//         }
//         public class Main {
//        	 public static void main(String[] args) {
//        		 Sample s = new Sample(10);
//        		 System.out.printli(s.getNum());
//        	 }
//         }
//
//！　フィールドとローカル変数を同じ名前で宣言した場合ローカル変数が優先される。
//ローカル変数ではなくフィールドを使いたい場合にはthisを使う。
//その場合の書式は「this.フィールド名」

         
         //19.結果として正しいもの。
//         class Parent {
//        	 String name;
//        	 String getName() {
//        		 return this.name;
//        	 }
//         }
//         
//         public class Child extends Parent {
//        	 String name;
//         }
//         public class Main {
//        	 public static void main(String[] args) {
//        		 Child child = new Child();
//        		 child.name = "sample";
//        		 System.out.println(child.getName());
//        	 }
//         }
//         ⇨　「null」と表示される。
//         
//         
//         このコードでは、「null」と表示される理由は、
//         `Child`クラスと`Parent`クラスの両方に`name`というフィールドが存在し、
//         `Child`クラスのインスタンスが`Parent`クラスの`getName()`メソッドを呼び出した際に、
//         `Parent`クラスの`name`フィールドが参照されるためです。
//         `Child`クラスの`name`フィールドに値が設定されても、
//         `Parent`クラスの`name`フィールドはデフォルト値（null）のまま変更されていません。
//
//         Javaでは、サブクラスがスーパークラスと同じ名前のフィールドを持つ場合、
//         サブクラスのフィールドはスーパークラスのフィールドを隠蔽しますが、
//         スーパークラスのメソッドからはスーパークラスのフィールドが参照されます。
//         この場合、`Child`クラスの`name`フィールドは、
//         `Parent`クラスの`name`フィールドとは異なるフィールドとして扱われます。
//
//         コードの動作を以下に示します：
//
//         1. `Child`クラスのインスタンス`child`が作成されます。
//         2. `child.name = "sample";`により、`Child`クラスの`name`フィールドに`"sample"`が設定されます。
//         3. `child.getName();`が呼び出されますが、このメソッドは`Parent`クラスに定義されており、
//         `Parent`クラスの`name`フィールドの値を返します。
//         `Parent`クラスの`name`フィールドは初期化されていないため、デフォルト値の`null`が返されます。
//
//         この問題を解決するためには、`Parent`クラスの`name`フィールドに値を設定するか、
//         `Child`クラスで`getName()`メソッドをオーバーライドして、
//         `Child`クラスの`name`フィールドを返すようにすることが考えられます。
//         例えば、`Child`クラスに以下のように`getName()`メソッドを追加することができます：
//
//         @Override
//         String getName() {
//             return this.name;
//         }
//       
//         この変更により、`Child`クラスのインスタンスで`getName()`メソッドを呼び出した場合、
//         `Child`クラスの`name`フィールドの値が返され、期待した結果が得られます。
//         
//         
         //20.結果として正しいもの。
//         class A {
//        	 public A() {
//        		 System.out.println("A");
//        	 }
//         }
//         
//         class B extends A {
//        	 public B() {
//        		 System.out.println("B");
//        	 }
//         }
//       public class JavaSilverSE11_1 {  //このコードでないと表示できない
//         //public class Main {　　//このコードはコメントアウトして上記のコードで表示させる。
//        	 public static void main(String[] args) {
//        		 A a = new B();
//        	 }
//         }
//
//       ⇨　「A」「B」と表示される。

//継承関係にあるクラスのインスタンスを作った時の
//コンストラクタがどのような動作をするのかについて問う問題。
//コンストラクタはインスタンスの準備をするためのメソッドで
//全てのインスタンスが持たなければいけない。
//定義がなかった場合でもデフォルトコンストラクタが自動的に追加される。
//
//！　継承関係にあるクラスのインスタンス生成時のコンストラクタの動作について理解しよう。
//・スーパークラスのインスタンスが持つコンストラクタが先に実行されなければいけない。
//・サブクラスのコンストラクタにはスーパークラスのコンストラクタを呼び出す「super();」が
//コンパイラによって先頭行に追加される。

//
//       このコードでは、「A」「B」と表示されるのは、
//       Javaにおけるクラスの継承とコンストラクタの呼び出し順序に基づいています。具体的な動作は以下の通りです：
//
//       1. `Main`クラスの`main`メソッド内で、`B`クラスのインスタンスが作成されます。
//       `A a = new B();`により、`B`クラスのオブジェクトを参照する`A`型の変数`a`が宣言されます。
//
//       2. `B`クラスのインスタンスを作成する際、まず`B`クラスのコンストラクタが呼び出されます。
//
//       3. Javaでは、サブクラスのコンストラクタが実行される前に、
//       スーパークラスのコンストラクタが自動的に呼び出されます（明示的にスーパークラスのコンストラクタを呼び出さない場合）。
//       この場合、`B`クラスのコンストラクタが実行される前に、まず`A`クラスのコンストラクタが呼び出されます。
//
//       4. `A`クラスのコンストラクタ内で`System.out.println("A");`が実行され、「A」と表示されます。
//
//       5. その後、`B`クラスのコンストラクタの実行が続き、`System.out.println("B");`が実行され、「B」と表示されます。
//
//       結果として、コンソールには以下のように表示されます：
//       ```
//       A
//       B
//       ```
//
//       この動作は、Javaにおけるコンストラクタの継承の基本的なルールによるものです。
//       サブクラスのインスタンスが作成される際には、スーパークラスからサブクラスに向かって
//       コンストラクタが順に呼び出され、スーパークラスの初期化がサブクラスの初期化より先に行われます。


//　　　　　　　　//21.結果として正しいもの。
//
//class Parent {
//	public Parent() {
//		System.out.println("A");
//	}
//	public Parent(String val) {
//		this();
//		System.out.println(val);
//	}
//}
//class Child extends Parent {
//	public Child() {
//		super("B");
//		System.out.println("C");
//	}
//	public Child(String val) {
//		this();
//		System.out.println(val);
//	}
//}
//
////public class Main {  //このコードコメントアウトしないと表示できない
//public class JavaSilverSE11_1 {　　//このコード使う
//	public static void main(String[] args) {
//		new Child("D");
//	}
//}
////		
//このコードが「A」「B」「C」「D」と表示する理由は、コンストラクタの呼び出し順序と、
//`super`および`this`キーワードの使用によります。以下に詳細な流れを説明します：
//
//1. `Main`クラスの`main`メソッド内で、`Child`クラスのインスタンスが文字列`"D"`を引数にして作成されます。
//つまり、`new Child("D");`が実行されます。
//
//2. `Child`クラスの`Child(String val)`コンストラクタが呼び出されます。
//このコンストラクタの最初の行で`this();`が呼び出されています。
//この`this();`は、同じクラス内の引数を取らない別のコンストラクタ、すなわち`Child()`コンストラクタを呼び出します。
//
//3. `Child()`コンストラクタの最初の行で`super("B");`が実行されます。
//`super("B");`は、スーパークラス`Parent`の`Parent(String val)`コンストラクタを引数`"B"`で呼び出します。
//
//4. `Parent(String val)`コンストラクタの最初の行で`this();`が実行されます。
//これにより、同じクラス内の引数を取らない`Parent()`コンストラクタが呼び出されます。
//
//5. `Parent()`コンストラクタ内で`System.out.println("A");`が実行され、「A」と表示されます。
//
//6. `Parent(String val)`コンストラクタの実行に戻り、`System.out.println(val);`が実行されます。
//この時点での`val`の値は`"B"`なので、「B」と表示されます。
//
//7. `Child()`コンストラクタの実行に戻り、`System.out.println("C");`が実行され、「C」と表示されます。
//
//8. 最後に、`Child(String val)`コンストラクタの実行が再開され、`System.out.println(val);`が実行されます。
//この時点での`val`の値は`"D"`なので、「D」と表示されます。
//
//以上のコンストラクタの呼び出し順序により、コンソールには「A」「B」「C」「D」と順に表示されます。
//		
////		
//明示的にコンストラクタを呼び出しながら、どのような順で処理が進むかを問う問題。
//抑えるキーワードはthisとsuper.abstract
//コンストラクタ内から。オーバーロードされた別のコンストラクタを呼び出す時に使うのが「this」
//コンストラクタ内から、スーパークラスのコンストラクタを呼び出すのが「super」
//mainメソッドでchildクラスのインスタンスを作る時に次々とコンストラクタが繋がって処理されていく。
//

//！　スーパークラスのインスタンスのコンストラクタを明示的に呼び出すにはsuperを使う。

//第8章
//関数型インタフェース、ラムダ式
//・ラムダ式
//・Predicateインターフェース
//・Supplierインターフェース
//・Functionインターフェース
//・Consumerインターフェース

//1.省略

////2.「//insert code here」 にはいるコードとして誤っているもの。
//public class Main {
//	public static void main(String[] args) {
//		//insert code here
//		System.out.println(f.test("Lambda"));
//	}
//	private static interface Function {
//		String test(String name);
//	}
//}
//
//
//A
//Function f = (name) -> {
//	return "hello, " + name;
//};
//
//B
//Function f = (name) -> {
//	"hello, " + name;
//}
//
//C
//Function f = (name) -> return "hello, " + name;
//
//D
//Function f = (name) -> "hello, " + name;
//
//E
//Function f = (name) -> {
//	return "hello, " + name;
//};

//
//→　B,Cが誤り
//※　コードを追加しエラー出るか出ないか見るのは明日以降にします。
//→22日以降に変更。
//
//
//ラムダ式の宣言にあたり省略できる構文についての問題。
//
//構文
//関数型インターフェースの型　変数名　＝　（ 引数 ）　ー＞　{ 処理 }	;
//
//この構文のうち、代入演算子の右側がラムダ式。
//ラムダ式の引数の宣言では、カッコ「()」も省略できる。
//
//構文
//関数型インターフェースの型　変数名　＝　引数　ー＞　{ 処理 }	;

//ただし、カッコを省略できるのは引数が１つの時だけ。
//
//中カッコあり　　　　　　　　　　　　　中カッコなし
//・複数の処理を記述できる　　　　　　　　・1つしか処理ができない
//・戻り値を戻すにはreturnが必要　　　　　・戻り値を戻すにはcreturnを省略
//
//！ラムダ式の構文について以下のことを覚えておこう。
//・ラムダ式で中カッコを省略した場合には処理は1分だけ記述できる。また、returnは記述できない。
//・ラムダ式で中カッコを記述した場合にはreturnは省略できない。
//
//
//3.結果として正しいもの。
//public class Main {
//	public static void main(String[] args) {
//		String val = "A";
//		Function f = (val) -> {
//			System.out.println(val);
//		};
//		f.test("B");
//	}
//}
//interface Function {
//	void test(String val);
//}
//
//→コンパイルエラーが発生

//ラムダ式の変数スコープに関する問題。
//ラムダ式は、変数宣言のうちデータ型の宣言を省略しているだけでString型の変数valを宣言しているのと同じ。
//ラムダ式で宣言されている変数valは「	String val = "A";」ここで宣言されている。
//同じ名前の変数を重複して宣言していることによりコンパイルエラーが発生する。
//！　メソッド内で宣言したローカル変数と同じ名前の変数をラムダ式の引数名としてつかうことはできない。


//このJavaのコードは、ラムダ式を使用して`Function`インターフェースの実装を試みていますが、
//コンパイルエラーが発生します。主な理由は、ラムダ式で使用されるパラメータ`val`が、
//ラムダ式の外側のスコープで既に定義されているためです。
//Javaでは、ラムダ式内で使用される変数は、その外側のスコープ（エンクロージングスコープ）で
//一意でなければなりません。このケースでは、メソッド`main`内で`String val = "A";`として
//`val`が既に宣言されており、ラムダ式の引数として再度`val`を使用しようとしているため、変数の名前が衝突しています。
//
//解決策としては、ラムダ式のパラメータの名前を変更することです。
//例えば、以下のように修正することができます：
//
//public class Main {
//	public static void main(String[] args) {
//		String val = "A";
//		Function f = (newValue) -> { // パラメータ名を変更
//			System.out.println(newValue);
//		};
//		f.test("B");
//	}
//}
//
//interface Function {
//	void test(String val);
//}
//
//この修正により、ラムダ式内のパラメータ名が
//外側のスコープの変数名と衝突しなくなり、コンパイルエラーが解消されます。
//
//		//4.結果として正しいもの。
//      public class Sample {
//    	  public static void main(String[] args) {
//    		  int cnt = 0;
//    		  Runnable r = () -> {
//    			  for (cnt = 0; cnt < 10; cnt++) {
//    				  System.out.println(cnt++);
//    			  }
//    		  };
//    		  new Thread(r).start();
//      } 
//    }
//      
//→　コンパイルエラーが発生する。
//ラムダ式からアクセスできる範囲に関する問題。
//
//for (cnt = 0; cnt < 10; cnt++) {　のfor文の更新文と、
//	  System.out.println(cnt++);のコンソール出力を行うタイミングで
//	  ローカル変数cntをインクリメントして値を変更している。
//	  そのためこのコードはコンパイルエラーになる

//
//このJavaコードでは、ラムダ式内でローカル変数`cnt`を変更しようとしていますが、
//これはコンパイルエラーを引き起こします。ラムダ式内から参照されるローカル変数は
//実質的にfinalである必要があります。これは、その変数がラムダ式の実行時に変更されないことを意味します。
//ローカル変数をラムダ式内で変更しようとすると、変数が実質的にfinalではなくなり、コンパイルエラーが発生します。
//
//このコードの場合、`cnt`はラムダ式の外で宣言され、ラムダ式内で変更されています。
//これはJavaのラムダ式の制約に違反しています。
//
//コンパイルエラーを回避するには、ラムダ式内で独立したカウンタを使用するか、
//`cnt`を変更しない別のアプローチを取る必要があります。例えば、以下のように修正できます：
//
//public class Sample {
//    public static void main(String[] args) {
//        Runnable r = () -> {
//            for (int cnt = 0; cnt < 10; cnt++) {
//                System.out.println(cnt);
//            }
//        };
//        new Thread(r).start();
//    }
//}
//
//この修正では、`cnt`をラムダ式内で宣言しています。
//これにより、`cnt`はラムダ式のスコープ内に限定され、外側のスコープの変数とは独立しています。
//この変更により、ラムダ式が実質的にfinalな変数の条件を満たし、コンパイルエラーが解消されます。
//また、ラムダ式内で`cnt`をインクリメントして出力する際に、`cnt++`ではなく`cnt`を出力するようにしています。
//これは、`cnt++`を使うと`cnt`の値が出力後にインクリメントされるため、意図した出力と異なる可能性があるからです。
//

//5.省略

//6.引数を受け取らず結果を戻すためのもの、
//Supplier
//引数を受け取らずに結果だけを戻すのでSupplier(供給者)という名前がついている。

//7.
//import java.util.function.*;
//
//public Main {
//	public static void main(String[] args) {
//		Function <String, Integer> func = (str) -> {
//			return Integer.parseInt(str);
//		};
//		System.out.println(func.apply("100") * 2);
//		}
////	}
//関数型インターフェースのFunctionに関する問題。


//このコードスニペットには、Javaでの`Function`インターフェースの使用例が示されていますが、少し修正が必要です。
//提供されたコードにはクラスの定義が不完全で、`Function`インターフェースのインポートが欠けています。
//`Function`は`java.util.function`パッケージの一部で、一つの引数を受け取り、結果を返す関数を表します。
//
//以下は修正されたバージョンのコードです：
//
//import java.util.function.Function;
//
//public class Main { // "class"キーワードを追加
//	public static void main(String[] args) {
//		Function<String, Integer> func = (str) -> {
//			return Integer.parseInt(str);
//		};
//		System.out.println(func.apply("100") * 2);
//	}
//}
//
//この修正では、以下の変更を加えました：
//
//1. `public class Main`の定義に`class`キーワードを追加しました。これはクラスを定義する際に必要です。
//2. `java.util.function.Function`インターフェースをインポートしました。
//これにより`Function`インターフェースをコード内で直接使用できるようになります。
//
//このコードは、文字列を整数に変換するラムダ式を定義し、それを使用して文字列"100"を整数に変換し、
//その結果に2を乗算して出力します。出力結果は`200`になります。
//


//第9章
//API

//1.省略
//2.省略

////3. 「3」「2」「1」と表示させる
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(new Integer[] {1,2,3});
//		list.sort((a, b) -> -a.compareTo(b));
//		for (Integer num : list) {
//			System.out.println(num);
//		}
//	}
//}
//
//このJavaプログラムは、リストを降順にソートして出力します。
//
//public class Main {
//    public static void main(String[] args) {
//        // Integer型のリストを作成し、初期値として1, 2, 3を設定します。
//        List<Integer> list = Arrays.asList(new Integer[] {1, 2, 3});
//        // ラムダ式を使って、リストの要素を降順にソートします。
//        // 比較関数として(a, b) -> -a.compareTo(b)を使用しています。
//        // これにより、自然順序の逆で要素がソートされます。
//        list.sort((a, b) -> -a.compareTo(b));
//        // 拡張forループを使って、ソートされたリストの各要素を出力します。
//        for (Integer num : list) {
//            System.out.println(num);
//        }
//    }
//}
//
//
//このプログラムは、次のように動作します。
//
//1. `Arrays.asList`メソッドを使用して、`Integer`オブジェクトのリストを作成します。このリストには初めに1, 2, 3が格納されています。
//2. `list.sort`メソッドを使い、ラムダ式`(a, b) -> -a.compareTo(b)`でリストの要素を降順にソートします。
//このラムダ式は、`a`と`b`の自然順序(`compareTo`メソッドによる比較結果)の逆を返すため、リストが降順にソートされます。
//3. 拡張forループ(`for (Integer num : list)`)を使って、
//ソートされたリストの要素を一つずつ取り出し、`System.out.println`メソッドで出力します。
//
//結果として、リストの要素が降順にソートされた状態で出力されるため、コンソールには`3 2 1`と表示されます。
//















//}