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
@XmlType(name = "CredentialCustomType",propOrder = {"type"})
public class CredentialCustomType {
	
	@XmlElement(name = "Type")
	@JsonProperty("Type")
	private String type;

}
