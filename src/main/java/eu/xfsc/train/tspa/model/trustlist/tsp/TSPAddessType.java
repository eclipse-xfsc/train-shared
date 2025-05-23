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
@XmlType(name = "TSPAddessType",propOrder = {"electronicAddress", "postalAddress"})
public class TSPAddessType {
	
	@XmlElement(name = "ElectronicAddress")
	@JsonProperty("ElectronicAddress")
	private String electronicAddress;
	
	@XmlElement(name = "PostalAddress")
	@JsonProperty("PostalAddress")
	private PostalAddressType postalAddress;

}
