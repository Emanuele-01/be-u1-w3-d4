package entità;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "concerto")
@Getter
@Setter
public class Concerto extends gestioneventiConstructor{
	private genereConcerto genere;
	private boolean inStreaming;
	
	public Concerto() {
		
	};
	
	public Concerto(genereConcerto genere, boolean inStreaming) {
		super();
		this.genere = genere;
		this.inStreaming = inStreaming;
	}
	
	
	@Override
	public String toString() {
		return "Il concerto ha un genere: " + genere + " il concerto è in Streaming: " + inStreaming;
	};
}
