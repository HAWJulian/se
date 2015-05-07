import javax.swing.*; 
import java.awt.event.*; 
import java.awt.*; 
import java.awt.image.*; 
import java.io.*; 
import javax.imageio.*; 

public class ImageEditor extends JFrame{ 
	public ImageEditor(){ 
	setDefaultCloseOperation(EXIT_ON_CLOSE); 
	setTitle("Ich fuege einen Titel hinzu");
	setSize(400, 300); 
	setVisible(true); } 
	
	public static void main(String[] args){
		ImageEditor frame = new ImageEditor();
	}
}
	