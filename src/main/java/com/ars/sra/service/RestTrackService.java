package com.ars.sra.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import com.ars.sra.model.ProductDetailPojo;

public class RestTrackService {
	static Logger log = Logger.getLogger(RestTrackService.class.getName());
	@Autowired
	ProductDetailPojo productDetailPojo;

	public ProductDetailPojo processProductUrl(String productUrl) throws IOException {
		Document doc = Jsoup.connect(productUrl).get();  
        String title = doc.title(); 
        System.out.println("title is: " + title);  
        Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]"); 
        log.info(doc.select("div#price_feature_div").text());

		return productDetailPojo;

	}
}
