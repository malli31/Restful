package com.local.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetIP {

	public static void main(String[] args) {
		URL url;
		
		try{
			url = new URL("https://www.ip2location.com/");
			URLConnection conn= url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String input;
		
		while((input=br.readLine())!=null){
			//if(input.contains("IP Address")){
			if(input.contains("ipAddress")&&input.contains("value")){
				int length=input.length();
				String ip=input.substring(input.indexOf("value")+6,length-1);
				
				System.out.println(ip);
			}
		}
		

	}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}


