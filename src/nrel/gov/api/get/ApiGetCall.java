package nrel.gov.api.get;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiGetCall {
	public String GetCall(String URL){
		String Url = URL;
		String strOutput = null;
		  try {
			URL url = new URL(Url);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));
			//assign the output to a string
			while ((strOutput = br.readLine()) != null) {
				return strOutput;
			}
			conn.disconnect();
		  } catch (MalformedURLException e) {
			  e.printStackTrace();
		  } catch (IOException e) {
			  e.printStackTrace();
	  }
		return strOutput;
	}
}