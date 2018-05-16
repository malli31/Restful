package com.local.interview;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


//import javax.json.JsonArray;

public class ReadPath {

	public static void main(String[] args) {
		 Client client = ClientBuilder.newClient();
		// Response response = client.target("https://webfs-189109.appspot.com/api/fs?path=/").request().get();
		// System.out.println(response);
		 
		 WebTarget myResource = client.target("https://webfs-189109.appspot.com/api/fs?path=/");
		 PathModel p =  myResource.request(MediaType.APPLICATION_JSON).get(PathModel.class);
		 List<PathModel> pl=p.getChildren();
		 String path="";
		 for(PathModel m:pl){
			 path=path+m.getName()+"/";
		 }
		 System.out.println(path);
		

	}

}
