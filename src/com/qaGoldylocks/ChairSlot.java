package com.qaGoldylocks;

public class ChairSlot {
	public int chairWeightCapacitiy;
	public int porridgeTemp;
	public int luminosity;
	public ChairSlot(int maxWeight, int porridgeTemp, int luminosity) {
		this.chairWeightCapacitiy = maxWeight;
		this.porridgeTemp = porridgeTemp;
		this.luminosity = luminosity;
		System.out.println("Place at the table created with maxWeight "+maxWeight+". porridgeTemp "+porridgeTemp
				+". luminosity "+luminosity);
	}
	public ChairSlot() {
		this.chairWeightCapacitiy = (int)Math.max(30, Math.round(Math.random()*150));
		this.porridgeTemp = (int)Math.max(30, Math.round(Math.random()*200));
		this.luminosity = (int)Math.max(12, Math.round(Math.random()*98));
		System.out.println("Place at the table created with maxWeight "+chairWeightCapacitiy+". porridgeTemp "+porridgeTemp
				+". luminosity "+luminosity);
	}
}
