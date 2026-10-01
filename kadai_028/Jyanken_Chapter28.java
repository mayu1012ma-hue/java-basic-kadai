package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	//自分のじゃんけんの手を入力する
	public String getMyChoice(){
		
		Scanner scanner = new Scanner(System.in);
		
		
		//任意のじゃんけんの手を入手
		 System.out.println("自分のじゃんけんの手を入力しましょう");
		 
		 //じゃんけん説明
		 System.out.println("グーはrockのrを入力しましょう");
		 System.out.println("チョキはscissorsのsを入力しましょう");
		 System.out.println("パーはpaperのpを入力しましょう");
		 
		//入力した内容を取得する
		 String input= scanner.next();
	      //正しいじゃんけんの手であるか判断
	      if(input.equals("r") || input.equals("s") || input.equals("p")) {
	    	  scanner.close();
	    	  return input;
	      }else {
	    	  System.out.println("入力エラーです");
	    	  scanner.close();
	    	  return null;
	      }
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom(){
		//配列にじゃんけんの手をセット
		String[] randomList = {"r","s","p"};
		
		//乱数で相手のじゃんけんを決める
		int index = (int)Math.floor(Math.random() * 3);
		return randomList[index];
	}
	
	//じゃんけんを行う
	public void playGame() {
		HashMap<String,String> humanMap = new HashMap<String,String>();
		
		//キー追加
		humanMap.put("r","グー");
		humanMap.put("s","チョキ");
		humanMap.put("p","パー");
		
		
		 String myChoice = getMyChoice();
		 String enemyChoice = getRandom();
		 
		//自分と対戦相手のじゃんけんの手を出力
		System.out.println( "自分の手は"+  humanMap.get(myChoice) + ",対戦相手の手は" + humanMap.get(enemyChoice));
		
		//自分と対戦相手のじゃんけんの手の比較
		if(myChoice.equals(enemyChoice)){
			System.out.println("あいこです");
		}else if((myChoice.equals("r") && enemyChoice.equals("s") )
				|| (myChoice.equals("s") && enemyChoice.equals("p") )
				||( myChoice.equals("p") && enemyChoice.equals("r")) ){
			
			System.out.println("自分の勝ちです");
		}else {
			 System.out.println("自分の負けです");
		}
		
	}
	
}












