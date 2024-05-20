                            package kadai_015;
	
public class Car_Chapter15 {	
	//フィールド作成
	private int gear = 1;			
	private int speed = 10;

	//Car_Chapter15 Car = new Car_Chapter15(1, 10); //これはCarExecで使う
	/*
	
		//メソッド作成　　メソッド名　　（）内は引数の宣言
	public void gearChange(int afterGear) {  // gearChangeというメソッドに引数afterGearを宣言
		gearChange(afterGear);// メソッドの戻り値（以降の処理え繰り返し使いたいので変数に代入している）
		//ギアの値により速度を変えたい
		this.speed = afterGear;
		
		if(1 == afterGear) {
			speed = 10;
		}else if(2 == afterGear) {
			speed = 20;
		}else if(3 == afterGear) {
			speed = 30;
		}else if(4 == afterGear) {
			speed = 40;
		}else if(5 == afterGear) {
			speed = 50;
		}else;
		gearChange(3);
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
	}                 
	
	//ギアチェンジ後の速度を表示させるメソッドを作りたい
	public void run() {	
		gearChange(3);
		System.out.println("速度は時速" speed + "kmです");
	}
	
	
	}
*/

public void gearChange(int afterGear) {

	System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");

	this.gear = afterGear;
	
	if(1 == afterGear) {
		this.speed = 10;
	}else if(2 == afterGear) {
		this.speed = 20;
	}else if(3 == afterGear) {
		this.speed = 30;
	}else if(4 == afterGear) {
		this.speed = 40;
	}else if(5 == afterGear) {
		this.speed = 50;
	}else {
		this.speed = 10;
	}
	
}

public void run() {	
	System.out.println("速度は時速" + this.speed + "kmです");
}
}
