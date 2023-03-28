package models;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Usuario extends AbstractEntity<Long>{
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false, unique = true)
	private String password;
	
	@Column(nullable = false)
	private String perfil;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	
}
