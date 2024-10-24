import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class hashmap {

    public static void main(String[] args) {
        HashMap<String, String> mydetails = new HashMap<String, String>();
        // adding elements to the map
        mydetails.put("FirstName", "Kajal");
        mydetails.put("lastName", "Gole");
        mydetails.put("PhoneNumber", "7906437277");
        mydetails.put("Password", "Kajalgole@123");
        mydetails.put("DOB", "21/04/2000");


        //----------------using keySet() to get the set view of keys-----------------

        //  Set<String> keys = mydetails.keySet();
        // for (String key : keys) {
        //     // printing each value
        //     System.out.println(key);
        //      System.out.println(key + " : " + mydetails.get(key));
        // }


        // System.out.println(mydetails);
        // System.out.println(mydetails.get("FirstName"));
        // System.out.println(mydetails.get("surName"));

        // --------- using values() to get the set view of values ----------
        // Collection<String> values = mydetails.values();
        // System.out.println(values);

        // // for each loop access each value from the view

        // for (String value : values) {
        //     // printing each value
        //     System.out.println(value);
        // }
         

        // -------------using EntrySet ---------- 
        //  using entryset() to get the set view of entrys
        Set<Entry<String, String >> entrys = mydetails.entrySet();

        for(Entry<String, String > entry : entrys ){
    //    ---- set value is setting value of each key to kjl -----
        String setvalue = entry.setValue("xyz");
            // System.out.println(entry);

            
            System.out.println(entry.getKey());
            // System.out.println(entry.getValue());
        }
        System.out.println(mydetails);
        
    }
}
