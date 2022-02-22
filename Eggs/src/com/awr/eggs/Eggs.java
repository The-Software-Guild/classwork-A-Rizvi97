package com.awr.eggs;

class Eggs {
	private int eggs, gross, dozen, remainder;

	public void setEggs(int eggs) {
		this.eggs = eggs;
	}
	
	private void calculateGrossDozen() {
		gross = eggs / 144;
		dozen = (eggs % 144) / 12;
		remainder = eggs % 12;
		}

	public int getGross() {
		calculateGrossDozen();
		return gross;
	}

	public int getDozen() {
		calculateGrossDozen();
		return dozen;
	}

	public int getRemainder() {
		calculateGrossDozen();
		return remainder;
	}
	
	
	
	
	
}
