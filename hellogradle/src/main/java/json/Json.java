package json;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class Json {
	public static void main(String[] args) {
		//JSONObject();
		readJSONFromFile();
	}

	private static void JSONObject() {
		JSONObject jo = new JSONObject();
		try {
			jo.accumulate("name", "吉尔");
			jo.accumulate("name", "克莱尔");
			jo.accumulate("age", 21);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	private static void readJSONFromFile(){
		File file = new File(Json.class.getResource("/json.json").getFile());
		String content;
		try {
			content = FileUtils.readFileToString(file);
			JSONObject jo = new JSONObject(content);
			System.out.println(jo.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
//	{
//		"name" : "汪小二",
//		"age" : 25.2,
//		"birthday" : "1990-01-01",
//		"scholl" : "MAT",
//		"major"  :["CS","GS"],
//		"has_girlfriend" : false,
//		"car" : null,
//		"house" : null,
//		"comment" : "这是一个注释"
//	}
}
