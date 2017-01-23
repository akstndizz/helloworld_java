package com.test.daum_openapi_exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DaumOpenAPIExam {
	public static void main(String[] args) {
		String keyword = "신학기가방";
		try {
			keyword = URLEncoder.encode(keyword, "utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String urlString = "https://apis.daum.net/shopping/search?apikey=fe9e497096c7d1d2f287c32390b5eab1&q=" + keyword
				+ "&result=20&pageno=3&output=json&sort=min_price";
		StringBuffer sb = new StringBuffer();
		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			
			InputStreamReader ir = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(ir); // 보조 스트림
			String line;
			while ((line = br.readLine()) != null)
				sb.append(line);// line에 값 입력
			br.close();
			ir.close();
			conn.disconnect();
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
/////////////////////////////////////////////////////////
		try{
			JSONParser jsonParser=new JSONParser();
			JSONObject json=(JSONObject)jsonParser.parse(sb.toString());
			JSONObject channel=(JSONObject)json.get("channel");
			System.out.println(channel.get("result"));
			JSONArray items=(JSONArray)channel.get("item");
			System.out.println(items.size());
			
			for (int i=0; i<items.size();i++){
				JSONObject obj=(JSONObject)items.get(i);
				System.out.println(i+":"+obj.get("title")+","+obj.get("price_min")+","+obj.get("price_max"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}