package org.comcast.excersice.campaigns;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.comcast.excersice.database.Database;
import org.comcast.excersice.model.Campaign;
import org.comcast.excersice.model.Response;
import org.comcast.excersice.service.CampaignService;
import org.comcast.excersice.validate.NotActiveException;
import org.comcast.excersice.validate.NotFoundException;


@Path("ad")
public class ResourceCampaign {

	CampaignService campaignservice = new CampaignService();
	private static Map<Long,Campaign> campaigns = new HashMap<Long,Campaign>();
	private Map<Long,Campaign> ad = Database.getAd();
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Campaign campaign)
	{
		campaign.setCurrentime(System.currentTimeMillis());
		Response response = new Response();
		
		if(ad.get(campaign.getPartner_id())!= null)
				{
			
			response.setStatus(false);
			response.setMessage("Partner_id already exist");
			return response;
			
				}
		
		ad.put(campaign.getPartner_id(),campaign);
		response.setStatus(true);
		response.setMessage("Ad is created sussceffully");
		//campaignservice.addAd(campaign);
		return response;
		
	}
	
	
	@GET
	@Path("/{partner_id}")
	@Produces(MediaType.APPLICATION_JSON)	
	public Campaign ad(@PathParam("partner_id") long id ) throws NotActiveException, NotFoundException
	{
		
	
	return campaignservice.getAdById(id);
			
	
	}
	
	
	
}
