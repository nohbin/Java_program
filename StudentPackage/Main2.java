package ppp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main2 extends JFrame {
	private JPanel shapePanel;
	private Point prevPoint, curPoint;
	private JButton drawButton = new JButton("그리기");
	private JButton delete = new JButton("지우기");
	private JButton color = new JButton("색상");
	private JButton sizeButton = new JButton("굵기");
	private JLabel imageLabel = new JLabel();

	private boolean drawMode = false;
	private int size = 1;

	public Main2() {
		setTitle("그림판");
		setSize(500, 500);
		createMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Container c = getContentPane();

		shapePanel = new JPanel();
		class DrawingPanel extends JPanel {
		    private Color penColor = Color.BLACK;  // 그리기 패널의 펜 색상
		    private Point prevPoint, curPoint;

		    public void setPenColor(Color color) {
		        this.penColor = color;
		    }

		    @Override
		    protected void paintComponent(Graphics g) {
		        super.paintComponent(g);

		        Graphics2D g2d = (Graphics2D) g;
		        g2d.setStroke(new BasicStroke(size));
		        g2d.setColor(penColor);
		        if (prevPoint != null && curPoint != null) {
		            g2d.drawLine(prevPoint.x, prevPoint.y, curPoint.x, curPoint.y);
		        }
		    }

		    public void setPrevPoint(Point prevPoint) {
		        this.prevPoint = prevPoint;
		    }

		    public void setCurPoint(Point curPoint) {
		        this.curPoint = curPoint;
		    }
		}


		// 마우스 이벤트와 마우스 모션 이벤트를 처리
		drawButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // 그리기 모드를 변경
		        drawMode = !drawMode;
		        if (drawMode) {
		            // 그리기 모드가 켜졌을 때, 마우스 이벤트와 마우스 모션 이벤트 리스너를 추가
		            DrawingPanel drawingPanel = new DrawingPanel();
		            shapePanel.add(drawingPanel);

		            shapePanel.addMouseListener(new MouseAdapter() {
		                public void mousePressed(MouseEvent e) {
		                    drawingPanel.setPrevPoint(e.getPoint());
		                }
		                public void mouseReleased(MouseEvent e) {
		                    drawingPanel.setPrevPoint(null);
		                }
		            });
		            shapePanel.addMouseMotionListener(new MouseAdapter() {
		                public void mouseDragged(MouseEvent e) {
		                    if (drawMode) {
		                        drawingPanel.setCurPoint(e.getPoint());
		                        shapePanel.repaint();
		                    }
		                }
		            });
		        } else {
		            // 그리기 모드가 꺼졌을 때, 마우스 이벤트와 마우스 모션 이벤트 리스너를 제거
		            Component[] components = shapePanel.getComponents();
		            for (Component component : components) {
		                if (component instanceof DrawingPanel) {
		                    shapePanel.remove(component);
		                }
		            }
		            shapePanel.repaint();
		        }
		    }
		});
		// 지우기 버튼 이벤트 처리 - 오동근
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		// 색상 버튼 이벤트 처리 - 조하은
		color.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color c = JColorChooser.showDialog(null, "색상 선택", Color.BLACK);
				if (c != null) {
					Component[] components = shapePanel.getComponents();
					for (Component component : components) {
						Graphics g = component.getGraphics();
						if (g != null && g instanceof Graphics2D) {
							((Graphics2D) g).setStroke(new BasicStroke(size));
							g.setColor(c);
						}
					}
				}
			}
		});
		// 굵기 버튼 이벤트 처리 - 성보경
		sizeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("굵기를 입력하세요");
				try {
					size = Integer.parseInt(input);
				} catch (NumberFormatException ex) {
					// 잘못된 입력일 경우 예외 처리
					JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
				}
			}
		});

		c.add(shapePanel);
	}

	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;

		public OpenActionListener() {
			chooser = new JFileChooser();
		}

		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
			chooser.setFileFilter(filter);

			int ret = chooser.showOpenDialog(null);
			if (ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}

			String filePath = chooser.getSelectedFile().getPath();
			imageLabel.setIcon(new ImageIcon(filePath));
			pack(); // 이미지의 크기에 맞추어 프레임 크기 조절
		}

	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu sMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("열기");
		openItem.addActionListener(new OpenActionListener());

		sMenu.add(openItem);
		sMenu.addSeparator();
		sMenu.add(new JMenuItem("저장"));

		mb.add(sMenu);
		mb.add(drawButton);
		mb.add(delete);
		mb.add(color);
		mb.add(sizeButton);
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new Main2();
	}
}
