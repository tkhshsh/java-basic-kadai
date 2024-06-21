package kadai_021;
public class DictionaryExec_Chapter21 {
	//継承
	public class Dicrionary_Chapter21 extends DictionaryExec_Chapter21{
	public static void main(String[] args) {
		//インスタンス化しdictionary作る
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
	
	//配列を宣言
	String[] english = {"apple", "banana", "grape", "orange"};
	//メソッドを実行数する、配列englishを引数に渡してsearchDictionaryメソッドを実行する	
	dictionary.searchDictionary(english);
	
}
	}
}
