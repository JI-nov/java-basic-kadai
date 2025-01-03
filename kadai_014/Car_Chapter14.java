package kadai_014;

public class Car_Chapter14 {
	
	    private int gear = 1; // 1速から5速のギアを表す
	    private int speed = 10; // ギアチェンジ後の速度を表す
	    
	    // コンストラクタ（初期化処理）
	    public Car_Chapter14() {
	        // ここが修正点です。コンストラクタは中身が空でも{}を加える必要があります。
	    }
	    
	    // ギアの値により速度を変える
	    public void gearChange(int afterGear) {	   
	    	  System.out.println("ギア"+this.gear+"から" +  afterGear + "に切り替えました");
	        this.gear = afterGear;
	        switch(this.gear) {
	            case 1 -> this.speed = 10;
	            case 2 -> this.speed = 20;
	            case 3 -> this.speed = 30;
	            case 4 -> this.speed = 40;
	            case 5 -> this.speed = 50;
	            default -> this.speed = 10;
	        }
	    }
	    
	    // ギアチェンジ後の速度を表示する
	    public void run() {
	        System.out.println("速度は時速" + this.speed + "kmです");
	    }
	}

	
	
	
	


