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
@XmlType(name = "PostalAddressType",propOrder = {"city", "country", "postalCode", "state", "streetAddress1","streetAddress2"})
public class PostalAddressType {
	
	@XmlElement(name = "City")
	@JsonProperty("City")
	private String city;
	
	@XmlElement(name = "Country")
	@JsonProperty("Country")
	private String country;
	
	@XmlElement(name = "PostalCode")
	@JsonProperty("PostalCopy")
	private String postalCode;
	
	@XmlElement(name = "State")
	@JsonProperty("State")
	private String state;
	
	@XmlElement(name = "StreetAddress1")
	@JsonProperty("StreetAddress1")
	private String streetAddress1;
	
	@XmlElement(name = "StreetAddress2")
	@JsonProperty("StreetAddress2")
	private String streetAddress2;

}
