package kadai_026;


public class JyankenExec_Chapter26 {
	public static void main(String[] args) {
		
		//じゃんけんクラスのインスタンスを作成
	Jyanken_Chapter26 janken = new Jyanken_Chapter26();
	
	String myChoice = janken.getMyChoice(); // getMychoiceメソッドを実行し、自分のじゃんけんの手を入力
	String random = janken.getRandom(); // getRandomメソッドを実行し、相手のじゃんけんの手が乱数で選ばれる
	janken.playGame(myChoice, random); //playGameメソッドを実行し、じゃんけんを行う。自分と対戦相手のじゃんけんの手を引数として渡す
	
	
	
	
	
	}
}
	
	
