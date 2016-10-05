import javax.swing.*;  

public class FrameSimples {  
    
    JFrame frame;  
    
    FrameSimples(){  
        frame=new JFrame();
        
        JButton b = new JButton("click");
        //configurar o tamanho do button
        b.setBounds(130,100,100, 40);  
        
        //adiciona o elemento no frame
        frame.add(b);  
              
        frame.setSize(400,500);  
        frame.setLayout(null); 
        frame.setVisible(true);  
    }  
      
    public static void main(String[] args) {  
        new FrameSimples();  
    }  
 }  