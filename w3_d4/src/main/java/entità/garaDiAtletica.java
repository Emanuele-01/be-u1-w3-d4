package entità;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "gara_di_atletica")
@Getter
@Setter

public class garaDiAtletica extends gestioneventiConstructor{
	
	private Set<User> atleta;
	private User vincitore;
	
	
	public garaDiAtletica() {
		
	};
	
	public garaDiAtletica(Set<User> atleta, User vincitore) {
		super();
		this.atleta = atleta;
		this.vincitore = vincitore;
	}
	
	@Override
	public String toString() {
		return "Il vincitore della gara di atletica:" + vincitore;
	};
}
