package net.belisoft.butron.model;

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Component;

@Entity
@Component
public class CachopoDeCecina extends AbstractPersistable<Long> implements
		Cachopo {

	private static final long serialVersionUID = -8517448705443716892L;

	@Column(unique = true)
	private String tipo;

	public CachopoDeCecina() {
		this.tipo = "De Cecina";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		CachopoDeCecina other = (CachopoDeCecina) obj;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cachopo [tipo=" + tipo + "]";
	}

}
