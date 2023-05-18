package entità;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "partecipazione")
@Getter
@Setter
public class partecipazione {
	
	@Id
	@GeneratedValue
	private UUID Id;
	private String persona;
	private String event;
	private StatoPartecipazione partecipazione;
	
	public partecipazione() {
		
	};
	
	public partecipazione(String persona, String event, StatoPartecipazione partecipazione) {
		this.persona = persona;
		this.event = event;
		this.partecipazione = partecipazione;
	};
	
	@Override 
	public String toString() {
		return "Questa è la partecipazione: " + persona + " / " + event + " / " + partecipazione;
	};
}
