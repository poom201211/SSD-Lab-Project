package main;

import javax.swing.*;
import java.awt.*;
import lib.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;

public class Gui extends JFrame implements Observer {

	private JButton saveButton;
	private JButton loadButton;
	private JButton resetButton;
	private Memento memento;
	private Game game;
	private Renderer renderer;
	private Controller controller;

	private void loadGame() {
		game.load(memento);
		loadButton.setEnabled(false);
	}

	private void saveGame() {
		loadButton.setEnabled(true);
		memento = game.save();
	}

	private void resetGame(){
		game.resetGame();
	}

	class Renderer extends JPanel {

		private int blockWidth = 30;
		private int mapSize;

		public Renderer() {
			mapSize = game.getMapSize() * blockWidth;
			setPreferredSize(new Dimension(mapSize, mapSize));
			setDoubleBuffered(true);
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			Toolkit.getDefaultToolkit().sync();
			paintBlocks(g);
		}

		private void paintBlocks(Graphics g) {
			g.setColor(Color.green);
			for (Block b : game.getBlocks()) {
				if(b.overlapped(game.getApple())){
					g.setColor(Color.red);
				}else{
					g.setColor(Color.green);
				}
				g.fillRect(b.getX() * blockWidth, b.getY() * blockWidth, blockWidth, blockWidth);
			}
		}
	}

	public Gui(Game game) {
		this.game = game;
		this.game.addObserver(this);

		controller = new Controller();

		renderer = new Renderer();
		renderer.addKeyListener(controller);

		setLayout(new BorderLayout());
		add(renderer, BorderLayout.CENTER);
		add(new JPanel() {
			{
				resetButton = new JButton("Reset Game");
				resetButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						resetGame();
						renderer.requestFocus();
					}
				});
				add(resetButton);

				saveButton = new JButton("Save Position");
				saveButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						saveGame();
						renderer.requestFocus();
					}
				});
				add(saveButton);

				loadButton = new JButton("Load Position");
				loadButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						loadGame();
						renderer.requestFocus();
					}
				});
				loadButton.setEnabled(false);
				add(loadButton);

			}
		}, BorderLayout.SOUTH);

		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		renderer.requestFocus();
	}

	@Override
	public void update(Observable o, Object arg) {
		renderer.repaint();
	}

	class Controller extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				game.handleUpKey();
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				game.handleLeftKey();
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				game.handleRightKey();
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				game.handleDownKey();
			}
		}

	}

}
