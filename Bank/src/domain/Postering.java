package domain;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Postering {
	private LocalDateTime datotid;
	private BigDecimal beloeb;
	private long konto;
	private String tekst;
	
	
public Postering(LocalDateTime datoTid, BigDecimal beloeb, long konto, String tekst) {
	this.datotid = datoTid;
	this.beloeb = beloeb;
	this.konto = konto;
	this.tekst = tekst;		
}
	
	public LocalDateTime getDatotid() {
		return datotid;
	}
/*	public void setDatotid(LocalDateTime datotid) {
		this.datotid = datotid;
	}*/
	
	public BigDecimal getBeloeb() {
		return beloeb;
	}
	/*
	public void setBeloeb(BigDecimal beloeb) {
		this.beloeb = beloeb;
	}*/
	public long getKonto() {
		return konto;
	}
/*	public void setKonto(long konto) {
		this.konto = konto;
	}*/
	
	
	@Override
	public String toString() {
		return "Postering [datotid = " + datotid + ", beloeb = " + beloeb + ", konto = " + konto + ", tekst = " + tekst + "]";
	}
	
	
	
}
