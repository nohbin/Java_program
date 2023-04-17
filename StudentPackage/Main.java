package ppp;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main extends JFrame {
	private JPanel shapePanel ;
	private Point prevPoint, curPoint;
	private JButton drawButton = new JButton("그리기");
	private JButton delete = new JButton("지우기");
	private JButton color = new JButton("색상");
	private JButton sizeButton = new JButton("굵기");
	private JLabel imageLabel = new JLabel();
	private boolean drawMode = false;
	
	public Main() {
		shapePanel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
			}
		};
		setTitle("그림판");
		setSize(500, 500);
		createMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// 지우기 버튼 이벤트 처리 - 오동근
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		// 색상 버튼 이벤트 처리 - 조하은
		color.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		// 굵기 버튼 이벤트 처리 - 성보경
		sizeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(shapePanel);
		setLocationRelativeTo(null);
	}
	
	class drawActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			drawMode = !drawMode;
			if (drawMode) {
				// 그리기 모드가 켜졌을 때, 마우스 이벤트와 마우스 모션 이벤트 리스너를 추가
				shapePanel.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						prevPoint = e.getPoint();
					}
					public void mouseReleased(MouseEvent e) {
						prevPoint = null;
					}
				});
				shapePanel.addMouseMotionListener(new MouseAdapter() {
					public void mouseDragged(MouseEvent e) {
						if (drawMode) {
							curPoint = e.getPoint();
							Graphics g = shapePanel.getGraphics();
							g.drawLine(prevPoint.x, prevPoint.y, curPoint.x, curPoint.y);
							prevPoint = curPoint;
						}
					}
				});
			} 
		}
	}

	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;

		public OpenActionListener() {
			chooser = new JFileChooser();
		}

		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG , GIF , PNG Images", "jpg", "gif", "png");
			chooser.setFileFilter(filter);

			int ret = chooser.showOpenDialog(null);
			if (ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}

			String filePath = chooser.getSelectedFile().getPath();
			imageLabel.setIcon(new ImageIcon(filePath));
			shapePanel.add(imageLabel);

			pack(); // 이미지의 크기에 맞추어 프레임 크기 조절
		}
	}

	class SaveActionListener implements ActionListener {
	    JFileChooser fileChooser;

	    public SaveActionListener() {
	        fileChooser = new JFileChooser();
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        fileChooser.setDialogTitle("Save PNG file");
	        int w =shapePanel.getWidth();
	        int h = shapePanel.getHeight();
	        
	        int userSelection = fileChooser.showSaveDialog(shapePanel);
	        if (userSelection == JFileChooser.APPROVE_OPTION) {
	            BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
	            Graphics2D g = image.createGraphics();
	            shapePanel.paint(g);
	            g.dispose();
	            File fileToSave = fileChooser.getSelectedFile();
	            try {
	                ImageIO.write(image, "png", fileToSave);
	            } catch (IOException e1) {
	                e1.printStackTrace();
	            }
	        } else {
	            // 사용자가 취소 버튼을 눌렀을 때의 처리를 작성합니다.
	        }
	    }
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu sMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("열기");
		openItem.addActionListener(new OpenActionListener());
		JMenuItem saveItem = new JMenuItem("저장");
		saveItem.addActionListener(new SaveActionListener());
		

		sMenu.add(openItem);
		sMenu.addSeparator();
		sMenu.add(saveItem);

		mb.add(sMenu);
		mb.add(drawButton);
		drawButton.addActionListener(new drawActionListener());
		mb.add(delete);
		mb.add(color);
		mb.add(sizeButton);
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new Main();
	}
}

