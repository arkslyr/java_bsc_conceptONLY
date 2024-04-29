import java.awt.event.*;
import java.applet.*;
import java.awt.*;
public class MouseTests extends Applet implements MouseListener,MouseMotionListener
{
  public void init()
  {
    addMouseListener(this);
    addMouseMotionListener(this);
  }
  public void mouseClicked(MouseEvent me)
  {
    showStatus("mouseClicked"+me.getX()+","+me.getY());
  }
  public void mousePressed(MouseEvent me)
  {
    showStatus("mousePressed"+me.getX()+","+me.getY());
  }
  public void mouseReleased(MouseEvent me)
  {
    showStatus("mouseReleased"+me.getX()+","+me.getY());
  }
  public void mouseEntered(MouseEvent me)
  {
    showStatus("mouseEntered"+me.getX()+","+me.getY());
  }
  public void mouseExited(MouseEvent me)
  {
    showStatus("mouseExited"+me.getX()+","+me.getY());
  }
  public void mouseMoved(MouseEvent me)
  {
    showStatus("mouseMoved"+me.getX()+","+me.getY());
  }
  public void mouseDragged(MouseEvent me)
  {
    showStatus("mouseDragged"+me.getX()+","+me.getY());
  }
}