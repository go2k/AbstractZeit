package com.sabel.koenig.zeit;

public abstract class Zeit {

	public abstract long getMinuten();
	
	public long getSekunden() {
		return getMinuten() * 60;
	}

	
}
