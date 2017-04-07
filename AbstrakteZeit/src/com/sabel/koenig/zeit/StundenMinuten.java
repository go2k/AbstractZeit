package com.sabel.koenig.zeit;

public class StundenMinuten extends Zeit{

	private long minuten;
	private long stunden;
	
	public StundenMinuten(long minuten, long stunden) {
		super();
		this.minuten = minuten;
		this.stunden = stunden;
	}

	@Override
	public long getMinuten() {
		// TODO Auto-generated method stub
		return stunden * 60 + minuten;
	}

	@Override
	public String toString() {
		return "StundenMinuten [minuten=" + minuten + ", stunden=" + stunden + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (minuten ^ (minuten >>> 32));
		result = prime * result + (int) (stunden ^ (stunden >>> 32));
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
		StundenMinuten other = (StundenMinuten) obj;
		if (minuten != other.minuten)
			return false;
		if (stunden != other.stunden)
			return false;
		return true;
	}
	
	

}
