package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		//インスタンス
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//調べる単語入力
		String[] words = {"apple", "banana", "grape","orange"};

		System.out.println(dictionary.search(words));
	}

}
