import java.util.*;

public class ShoeMap{
	public static void main (String[] args) {
		Map <String,String> shoeMap =new HashMap<String,String>();
		shoeMap.put("Heels", "Lilly");
		shoeMap.put("Flats", "Lilly");
		shoeMap.put("Sneakers", "Adidas");
		shoeMap.put("Oxfords", "Adidas");
		shoeMap.put("Dress", "Stella");
		shoeMap.put("Slippers", "Stella");
		shoeMap.put("Ballet", "Ballie");
		shoeMap.put("Sandels", "Ballie");
		shoeMap.put("Tennis", "Nike");
		shoeMap.put("Cleats", "Nike");
		//takes the keys and puts them in ArrayList
		List<String> sortedKeys = new ArrayList<>(shoeMap.keySet());
		//Sorts arraylist of keys 
		//System.out.print(sortedKeys);
        Collections.sort(sortedKeys);
        //System.out.print(sortedKeys);

        // prints out sorted map by  key
        for (String key : sortedKeys) {
        	//retrieves the value of the key(the keys are already in alphabetic order
            String manufacturer = shoeMap.get(key);
            System.out.println(key + " ----> " + manufacturer);
        }
    }

	}
