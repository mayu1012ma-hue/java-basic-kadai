package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	//英単語の辞書として機能する
	 HashMap<String, String> dictionary = new HashMap<String, String>();

	 //英単語と意味を追加
	 public Dictionary_Chapter21() {
		 
	 dictionary.put("apple","りんご");
	 dictionary.put("peach","桃");
	 dictionary.put("banana","バナナ");
	 dictionary.put("lemon","レモン");
	 dictionary.put("pear","梨");
	 dictionary.put("kiwi","キウィ");
	 dictionary.put("strawberry","いちご");
	 dictionary.put("grape","ぶどう");
	 dictionary.put("muscat","マスカット");
	 dictionary.put("cherry","さくらんぼ");
	 
	 }
	 
	 public String search(String[] words) {

	        String result = "";

	        for (String word : words) {

	            if (dictionary.containsKey(word)) {
	                result += word + "の意味は" + dictionary.get(word) + "\n";
	            } else {
	                result += word + "は辞書に存在しません\n";
	            }
	        }

	        return result;
	    }
}

