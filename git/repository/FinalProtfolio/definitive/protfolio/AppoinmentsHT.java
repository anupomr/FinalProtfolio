package definitive.protfolio;

import java.util.Hashtable;

public class AppoinmentsHT {
	

	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		  // Adding elements to the hashtable
        hashtable.put("Doctor Appoinment ", 121130);
        hashtable.put("Gurdian meeting", 211025);
        hashtable.put("Final Protfolio complition", 311159);
 
        // Getting values from the hashtable
        int valueA = hashtable.get("Final Protfolio complition");
        System.out.println("Final Protfolio complition time": " + valueA);
 
        // Removing elements from the hashtable
        hashtable.remove("Gurdian meeting");
 
        // Enumerating the elements of the hashtable
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }

	}

}
