import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NestedJson {

	public static void main(String[] args) throws JSONException {

		String jsonText="{\"results\":[{\"address_components\":[{\"long_name\":\"277\",\"short_name\":\"277\",\"types\":[\"street_number\"]},{\"long_name\":\"Bedford Avenue\",\"short_name\":\"Bedford Ave\",\"types\":[\"route\"]},{\"long_name\":\"Williamsburg\",\"short_name\":\"Williamsburg\",\"types\":[\"neighborhood\",\"political\"]},{\"long_name\":\"Brooklyn\",\"short_name\":\"Brooklyn\",\"types\":[\"sublocality\",\"political\"]},{\"long_name\":\"Kings\",\"short_name\":\"Kings\",\"types\":[\"administrative_area_level_2\",\"political\"]},{\"long_name\":\"New York\",\"short_name\":\"NY\",\"types\":[\"administrative_area_level_1\",\"political\"]},{\"long_name\":\"United States\",\"short_name\":\"US\",\"types\":[\"country\",\"political\"]},{\"long_name\":\"11211\",\"short_name\":\"11211\",\"types\":[\"postal_code\"]}],\"formatted_address\":\"277 Bedford Avenue, Brooklyn, NY 11211, USA\",\"geometry\":{\"location\":{\"lat\":40.714232,\"lng\":-73.9612889},\"location_type\":\"ROOFTOP\",\"viewport\":{\"northeast\":{\"lat\":40.7155809802915,\"lng\":-73.9599399197085},\"southwest\":{\"lat\":40.7128830197085,\"lng\":-73.96263788029151}}},\"place_id\":\"ChIJd8BlQ2BZwokRAFUEcm_qrcA\",\"types\":[\"street_address\"]},],\"status\":\"OK\"}";
		JSONObject obj_jsonobject=new JSONObject(jsonText);
		JSONArray obj_jsonArray=obj_jsonobject.getJSONArray("results");
		System.out.println("Object array is now: "+obj_jsonArray);
		System.out.println("Length is :"+obj_jsonArray.length());
		JSONObject obj1_jsonObject=obj_jsonArray.getJSONObject(0);
		System.out.println("Element 0"+obj1_jsonObject);
		
		JSONArray address_components_array=obj1_jsonObject.getJSONArray("address_components");
		System.out.println("address component " +address_components_array);
		
		JSONObject obj12_jsonObject=address_components_array.getJSONObject(0);
		System.out.println(obj12_jsonObject);
		System.out.println("Short name: "+obj12_jsonObject.getString("short_name"));
		System.out.println("Long name: "+obj12_jsonObject.getString("long_name"));
		
		
	}

}
