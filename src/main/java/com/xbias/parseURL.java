package com.xbias;
import org.jsoup.*;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.*;
import java.io.*;
import java.util.ArrayList;
import org.jsoup.select.Elements;
import java.util.Scanner;
class parseURL
{
  /**Parses all links in the google search, then returns the first element in the list from https://dev.to/itsshashank/how-to-parse-google-search-result-in-java-3303
   * @param html the page
   * @return the list with all URLSs
   * @throws Exception
   */
  public String parseLinks(InputStream html, String type) throws Exception 
  { 
    ArrayList<String> result = new ArrayList<String>();
    Document doc = Jsoup.parse(Convert_IS(html));
    Elements results = doc.select("a > h3");
    for (Element link : results) {
      Elements parent = link.parent().getAllElements();
      String relHref = parent.attr("href");
      if (relHref.startsWith("/url?q=")) {
        relHref = relHref.replace("/url?q=", "");
      }
      String[] splittedString = relHref.split("&sa=");
      if (splittedString.length > 1) {
        relHref = splittedString[0];
      }
      //prints relHref for debugging purposes
      //System.out.println(relHref);
      result.add(relHref);
      if (type.equals("fox"))
    {
      ArrayList<String> FoxResult = result;
      Scraper s = new Scraper();
      s.scraper(FoxResult.get(0), "wrapper");
      return FoxResult.get(0);
    }
  }
  if (type.equals("cnn"))
    {
      ArrayList<String> CnnResult = result;
      Scraper s = new Scraper();
      s.scraper(CnnResult.get(0), "body-text");
      return CnnResult.get(0);
    }
    if (type.equals("ap"))
    {
      ArrayList<String> apResult = result;
      Scraper s = new Scraper();
      s.scraper(apResult.get(0), "root");
      return apResult.get(0);
    }
    if (type.equals("Reuters"))
    {
      ArrayList<String> ReutersResult = result;
      Scraper s = new Scraper();
      s.scraper(ReutersResult.get(0), "paragraph");
      return ReutersResult.get(0);
    }
    if (type.equals("npr"))
    {
      ArrayList<String> NprResult = result;
      Scraper s = new Scraper();
      s.scraper(NprResult.get(0), "storytext");
      return NprResult.get(0);
    }
    if (type.equals("nyt"))
    {
      ArrayList<String> NytResult = result;
      Scraper s = new Scraper();
      s.scraper(NytResult.get(0), "site-content");
      return NytResult.get(0);
    }
    if (type.equals("et"))
    {
      ArrayList<String> EtResult = result;
      Scraper s = new Scraper();
      s.scraper(EtResult.get(0), "main");
      return EtResult.get(0);
    }
    else
    {
      return result.get(0);
    }
  }

public String Convert_IS(InputStream html) throws IOException
  { 
    Scanner sc = new Scanner(html);
    StringBuffer sb = new StringBuffer();
    while(sc.hasNext())
    {
      sb.append(sc.nextLine());
    }
    return(sb.toString());
  }
}