///*
import org.jsoup.*;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.*;
import java.net.*;
import java.io.*;
import org.jsoup.select.*;
import org.jsoup.helper.*;
import java.net.URL;
import java.net.MalformedURLException;
class Scraper
{
	public Document DownloadWebPage(String webpage) throws IOException
	{
	  try {
        //Here we create a document object and use JSoup to fetch the website
        Document doc = Jsoup.connect(webpage).get(); 
        //In case of any IO errors, we want the messages written to the console
    }
     catch (IOException e) 
     {
       e.printStackTrace();
     }
    return doc;
	}
  public String scraper(String html)
  {
//Downloads the webpage so we're not hitting the page with a bunch of traffic (cuz that's mean)
    Document doc = DownloadWebPage(html);
//Converts the file to a string so we can parse it through compareBias	
    String parsedFile = " ";
		Element table = doc.getElementById("datatable");
		Elements rows = table.getElementsByTag("TR");
		for (Element row : rows) {
			Elements tds = row.getElementsByTag("TD");
			for (int i = 0; i < tds.size(); i++) 
      { 
        parsedFile = (tds.get(i).text());
        System.out.println(parsedFile);
			}
    }
    return parsedFile;
  }
}
//*/