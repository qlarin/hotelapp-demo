package pl.stsledziona.demos.hotelapp.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Localization {

	@Column(nullable = false)
	private String country;
	@Column(nullable = false)
	private String locality;
	@Column(nullable = false)
	private String street;
	@Column(nullable = false)
	private String zipCode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
