import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class ParseSite {
	
	private String URL_Str;
	
	ParseSite(String URL_Str){
		this.URL_Str = URL_Str;

	}
	
	public ArrayList<String> getLinks(){
		ArrayList<String> links = new ArrayList<String>();
		try {
			Document doc = Jsoup.connect(URL_Str).get();
			Elements linksElem = doc.select("p");
			//Elements linksElem = doc.getElementsByClass("div");
			
			for(Element elem : linksElem){
				links.add(elem.text());
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return links;
	}
	
	

}
