package org.comcast.excersice.model;

public class Campaign {
	private long partner_id;
	private long duration;
	private String ad_content;
	private long currentime;
	private String error;
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public long getCurrentime() {
		return currentime;
	}
	public void setCurrentime(long currentime) {
		this.currentime = currentime;
	}
	public long getPartner_id() {
		return partner_id;
	}
	public void setPartner_id(long partner_id) {
		this.partner_id = partner_id;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getAd_content() {
		return ad_content;
	}
	public void setAd_content(String ad_content) {
		this.ad_content = ad_content;
	}

	

}
