package interview.prep.javaprogramsolutions.Collection;

import java.util.HashMap;
import java.util.Map;

public class SearchKeyInHashMap {

	public void searchHashMapKey(int key) {
		Map<Integer, String> map = new HashMap<Integer, String>(); // How to
																	//create
																	// Map
																	// Collection
		map.put(100, "Shiva");
		map.put(102, "Shiva1");
		map.put(103, "Shiva2");
		map.put(104, "Shiva3");
		map.put(102, "Shiva4");
		// Iterate Map
		for (Map.Entry<Integer, String> mapEntry : map.entrySet()) {
			// System.out.println("Key : "+mapEntry.getKey()+" Value
			// :"+mapEntry.getValue());
			if (mapEntry.getKey() == key) {
				System.out.println("key matched and get the value : " + mapEntry.getValue()+ " : entered Value :" +mapEntry.getKey());

			}
		}
	}

	public static void main(String[] args) {
		SearchKeyInHashMap skihm = new SearchKeyInHashMap();
		skihm.searchHashMapKey(104);

	}

}
