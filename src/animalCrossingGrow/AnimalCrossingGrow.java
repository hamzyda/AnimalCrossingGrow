package animalCrossingGrow;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


//import javafx.embed.swing.JFXPanel;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;

public class AnimalCrossingGrow {
	player player = new player();
	animal animal = new animal();
	//JFXPanel panel = new JFXPanel();
	//Media m = new Media("file:/c:/나비보벳따우.WAV");
	//MediaPlayer p = new MediaPlayer(m);
	
	static Boolean isOpenCheerUpScreen = false;
	static Boolean isOpenWarningScreen = false;
	static String selectedAnimal = "";
	static String selectedCondition;
	Boolean missionSuccess = false;
	
	JFrame frame;
	
	JPanel mainScreen;
	JPanel selectScreen;
	JPanel explainScreen;
	static JPanel gameScreen = new JPanel() {
		public void paintComponent(Graphics g) {
			Dimension d = this.getSize();
			ImageIcon image = new ImageIcon("./image/gamebackground.PNG");
			g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);		
		}
	};
	JPanel missionScreen;
	JPanel warningScreen;
	JPanel failScreen;
	JPanel endingScreen;
	JPanel endingScreen2;
	JPanel endingScreen3;
	JPanel cheerUpScreen;
	
	JLabel animalImage;
	JLabel animalIntimacyText;
	JLabel animalLevelText;
	JLabel animalFaceText;
	JLabel animalCurrentsStateText;
	JLabel missionTitleText;
	JLabel missionText;
	
	JTextField missionAnswerField = new JTextField();
	
	JButton startButton;
	JButton explainButton;
	JButton quitButton;
	JButton appleButton;
	JButton heejukButton;
	JButton yobiButton;
	JButton backButton;
	JButton expBackButton;//
	JButton eatButton;
	JButton playButton;
	JButton showerButton;
	JButton sleepButton;
	JButton gameBackButton;//
	JButton playerMissionInputButton;
	JButton warningScreenButton;
	JButton backToMainButton;
	JButton cheerUpScreenButton;
	JButton goButton;
	JButton clickScreenButton;
	JButton goToMainButton;
	JButton missionBackButton;

	
	public AnimalCrossingGrow(){
		
		// 객체 생성
		this.mainScreen = new JPanel() {
			public void paintComponent(Graphics g) {
				Dimension d = this.getSize();
				ImageIcon image = new ImageIcon("./image/StartImage.PNG");
				g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);		
			}
		};
		
		this.selectScreen = new JPanel() {
		       public void paintComponent(Graphics g) {
		          Dimension d = this.getSize();
		          ImageIcon image = new ImageIcon("./image/animalselect.PNG");
		          g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);
		       }
		};
		
		this.explainScreen = new JPanel() {
		       public void paintComponent(Graphics g) {
		           Dimension d = this.getSize();
		           ImageIcon image = new ImageIcon("./image/explainscreen.PNG");
		           g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);
		       }
		};
		
		this.missionScreen = new JPanel() {
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                ImageIcon image = new ImageIcon("./image/missionbackground.PNG");
                g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);
            }
		};
		
		this.warningScreen = new JPanel() {
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                ImageIcon image = new ImageIcon("./image/warning.PNG");
                g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);
            }
		};
		
		this.cheerUpScreen = new JPanel() {
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                ImageIcon image = new ImageIcon("./image/cheerup.PNG");
                g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);
            }
		};
		
		this.failScreen = new JPanel() {
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                ImageIcon image = new ImageIcon("./image/fail.PNG");
                g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);
            }
		};
		
		this.endingScreen = new JPanel() {
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                ImageIcon image = new ImageIcon("./image/ending.PNG");
                g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);
            }
		};
		
		this.endingScreen2 = new JPanel() {
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                ImageIcon image = new ImageIcon("./image/ending2.PNG");
                g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);
            }
		};
		
		this.endingScreen3 = new JPanel() {
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                ImageIcon image = new ImageIcon("./image/ending3.PNG");
                g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);
            }
		};
		
		
		this.animalImage = new JLabel();
		this.animalIntimacyText = new JLabel();
		this.animalLevelText = new JLabel();
		this.animalCurrentsStateText = new JLabel();
		this.missionTitleText = new JLabel();
		this.missionText= new JLabel();
		this.animalFaceText = new JLabel();
		
		
		this.startButton = new JButton();
		this.explainButton = new JButton();
		this.quitButton = new JButton();
		this.appleButton = new JButton();
		this.heejukButton = new JButton();
		this.yobiButton = new JButton();
		this.backButton = new JButton();
		this.expBackButton = new JButton();
		this.eatButton = new JButton();
		this.playButton = new JButton();
		this.showerButton = new JButton();
		this.sleepButton = new JButton();
		this.gameBackButton = new JButton();
		this.playerMissionInputButton = new JButton();
		this.warningScreenButton = new JButton();
		this.backToMainButton = new JButton();
		this.cheerUpScreenButton = new JButton();
		this.goButton = new JButton();
		this.clickScreenButton = new JButton();
		this.goToMainButton = new JButton();
		this.missionBackButton = new JButton();
		

   	    ImageIcon applepictureimage = new ImageIcon("./image/a.PNG");
		Image applepictureimg = applepictureimage.getImage();
		Image changeapplepicture = applepictureimg.getScaledInstance(230, 380, Image.SCALE_SMOOTH);
		ImageIcon aImage = new ImageIcon(changeapplepicture);
		
		ImageIcon heejukpictureimage = new ImageIcon("./image/h.PNG");
		Image heejukpictureimg = heejukpictureimage.getImage();
		Image changeheejukpicture = heejukpictureimg.getScaledInstance(230, 380, Image.SCALE_SMOOTH);
		ImageIcon hImage = new ImageIcon(changeheejukpicture);
		
		ImageIcon yobipictureimage = new ImageIcon("./image/y.PNG");
		Image yobipictureimg = yobipictureimage.getImage();
		Image changeyobipicture = yobipictureimg.getScaledInstance(230, 380, Image.SCALE_SMOOTH);
		ImageIcon yImage = new ImageIcon(changeyobipicture);
		
		
		
		
		
		
		
		// 프레임 구성
		this.frame = new JFrame();
		this.frame.setSize(1200, 850);
		this.frame.setBounds(0, 0, 1200, 850);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setResizable(false);
		this.frame.setTitle("키워봐요 동물의 숲");
		this.frame.getContentPane().setLayout(null);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// mainScreen (처음 메뉴 화면) 구성
	    this.mainScreen.setBounds(0, 0, 1183, 813);
		this.frame.getContentPane().add(this.mainScreen);
		this.mainScreen.setLayout(null);
		
		// mainScreen (처음 메뉴 화면) 구성 - 게임 시작 버튼
		ImageIcon startImage = new ImageIcon("./image/gamestart.PNG");
		Image startimg = startImage.getImage();
		Image changestart = startimg.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changestartImage = new ImageIcon(changestart);	
		
		ImageIcon startImage2 = new ImageIcon("./image/gamestart2.PNG");
		Image startimg2 = startImage2.getImage();
		Image changestart2 = startimg2.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changestartImage2 = new ImageIcon(changestart2);	
	
		this.startButton = new JButton(changestartImage);
		this.startButton.setRolloverIcon(changestartImage2);
		this.startButton.setBorderPainted(false);
		this.startButton.setContentAreaFilled(false);
		this.startButton.setOpaque(false);
		this.startButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 selectScreen.setVisible(true);
                 mainScreen.setVisible(false);
             }
         });
		this.startButton.setBounds(73, 600, 298, 150);
		this.mainScreen.add(this.startButton);
		
		// mainScreen (처음 메뉴 화면) 구성 - 게임 설명 버튼 
		ImageIcon explainImage = new ImageIcon("./image/gameexplain.PNG");
		Image explainimg = explainImage.getImage();
		Image changeexplain = explainimg.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changeexplainImage = new ImageIcon(changeexplain);	
		
		ImageIcon explainImage2 = new ImageIcon("./image/gameexplain2.PNG");
		Image explainimg2 = explainImage2.getImage();
		Image changeexplain2 = explainimg2.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changeexplainImage2 = new ImageIcon(changeexplain2);	
	
		this.explainButton = new JButton(changeexplainImage);
		this.explainButton.setRolloverIcon(changeexplainImage2);
		this.explainButton.setBorderPainted(false);
		this.explainButton.setContentAreaFilled(false);
		this.explainButton.setOpaque(false);
		this.explainButton.setPreferredSize(new Dimension(298, 150));
		this.explainButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
            	 explainScreen.setVisible(true);
                 mainScreen.setVisible(false);
             }
         });
		this.explainButton.setBounds(446, 600, 298, 150);
		this.mainScreen.add(this.explainButton);
		
		// mainScreen (처음 메뉴 화면) 구성 - 게임 종료 버튼 
		ImageIcon quitImage = new ImageIcon("./image/gamequit.PNG");
		Image quitimg = quitImage.getImage();
		Image changequit =quitimg.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changequitImage = new ImageIcon(changequit);	
		
		ImageIcon quitImage2 = new ImageIcon("./image/gamequit2.PNG");
		Image quitimg2 = quitImage2.getImage();
		Image changequit2 = quitimg2.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changequitImage2 = new ImageIcon(changequit2);	
	
		this.quitButton = new JButton(changequitImage);
		this.quitButton.setRolloverIcon(changequitImage2);
		this.quitButton.setBorderPainted(false);
		this.quitButton.setContentAreaFilled(false);
		this.quitButton.setOpaque(false);
		this.quitButton.setPreferredSize(new Dimension(298, 150));
		this.quitButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   System.exit(0);
               }
           });
		this.quitButton.setBounds(819, 600, 298, 150);
		this.mainScreen.add(this.quitButton);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// selectScreen (동물 선택 화면) 구성
		this.selectScreen.setBounds(0, 0, 1183, 813);
        this.frame.getContentPane().add(this.selectScreen);
        this.selectScreen.setLayout(null);
		
		// selectScreen (동물 선택 화면) 구성 - 애플 선택 버튼
        ImageIcon appleImage = new ImageIcon("./image/apple.PNG");
        Image appleimg = appleImage.getImage();
        Image changeapple = appleimg.getScaledInstance(210, 80, Image.SCALE_SMOOTH);
        ImageIcon changeappleImage = new ImageIcon(changeapple);    
        
        ImageIcon appleImage2 = new ImageIcon("./image/apple2.PNG");
        Image appleimg2 = appleImage2.getImage();
        Image changeapple2 = appleimg2.getScaledInstance(210, 80, Image.SCALE_SMOOTH);
        ImageIcon changeappleImage2 = new ImageIcon(changeapple2);    
        

        this.appleButton = new JButton(changeappleImage);
        this.appleButton.setRolloverIcon(changeappleImage2);
        this.appleButton.setBorderPainted(false);
        this.appleButton.setContentAreaFilled(false);
        this.appleButton.setOpaque(false);
        this.appleButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
            	 selectedAnimal = "애플이";
        		 animalImage.setIcon(aImage);
        		 AnimalCrossingGrow.gameScreen.setVisible(true);
                 selectScreen.setVisible(false);
             }
         });
        this.appleButton.setBounds(180, 575, 210, 80);
        this.selectScreen.add(this.appleButton);
        
		// selectScreen (동물 선택 화면) 구성 - 히죽 선택 버튼
        ImageIcon heejukImage = new ImageIcon("./image/heejuk.PNG");
        Image heejukimg= heejukImage.getImage();
        Image changeheejuk = heejukimg.getScaledInstance(210, 80, Image.SCALE_SMOOTH);
        ImageIcon changeheejukImage = new ImageIcon(changeheejuk);    
        
        ImageIcon heejukImage2 = new ImageIcon("./image/heejuk2.PNG");
        Image heejukimg2 = heejukImage2.getImage();
        Image changeheejuk2 = heejukimg2.getScaledInstance(210, 80, Image.SCALE_SMOOTH);
        ImageIcon changeheejukImage2 = new ImageIcon(changeheejuk2);    
        

        this.heejukButton = new JButton(changeheejukImage);
        this.heejukButton.setRolloverIcon(changeheejukImage2);
        this.heejukButton.setBorderPainted(false);
        this.heejukButton.setContentAreaFilled(false);
        this.heejukButton.setOpaque(false);
        this.heejukButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
            	 selectedAnimal = "히죽이";
            	 animalImage.setIcon(hImage);
        		 AnimalCrossingGrow.gameScreen.setVisible(true);
            	 selectScreen.setVisible(false);
             }
         });
        this.heejukButton.setBounds(500, 575, 210, 80);
        this.selectScreen.add(this.heejukButton);
        
		// selectScreen (동물 선택 화면) 구성 - 요비 선택 버튼
        ImageIcon yobiImage = new ImageIcon("./image/yobi.PNG");
        Image yobiimg= yobiImage.getImage();
        Image changeyobi = yobiimg.getScaledInstance(210, 80, Image.SCALE_SMOOTH);
        ImageIcon changeyobiImage = new ImageIcon(changeyobi);    
        
        ImageIcon yobiImage2 = new ImageIcon("./image/yobi2.PNG");
        Image yobiimg2 = yobiImage2.getImage();
        Image changeyobi2 = yobiimg2.getScaledInstance(210, 80, Image.SCALE_SMOOTH);
        ImageIcon changeyobiImage2 = new ImageIcon(changeyobi2);    
        

        this.yobiButton = new JButton(changeyobiImage);
        this.yobiButton.setRolloverIcon(changeyobiImage2);
        this.yobiButton.setBorderPainted(false);
        this.yobiButton.setContentAreaFilled(false);
        this.yobiButton.setOpaque(false);
        this.yobiButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
            	 selectedAnimal = "요비";
            	 animalImage.setIcon(yImage);
            	 AnimalCrossingGrow.gameScreen.setVisible(true);
            	 selectScreen.setVisible(false);
             }
         });
        this.yobiButton.setBounds(820, 575, 210, 80);
        this.selectScreen.add(this.yobiButton);
        
        // selectScreen (동물 선택 화면) 구성 - 돌아가기 버튼
		ImageIcon backImage = new ImageIcon("./image/backimage.PNG");
		Image backimg = backImage.getImage();
		Image changeback = backimg.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changebackImage = new ImageIcon(changeback);	
		
		ImageIcon backImage2 = new ImageIcon("./image/backimage2.PNG");
		Image backimg2 = backImage2.getImage();
		Image changeback2 = backimg2.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changebackImage2 = new ImageIcon(changeback2);	
	
		this.backButton = new JButton(changebackImage);
		this.backButton.setRolloverIcon(changebackImage2);
		this.backButton.setBorderPainted(false);
		this.backButton.setContentAreaFilled(false);
		this.backButton.setOpaque(false);
		this.backButton.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
            	mainScreen.setVisible(true);
                selectScreen.setVisible(false);
            }
        });
        this.backButton.setBounds(870, 50, 298, 150);
        this.selectScreen.add(this.backButton);
		
		
		
		
        
        
        
        
        
        
        
        
        
        
        
		
		
		// explainScreen (게임 설명 화면) 구성
        this.explainScreen.setBounds(0, 0, 1183, 813);
		this.frame.getContentPane().add(this.explainScreen);
		this.explainScreen.setLayout(null);		
		
		
		// explainScreen (게임 설명 화면) 구성 - 돌아가기 버튼	
		this.expBackButton = new JButton(changebackImage);
		this.expBackButton.setRolloverIcon(changebackImage2);
		this.expBackButton.setBorderPainted(false);
		this.expBackButton.setContentAreaFilled(false);
		this.expBackButton.setOpaque(false);
		this.expBackButton.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
            	mainScreen.setVisible(true);
                explainScreen.setVisible(false);
            }
        });
        this.expBackButton.setBounds(446, 600, 298, 150);
        this.explainScreen.add(this.expBackButton);
		
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // gameScreen (게임 화면) 구성 
        gameScreen.setBounds(0, 0, 1183, 813);
		frame.getContentPane().add(gameScreen);
		gameScreen.setLayout(null);		
		
		// gameScreen (게임 화면) 구성 - 동물 이미지
		this.animalImage.setBounds(483, 135, 725, 460);
		gameScreen.add(this.animalImage);
		
		// gameScreen (게임 화면) 구성 - 레벨 텍스트
		this.animalLevelText.setText(animal.getlevel());
		this.animalLevelText.setFont(new Font("Asia신디나루M", 1, 50));
		this.animalLevelText.setBounds(215, 82, 100, 45);
		gameScreen.add(this.animalLevelText);
		
		// gameScreen (게임 화면) 구성 - 호감도 텍스트
		this.animalIntimacyText.setText(animal.getintimacy());
		this.animalIntimacyText.setFont(new Font("Asia신디나루M", 1, 50));
		this.animalIntimacyText.setBounds(280, 168, 100, 45);
		gameScreen.add(this.animalIntimacyText);
		
		// gameScreen (게임 화면) 구성 - 상태 텍스트
		this.animalCurrentsStateText.setText(animal.State());
		this.animalCurrentsStateText.setFont(new Font("Asia신디나루M", 1, 50));
		this.animalCurrentsStateText.setBounds(215, 258, 185, 45);
		gameScreen.add(this.animalCurrentsStateText);
		
		// gameScreen (게임 화면) 구성 - 표정 텍스트
		this.animalFaceText.setText("('-')");
		this.animalFaceText.setFont(new Font("Asia신디나루M", 1, 30));
		this.animalFaceText.setBounds(515, 148, 245, 45);
		gameScreen.add(this.animalFaceText);		
        
        // gameScreen (게임 화면) 구성 - 먹이주기 버튼
		ImageIcon eatImage = new ImageIcon("./image/eaticon.PNG");
		Image eatimg = eatImage.getImage();
		Image changeeat = eatimg.getScaledInstance(205, 205, Image.SCALE_SMOOTH);
		ImageIcon changeeatImage = new ImageIcon(changeeat);		
	
		this.eatButton = new JButton(changeeatImage);
		this.eatButton.setBorderPainted(false);
		this.eatButton.setContentAreaFilled(false);
		this.eatButton.setOpaque(false);
		this.eatButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
            	 missionScreen.setVisible(true);
                 AnimalCrossingGrow.gameScreen.setVisible(false);
                 selectedCondition = "배고픔";
                 player.eat();
                 missionTitleText.setText("먹이를 주려면 위의 문장을 입력해줘구리");
         		 missionText.setText(player.mission);
             }
         });
		this.eatButton.setBounds(73, 550, 205, 205);   
		gameScreen.add(this.eatButton);
		
        // gameScreen (게임 화면) 구성 - 놀아주기 버튼
		ImageIcon playImage = new ImageIcon("./image/playicon.PNG");
		Image playimg = playImage.getImage();
		Image changeplay = playimg.getScaledInstance(205, 205, Image.SCALE_SMOOTH);
		ImageIcon changeplayImage = new ImageIcon(changeplay);		
	
		this.playButton = new JButton(changeplayImage);
		this.playButton.setBorderPainted(false);
		this.playButton.setContentAreaFilled(false);
		this.playButton.setOpaque(false);
		this.playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           	 	missionScreen.setVisible(true);
                AnimalCrossingGrow.gameScreen.setVisible(false);
                selectedCondition = "심심함";
                player.play();
                missionTitleText.setText("놀아 주려면 위의 문장을 입력해줘구리");
        		missionText.setText(player.mission);
            }
        });
		this.playButton.setBounds(351, 550, 205, 205);    
		gameScreen.add(this.playButton);
		
		// gameScreen (게임 화면) 구성 - 씻겨주기 버튼
		ImageIcon showerImage = new ImageIcon("./image/showericon.PNG");
		Image showerimg = showerImage.getImage();
		Image changeshower = showerimg.getScaledInstance(205, 205, Image.SCALE_SMOOTH);
		ImageIcon changeshowerImage = new ImageIcon(changeshower);		
	
		this.showerButton = new JButton(changeshowerImage);
		this.showerButton.setBorderPainted(false);
		this.showerButton.setContentAreaFilled(false);
		this.showerButton.setOpaque(false);
		this.showerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           	 	missionScreen.setVisible(true);
                AnimalCrossingGrow.gameScreen.setVisible(false);
                selectedCondition = "더러움";
                player.shower();
                missionTitleText.setText("씻겨 주려면 위의 문장을 입력해줘구리");
        		missionText.setText(player.mission);
            }
        });
		this.showerButton.setBounds(629, 550, 205, 205);   
		gameScreen.add(this.showerButton);
		
		// gameScreen (게임 화면) 구성 - 재워주기 버튼
		ImageIcon sleepImage = new ImageIcon("./image/sleepicon.PNG");
		Image sleepimg = sleepImage.getImage();
		Image changesleep = sleepimg.getScaledInstance(205, 205, Image.SCALE_SMOOTH);
		ImageIcon changesleepImage = new ImageIcon(changesleep);		
	
		this.sleepButton = new JButton(changesleepImage);
		this.sleepButton.setBorderPainted(false);
		this.sleepButton.setContentAreaFilled(false);
		this.sleepButton.setOpaque(false);
		this.sleepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           	 	missionScreen.setVisible(true);
                AnimalCrossingGrow.gameScreen.setVisible(false);
                selectedCondition = "졸림";
                player.sleep();
                missionTitleText.setText("재우려면 위의 문장을 입력해줘구리");
        		missionText.setText(player.mission);
            }
        });
		this.sleepButton.setBounds(907, 550, 205, 205); 
		gameScreen.add(this.sleepButton);
		
		
		// gameScreen (게임 화면) 구성 - 돌아가기 버튼
		this.gameBackButton = new JButton(changebackImage);
		this.gameBackButton.setRolloverIcon(changebackImage2);
		this.gameBackButton.setBorderPainted(false);
		this.gameBackButton.setContentAreaFilled(false);
		this.gameBackButton.setOpaque(false);
		this.gameBackButton.setPreferredSize(new Dimension(298, 150));
		this.gameBackButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   AnimalCrossingGrow.gameScreen.setVisible(false);
                   selectScreen.setVisible(true);
                   
                   animal.face = "('-')";
            	   animal.level = 1;
            	   animal.intimacy = 0;
            	   isOpenCheerUpScreen = false;
            	   isOpenWarningScreen = false;
            	   animalLevelText.setText(animal.getlevel());
                   animalIntimacyText.setText(animal.getintimacy());
                   animalCurrentsStateText.setText(animal.State());
                   animalFaceText.setText(animal.getface());
            	   AnimalCrossingGrow.gameScreen.revalidate();
                   AnimalCrossingGrow.gameScreen.repaint();
               }
           });
		this.gameBackButton.setBounds(870, 50, 298, 150);
		gameScreen.add(this.gameBackButton);
		
        
		
		
		
		
		
		
		
		
		
		
		
		// eatMissionScreen (미션 화면) 구성 
		this.missionScreen.setBounds(0, 0, 1183, 813);
        this.frame.getContentPane().add(this.missionScreen);
        this.missionScreen.setLayout(null);
        
        // eatMissionScreen (미션 화면) 구성 - 돌아가기 버튼
        this.missionBackButton = new JButton(changebackImage);
		this.missionBackButton.setRolloverIcon(changebackImage2);
		this.missionBackButton.setBorderPainted(false);
		this.missionBackButton.setContentAreaFilled(false);
		this.missionBackButton.setOpaque(false);
		this.missionBackButton.setPreferredSize(new Dimension(298, 150));
		this.missionBackButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   AnimalCrossingGrow.gameScreen.setVisible(true);
                   missionScreen.setVisible(false);
                   
            	   animalLevelText.setText(animal.getlevel());
                   animalIntimacyText.setText(animal.getintimacy());
                   animalCurrentsStateText.setText(animal.State());
                   animalFaceText.setText(animal.getface());
            	   AnimalCrossingGrow.gameScreen.revalidate();
                   AnimalCrossingGrow.gameScreen.repaint();
               }
           });
		this.missionBackButton.setBounds(870, 50, 298, 150);
		missionScreen.add(this.missionBackButton);
        
        // eatMissionScreen (미션 화면) 구성 - 미션 문장
        this.missionTitleText.setFont(new Font("Asia신디나루M", 1, 25));
		this.missionTitleText.setBounds(380, 580, 676, 86);
		this.missionScreen.add(this.missionTitleText);
		
		// eatMissionScreen (미션 화면) 구성 - 미션 문장
		this.missionText.setFont(new Font("Asia신디나루M", 1, 50));
		this.missionText.setBounds(330, 190, 676, 86);
		this.missionScreen.add(this.missionText);
        
		// eatMissionScreen (미션 화면) 구성 - 미션 문장 입력 텍스트 필드
        this.missionAnswerField.setBounds(380,670,500,58);
		this.missionScreen.add(this.missionAnswerField);
		this.missionAnswerField.setColumns(10);
		
		// eatMissionScreen (미션 화면) 구성 - 문장 입력 버튼
		this.playerMissionInputButton.setText("확인");
		this.playerMissionInputButton.setBounds(900, 670, 80, 58);
		this.missionScreen.add(this.playerMissionInputButton);
		this.playerMissionInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if(animal.condition == selectedCondition) {
            			missionSuccess = true;
            		} 
            	else {
            			missionSuccess = false;
            		}
                    
                   	missionAnswerField.setText((String)null);
                   	
                   	if (animal.condition == selectedCondition) {
            			if (missionSuccess) {
            				animal.intimacy = animal.intimacy + 1;
            			} else {
            				animal.intimacy = animal.intimacy - 1;
            			}
                   	}
                   	else animal.intimacy = animal.intimacy - 1;
               
                   	
                   	
                   	
               if (animal.intimacy == 5) {
            	   animal.face = "('-')";
            	   animal.level = 1;
            	   animal.intimacy = 0;
            	   isOpenCheerUpScreen = false;
            	   isOpenWarningScreen = false;
            	   
            	   // 엔딩 화면으로
            	   endingScreen.setVisible(true);
               	   missionScreen.setVisible(false); 
               }
               
               else if (animal.intimacy == 3){
            	   animal.face = "(='▼'=)";
            	   animal.level = 2;
            	   
            	   if (isOpenCheerUpScreen == false) {
            		   cheerUpScreen.setVisible(true);
                   	   missionScreen.setVisible(false); 
                   	   isOpenCheerUpScreen = true;
            	   }
            	   else {
            		   AnimalCrossingGrow.gameScreen.setVisible(true);
                	   missionScreen.setVisible(false); 
            	   }
               }
                           
               else if (animal.intimacy == -3) {
            	   animal.face = "‪(ㅠ_ㅠ )‬";
            	   
            	   if (isOpenWarningScreen == false) {
            		   warningScreen.setVisible(true);
                   	   missionScreen.setVisible(false); 
                   	   isOpenWarningScreen = true;
            	   }
            	   else {
            		   AnimalCrossingGrow.gameScreen.setVisible(true);
                	   missionScreen.setVisible(false); 
            	   }
               }   	
               
               else if (animal.intimacy == -5) {
            	   animal.face = "('-')";
            	   animal.level = 1;
            	   animal.intimacy = 0;
            	   isOpenCheerUpScreen = false;
            	   isOpenWarningScreen = false;
            	   
            	   failScreen.setVisible(true);
               	   missionScreen.setVisible(false);            	   
               }
               
               else {
            	   if (animal.intimacy < 5 && animal.intimacy > 3) {
            		   animal.face = "(='▼'=)";
            	   }
            	   else if (animal.intimacy < 3 && animal.intimacy >= 0) {
            		   animal.face = "('-')";
            	   }
            	   else if (animal.intimacy < 0 && animal.intimacy > -3) {
            		   animal.face = "(ㅡ_ㅡ;)";
            	   }
            	   else if (animal.intimacy < -3 && animal.intimacy > -5) {
            		   animal.face = "‪(ㅠ_ㅠ )";
            	   }
            	   AnimalCrossingGrow.gameScreen.setVisible(true);
            	   missionScreen.setVisible(false); 
               }
               
               animalLevelText.setText(animal.getlevel());
               animalIntimacyText.setText(animal.getintimacy());
               animalCurrentsStateText.setText(animal.State());
               animalFaceText.setText(animal.getface());
               AnimalCrossingGrow.gameScreen.revalidate();
               AnimalCrossingGrow.gameScreen.repaint();
            }         
        });
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// cheerUpScreen (응원 화면) 구성 
		this.cheerUpScreen.setBounds(0, 0, 1183, 813);
		this.frame.getContentPane().add(this.cheerUpScreen);
		this.cheerUpScreen.setLayout(null);
		
		// cheerUpScreen (응원 화면) 구성 
		this.cheerUpScreenButton = new JButton(changebackImage);
		this.cheerUpScreenButton.setRolloverIcon(changebackImage2);
		this.cheerUpScreenButton.setBounds(819, 600, 298, 150);
		this.cheerUpScreenButton.setBorderPainted(false);
		this.cheerUpScreenButton.setContentAreaFilled(false);
		this.cheerUpScreenButton.setOpaque(false);
		this.cheerUpScreenButton.setPreferredSize(new Dimension(298, 150));
		this.cheerUpScreenButton.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
            	AnimalCrossingGrow.gameScreen.setVisible(true);
            	cheerUpScreen.setVisible(false);
            }
        });
		this.cheerUpScreen.add(this.cheerUpScreenButton);
		
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// warningScreen (경고 화면) 구성 
		this.warningScreen.setBounds(0, 0, 1183, 813);
		this.frame.getContentPane().add(this.warningScreen);
		this.warningScreen.setLayout(null);
		
		// waringScreen (경고 화면) 구성 - 확인 버튼 warningScreenButton	
		this.warningScreenButton = new JButton(changebackImage);
		this.warningScreenButton.setRolloverIcon(changebackImage2);
		this.warningScreenButton.setBounds(819, 600, 298, 150);
		this.warningScreenButton.setBorderPainted(false);
		this.warningScreenButton.setContentAreaFilled(false);
		this.warningScreenButton.setOpaque(false);
		this.warningScreenButton.setPreferredSize(new Dimension(298, 150));
		this.warningScreenButton.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
            	AnimalCrossingGrow.gameScreen.setVisible(true);
                warningScreen.setVisible(false);
            }
        });
		this.warningScreen.add(this.warningScreenButton);
		
		
		
		// failScreen (실패 화면) 구성 
		this.failScreen.setBounds(0, 0, 1183, 813);
		this.frame.getContentPane().add(this.failScreen);
		this.failScreen.setLayout(null);
				
		// failScreen (실패 화면) 구성 - 돌아가기 버튼
		this.backToMainButton = new JButton(changebackImage);
		this.backToMainButton.setRolloverIcon(changebackImage2);
		this.backToMainButton.setBorderPainted(false);
		this.backToMainButton.setContentAreaFilled(false);
		this.backToMainButton.setOpaque(false);
		this.backToMainButton.setPreferredSize(new Dimension(298, 150));
		this.backToMainButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
		           mainScreen.setVisible(true);
		           failScreen.setVisible(false);
		    }
		});
		this.backToMainButton.setBounds(819, 600, 298, 150);
		this.failScreen.add(this.backToMainButton);
		
		
		
		
		
		
				
				
		
		
		
		
		
		
		
		
		
		// endingScreen (엔딩 화면) 구성 
		this.endingScreen.setBounds(0, 0, 1183, 813);
		this.frame.getContentPane().add(this.endingScreen);
		this.endingScreen.setLayout(null);
				
		// endingScreen (엔딩 화면) 구성 - 보러가기 버튼
		ImageIcon goImage = new ImageIcon("./image/goimage.PNG");
		Image goimg = goImage.getImage();
		Image changego = goimg.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changegoImage = new ImageIcon(changego);	
		
		ImageIcon goImage2 = new ImageIcon("./image/goimage2.PNG");
		Image goimg2 = goImage2.getImage();
		Image changego2 = goimg2.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changegoImage2 = new ImageIcon(changego2);
		this.goButton = new JButton(changegoImage);
		this.goButton.setRolloverIcon(changegoImage2);
		this.goButton.setBorderPainted(false);
		this.goButton.setContentAreaFilled(false);
		this.goButton.setOpaque(false);
		this.goButton.setPreferredSize(new Dimension(298, 150));
		this.goButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
		           endingScreen2.setVisible(true);
		           endingScreen.setVisible(false);
		    }
		});
		this.goButton.setBounds(819, 600, 298, 150);
		this.endingScreen.add(this.goButton);
		
		
		
		
				
		
		
		
		
		
		
		
		
				
				
		// endingScreen2 (엔딩 화면) 구성 
		this.endingScreen2.setBounds(0, 0, 1183, 813);
		this.frame.getContentPane().add(this.endingScreen2);
		this.endingScreen2.setLayout(null);
		
		// ending1Screen (엔딩 화면) 구성 - 화면 클릭
		this.clickScreenButton.setBorderPainted(false);
		this.clickScreenButton.setContentAreaFilled(false);
		this.clickScreenButton.setOpaque(false);
		this.clickScreenButton.setPreferredSize(new Dimension(1183, 813));
		this.clickScreenButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				//p.play();
		        endingScreen3.setVisible(true);
		        endingScreen2.setVisible(false);
		    }
		});
		this.clickScreenButton.setBounds(0, 0, 1183, 813);
		this.endingScreen2.add(this.clickScreenButton);
		
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		// endingScreen3 (엔딩 화면) 구성 
		this.endingScreen3.setBounds(0, 0, 1183, 813);
		this.frame.getContentPane().add(this.endingScreen3);
		this.endingScreen3.setLayout(null);
		
		// endingScreen3 (엔딩 화면) 구성 - 처음으로 버튼
		ImageIcon gotomainImage = new ImageIcon("./image/gotomain.PNG");
		Image gotomainimg = gotomainImage.getImage();
		Image changegotomain = gotomainimg.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changegotomainImage = new ImageIcon(changegotomain);	
		
		ImageIcon gotomainImage2 = new ImageIcon("./image/gotomain2.PNG");
		Image gotomainimg2 = gotomainImage2.getImage();
		Image changegotomain2 = gotomainimg2.getScaledInstance(298, 150, Image.SCALE_SMOOTH);
		ImageIcon changegotomainImage2 = new ImageIcon(changegotomain2);
		this.goToMainButton = new JButton(changegotomainImage);
		this.goToMainButton.setRolloverIcon(changegotomainImage2);
		this.goToMainButton.setBorderPainted(false);
		this.goToMainButton.setContentAreaFilled(false);
		this.goToMainButton.setOpaque(false);
		this.goToMainButton.setPreferredSize(new Dimension(298, 150));
		this.goToMainButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				   //p.stop();
		           mainScreen.setVisible(true);
		           endingScreen3.setVisible(false);
		    }
		});
		this.goToMainButton.setBounds(819, 600, 298, 150);
		this.endingScreen3.add(this.goToMainButton);
		
		
		
		
		
		
		
		
		
		
        

		
		
		// 시각화 결정
        this.mainScreen.setVisible(true);
		this.explainScreen.setVisible(false);
		this.selectScreen.setVisible(false);
		gameScreen.setVisible(false);
		this.missionScreen.setVisible(false);
		this.warningScreen.setVisible(false);
		this.cheerUpScreen.setVisible(false);
		this.failScreen.setVisible(false);
		this.endingScreen.setVisible(false);
		this.endingScreen2.setVisible(false);
		this.endingScreen3.setVisible(false);
	}
}