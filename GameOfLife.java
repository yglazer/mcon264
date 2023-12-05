package CircularQueuesWithLinkedList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameOfLife extends JFrame {
	//20x20
	private static final int GRID_SIZE = 20;
	
	private static final int CELL_SIZE = 30;
	// milliseconds
	private static final int INTERVAL = 100; 

	private int[][] grid;
	private CircularLinkedListQueue<int[][]> queue;

	public GameOfLife() {

		// creating our grid
		grid = new int[GRID_SIZE][GRID_SIZE];
		// putting 1,0's
		initializeGrid();

		queue = new CircularLinkedListQueue<>();
		// sets title of display
		setTitle("Game of Life");
		// set size of display
		setSize(GRID_SIZE * CELL_SIZE, GRID_SIZE * CELL_SIZE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				drawGrid(g);
			}
		};
		// this is how fast it goes
		Timer timer = new Timer(INTERVAL, e -> {
			updateGrid();
			// enqueues from our circular queue
			queue.enqueue(copyGrid(grid));
			panel.repaint();
		});

		add(panel);
		timer.start();
	}

	private void initializeGrid() {
		// Initialize the grid with random values or not so random- I like pattern it
		// makes
		for (int i = 0; i < GRID_SIZE; i++) {
			for (int t = 0; t < GRID_SIZE; t++) {
				if (t == 3 ) {
					grid[i][t] = 1;
				} else {
					grid[i][t] = 0;
				}

			}
		}

	}

	private void updateGrid() {
		int[][] newGrid = copyGrid(grid);
		//loops through each box
		for (int i = 0; i < GRID_SIZE; i++) {
			for (int j = 0; j < GRID_SIZE; j++) {
				int liveNeighbors = countLiveNeighbors(grid, i, j);
				//if less than 2 neighbors or more then 3 dies
				if (grid[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
					newGrid[i][j] = 0;
					//if 3 neighbors== live
				} else if (grid[i][j] == 0 && liveNeighbors == 3) {
					newGrid[i][j] = 1;
				}
			}
		}

		grid = newGrid;
	}
	//count live neighbors
	private int countLiveNeighbors(int[][] grid, int x, int y) {
		int count = 0;

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				int newX = (x + i + GRID_SIZE) % GRID_SIZE;
				int newY = (y + j + GRID_SIZE) % GRID_SIZE;
				count += grid[newX][newY];
			}
		}

		return count - grid[x][y];
	}
	// copy grid to put it in queue a then create the next one
	private int[][] copyGrid(int[][] original) {
		int[][] copy = new int[GRID_SIZE][GRID_SIZE];
		for (int i = 0; i < GRID_SIZE; i++) {
			System.arraycopy(original[i], 0, copy[i], 0, GRID_SIZE);
		}
		return copy;
	}

	// draws the visual
	private void drawGrid(Graphics g) {
		for (int i = 0; i < GRID_SIZE; i++) {
			for (int j = 0; j < GRID_SIZE; j++) {
				if (grid[i][j] == 1) {
					g.setColor(Color.PINK);
				} else {
					g.setColor(Color.WHITE);
				}
				// fills the grid
				g.fillRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
				g.setColor(Color.PINK);
				// draws the grid lines
				g.drawRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
			}
		}
	}

	public static void main(String[] args) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GameOfLife().setVisible(true);
			}
		});

	}
}
