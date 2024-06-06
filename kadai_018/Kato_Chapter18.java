package kadai_018;
//抽象クラス(抽象メソッドを持つため抽象クラスにする)
abstract public class Kato_Chapter18 {
	//フィールド名を定義し、初期値を宣言()
	public String familyName = "加藤";//姓を表す
	public String givenName = "";//名を表す
	public String address = "東京都中野区○×";//住所を表す
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		//メソッドで何をするかを書く（名前と住所を出力するのをかいた）
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
		
	}
	
	//個別の紹介を出力する抽象メソッド
	//abstractがある場合、子クラスに内容を書くので、ここでは内容を書かない
	abstract public void eachIntroduce();
	
	
	//紹介を実行するメソッド
	public void execIntroduce() {
		//execIntroduceで何を実行するかを書く
		//commonでは名前と住所を実行するよ。
		//eachの方ではそれぞれの紹介を出力するよ。
		commonIntroduce();//親クラスだから、メソッド名だけでOK
		eachIntroduce();//親クラスだから、メソッド名だけでOK
		//それぞれの紹介文の後に空行入れたいから、空白入れたよ。
		System.out.println(" ");
	}    
		
}
