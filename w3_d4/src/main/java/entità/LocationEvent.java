package entità;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "location")
@Getter
@Setter

public class LocationEvent {
	
	@Id
	@GeneratedValue
	private UUID Id;
	private String name;
	private String city;
	
	public LocationEvent() {
		
	};
	
	public LocationEvent(String name, String city) {
		this.name = name;
		this.city = city;
	};
	
	@Override
	public String toString() {
		return "La città è: " + city + " / " + name;
	};
}
