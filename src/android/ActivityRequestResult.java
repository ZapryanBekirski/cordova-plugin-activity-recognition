package cordova.plugin.activity.recognition;

import org.json.JSONObject;

public class ActivityRequestResult 
{
	public String ActivityType;
	public int Propability;
	
	public ActivityRequestResult()
	{
		ActivityType = "NoActivityYet";
		Propability = 0;
	}
	
	public JSONObject GetJSONObject()
	{
		JSONObject result = new JSONObject();
		obj.put("ActivityType", ActivityType);
		obj.put("Propability", Propability);
		return result;
	}
}