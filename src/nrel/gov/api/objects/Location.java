package nrel.gov.api.objects;

import java.util.List;


public class Location {
	public class Precision
	{
	    public String name;
	    public List<String> types;
	    public int value;
	}

	public class E85
	{
	    public int total;
	}

	public class Stations
	{
	    public int total;
	}

	public class ELEC
	{
	    public int total;
	    public Stations stations;
	}

	public class HY
	{
	    public int total;
	}

	public class LNG
	{
	    public int total;
	}

	public class BD
	{
	    public int total;
	}

	public class CNG
	{
	    public int total;
	}

	public class LPG
	{
	    public int total;
	}

	public class Fuels
	{
	    public E85 e85;
	    public ELEC eLEC;
	    public HY hY;
	    public LNG lNG;
	    public BD bD;
	    public CNG cNG;
	    public LPG lPG;
	}

	public class StationCounts
	{
	    public int total;
	    public Fuels fuels;
	}
	public class EvNetworkIds
	{
	    public List<String> posts;
	}
}
