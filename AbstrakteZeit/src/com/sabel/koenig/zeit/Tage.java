package com.sabel.koenig.zeit;

public class Tage extends Zeit {

	private long tage;

	public Tage(long tage) {
		super();
		this.tage = tage;

	}

	public void setTage(long tage) {
		this.tage = tage;
	}

	@Override
	public long getMinuten() {
		// TODO Auto-generated method stub
		return tage * 24 * 60;
	}

	@Override
	public String toString() {
		return "Tage [tage=" + tage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (tage ^ (tage >>> 32));
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
		Tage other = (Tage) obj;
		if (tage != other.tage)
			return false;
		return true;
	}

}
