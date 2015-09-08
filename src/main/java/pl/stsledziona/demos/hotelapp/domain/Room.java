package pl.stsledziona.demos.hotelapp.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import pl.stsledziona.demos.hotelapp.domain.enums.RoomType;
import pl.stsledziona.demos.hotelapp.domain.enums.RoomWindowDirection;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue
	private Long id;

	@Enumerated(EnumType.STRING)
	private RoomType roomType;
	@Enumerated(EnumType.STRING)
	private RoomWindowDirection roomWindowDirection;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public RoomWindowDirection getRoomWindowDirection() {
		return roomWindowDirection;
	}

	public void setRoomWindowDirection(RoomWindowDirection roomWindowDirection) {
		this.roomWindowDirection = roomWindowDirection;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((roomType == null) ? 0 : roomType.hashCode());
		result = prime * result + ((roomWindowDirection == null) ? 0 : roomWindowDirection.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (roomType != other.roomType)
			return false;
		if (roomWindowDirection != other.roomWindowDirection)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + "]";
	}
	
	

}
