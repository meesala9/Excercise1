package nrel.gov.api.objects;

import java.util.List;
import nrel.gov.api.objects.StationLocation.Station;
import nrel.gov.api.objects.Location.*;

public class FuelStation {
		public double latitude;
	    public double longitude;
	    public Precision precision;
	    public String station_locator_url;
	    public int total_results;
	    public StationCounts station_counts;
	    public int offset;
	    public List<Station> fuel_stations;
}
