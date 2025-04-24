package eu.xfsc.train.tspa.model.trustlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import eu.xfsc.train.tspa.model.trustlist.tsp.TrustServiceProviderListCustomType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "TrustServiceStatusList")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustServiceStatusList",propOrder = {"frameworkInformation","trustServiceProviderList"})
@JsonRootName(value = "TrustServiceStatusList")
public class TrustServiceStatusList {
	
	@XmlElement(name = "FrameworkInformation")
	@JsonProperty("FrameworkInformation")
	private FrameworkInformationType frameworkInformation;
	
	@XmlElement(name = "TrustServiceProviderList")
	@JsonProperty("TrustServiceProviderList")
	private TrustServiceProviderListCustomType trustServiceProviderList;

}
