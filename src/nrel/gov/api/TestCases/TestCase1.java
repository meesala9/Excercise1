package nrel.gov.api.TestCases;

import java.util.List;

import com.google.gson.Gson;

import nrel.gov.api.get.ApiGetCall;
import nrel.gov.api.objects.FuelStation;
import nrel.gov.api.objects.StationLocation.Station;
import nrel.gov.api.objects.StationLocation.objStation;

public class TestCase1 {

	public static String ApiKey = "zH1sPJ21EGkhnHuB5MtAi9M3pQcLeqz7meWRrru3";
	protected static String Url = "https://developer.nrel.gov/api/alt-fuel-stations/v1/nearest.json?api_key="+ApiKey+"&location=Austin+TX&ev_network=ChargePoint+Network";
	public static String StationName = "HYATT AUSTIN";
	public static String Address = "208 Barton Springs, Austin, TX, 78704";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApiGetCall GetCall = new ApiGetCall();
		String strNearestStations = GetCall.GetCall(Url);		
		Gson gson = new Gson();
		FuelStation StationLocation = gson.fromJson(strNearestStations, FuelStation.class);
		
		List<Station> fuelStations= StationLocation.fuel_stations;
		int iCount;
		int stationId = 0;
		for(iCount=0;iCount<=fuelStations.size();iCount++){
			String tempStationName = fuelStations.get(iCount).station_name;
			if(tempStationName.equalsIgnoreCase(StationName)){
				stationId = fuelStations.get(iCount).id;
				break;
			}
		}

		//Validation of the address
		String validationCallUrl = "https://developer.nrel.gov/api/alt-fuel-stations/v1/"+stationId+".json?api_key="+ApiKey;
		String strStationObject = GetCall.GetCall(validationCallUrl);		
		objStation objStation = gson.fromJson(strStationObject, objStation.class);		
		String stationAddress = objStation.alt_fuel_station.street_address+", "+objStation.alt_fuel_station.city+", "+objStation.alt_fuel_station.state+", "+objStation.alt_fuel_station.zip;
		System.out.println("Station Address from the Query: "+stationAddress);
		System.out.println("Expected Station Address: "+Address);
		
		if(Address.equalsIgnoreCase(stationAddress)){
			System.out.println("Result: Address matched");
		}else{
			System.out.println("Result: Address didn't match");
		}
	}
}
