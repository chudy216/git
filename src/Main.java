import javax.swing.text.Document;
import javax.swing.text.Element;
import java.io.IOException;

import static sun.net.InetAddressCachePolicy.get;

public class Main {
    public static void main(String[] args) {
        Document doc = null;
        try {
            Object url;
            doc = Jsoup.connect( url: "https://www.zsmeie.torun.pl/glowna/index.php");
        }
        catch (IOException e) {
            e.printStackTrace(); }
        Element element1 = doc.getAllElements().get(2);
        System.out.println(element1.toString());
    }
}
