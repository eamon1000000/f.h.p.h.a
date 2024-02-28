import java.util.Random;
public class granny {
	int width;
	int height;
	int[][] grid = new int[height][width];
	Random rand = new Random();
	int upperBound = 6;
	
	
	
	public granny() {
		this.width = 15;
		this.height = 15;
		this.grid = new int[width][height];
		for (int i = 0; i< width; i++) {
			for (int j = 0; j< height; j++) {
				this.grid[i][j] = rand.nextInt(upperBound);
			}
		}
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j< width; j++) {
				this.grid[i][j]=1;
				
			}
		}
		for (int i = width-3; i <width; i++) {
			for (int j = 0; j< width; j++) {
				this.grid[i][j]=1;
				
			}
		}
		for (int i = 0; i < width; i++) {
			for (int j = 0; j< 3; j++) {
				this.grid[i][j]=1;
				
			}
		}
		for (int i = 0; i < width; i++) {
			for (int j = width -3; j< width; j++) {
				this.grid[i][j]=1;
				
			}
		}		
	}
	
	public granny(granny copy) {
		this.height = copy.height;
		this.width = copy.width;
		this.grid = copy.grid;
	}
	
	public granny(int inWidth, int inHeight) {
		this.width = inWidth;
		this.height = inHeight;
		this.grid = new int[inWidth][inHeight];
	}

}
