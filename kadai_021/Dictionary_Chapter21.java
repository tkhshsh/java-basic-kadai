package kadai_021;
//HashMapを取り込む
import java.util.HashMap;
public class Dictionary_Chapter21 {
	//メソッド作成　引数にExecクラスにある配列englishがある。返却値は設定していない
	//作り方の考え方としては、まず、メソッド作成し、
	//メソッドの中に辞書があり、拡張for文で配列（english）をループさせ
	//if文でその辞書に英単語（english）があれば（nullじゃなければ）和訳を表示させ
	//nullだったら、辞書に存在しませんと出力する
	//これらの処理をするメソッドを作る。
	//searchDictionaryメソッドに引数として配列Srring[] englishを入力している。配列englishは調べたい単語を入力したもの。execクラスで記入
	public void searchDictionary(String[] english) {
	
	//nullは『ない』って意味
		
	//辞書として機能するHashMapを宣言する。 //メソッド内に辞書を作成 
	HashMap<String,String> dic = new HashMap<String,String>();
	dic.put("apple","りんご");
	dic.put("peach","桃");
	dic.put("banana","バナナ");
	dic.put("lemon","レモン");
	dic.put("pear","梨");
	dic.put("kiwi","キウイ");
	dic.put("strawberry","いちご");
	dic.put("grape","ぶどう");
	dic.put("muscat","マスカット");
	dic.put("charry","さくらんぼ");

	/*
	//拡張for文でfruitsていうループ用変数名設定して、配列englishの中身を一個一個取り出して処理する
	for(String fruits : english) {
		//(キー（fruitsという変数にしている）を変数trunsにする
		String truns = dic.get(fruits);
		//もし変数truns(キー)があれば	
		if(truns != null) {
			// キーの意味はdic.get(fruits)で返された値（和訳）
			System.out.println(fruits +"の意味は" + dic.get(fruits));
		}else if(truns == null) {
			System.out.println(fruits + "は辞書に存在しません");
	*	}
	}*/
	//もしくは
	//拡張for文でfruitsていうループ用変数名設定して、配列englishの中身を一個一個取り出して処理する
	for(String fruits : english) {
		//配列englishの中身がdicにあれば、和訳を表示させ、なければないよと表示させる。
		if(dic.get(fruits) != null) { //dic.get(fruits)で valueを取得し、!= nullでvalueが辞書にあれば
			System.out.println(fruits + "の意味は" + dic.get(fruits));
		}else if(dic.get(fruits) == null) {
			System.out.println(fruits + "は辞書に存在しません");
		}
	}
	
	
		/*for(HashMap.Entry<String,String> entry : dic.entrySet()) {
			System.out.println(entry.getKey() + "の意味は" + entry.getValue());
		///System.out.println(entry.getKey()+ "は辞書に存在しません");
		*/	

	
	
	
	}
	}


		
	//for(int i = 0; i < dic.size(); i++);
//	if(i > dic.size()) {
//		System.out.println("は存在しません");
	
	//System.out.println(dic.containsKey("apple"));
	
	
