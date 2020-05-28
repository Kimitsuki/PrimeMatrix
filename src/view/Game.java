/*
 *	
 *	Author TungNS15
 *	Date May 21, 2020
 *
 */
package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Color;

@SuppressWarnings("serial")
public class Game extends JFrame {

//	private JPanel intro;
	private JPanel contentPane;
	private JPanel warmUpPane;
	private JPanel confirmPaneWarmUp;
	private JPanel easyModePane;
	private JPanel confirmPaneEasyMode;
	private JPanel normalModePane;
	private JPanel confirmPaneNormalMode;
	private JPanel hardModePane;
	private JPanel confirmPaneHardMode;

	/**
	 * Create the frame.
	 */
	public Game() {
//		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1280, 720);
		JFrame f = new JFrame();
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 1280, 720);

		/**
		 * Intro video
		 */
//		intro = new JPanel();
//		intro.setLayout(new BorderLayout());
//
//		f.setVisible(true);
//
//		Canvas canvas = new Canvas();
//		intro.add(canvas);
//		f.add(intro);
//		NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "lib");
//		Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);
//		MediaPlayerFactory mpf = new MediaPlayerFactory();
//		EmbeddedMediaPlayer emp = mpf.newEmbeddedMediaPlayer(new Win32FullScreenStrategy(f));
//		emp.setVideoSurface(mpf.newVideoSurface(canvas));
//		emp.setEnableMouseInputHandling(false);
//		emp.setEnableKeyInputHandling(false);
//		String file = "Prime.mp4";
//		emp.prepareMedia(file);
//		emp.play();
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		f.remove(intro);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		f.setContentPane(contentPane);
		contentPane.setLayout(null);

		warmUpPane = new JPanel();
		warmUpPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		warmUpPane.setLayout(null);

