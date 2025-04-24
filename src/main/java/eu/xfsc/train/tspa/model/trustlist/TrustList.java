package eu.xfsc.train.tspa.model.trustlist;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrustList {

	@JsonProperty("TrustServiceStatusList")
	private TrustServiceStatusList trustServiceStatusList;
	
}
