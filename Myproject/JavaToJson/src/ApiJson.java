import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ApiJson {

	public static void main(String[] args) throws JSONException {

		/*
		 {
   "results" : [
      {
         "address_components" : [
            {
               "long_name" : "Bhopal",
               "short_name" : "Bhopal",
               "types" : [ "locality", "political" ]
            },
            {
               "long_name" : "MP",
               "short_name" : "Bhopal",
               "types" : [ "administrative_area_level_2", "political" ]
            },
            {
               "long_name" : "Madhya Pradesh",
               "short_name" : "MP",
               "types" : [ "administrative_area_level_1", "political" ]
            },
            {
               "long_name" : "India",
               "short_name" : "IN",
               "types" : [ "country", "political" ]
            }
         ],
         "formatted_address" : "Bhopal, Madhya Pradesh, India",
         "geometry" : {
            "bounds" : {
               "northeast" : {
                  "lat" : 23.3326697,
                  "lng" : 77.5748062
               },
               "southwest" : {
                  "lat" : 23.0661497,
                  "lng" : 77.2369767
               }
            },
            "location" : {
               "lat" : 23.2599333,
               "lng" : 77.412615
            },
            "location_type" : "APPROXIMATE",
            "viewport" : {
               "northeast" : {
                  "lat" : 23.3326697,
                  "lng" : 77.5748062
               },
               "southwest" : {
                  "lat" : 23.0661497,
                  "lng" : 77.2369767
               }
            }
         },
         "place_id" : "ChIJvY_Wj49CfDkR-NRy1RZXFQI",
         "types" : [ "locality", "political" ]
      }
   ],
   "status" : "OK"
}
		 */

		String jsonT="{\"results\":[{\"address_components\":[{\"long_name\":\"Bhopal\",\"short_name\":\"Bhopal\",\"types\":[\"locality\",\"political\"]},{\"long_name\":\"Bhopal\",\"short_name\":\"Bhopal\",\"types\":[\"administrative_area_level_2\",\"political\"]},{\"long_name\":\"Madhya Pradesh\",\"short_name\":\"MP\",\"types\":[\"administrative_area_level_1\",\"political\"]},{\"long_name\":\"India\",\"short_name\":\"IN\",\"types\":[\"country\",\"political\"]}],\"formatted_address\":\"Bhopal, Madhya Pradesh, India\",\"geometry\":{\"bounds\":{\"northeast\":{\"lat\":23.3326697,\"lng\":77.5748062},\"southwest\":{\"lat\":23.0661497,\"lng\":77.2369767}},\"location\":{\"lat\":23.2599333,\"lng\":77.412615},\"location_type\":\"APPROXIMATE\",\"viewport\":{\"northeast\":{\"lat\":23.3326697,\"lng\":77.5748062},\"southwest\":{\"lat\":23.0661497,\"lng\":77.2369767}}},\"place_id\":\"ChIJvY_Wj49CfDkR-NRy1RZXFQI\",\"types\":[\"locality\",\"political\"]}],\"status\":\"OK\"}";
		
		JSONObject jsObj=new JSONObject(jsonT);

		//Getting results
		JSONArray result=jsObj.getJSONArray("results");
		System.out.println("Result is: "+result);
		System.out.println("------------------");

		//Getting address component
		JSONObject result1=result.getJSONObject(0);
		JSONArray add_comp=result1.getJSONArray("address_components");
		System.out.println("Address component is: ");
		System.out.println("----------------------------------------");
		System.out.println(add_comp);
		System.out.println("----------------------------------------");

		//Getting long_name,short_name,types in 0th object
		System.out.println("long_name,short_name,types in 0th object: ");
		System.out.println("----------------------------------------");
		JSONObject add_com_0=add_comp.getJSONObject(0);
		String long_name_0=add_com_0.getString("long_name");
		System.out.println("Long name in 0th location: "+long_name_0);

		String short_name_0=add_com_0.getString("short_name");
		System.out.println("Short name in 0th location: "+short_name_0);


		JSONArray types=add_com_0.getJSONArray("types");
		String value0_1=types.getString(0);
		System.out.println("0th index value in types: "+value0_1);

		String value0_2=types.getString(1);
		System.out.println("1st index value in types: "+value0_2);
		System.out.println("--------------------------");

		//Getting long_name,short_name,types in 1st object
		System.out.println("long_name,short_name,types in 1st object:");
		System.out.println("----------------------------------------");
		JSONObject add_com_1=add_comp.getJSONObject(1);
		String long_name_1=add_com_1.getString("long_name");
		System.out.println("Long name in 1st location: "+long_name_1);

		String short_name_1=add_com_1.getString("short_name");
		System.out.println("Short name in 1st location: "+short_name_1);


		JSONArray types_1=add_com_1.getJSONArray("types");
		String value1_1=types_1.getString(0);
		System.out.println("0th index value in types: "+value1_1);

		String value1_2=types.getString(1);
		System.out.println("1st index value in types: "+value1_2);
		System.out.println("--------------------------");

		//Getting long_name,short_name,types in 2nd object
		System.out.println("long_name,short_name,types in 2nd object:");
		System.out.println("----------------------------------------");
		JSONObject add_com_2=add_comp.getJSONObject(2);
		String long_name_2=add_com_2.getString("long_name");
		System.out.println("Long name in 2nd location: "+long_name_2);

		String short_name_2=add_com_2.getString("short_name");
		System.out.println("Short name in 2nd location: "+short_name_2);


		JSONArray types_2=add_com_2.getJSONArray("types");
		String value2_1=types_2.getString(0);
		System.out.println("0th index value in types: "+value2_1);

		String value2_2=types.getString(1);
		System.out.println("1st index value in types: "+value2_2);
		System.out.println("--------------------------");

		//Getting long_name,short_name,types in 3rd object
		System.out.println("long_name,short_name,types in 3rd object:");
		System.out.println("----------------------------------------");
		JSONObject add_com_3=add_comp.getJSONObject(3);
		String long_name_3=add_com_3.getString("long_name");
		System.out.println("Long name in 3rd location: "+long_name_3);

		String short_name_3=add_com_3.getString("short_name");
		System.out.println("Short name in 3rd location: "+short_name_3);

		JSONArray types_3=add_com_3.getJSONArray("types");
		String value3_1=types_3.getString(0);
		System.out.println("0th index value in types: "+value3_1);

		String value3_2=types.getString(1);
		System.out.println("1st index value in types: "+value3_2);
		System.out.println("--------------------------");

		//Getting formatted_address 
		System.out.println("formatted_address is:");
		System.out.println("---------------------");
		String formatted_address=result1.getString("formatted_address");
		System.out.println("Formatted address is: "+formatted_address);
		System.out.println("----------------------");
		
		
		//Getting geometry
		System.out.println("Geometry is ");
		System.out.println("------------");
		JSONObject geometry=result1.getJSONObject("geometry");
		System.out.println("geometry is : "+geometry);
		System.out.println("--------------");
		
		//Getting bounds
		System.out.println("Bounds");
		System.out.println("------");
		JSONObject bounds=geometry.getJSONObject("bounds");
		System.out.println(bounds);
		System.out.println("--------");
		
		//Getting northeast and southwest in bounds
		System.out.println("Northeast and southwest are");
		System.out.println("---------------------------");
		JSONObject northeast=bounds.getJSONObject("northeast");
		System.out.println("Northeast is: "+northeast);
		double lat=northeast.getDouble("lat");
		System.out.println("lat is: "+lat);
		double lng=northeast.getDouble("lng");
		System.out.println("lng is:" +lng);
		
		JSONObject southwest=bounds.getJSONObject("southwest");
		System.out.println("southwest is: "+southwest);
		double latS=southwest.getDouble("lat");
		System.out.println("lat is: "+latS);
		double lngS=southwest.getDouble("lng");
		System.out.println("lng is:" +lngS);
		System.out.println("------------------");
		
		//Getting location
		System.out.println("Location is ");
		System.out.println("------------");
		JSONObject location=geometry.getJSONObject("location");
		System.out.println(location);
		double latl=location.getDouble("lat");
		System.out.println("lat is: "+latl);
		double lngl=location.getDouble("lng");
		System.out.println("lat is: "+lngl);
		System.out.println("--------------------------");
		
		//getting location_type
		System.out.println("Location type is");
		System.out.println("----------------");
		String loc_type=geometry.getString("location_type");
		System.out.println(loc_type);
		System.out.println("--------------------------");
		
		//getting viewport
		System.out.println("Viewports");
		System.out.println("---------");
		JSONObject viewport=geometry.getJSONObject("viewport");
		System.out.println(viewport);
		System.out.println("--------------------------");
		
		//Getting Northeast and southwest
		System.out.println("Northeast and southwest are");
		System.out.println("---------------------------");
		JSONObject northeastView=viewport.getJSONObject("northeast");
		System.out.println("North east is:"+northeastView);
		double latV=northeastView.getDouble("lat");
		System.out.println("Lat is "+latV);
		double lngV=northeastView.getDouble("lng");
		System.out.println("lng is "+lngV);
		
		JSONObject southwestView=viewport.getJSONObject("southwest");
		System.out.println("south west is:"+southwestView);
		double latSV=southwestView.getDouble("lat");
		System.out.println("Lat is "+latSV);
		double lngSV=southwestView.getDouble("lng");
		System.out.println("lng is "+lngSV);
		System.out.println("--------------------------");
		
		
		//Getting place_id
		System.out.println("Place id is");
		System.out.println("-----------");
		String place_id=result1.getString("place_id");
		System.out.println(place_id);
		System.out.println("--------------------------");
		
		//Getting types
		System.out.println("Types");
		System.out.println("------");
		JSONArray type=result1.getJSONArray("types");
		System.out.println("type is " +type);
		String vlaueT1=type.getString(0);
		System.out.println("First value is: "+vlaueT1);
		String vlaueT2=type.getString(1);
		System.out.println("First value is: "+vlaueT2);
		System.out.println("--------------------------");
		
		//Getting status
		System.out.println("Status is");
		System.out.println("---------");
		String status=jsObj.getString("status");
		System.out.println(status);
		

	}
}
