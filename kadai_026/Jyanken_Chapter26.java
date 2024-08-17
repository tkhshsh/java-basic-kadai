package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//自分のじゃんけんの手を入力するメソッドを作成していく
	public String getMyChoice() {
		//Sccanerクラスのオブジェクトを生成する(System.inは標準入力（キーボートなどからの入力装置からの入力のこと）を示しています)
		Scanner scanner = new Scanner(System.in);
		
		//自分のじゃんけんの手は、正しいじゃんけんの手が入力されるまでループします。
		//このため、自分のじゃんけんの手を入力する処理を、while(true){}で囲みます。
		while(true) {
			//入力処理方法を以下のように出力する
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはsissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			//入力した内容を取得する(nextは区切り文字までの入力を取得する（空白）)
			String choice = scanner.next();
			
			//入力した内容がrspのいずれでもない場合、エラーを出力し、再度自分のじゃんけんの手を選びます。
			//!はtrueの場合にfalse、falseの場合にtrueとする意味
			//下の場合はchoiceがr,s,pと一緒じゃなかったらということ
			if(!(choice.equals("r") || choice.equals("s") || choice.equals("p"))) {
				//正しいじゃんけんの手でない場合
				System.out.println("グーのr、チョキのs、パーのpのどれかを入力してください");
				continue; //繰り返し処理の途中で中断し、次のループに進む命令。
				//ここでは、もし入力した内容を取得した値がr、s、pのいずれかとも一緒じゃなかった時に
				//グーのr、〜のどれかを入力してくださいを出力し、自分のじゃんけんの手をループさせる。
			//入力した内容がr、s、pのいずれかの場合、Scannerクラスのオブジェクトをクローズします。
			//そして、自分のじゃんけんの手を返します。
			} else {
				scanner.close();
				//自分のじゃんけんの手を返す
				return choice;
			}
		}
	}
	
	//対戦相手のじゃんけんの手が乱数で選ばれる
	public String getRandom() {
		//配列にじゃんけんの手であるr、s、pをセットする
		String[] janken = {"r","s","p"}; //配列は要素数０から始まる
		//乱数で対戦相手のじゃんけんの手を選ぶ
		//乱数を使い、配列にセットした要素の中でランダムな要素の値を取得する
		//乱数で取得した３未満の数をfloor()メソッドで切り捨て(小数点を切り捨てるから)、配列の要素数である0〜２を取得する
		String choice = janken[(int) Math.floor(Math.random()*3)];
		//取得した配列の要素の値を、対戦相手のじゃんけんの手として返します
		return choice;
	}
	
	//じゃんけんを行う。引数としてこのメソッド内ではmyChoiceとrandomを作ってます。
	public void playGame(String myChoice, String random) {
		String result = "";
		
		//引数で渡されるrかsかpを、グーかチョキかパーに変換して出力するために、HashMapを作ります。
		//HashMapのキーがr,s,pで、値がグー、チョキ、パーです。
		HashMap<String,String> janken = new HashMap<>();
		janken.put("r","グー");
		janken.put("s","チョキ");
		janken.put("p","パー");
		
		//自分と対戦相手のじゃんけんの手を出力。引数で渡されたHashMapのキーを、HashMapの値に変換して出力する
		System.out.println("自分の手は" + janken.get(myChoice) + "対戦相手の手は" + janken.get(random));
		
		//自分と対戦相手のじゃんけんの手を比較する
		if((myChoice.equals("r") && random.equals("s"))  //もし自分の手がrかつ相手の手がs
				|| (myChoice.equals("s") && random.equals("p")) //または、自分の手がsかつ相手の手がp
				|| (myChoice.equals("p") && random.equals("r"))) { //または、自分の手がpかつ相手の手がrなら 
				result = "自分の勝ちです";
		} else if ((myChoice.equals("r") && random.equals("p"))
				|| (myChoice.equals("s") && random.equals("r"))
				|| (myChoice.equals("p") && random.equals("s"))) {
				result = "自分の負けです";
			} else {
				result = "あいこです";
		}
		//じゃんけんの結果を出力する
		System.out.println(result);
	}
	
	
}