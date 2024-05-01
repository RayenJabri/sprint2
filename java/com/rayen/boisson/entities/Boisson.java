package com.rayen.boisson.entities;
import jakarta.persistence.*;

	import jakarta.persistence.ManyToOne;


	import java.util.Date;
	@Entity
	public class Boisson {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idBoisson;
	    private String nomBoisson;
	    private Double prixBoisson;


	    public Boisson() {
	        super();
	    }


		public Long getIdBoisson() {
			return idBoisson;
		}


		public void setIdBoisson(Long idBoisson) {
			this.idBoisson = idBoisson;
		}


		public String getNomBoisson() {
			return nomBoisson;
		}


		public void setNomBoisson(String nomBoisson) {
			this.nomBoisson = nomBoisson;
		}


		public Double getPrixBoisson() {
			return prixBoisson;
		}


		public void setPrixBoisson(Double prixBoisson) {
			this.prixBoisson = prixBoisson;
		}


		public Boisson(String nomBoisson, Double prixBoisson) {
			super();
		
			this.nomBoisson = nomBoisson;
			this.prixBoisson = prixBoisson;
		}


		@Override
		public String toString() {
			return "Boisson [idBoisson=" + idBoisson + ", nomBoisson=" + nomBoisson + ", prixBoisson=" + prixBoisson
					+ "]";
		}

	    
	}
