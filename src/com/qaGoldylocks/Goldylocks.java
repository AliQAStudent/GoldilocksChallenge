package com.qaGoldylocks;

import java.util.ArrayList;
import java.util.Scanner;

public class Goldylocks {

	static int[] expectedAsArray = {2, 5};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isFinished = false;
		while(!isFinished) {
			//Initialize list of chairs
			ArrayList<ChairSlot> allChairs = new ArrayList<ChairSlot>();
			//We are creating chair slots with random maxWeights, temps and light. Uncomment second constructor to create fixed values
			ChairSlot chairSlot1 = new ChairSlot();//(30, 30,54);
			ChairSlot chairSlot2 = new ChairSlot();//(130, 95,78);
			ChairSlot chairSlot3 = new ChairSlot();//(90, 90,98);
			ChairSlot chairSlot4 = new ChairSlot();//(150, 150,12);
			ChairSlot chairSlot5 = new ChairSlot();//(120, 70,22);
			ChairSlot chairSlot6 = new ChairSlot();//(200, 200,12);
			ChairSlot chairSlot7 = new ChairSlot();//(110, 110,45);
			allChairs.add(chairSlot1);
			allChairs.add(chairSlot2);
			allChairs.add(chairSlot3);
			allChairs.add(chairSlot4);
			allChairs.add(chairSlot5);
			allChairs.add(chairSlot6);
			allChairs.add(chairSlot7);
			System.out.println("Please enter Goldilocks weight");
			int goldiLocksWeight = Integer.parseInt(scan.nextLine());
			System.out.println("Please enter Goldilocks max porridge tolerance");
			int goldiLocksPorridgeMaxTemp = Integer.parseInt(scan.nextLine());
			System.out.println("Please enter Goldilocks max luminosity tolerance");
			int goldiLocksPorridgeMaxLight = Integer.parseInt(scan.nextLine());
			System.out.println("Goldilocks can seat at the following seats:");
			boolean anyChairsFound = false;
			for(int i = 0; i< allChairs.size();i++) {
				if(allChairs.get(i).chairWeightCapacitiy >= goldiLocksWeight
						&& allChairs.get(i).porridgeTemp <= goldiLocksPorridgeMaxTemp
						&& allChairs.get(i).luminosity <= goldiLocksPorridgeMaxLight)
				{
					anyChairsFound = true;
					System.out.println("seat # "+(i+1)+" (maxWeight: "+allChairs.get(i).chairWeightCapacitiy
							+" porridgeTemp: "+allChairs.get(i).porridgeTemp
							+" luminosity: "+allChairs.get(i).luminosity+")");
				}
			}
			if(!anyChairsFound)
				System.out.println("NONE");
			System.out.println("Repeat? (Y/N)");
			if(scan.nextLine().equals("N"))
				isFinished = true;
		}
	}
}
