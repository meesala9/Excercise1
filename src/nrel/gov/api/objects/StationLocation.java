package nrel.gov.api.objects;

import java.util.Date;
import java.util.List;

public class StationLocation extends Location{

	public class Station
	{
	    public String access_days_time;
	    public String cards_accepted;
	    public String date_last_confirmed;
	    public String expected_date;
	    public String fuel_type_code;
	    public int id;
	    public String groups_with_access_code;
	    public String open_date;
	    public String owner_type_code;
	    public String status_code;
	    public String station_name;
	    public String station_phone;
	    public Date updated_at;
	    public String geocode_status;
	    public double latitude;
	    public double longitude;
	    public String city;
	    public String intersection_directions;
	    public String plus4;
	    public String state;
	    public String street_address;
	    public String zip;
	    public String bd_blends;
	    public String e85_blender_pump;
	    public List<String> ev_connector_types;
	    public String ev_dc_fast_num;
	    public String ev_level1_evse_num;
	    public int ev_level2_evse_num;
	    public String ev_network;
	    public String ev_network_web;
	    public String ev_other_evse;
	    public String hy_status_link;
	    public String lpg_primary;
	    public String ng_fill_type_code;
	    public String ng_psi;
	    public String ng_vehicle_class;
	    public EvNetworkIds ev_network_ids;
	}

	public class objStation
	{
	    public Station alt_fuel_station;
	}

}
