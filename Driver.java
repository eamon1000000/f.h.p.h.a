import java.util.Random;
import java.util.Scanner;
import java.util.Random;


public class Driver {

	public static void main(String[] args) {
		System.out.println("..._..__.___-__--_---~--~~-~~~^~~^^~^^^~^^~~^~~~-~~--~---_--__-___.__.._...\n");
		System.out.printf("%7s", "Hello\n");
		System.out.println();
		System.out.printf("%28s", "i'm F.Y.P.H.A. (^◡^ )\n");
		System.out.println();
		System.out.printf("%76s", "the Fibre and Yarnwork Pattern Harmony Algorithm!\n");
		System.out.println();
		System.out.println("..._..__.___-__--_---~--~~-~~~^~~^^~^^^~^^~~^~~~-~~--~---_--__-___.__.._...\n");
		System.out.println();
		
		Random rand = new Random();
		Scanner kb = new Scanner(System.in);
		int choice = 0;
		
		while (true) {
			System.out.println("what can i help you with?\n-----------------------------------------------------\n1. create a random & repeatable crochet textile design"
					+ "\n2. create an abstract generated weaving piece of custom width\n3. granny square quick-gen\n4. create a custom swatch pattern based on your input\n5. exit");
			choice = kb.nextInt();
;			while (choice != 5) {
				switch(choice) {
				case 1:
					
					int upperBoundRows = 6;
					int numRows = rand.nextInt(1, upperBoundRows);
					
					
					
					final int upperBoundStitchRep = 9;
					final int numStitchesPerRow = rand.nextInt(1, upperBoundStitchRep);
					
					
					int counter = numRows;
					
					
					System.out.println("\nHere is your random and repeatable textile design:");

					for(int i = 0; i < numRows; i++) {
						
						System.out.println("\n");
						System.out.print("Row " + (counter--) + ":");
						
						for(int j = 0; j<numStitchesPerRow; j++) {
							int upperBoundStitchType = 6;
							int stitchType = rand.nextInt(upperBoundStitchType);
							switch(stitchType) {
							case 0:
								System.out.printf("%4s", "DC");
								break;
							case 1:
								System.out.printf("%4s", "SC");
								break;
							case 2:
								System.out.printf("%4s", "PS");
								break;
							case 3:
								System.out.printf("%4s", "HD");
								break;
							case 4:
								System.out.printf("%4s", "CH");
								break;
							case 5:
								System.out.printf("%4s", "DS");
								break;
							
							}
						}
						System.out.print("  (repeat)");
					}
					System.out.println("\n\nRow 0:  " + numStitchesPerRow + " chain stitches");
					System.out.println("\n\nStitch Legend:\n------------------------\nSC: Single Crochet\nHD: Half-Double Crochet\nDC: Double Crochet"
							+ "\nCH: Chain Stitch (skip)\nPS: Post Stitch\nDS: Drop Stitch\n");
					break;
				case 2:
				int warp;	
				int numColours;
				System.out.println("Great, looks like you want to create a weaving pattern! I'm just gonna ask you a couple questions about "
						+ "the building blocks that you want to work with.");
				
				System.out.println("Please enter desired number of warp threads (width): ");
				 warp = kb.nextInt();
				 while(true) {
					  System.out.println("How many colours will you use? Please enter a number between 2 and 5: ");
					  numColours = kb.nextInt();
					  if(numColours >= 2 && numColours <= 5) {
						  break;
					  }
					  else {
						  System.out.println("Sorry, please try again...\n ");
					  }
				 }
				 weaveID idArr[] = new weaveID[numColours];
				 
				 for(int i = 0; i < numColours; i++) {
					 String tName;
					 String yes;
					 boolean tBase;
					 System.out.println("Please enter the name of colour #" + (i+1));
					 kb.nextLine();
					 tName = kb.nextLine();
					 System.out.println("Is " + tName + " one of your base colours? Enter YES if it is, NO if it isnt: ");
					 yes = kb.next();
					 if(yes.equalsIgnoreCase("yes")) {
						 tBase = true;
					 }
					 else {
						 tBase = false;
					 }
					 
					 idArr[i] = new weaveID(tName, tBase);
					 System.out.println("Colour identity recorded!");
					 if(idArr[i].base == true) {
						 System.out.println("Base Colour: " + idArr[i].name);
					 }
					 else{
						 System.out.println("Accent Colour: " + idArr[i].name);
					 }
				 }
				 
				 
					System.out.println("\nCreating weaving pattern...\n");
					
					weaveID weaveOrd[] = new weaveID[idArr.length + 1];
					
					for(int j = 0; j< idArr.length; j++) {
								if(idArr[j].base== true) {
								weaveOrd[0] = idArr[j];
							}
					
					for(int i = 0; i< idArr.length; i++) {
						weaveOrd[i+1] = idArr[i];
					}
					
					int weft = rand.nextInt(4,10);
					for(int k = 0; k<= weft; k++) {
						System.out.println("\n");
						for(int i = 0; i<=warp; i++) {
							int baseProb = rand.nextInt(0,10);
								if(baseProb <= 5) {
									System.out.printf("%-10s ", weaveOrd[0].name);
								}
								else {
									int numAccentcol = weaveOrd.length;
									int pickAccentCol = rand.nextInt(1,numAccentcol);
									System.out.printf("%-10s ", weaveOrd[pickAccentCol].name);

							}
						}
							
						
						}
					}
					

				 
				 
				
				 
				
					
					break;
				case 3:
					granny quickGranny = new granny();
					for (int i = 0; i< quickGranny.width; i++) {
						System.out.println("\n");
						for(int j = 0; j< quickGranny.height; j++) {
							int stitch = quickGranny.grid[i][j];
							switch(stitch) {
							case 0:
								System.out.printf("%4s", "DC");
								break;
							case 1:
								System.out.printf("%4s", "SC");
								break;
							case 2:
								System.out.printf("%4s", "PS");
								break;
							case 3:
								System.out.printf("%4s", "HD");
								break;
							case 4:
								System.out.printf("%4s", "CH");
								break;
							case 5:
								System.out.printf("%4s", "DS");
								break;
							
							}

						}
					}
					System.out.println("\n");
					
				
				}
				break;
	
		}

		}
		
		




	}

}
