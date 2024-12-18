package kadai_008;

public class Price_Chapter08 {
	public static void main(String[] args) {
		// 年代
		int userAge = 30;
		// サービスの使用料金
		int serviceCost = 0;

		   if (userAge >= 30 && userAge <= 39) {
            serviceCost = 3000;
        } else if (userAge >= 40 && userAge <= 49) {
            serviceCost = 4000;
        } else if (userAge >= 50 && userAge <= 59) {
            serviceCost = 5000;
        } else {
            serviceCost = 500;
        }
		   
		// 料金を表示
System.out.println(userAge);
    System.out.println(serviceCost);
		
		
	
	}
}
