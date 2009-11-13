package org.chris;
import org.json.*;

import com.google.gson.Gson;

public class TestJSON1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		jsonMethod();
		gsonMethod();
		// not quite sure why this is necessary for error-less debug
		System.exit(0);
	}
	
	private static void jsonMethod()
	{
		JSONObject jsonObj = new JSONObject();
		try {
			jsonObj.put("age", 24);
			System.out.println(jsonObj.get("age"));
			
			JSONObject obj=new JSONObject();
			obj.put("name","foo");
			obj.put("num",new Integer(100));
			obj.put("balance",new Double(1000.21));
			obj.put("is_vip",new Boolean(true));
			obj.put("nickname",null);
			System.out.println(obj);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void gsonMethod()
	{
		Gson gson = new Gson();
		BagOfPrimitives obj = new BagOfPrimitives();
		String json = gson.toJson(obj);
		System.out.println(json);
		//BagOfPrimitives obj2 = gson.fromJson(json, BagOfPrimitives.class);  
		//System.out.println(obj2.);
	}
}

class BagOfPrimitives {
	@SuppressWarnings("unused")
	private int value1 = 1;
	@SuppressWarnings("unused")
	private String value2 = "abc";
	@SuppressWarnings("unused")
	private transient int value3 = 3;
	BagOfPrimitives() {
	    // no-args constructor
	}
}
