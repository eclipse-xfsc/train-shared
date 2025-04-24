package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPInformationType", propOrder = { "tspAddress", "tSPCertificationList", "tSPEntityIdentifierList",
		"tSPInformationURI" })
public class TSPInformationType {

	@XmlElement(name = "Address")
	@JsonProperty("Address")
	private TSPAddessType tspAddress;

	@XmlElement(name = "TSPCertificationList")
	@JsonProperty("TSPCertificationList")
	private TSPCertificationListType tSPCertificationList;

	@XmlElement(name = "TSPEntityIdentifierList")
	@JsonProperty("TSPEntityIdentifierList")
	private TSPEntityIdentifierListType tSPEntityIdentifierList;

	@XmlElement(name = "TSPInformationURI")
	@JsonProperty("TSPInformationURI")
	private String tSPInformationURI;

}
