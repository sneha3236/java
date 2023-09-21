import java.awt.*;
class frame
{ 
public static void main(String ar[])
{
Frame f=new Frame("my first frame");
TextArea ta=new TextArea();
MenuBar mb=new MenuBar();
Menu m1=new Menu("file");
Menu m2=new Menu("edit");
MenuItem mi1=new MenuItem("new");
MenuItem mi2=new MenuItem("open");
MenuItem mi3=new MenuItem("save");
MenuItem mi4=new MenuItem("-");
MenuItem mi5=new MenuItem("exit");
MenuItem mi6=new MenuItem("cut");
MenuItem mi7=new MenuItem("copy");
MenuItem mi8=new MenuItem("paste");
m1.add(mi1);
m1.add(mi2);
m1.add(mi3);
m1.add(mi4);
m1.add(mi5);
m2.add(mi6);
m2.add(mi7);
m2.add(mi8);
mb.add(m1);
mb.add(m2);
Font ft=new Font("Arial",1,28);
Color bc=new Color(255,255,255);
ta.setBackground(bc);
ta.setForeground(Color.black);
ta.setFont(ft);
f.setMenuBar(mb);
f.add(ta);
f.setVisible(true);
f.setSize(400,400);
}
}