		confirmPaneWarmUp = new JPanel();
		confirmPaneWarmUp.setBounds(560, 250, 300, 150);
		confirmPaneWarmUp.setBackground(new Color(0, 0, 0, 0));
		try {
			BufferedImage icon = ImageIO.read(new File("res/confirm.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(300, 140, Image.SCALE_SMOOTH)));
			confirmPaneWarmUp.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		warmUpPane.add(confirmPaneWarmUp);

		JButton buttonNoWarmUp = new JButton();
		buttonNoWarmUp.setBounds(600, 330, 100, 40);
		Image buttonNoImg = new ImageIcon("res/no.png").getImage();
		Image buttonNoNewIcon = buttonNoImg.getScaledInstance(100, 40, Image.SCALE_SMOOTH);
		ImageIcon buttonNoIcon = new ImageIcon(buttonNoNewIcon);
		buttonNoWarmUp.setIcon(buttonNoIcon);
		buttonNoWarmUp.setBackground(new Color(97, 80, 213));
		buttonNoWarmUp.setBorderPainted(false);
		warmUpPane.add(buttonNoWarmUp);
		buttonNoWarmUp.setVisible(false);

		JButton buttonYesWarmUp = new JButton();
		buttonYesWarmUp.setBounds(720, 330, 100, 40);
		Image buttonYesImg = new ImageIcon("res/yes.png").getImage();
		Image buttonYesNewIcon = buttonYesImg.getScaledInstance(100, 40, Image.SCALE_SMOOTH);
		ImageIcon buttonYesIcon = new ImageIcon(buttonYesNewIcon);
		buttonYesWarmUp.setIcon(buttonYesIcon);
		buttonYesWarmUp.setBackground(new Color(97, 80, 213));
		buttonYesWarmUp.setBorderPainted(false);
		warmUpPane.add(buttonYesWarmUp);
		buttonYesWarmUp.setVisible(false);

		confirmPaneWarmUp.setVisible(false);

		JPanel image1 = new JPanel();
		image1.setBounds(-5, -5, 1280, 720);
		try {
			BufferedImage icon = ImageIO.read(new File("res/menu.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(1280, 681, Image.SCALE_SMOOTH)));
			image1.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		warmUpPane.add(image1);

		easyModePane = new JPanel();
		easyModePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		easyModePane.setLayout(null);

		confirmPaneEasyMode = new JPanel();
		confirmPaneEasyMode.setBounds(560, 250, 300, 150);
		confirmPaneEasyMode.setBackground(new Color(0, 0, 0, 0));
		try {
			BufferedImage icon = ImageIO.read(new File("res/confirm.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(300, 140, Image.SCALE_SMOOTH)));
			confirmPaneEasyMode.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		easyModePane.add(confirmPaneEasyMode);

		JButton buttonNoEasyMode = new JButton();
		buttonNoEasyMode.setBounds(600, 330, 100, 40);
		buttonNoEasyMode.setIcon(buttonNoIcon);
		buttonNoEasyMode.setBackground(new Color(97, 80, 213));
		buttonNoEasyMode.setBorderPainted(false);
		easyModePane.add(buttonNoEasyMode);
		buttonNoEasyMode.setVisible(false);

		JButton buttonYesEasyMode = new JButton();
		buttonYesEasyMode.setBounds(720, 330, 100, 40);
		buttonYesEasyMode.setIcon(buttonYesIcon);
		buttonYesEasyMode.setBackground(new Color(97, 80, 213));
		buttonYesEasyMode.setBorderPainted(false);
		easyModePane.add(buttonYesEasyMode);
		buttonYesEasyMode.setVisible(false);

		confirmPaneEasyMode.setVisible(false);

		JPanel image2 = new JPanel();
		image2.setBounds(-5, -5, 1280, 720);
		try {
			BufferedImage icon = ImageIO.read(new File("res/menu.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(1280, 681, Image.SCALE_SMOOTH)));
			image2.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		easyModePane.add(image2);

		normalModePane = new JPanel();
		normalModePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		normalModePane.setLayout(null);

		confirmPaneNormalMode = new JPanel();
		confirmPaneNormalMode.setBounds(560, 250, 300, 150);
		confirmPaneNormalMode.setBackground(new Color(0, 0, 0, 0));
		try {
			BufferedImage icon = ImageIO.read(new File("res/confirm.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(300, 140, Image.SCALE_SMOOTH)));
			confirmPaneNormalMode.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		normalModePane.add(confirmPaneNormalMode);

		JButton buttonNoNormalMode = new JButton();
		buttonNoNormalMode.setBounds(600, 330, 100, 40);
		buttonNoNormalMode.setIcon(buttonNoIcon);
		buttonNoNormalMode.setBackground(new Color(97, 80, 213));
		buttonNoNormalMode.setBorderPainted(false);
		normalModePane.add(buttonNoNormalMode);
		buttonNoNormalMode.setVisible(false);

		JButton buttonYesNormalMode = new JButton();
		buttonYesNormalMode.setBounds(720, 330, 100, 40);
		buttonYesNormalMode.setIcon(buttonYesIcon);
		buttonYesNormalMode.setBackground(new Color(97, 80, 213));
		buttonYesNormalMode.setBorderPainted(false);
		normalModePane.add(buttonYesNormalMode);
		buttonYesNormalMode.setVisible(false);

		confirmPaneNormalMode.setVisible(false);

		JPanel image3 = new JPanel();
		image3.setBounds(-5, -5, 1280, 720);
		try {
			BufferedImage icon = ImageIO.read(new File("res/menu.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(1280, 681, Image.SCALE_SMOOTH)));
			image3.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		normalModePane.add(image3);

		hardModePane = new JPanel();
		hardModePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		hardModePane.setLayout(null);

		confirmPaneHardMode = new JPanel();
		confirmPaneHardMode.setBounds(560, 250, 300, 150);
		confirmPaneHardMode.setBackground(new Color(0, 0, 0, 0));
		try {
			BufferedImage icon = ImageIO.read(new File("res/confirm.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(300, 140, Image.SCALE_SMOOTH)));
			confirmPaneHardMode.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hardModePane.add(confirmPaneHardMode);

		JButton buttonNoHardMode = new JButton();
		buttonNoHardMode.setBounds(600, 330, 100, 40);
		buttonNoHardMode.setIcon(buttonNoIcon);
		buttonNoHardMode.setBackground(new Color(97, 80, 213));
		buttonNoHardMode.setBorderPainted(false);
		hardModePane.add(buttonNoHardMode);
		buttonNoHardMode.setVisible(false);

		JButton buttonYesHardMode = new JButton();
		buttonYesHardMode.setBounds(720, 330, 100, 40);
		buttonYesHardMode.setIcon(buttonYesIcon);
		buttonYesHardMode.setBackground(new Color(97, 80, 213));
		buttonYesHardMode.setBorderPainted(false);
		hardModePane.add(buttonYesHardMode);
		buttonYesHardMode.setVisible(false);

		confirmPaneHardMode.setVisible(false);

		JPanel image4 = new JPanel();
		image4.setBounds(-5, -5, 1280, 720);
		try {
			BufferedImage icon = ImageIO.read(new File("res/menu.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(1280, 681, Image.SCALE_SMOOTH)));
			image4.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hardModePane.add(image4);

		JPanel warmUp = new JPanel();
		warmUp.setBounds(290, 200, 250, 250);
		warmUp.setBackground(new Color(0, 0, 0, 0));
		try {
			BufferedImage icon = ImageIO.read(new File("res/warmUp.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
			warmUp.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contentPane.add(warmUp);

		JPanel gameMode = new JPanel();
		gameMode.setBounds(580, 200, 250, 250);
		gameMode.setBackground(new Color(0, 0, 0, 0));
		try {
			BufferedImage icon = ImageIO.read(new File("res/gameMode.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
			gameMode.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contentPane.add(gameMode);

		JPanel dailyMission = new JPanel();
		dailyMission.setBounds(870, 200, 250, 250);
		dailyMission.setBackground(new Color(0, 0, 0, 0));
		try {
			BufferedImage icon = ImageIO.read(new File("res/dailyMission.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
			dailyMission.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contentPane.add(dailyMission);

		JPanel image = new JPanel();
		image.setBounds(-5, -5, 1280, 720);
		try {
			BufferedImage icon = ImageIO.read(new File("res/menu.png"));
			JLabel picLabel = new JLabel(new ImageIcon(icon.getScaledInstance(1280, 681, Image.SCALE_SMOOTH)));
			image.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contentPane.add(image);

		JButton buttonPlayBlue = new JButton();
		buttonPlayBlue.setBounds(390, 380, 125, 50);
		Image buttonPlayBlueImg = new ImageIcon("res/playBlue.png").getImage();
		Image buttonPlayBlueNewIcon = buttonPlayBlueImg.getScaledInstance(125, 50, Image.SCALE_SMOOTH);
		ImageIcon buttonPlayBlueIcon = new ImageIcon(buttonPlayBlueNewIcon);
		buttonPlayBlue.setIcon(buttonPlayBlueIcon);
		buttonPlayBlue.setBackground(new Color(97, 80, 213));
		buttonPlayBlue.setBorderPainted(false);
		buttonPlayBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				f.setContentPane(warmUpPane);
				warmUpPane.setVisible(true);
			}
		});
		contentPane.add(buttonPlayBlue);

		JButton buttonEasy = new JButton();
		buttonEasy.setBounds(680, 270, 125, 50);
		Image buttonEasyImg = new ImageIcon("res/easy.png").getImage();
		Image buttonEasyNewIcon = buttonEasyImg.getScaledInstance(125, 50, Image.SCALE_SMOOTH);
		ImageIcon buttonEasyIcon = new ImageIcon(buttonEasyNewIcon);
		buttonEasy.setIcon(buttonEasyIcon);
		buttonEasy.setBackground(new Color(56, 160, 234));
		buttonEasy.setBorderPainted(false);
		buttonEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				f.setContentPane(easyModePane);
				easyModePane.setVisible(true);
			}
		});
		contentPane.add(buttonEasy);

		JButton buttonNormal = new JButton();
		buttonNormal.setBounds(680, 325, 125, 50);
		Image buttonNormalImg = new ImageIcon("res/normal.png").getImage();
		Image buttonNormalNewIcon = buttonNormalImg.getScaledInstance(125, 50, Image.SCALE_SMOOTH);
		ImageIcon buttonNormalIcon = new ImageIcon(buttonNormalNewIcon);
		buttonNormal.setIcon(buttonNormalIcon);
		buttonNormal.setBackground(new Color(56, 160, 234));
		buttonNormal.setBorderPainted(false);
		buttonNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				f.setContentPane(normalModePane);
				normalModePane.setVisible(true);
			}
		});
		contentPane.add(buttonNormal);

		JButton buttonHard = new JButton();
		buttonHard.setBounds(680, 380, 125, 50);
		Image buttonHardImg = new ImageIcon("res/hard.png").getImage();
		Image buttonHardNewIcon = buttonHardImg.getScaledInstance(125, 50, Image.SCALE_SMOOTH);
		ImageIcon buttonHardIcon = new ImageIcon(buttonHardNewIcon);
		buttonHard.setIcon(buttonHardIcon);
		buttonHard.setBackground(new Color(56, 160, 234));
		buttonHard.setBorderPainted(false);
		buttonHard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				f.setContentPane(hardModePane);
				hardModePane.setVisible(true);
			}
		});
		contentPane.add(buttonHard);

		JButton buttonPlayPink = new JButton();
		buttonPlayPink.setBounds(970, 380, 125, 50);
		Image buttonPlayPinkImg = new ImageIcon("res/playPink.png").getImage();
		Image buttonPlayPinkNewIcon = buttonPlayPinkImg.getScaledInstance(125, 50, Image.SCALE_SMOOTH);
		ImageIcon buttonPlayPinkIcon = new ImageIcon(buttonPlayPinkNewIcon);
		buttonPlayPink.setIcon(buttonPlayPinkIcon);
		buttonPlayPink.setBackground(new Color(24, 134, 225));
		buttonPlayPink.setBorderPainted(false);
		contentPane.add(buttonPlayPink);

		JButton buttonTrue = new JButton();
		buttonTrue.setBounds(770, 450, 125, 50);
		Image buttonTrueImg = new ImageIcon("res/true.png").getImage();
		Image buttonTrueNewIcon = buttonTrueImg.getScaledInstance(125, 50, Image.SCALE_SMOOTH);
		ImageIcon buttonTrueIcon = new ImageIcon(buttonTrueNewIcon);
		buttonTrue.setIcon(buttonTrueIcon);
		buttonTrue.setBackground(new Color(41, 59, 112));
		buttonTrue.setBorderPainted(false);
		warmUpPane.add(buttonTrue);

		JButton buttonFalse = new JButton();
		buttonFalse.setBounds(520, 450, 125, 50);
		Image buttonFalseImg = new ImageIcon("res/false.png").getImage();
		Image buttonFalseNewIcon = buttonFalseImg.getScaledInstance(125, 50, Image.SCALE_SMOOTH);
		ImageIcon buttonFalseIcon = new ImageIcon(buttonFalseNewIcon);
		buttonFalse.setIcon(buttonFalseIcon);
		buttonFalse.setBackground(new Color(41, 59, 112));
		buttonFalse.setBorderPainted(false);
		warmUpPane.add(buttonFalse);

		JButton buttonBackWarmUp = new JButton();
		buttonBackWarmUp.setBounds(1200, 30, 40, 40);
		Image buttonBackImg = new ImageIcon("res/back.png").getImage();
		Image buttonBackNewIcon = buttonBackImg.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		ImageIcon buttonBackIcon = new ImageIcon(buttonBackNewIcon);
		buttonBackWarmUp.setIcon(buttonBackIcon);
		buttonBackWarmUp.setBackground(new Color(14, 27, 72));
		buttonBackWarmUp.setBorderPainted(false);
		buttonBackWarmUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneWarmUp.setVisible(true);
				buttonFalse.setEnabled(false);
				buttonTrue.setEnabled(false);
				buttonNoWarmUp.setVisible(true);
				buttonYesWarmUp.setVisible(true);
			}
		});
		warmUpPane.add(buttonBackWarmUp);

		buttonNoWarmUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneWarmUp.setVisible(false);
				buttonFalse.setEnabled(true);
				buttonTrue.setEnabled(true);
				buttonNoWarmUp.setVisible(false);
				buttonYesWarmUp.setVisible(false);
			}
		});

		buttonYesWarmUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneWarmUp.setVisible(false);
				buttonNoWarmUp.setVisible(false);
				buttonYesWarmUp.setVisible(false);
				warmUpPane.setVisible(false);
				f.setContentPane(contentPane);
				contentPane.setVisible(true);
			}
		});

		JButton buttonBackEasyMode = new JButton();
		buttonBackEasyMode.setBounds(1200, 30, 40, 40);
		buttonBackEasyMode.setIcon(buttonBackIcon);
		buttonBackEasyMode.setBackground(new Color(14, 27, 72));
		buttonBackEasyMode.setBorderPainted(false);
		buttonBackEasyMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneEasyMode.setVisible(true);
				buttonNoEasyMode.setVisible(true);
				buttonYesEasyMode.setVisible(true);
			}
		});
		easyModePane.add(buttonBackEasyMode);

		buttonNoEasyMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneEasyMode.setVisible(false);
				buttonNoEasyMode.setVisible(false);
				buttonYesEasyMode.setVisible(false);
			}
		});

		buttonYesEasyMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneEasyMode.setVisible(false);
				buttonNoEasyMode.setVisible(false);
				buttonYesEasyMode.setVisible(false);
				easyModePane.setVisible(false);
				f.setContentPane(contentPane);
				contentPane.setVisible(true);
			}
		});

		JButton buttonBackNormalMode = new JButton();
		buttonBackNormalMode.setBounds(1200, 30, 40, 40);
		buttonBackNormalMode.setIcon(buttonBackIcon);
		buttonBackNormalMode.setBackground(new Color(14, 27, 72));
		buttonBackNormalMode.setBorderPainted(false);
		buttonBackNormalMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneNormalMode.setVisible(true);
				buttonNoNormalMode.setVisible(true);
				buttonYesNormalMode.setVisible(true);
			}
		});
		normalModePane.add(buttonBackNormalMode);

		buttonNoNormalMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneNormalMode.setVisible(false);
				buttonNoNormalMode.setVisible(false);
				buttonYesNormalMode.setVisible(false);
			}
		});

		buttonYesNormalMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneNormalMode.setVisible(false);
				buttonNoNormalMode.setVisible(false);
				buttonYesNormalMode.setVisible(false);
				normalModePane.setVisible(false);
				f.setContentPane(contentPane);
				contentPane.setVisible(true);
			}
		});

		JButton buttonBackHardMode = new JButton();
		buttonBackHardMode.setBounds(1200, 30, 40, 40);
		buttonBackHardMode.setIcon(buttonBackIcon);
		buttonBackHardMode.setBackground(new Color(14, 27, 72));
		buttonBackHardMode.setBorderPainted(false);
		buttonBackHardMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneHardMode.setVisible(true);
				buttonNoHardMode.setVisible(true);
				buttonYesHardMode.setVisible(true);
			}
		});
		hardModePane.add(buttonBackHardMode);

		buttonNoHardMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneHardMode.setVisible(false);
				buttonNoHardMode.setVisible(false);
				buttonYesHardMode.setVisible(false);
			}
		});

		buttonYesHardMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmPaneHardMode.setVisible(false);
				buttonNoHardMode.setVisible(false);
				buttonYesHardMode.setVisible(false);
				hardModePane.setVisible(false);
				f.setContentPane(contentPane);
				contentPane.setVisible(true);
			}
		});

//		setVisible(true);
		f.setVisible(true);
	}
}