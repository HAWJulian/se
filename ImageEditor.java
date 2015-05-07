import javax.swing.*; 
import java.awt.event.*; 
import java.awt.*; 
import java.awt.image.*; 
import java.io.*; 
import javax.imageio.*; 

public class ImageEditor extends JFrame{ 
	public ImageEditor(){ 
	createMenuBar();
	setDefaultCloseOperation(EXIT_ON_CLOSE); 
	setTitle("Ich fuege einen Titel hinzu");
	setSize(400, 300); 
	setVisible(true); 
	} 
	
	public static void main(String[] args){
		ImageEditor frame = new ImageEditor();
	}
	
	private void createMenuBar(){
		JMenuBar menuBar = new JMenuBar(); 
		setJMenuBar(menuBar);
		JMenu menuFile = new JMenu("File"); 
		menuBar.add(menuFile);
		JMenuItem menuItemOpen = new JMenuItem("Open"); 
		menuFile.add(menuItemOpen);
		menuItemOpen.addActionListener(e -> {
			onOpen();
		});
	}
	private void onOpen(){
 		JOptionPane.showMessageDialog(this, "Open Selected");
	}
}
	