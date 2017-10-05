package org.comcast.excersice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.comcast.excersice.database.Database;
import org.comcast.excersice.model.Campaign;
import org.comcast.excersice.validate.NotActiveException;
import org.comcast.excersice.validate.NotFoundException;




public class CampaignService {
	private Map<Long,Campaign> ad = Database.getAd();
	
	
	Campaign campaign = new Campaign();
	long currentime;
	
	public Campaign getAdById(long id) throws NotActiveException, NotFoundException 
	{
		 currentime = System.currentTimeMillis();
	System.out.println("currentime = "+ currentime);	
	
		
		campaign =  ad.get(id);
		if(campaign == null)
		{
			throw new NotFoundException("id not found");
		}
	
		if(ad.get(campaign.getPartner_id())!= null)
		{
		if((campaign.getCurrentime()+campaign.getDuration())<currentime)
		{	
			System.out.println(campaign.getCurrentime()+campaign.getDuration());
			System.out.println(currentime);
			System.out.println(campaign.getCurrentime());
			
			System.out.println(campaign.getDuration());
			
			System.out.println(currentime - (campaign.getCurrentime()+campaign.getDuration()));
				
			throw new NotActiveException("partner_id is not Active");
		}
		}
		return ad.get(id);
	}
	public List<Campaign> getAllAd()
	{
		return new ArrayList<Campaign>(ad.values());
	}
	
	public Campaign addAd(Campaign campaign)
	{
		
		ad.put(campaign.getPartner_id(), campaign);
		return campaign;	
	}

}
