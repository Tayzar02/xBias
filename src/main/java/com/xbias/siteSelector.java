package com.xbias;
import java.net.*;
import java.io.*;
/**
   * The method will return the search page result in a {@link String} object
   *
   * @param googleSearchQuery the google search query
   * @return the content as {@link String} object
   * @throws Exception
   */
public class siteSelector extends Main 
{
  final String agent = "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)";
  
  public void fox (String prompt) throws Exception
  {
    String foxsearch = ("https://google.com/search?q=" + prompt + "%20site:foxnews.com");
    URL foxurl = new URL(foxsearch);
    final URLConnection connection = foxurl.openConnection();
    connection.setRequestProperty("User-Agent", agent);
    final InputStream stream = connection.getInputStream();
    parseURL parse = new parseURL();
    System.out.println(parse.parseLinks(stream, "fox"));
  } 
  public void cnn (String prompt) throws Exception
  {
    String cnnsearch = ("https://google.com/search?q=" + prompt + "%20site:cnn.com");
    URL cnnurl = new URL(cnnsearch);
    final URLConnection connection = cnnurl.openConnection();
    connection.setRequestProperty("User-Agent", agent);
    final InputStream stream = connection.getInputStream();
    parseURL parse = new parseURL();
    System.out.println(parse.parseLinks(stream, "cnn"));
  }
  public void reuters (String prompt) throws Exception
  {
    String reuterssearch = ("https://google.com/search?q=" + prompt + "%20site:reuters.com");
    URL reutersurl = new URL(reuterssearch);
    final URLConnection connection = reutersurl.openConnection();
    connection.setRequestProperty("User-Agent", agent);
    final InputStream stream = connection.getInputStream();
    parseURL parse = new parseURL();
    System.out.println(parse.parseLinks(stream, "reuters"));
  }
  public void npr (String prompt) throws Exception
  {
    String nprsearch = ("https://google.com/search?q=" + prompt + "%20site:npr.org");
    URL nprurl = new URL(nprsearch);
    final URLConnection connection = nprurl.openConnection();
    connection.setRequestProperty("User-Agent", agent);
    final InputStream stream = connection.getInputStream();
    parseURL parse = new parseURL();
    System.out.println(parse.parseLinks(stream, "npr"));
  }
  public void ap (String prompt) throws Exception
  {
    String apsearch = ("https://google.com/search?q=" + prompt + "%20site:apnews.com");
    URL apurl = new URL(apsearch);
    final URLConnection connection = apurl.openConnection();
    connection.setRequestProperty("User-Agent", agent);
    final InputStream stream = connection.getInputStream();
    parseURL parse = new parseURL();
    System.out.println(parse.parseLinks(stream, "ap"));
  }
  public void nyt (String prompt) throws Exception
  {
    String nytsearch = ("https://google.com/search?q=" + prompt + "%20site:nytimes.com");
    URL nyturl = new URL(nytsearch);
    final URLConnection connection = nyturl.openConnection();
    connection.setRequestProperty("User-Agent", agent);
    final InputStream stream = connection.getInputStream();
    parseURL parse = new parseURL();
    System.out.println(parse.parseLinks(stream, "nyt"));
  }
  public void et (String prompt) throws Exception
  {
    String etsearch = ("https://google.com/search?q=" + prompt + "%20site:theepochtimes.com");
    URL eturl = new URL(etsearch);
    final URLConnection connection = eturl.openConnection();
    connection.setRequestProperty("User-Agent", agent);
    final InputStream stream = connection.getInputStream();
    parseURL parse = new parseURL();
    System.out.println(parse.parseLinks(stream, "et"));
  }
}