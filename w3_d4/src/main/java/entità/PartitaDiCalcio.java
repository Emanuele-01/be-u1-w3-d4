package entità;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table (name = "partita_di_calcio")
@Getter
@Setter
@ToString
public class PartitaDiCalcio extends gestioneventiConstructor{
	
	private String squadraDiCasa;
	private String squadraOspite;
	private String squadraVincente;
	private int numeroGoalCasa;
	private int numeroGoalOspiti;
	
	
	public PartitaDiCalcio() {
		
	};
	
	
	public PartitaDiCalcio(String squadraDiCasa, String squadraOspite, String squadraVincente, int numeroGoalCasa,
			int numeroGoalOspiti) {
		super();
		this.squadraDiCasa = squadraDiCasa;
		this.squadraOspite = squadraOspite;
		this.squadraVincente = squadraVincente;
		this.numeroGoalCasa = numeroGoalCasa;
		this.numeroGoalOspiti = numeroGoalOspiti;
	}
	
	@Override
	public String toString() {
		return "Partita di calcio: " + squadraDiCasa + " - " + squadraOspite + "numero goal casa/ospiti: " + numeroGoalCasa + " / " + numeroGoalOspiti;
	};
}
