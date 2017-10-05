package org.comcast.excersice.database;

import java.util.HashMap;
import java.util.Map;

import org.comcast.excersice.model.Campaign;

public class Database {
	private static Map<Long,Campaign> campaign = new HashMap<Long,Campaign>();
	
public static Map<Long,Campaign> getAd()
{
	return campaign;
	
}
}
