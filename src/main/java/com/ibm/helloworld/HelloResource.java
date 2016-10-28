package com.ibm.helloworld;
import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ibm.json.java.JSONObject;

@Path("/hello")
public class HelloResource {

	@GET
	@Produces("application/json")
	public String getInformation() throws Exception, IOException {
        JSONObject myJSONObj = new JSONObject();
        myJSONObj.put("message", "Hello World!");
        return myJSONObj.toString();
        
	}
}