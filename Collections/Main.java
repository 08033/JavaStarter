
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Logger.PrintMessage("-----------------------------------");
        Logger.PrintMessage("Enum: MyEnum");
        Logger.PrintMessage(MyEnum.green.toString());

        Logger.PrintMessage("------------------------------------");
        Logger.PrintMessage("ArrayList");
        ArrayList<Integer> schoolingLevel = new ArrayList<Integer>();
        for (int i = 1; i < 11; i++) {
            schoolingLevel.add(i);
        }
        Logger.PrintMessage("Schooling levels include:");
        schoolingLevel.forEach(x -> {
            Logger.PrintMessage(x.toString());
        });

        Logger.PrintMessage("Early years include:");
        for (Integer lev : schoolingLevel) {
            if (lev == 4) {
                break;
            }
            Logger.PrintMessage(lev.toString());
        }

        ArrayList<Document> myDocs = new ArrayList<Document>();
        Document doc1 = new Document("BSCS-Transcript", "PDF", 1024, "Academic");
        Document doc2 = new Document("MSCS-Transcript", "PDF", 2048, "Academic");
        Document doc3 = new Document("NadraCNIC", "PDF", 500, "ID");
        myDocs.add(doc1);
        myDocs.add(doc2);
        myDocs.add(doc3);
        Logger.PrintMessage("Documents:");
        for (Document d : myDocs) {
            Logger.PrintMessage(String.format("Title:%s; Type:%s; Size:%s; Category:%s", d.Title, d.Type, d.SizeInBytes, d.Category));
        }

        try {
            Logger.PrintMessage("--------------------------------------------");
            Logger.PrintMessage("HashMap");
            // int x = 1/0; //To check Exception handling
            HashMap<Integer, Document> myDocCollections = new HashMap<Integer, Document>();
            myDocCollections.put(1, doc1);
            myDocCollections.put(2, doc2);
            myDocCollections.put(3, doc3);
            for (Document dd : myDocCollections.values()) {
                Logger.PrintMessage("Document: " + dd.Title);
                Logger.PrintMessage(dd.Type);
                Logger.PrintMessage(dd.Category);
                Logger.PrintMessage(Integer.toString(dd.SizeInBytes));
            }
            // for (String i : capitalCities.keySet()) {
            //     System.out.println("key: " + i + " value: " + capitalCities.get(i));
            //   }
        } catch (Exception e) {
            System.out.println("Error occured:");                    
            System.out.println(e);            
        }
    }
}

enum MyEnum {
    red,
    yellow,
    green
}
