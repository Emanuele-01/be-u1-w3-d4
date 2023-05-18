package entità;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table (name = "gestioneventi")
@Getter
@Setter
@ToString

public class gestioneventiConstructor {
	
	@Id
	@GeneratedValue
	private long id;
	private String titolo;
	private LocalDate data;
	private TypeOfEvent tipoEvento;
	private int numeroMassimoPartecipanti;
	
	public gestioneventiConstructor() {
		
	};
	
	public gestioneventiConstructor(String titolo, LocalDate data, TypeOfEvent tipoEvento, int numeroMassimoPartecipanti) {
		this.titolo = titolo;
		this.data = data;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	};
	
}
