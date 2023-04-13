import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class crawling {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("http://amo.kma.go.kr/weather/airport.do?icaoCode=RKTU").get();

        Elements e1 = doc.getElementsByAttributeValue("class","wea_air_text");

        Elements e2 = doc.getElementsByAttributeValue("class", "wea_air_info");

        System.out.println(e1.text());
        System.out.println(e2.text());
    }
}