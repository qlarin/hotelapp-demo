package pl.stsledziona.demos.hotelapp.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
@NamedQueries({ @NamedQuery(name = "hotels", query = "SELECT h FROM Hotel h") })
public class Hotel {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;
	@Embedded
	private Localization location;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotel_id")
	private List<Room> rooms;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Localization getLocation() {
		return location;
	}

	public void setLocation(Localization location) {
		this.location = location;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

}
