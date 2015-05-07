import javax.swing.*; 
import java.awt.*; 
import java.awt.image.*;  
public class ImageEditorPanel extends JPanel
{    
	private BufferedImage image;    
	public void setImage(BufferedImage img)
	{       
		image = img;       
		repaint();    
	}
	
	@Override
    public void paintComponent(Graphics g)
	{      
		if (image != null)
		{          
			g.drawImage(image, 0, 0, getWidth(), getHeight(),   null);       
		}    
	}    
	
	@Override    
	public Dimension getPreferredSize()
	{       
		return new Dimension(400, 300);    
	} 
	
	private void setDummyImage()
	{    
		BufferedImage bufferedImage =  new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);    
		Graphics g = bufferedImage.getGraphics();    
		g.setColor(Color.YELLOW);    
		g.fillOval(10, 10, 380, 280);    
		panel.setImage(bufferedImage); 
	} 
}