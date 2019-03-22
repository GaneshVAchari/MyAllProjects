package com.gva.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	
	private static ObjectMapper mapper;
	
	static
	{
		mapper=new ObjectMapper();
	}
	
	public static String convertJavaToJson(Object object)
	{
		String jsonResult="";
		try {
			jsonResult=mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			System.out.println("Exception occured while converting java object into json--->"+e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Exception occured while converting java object into json--->"+e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception occured while converting java object into json--->"+e.getMessage());
		}
		return jsonResult;
	}
	
	public static <T> T convertJsonToJava(String jsonString, Class<T> cls)
	{
		T result=null;
		try {
			result=mapper.readValue(jsonString, cls);
		} catch (JsonParseException e) {
			System.out.println("Exception occured while converting json into java object--->"+e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Exception occured while converting json into java object--->"+e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception occured while converting json into java object--->"+e.getMessage());
		}
		return result;
	}

}
