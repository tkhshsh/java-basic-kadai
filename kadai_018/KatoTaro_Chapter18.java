package kadai_018;
//親クラスからの継承
public class KatoTaro_Chapter18 extends Kato_Chapter18{
	//名前を設定するメソッド
	public void setGivenName() {//名を表すフィールドの値をセットする
		//givenNameというフィールドに太郎という名前を宣言。
		givenName = "太郎";
	}

	//抽象メソッド
	public void eachIntroduce() {
		// 抽象メソッドは子クラスに具体的な処理を書く
		System.out.println("私はJavaが得意です");
	}
	
}
