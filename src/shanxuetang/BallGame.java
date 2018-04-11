package shanxuetang;

import java.awt.*;

public class BallGame extends Frame {
    //球桌和桌球图片
    Image ball = Toolkit.getDefaultToolkit().getImage("F:\\Javaprogram\\practices\\src\\shanxuetang\\images\\ball01.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("F:\\Javaprogram\\practices\\src\\shanxuetang\\images\\table.png");
    //桌球起始位置
    double x=100;
    double y=100;
    //桌球移动的初始角度60°
    double degree = 3.14/3;
    /**
     * 绘制一次桌面和桌球
     */
    public void paint(Graphics g){
        //绘制一次桌面和桌球
        System.out.println("窗口被画了一次！");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);
        //桌球的下一次坐标位置
        x=x+10*Math.cos(degree);
        y=y+10*Math.sin(degree);
        //到了桌子四个边框后桌球角度的变化
        //1.如果到了底部，变角度
        if(y>480-30-40){  //480是桌球高度，30是球的直径，40是桌边框宽度
            degree = -degree;
        }
        //2.如果到了右边界，变角度
        if(x>856-30-40){
            degree = 3.14-degree;
        }
        //3.上边界
        if(x<20+20){
            degree = 3.14-degree;
        }
        //4.左边界
        if(y<20+20){
            degree = -degree;
        }
    }
    /**
     * 绘制多次桌面和桌球
     */
    void launchFrame(){
        //四个方法什么含义，
        setSize(856,480);  //图片来源不同，效果不同
        setLocation(50,50);
        setTitle("作品！！！");
        setVisible(true);
        //每隔40毫秒绘制一次桌面和桌球
        while(true){
            repaint();  //重画窗口！
            try{
                Thread.sleep(40);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        System.out.println("我是林");
        BallGame bg = new BallGame();
        bg.launchFrame();
    }
}
