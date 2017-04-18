import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.event.MouseInputAdapter;

public class Circle extends JPanel{

  // コンストラクタ（初期化処理）
  Circle() {
      setPreferredSize(new Dimension(500,500));
  }

  // 画面描画
  public void paintComponent(Graphics g) {
      // 円を描く
      //一つ目
      g.setColor(Color.green);
      g.fillOval(10, 10, 480, 480);
      g.setColor(Color.black);
      g.drawOval(10, 10, 480, 480);
      //二つ目
      g.setColor(Color.yellow);
      g.fillOval(250, 250, 200, 200);
      g.setColor(Color.black);
      g.drawOval(250, 250, 200, 200);
      Integer r = 200/2;
      //大きい方の円は関係ない
      // g.drawLine(250, 250+r, 250+2*r, 250+r);
      // g.drawLine(250+r, 250, 250+r, 250+2*r);
      //大きい方の円が関係する
      g.drawLine(250, 250, 250+2*r, 250+2*r);
      g.drawLine(250, 250+2*r, 250+2*r, 250);
  }

  void Windows(){
    // ウィンドウの作成と表示
    JFrame frame = new JFrame();
    frame.setTitle("Circle");
    frame.getContentPane().setLayout(new FlowLayout());
    frame.getContentPane().add(new Circle());
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setVisible(true);
  }

  void run(){
    this.Windows();
  }

  public static void main(String[] args) {
      Circle circle = new Circle();
      circle.run();
  }
}
