package test;

public class JavaSilverSE11_01 {
	public static void main(String[] args) {
	    System.out.println("こんにちは。");
		
		  

			//  第7章
			//  クラスの継承、インターフェース、抽象クラス
			//  ・クラスの継承
			//  ・インターフェース
			//  ・抽象クラスと具象クラス
			//  ・抽象メソッドの実装
			//  ・メソッドのオーバーライド
			//  ・ポリモーフィズム
			//  ・型の互換性、アップキャスト、ダウンキャスト
			//  ・thisの使用
			//  ・superの使用
			  
			  
			  //1.
			//  public class Child extends Parent {
			//   Child() {
//			    name = "Java";
			//   }
			//   void hello() {
//			    System.out.println("hello, " + name);
			//   }
			//  }
			  
			  //このクラスが継承しているParentクラスの説明として正しいもの
			  //⇨
			  //Parentクラスには、nameフィールドを定義しなければいけない。
			//  
			//  クラスの継承に関する問題。
			//  継承は、あるクラスを機能拡張した新しいクラスを定義すること。
			//  拡張元になるクラスのことを基底クラスやスーパークラス、
			//  拡張したクラスのことを派生クラスやサブクラスと呼ぶ。
			//  
			//  継承は生産性を向上させる強力なプログラミング手法。
			//  共通部分のプログラム⇨差分プログラミングと呼ぶ。
			////  
			//  ！　継承をすることでサブクラスはスーパークラスの特徴を引き継ぎます。
			//  サブクラスのインスタンスは、スーパークラスのインスタンスと
			//  差分のインスタンスの両方で構成されていることを理解しよう。
			  
			//  2. 継承の説明として正しいもの
			//  ⇨　サブクラスであってもコンストラクタは引き継ぎができない
			//  
			//  継承では何を引き継ぐかについて問う問題。
			//  下記の2つは継承していても引き継げない
			////  ・コンストラクタ
			////  ・privateなフィールドやメソッド
			//  
			//  privateなフィールドやメソッドは、アクセス修飾子privateで修飾され、
			//  同じクラスのインスタンス同志でしか使えない。
			//  
			//  デフォルトは「パッケージアクセス」とも呼ばれ、
			//  同じパッケージに属するクラスのインスタンスからのアクセスだけを許可するもの。
			//  継承関係でもスーパークラスとサブクラスのそれぞれが属するパッケージが異なれば
			//  アクセスできない。
			//  
			//  protectedは異なるパッケージであっても
			//  継承関係にあればアクセスを許可する
			//  というもの。
			//  
			//  ！　継承関係にあってもスーパークラスのコンストラクタと
			//  privateなフィールドやメソッドはサブクラスには引き継がれない。
			  
			//  3.インターフェースに関する説明として正しいもの。
			//  ⇨
			//  ・アクセス修飾子を省略してもpublicなメソッドとして扱われる
			//  ・抽象クラスは、インターフェースに定義されているメソッドを実現しなくてもよい
			//  
			//  解説；
			////  インターフェースの基礎知識を問う問題。
			//  インターフェースは、クラスから「型」だけを取り出したもの。
			//  型とはそのものの「扱い方」を決めるための情報
			//  変数を宣言する時に型を指定するのはその変数の扱い方を決めるため。
			//  注意すべきなのは扱う対象そのものの種類と型で指定する
			//  「扱う対象の種類」は異なる概念であること。
			//  インスタンスの種類と変数の型を分けて考えられるためポリモーフィズムが成り立つ。
			 
			//  インターフェースは他のクラスからの「扱い方」を規定したもの。
			//  他のクラスから扱えるようにするために規定する抽象メソッドは
			//  すべてpublicであると解釈される。
			//  アクセス修飾子を記述しなくてもインターフェースは
			//  コンパイルエラーによって自動的にpublicで修飾される。
			//  
			//  ！　インターフェースに宣言する抽象メソッドには、
			//  処理内容をいっさい記述することはできない。
			//  
			//  継承に関するルール
			//  ⇨　・クラス同士は単一継承のみ可能
//			  　　・インターフェース同士は多重継承が可能
			  
			  //4.
			//  public interface A {
			//   void sample() {
//			    System.out.println("sample");
			//   }
			//  }
			//  public class B implements A {
			//  
			//  }
			//  
			//  public class Main {
			//   public static void main(String[] args) {
//			    A a = new B();
//			    a.sample();
			//   }
			//  }
			//
			//  ⇨　インターフェースAのsampleメソッドをdefaultで修飾しなければいけない。
			//  解説；デフォルトメソッドに関する問題。
			//  インターフェースに定義されている抽象メソッドはそのインターフェースを
			//  実現したクラスが必ず実装しなければいけない。
			  
			  //5.結果として正しいもの
			//  public interface A {
			//   @Override
			//   default String toString() {
//			    return "A";
			//   }
			//  }
			//    
			//  public class B implements A {
			//   @Override
			//   public String toString() {
//			    return "B";
			//   }
			//  }
			//  
			//  public class Main {
			//   public static void main(String[] args) {
//			    A a = new B();
//			    System.out.println(a);
			//   }
			//  }
			//  ⇨　Aインターフェースでコンパイルエラーとなる。
			//  解説；　インターフェースに定義するデフォルトメソッドは、
			//  実現クラスが持つべきデフォルトの実装を定義するもの。
			//  Aインターフェースでjava.lang.Objectクラスに
			//  定義されているtoStringメソッドをデフォルトメソッドとして
			//  オーバーライドしているためコンパイルエラーが発生する。
			  
			  //6.省略
			  
			  //7.結果として正しいもの。
			//  public interface A {
			//   default void test() {
//			    System.out.println("A");
			//   }
			//  }
			//  public interface B {
			//   default void test() {
//			    System.out.println("B");
			//   }
			//  }
			//  public class Main implements A, B {
			//   public static void main(String[] args) {
//			    new Main().test();
			//   }
			//  }
			//  //→　コンパイルエラーが発生する。
			//  このコード例では、MainクラスがAインターフェースとBインターフェースの両方を実装していますが、
			//  両方のインターフェースにtestメソッドのデフォルト実装が存在します。
			//  Javaでは、同一のシグネチャを持つメソッドの複数のデフォルト実装を持つインターフェースを
			//  一つのクラスが実装しようとすると、どちらのデフォルトメソッドを使用すべきか
			//  Javaコンパイラが決定できないため、コンパイルエラーが発生します。
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
			//  javaでは２つ以上のクラスを同時に継承する多重継承が禁止されているが
			//  インターフェースの多重継承は可能。
			//  
			//  呼び出すデフォルトメソッドを特定する。
			//  public class Main implements A.B {
			//   public static void main(String[] args) {
//			    new Main().test();
			//   }
			//   @Override
			//   public void test() {
//			    A.super.test();
			//   }
			//  }
			//
			//  8.抽象クラスに関する説明として正しいもの。
			//  
			//  →　・インスタンスを生成することはできない。
//			  　　・サブクラスから抽象クラスの公開フィールドに自由にアクセスできる。
//			    　・抽象クラスを継承した抽象クラスを定義できる。
			//  
//			     解説；　抽象クラスの基礎知識を問う問題。
//			     ！　抽象クラスはインスタンス化できない。
//			     　　抽象メソッドは、具象クラスが実装しないといけない。
			  
			  //9.
			//  abstract class AbstractSample {
			//   public void sample() {
//			    System.out.println("A");
//			    test();
//			    System.out.println("C");
			//   }
			//   protected abstract void test();
			//  }
			//  class ConcreteSample extends AbstractSample {
			//   protected void test() {
//			    System.out.println("B");
			//   }
			//  }
			//  
			//  public class Main {
			//  public static void main(String[] args) {
			//   AbstractSample s = new ConcreteSample();
			//   s.sample();
			//  }
			// }
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
			//  解説；　メソッドのオーバーライドの基礎知識を問う問題。
			//  オーバーライドはサブクラスでスーパークラスに定義されたメソッドを
			//  「再定義」すること。
			//  「多重定義」を表すオーバーロードと間違えやすいので注意！！
			//  メソッドを再定義するため、メソッドのシグニチャ（メソッド名、引数リストの型、数、順番）は
			//  同じでないといけない。
			//  
			//  ！サブクラスでは、オーバーロードされたメソッドが使われる。
			  
			 
			//  メソッドをオーバーライドする際には、サブクラスでオーバーライドされるメソッドの
			//  シグネチャが、スーパークラスのメソッドシグネチャと完全に一致している必要があります。
			//  メソッドのシグネチャには、メソッド名と引数リストが含まれます。
			//  したがって、オーバーライドするメソッドでは、以下の条件が一致していなければなりません：
			//
			//  メソッド名：オーバーライドされるメソッドと同じ名前である必要があります。
			//  引数リスト：
			//  型：引数の型が全て同じである必要があります。
			//  数：引数の数が同じである必要があります。
			//  順番：引数の順番が同じである必要があります。
			//  これらの条件を満たすことで、サブクラスのメソッドはスーパークラスのメソッドを正しくオーバーライドすることができます。
			//  オーバーライドは、サブクラスがスーパークラスの特定の振る舞いを特定の方法で再定義したい場合に使用されます。
			//  また、オーバーライドするメソッドは、アクセス修飾子においても制限があります。
			//  例えば、スーパークラスのメソッドがprotectedである場合、サブクラスでオーバーライドするメソッドは
			//  protectedまたはそれよりもアクセス範囲が広い修飾子（public）を使用することができますが、
			//  より狭い範囲の修飾子（private）を使用することはできません。
			//  
			//  11.　以下のクラスを継承したサブクラスを定義する時
			//  hellpメソッドをオーバーライドしようとしている。
			//  サブクラスに定義するhelloメソッドに
			//  付けられるアクセス修飾子として正しいものは？
			//  public class Sample {
			//   protected void hello() {
//			    System.out.println("hello");
			//   }
			//  }
			//  ⇨　public
			//  オーバーライドには3つのルールがある。
			//  ・シグニチャが同じである。
			//  ・戻り値型は同じ型か、サブクラス型であること。
			//  ・アクセス修飾子は同じか、より緩いものを指定すること
			//  
			  //！オーバーライドしたメソッドは元の定義よりも
			  //アクセス制御を緩くすることはできるが厳しきはできない。
			  
			  //12.
			//  class A {
			//   String val = "A";
			//   void print() {
//			    System.out.print(val);
//			    }
			//  }
			//  
			//  class B extends A {
			//   String val = "B";
			//  }
			//  
			//  public class Main {
			//   public static void main(String[] args) {
//			    A a = new A();
//			    A b = new B();
//			    System.out.print(a.val);
//			    System.out.print(b.val);
//			    a.print();
//			    b.print();
			//   }
			  //}

			 //→　「AAAA」と表示される。
			 
			  //継承関係にある2つのクラスで同名のフィールドが使われている時どちらが優先されるかを問う問題。

			  
			//  このJavaプログラムは、クラスの継承とポリモーフィズムの基本的な概念を示しています。
			//  ここには3つのクラスが定義されています：`A`、`B`（`A`を継承）、そして`Main`クラス。
			//
			//  - `A`クラスには`val`という文字列変数があり、その値は`"A"`です。
			//  また、`print`メソッドがあり、`val`の値を出力します。
			//  - `B`クラスは`A`クラスを継承しており、自身の`val`変数を持っていますが、その値は`"B"`です。
			//  `B`クラスでは`print`メソッドをオーバーライドしていないため、`A`クラスの`print`メソッドを継承します。
			//
			//  `Main`クラスの`main`メソッドでは、以下の操作が行われます：
			//
			//  1. `A`型のオブジェクト`a`を作成し、`A`クラスのインスタンスを代入します。
			//  2. `A`型のオブジェクト`b`を作成し、`B`クラスのインスタンスを代入します。
			//  3. `a.val`と`b.val`を出力します。Javaでは、フィールド（変数）の参照は静的な型に基づくため、
			//  これらはそれぞれ`"A"`と`"A"`を出力します。
			//  `b`は`A`型として宣言されているため、`B`クラスの`val`ではなく、`A`クラスの`val`が参照されます。
			//  4. `a.print()`と`b.print()`を呼び出します。
			//  `print`メソッドは動的にバインドされるため（ランタイム時のオブジェクトの型に基づく）、
			//  `a.print()`は`"A"`を出力し、`b.print()`も`"A"`を出力します。
			//  これは、`b`が`B`のインスタンスであっても、`print`メソッドが`A`クラスの`val`フィールドを参照しているためです。
			//
			//  したがって、このプログラムの出力は次のようになります：
			//
			//  

			//  AAA
			//  

			//
			//  最初の2つの`A`は、`a.val`と`b.val`の出力です。
			//  後ろの2つの`A`は、`a.print()`と`b.print()`による出力です。
			//  
			  //13.結果として正しいもの。
			//  interface Worker {
			//   void work();
			//  }
			//  
			//  class Employee {
			//   public void work() {
//			    System.out.println("work");
			//   }
			//  }
			//  1. class Engineer extends Employee implements Worker { }
			//  
			//  public class Main {
			//   public static void main(String[] args) {
//			    Worker worker = new Engineer();
//			    worker.work();
			//   }
			//  }
			  
			  //→　「work」と表示される。
			  //インターフェースの実装に関する問題。
			  
			  //14.結果として正しいもの。
			//  public interface Worker {
			//   void work();
			//  }
			//  class Employee implements Worker {
			//   public void work() {
//			    System.out.println("report");
			//   }
			//   public void report() {
//			    System.out.println("report");
			//   }
			//  }
			//  class Engineer extends Employee {
			//   public void create() {
//			    System.out.println("create future");
			//   }
			//  }
			//  
			//  public class Main {
			//   public static void main(String[] args) {
//			    Worker a = new Engineer();
//			    Employee b = new Engineer();
//			    Employee c = new Engineer();
//			    a.create();
//			    b.work();
//			    c.report();
//			    }
			//   }
			// 
			//  →　Mainクラスの「 a.create();」ここでコンパイルエラーになる。
			//  
			  //ポリモーフィズムを使った問題。
			//  mainメソッドでは次にcreateメソッド、workメソッド、reportメソッドを呼び出している。
			//  変数aを使ってcreateメソッドを呼び出している。しかし、変数aはWorker型であり
			//  このインターフェースにはcreateメソッドが定義されていない。なのでそこでコンパイルエラーになる。
			//  
			//  ！　フィールドやメソッドの呼び出しは。変数で定義されたものしか使えない。
			//  ポリモーフィズムを使った問題では変数が何型かを確認するようにして。
			  
			  //15.実行結果として正しいもの。
			  
			//  1. public interface A { }
			//  1. public class B implements A { }
			//  1. public class C extends B { }
			//  1. public class D { }
			//  
			//  public class Main {
			//   public static void main(String[] args) {
//			    A[] array = {	
			
			
			
			
			
			
			
			
			
			
			
		
		
		
	}

}
