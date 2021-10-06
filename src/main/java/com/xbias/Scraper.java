///*
package com.xbias;
import org.jsoup.*;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.*;
import java.io.*;
import org.jsoup.select.*;
class Scraper
{
	public Document DownloadWebPage(String webpage) throws IOException
	{
        //Here we create a document object and use JSoup to fetch the website
        Document doc = Jsoup.connect(webpage).get();
    return doc;
  }
  public String scraper(String html, String id) throws IOException
  {
//Downloads the webpage so we're not hitting the page with a bunch of traffic (cuz that's mean)
    Document doc = DownloadWebPage(html);
//Converts the file to a string so we can parse it through compareBias	
		Element table = doc.getElementById(id);  //going to have to change this Id site to site, not everybody calls their id for the main body of the page wrapper....
		Elements rows = table.getElementsByTag("div");
    String parsedFile = "null";
		for (Element row : rows) {
			Elements tds = row.getElementsByTag("p");
			for (int i = 0; i < tds.size(); i++) 
      { 
        parsedFile += (tds.get(i).text());
			}
    }
    //System.out.println("Parsed File: " + parsedFile); //DEBUG: Prints parsed file
    return parsedFile;
  }
}
//*/