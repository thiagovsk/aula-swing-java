import javax.swing.*;  

public class FrameElementos {  
    
    JFrame frame;  
    
    FrameElementos(){  
        frame=new JFrame();
        
        //cria um botao
        JButton botao = new JButton("click");
        //configurar o tamanho do button
        botao.setBounds(130,100,100, 40);  
        
        // adiciona um label de texto
        JLabel label = new JLabel("Birl");
        
        //adiciona os elementos no frame
        frame.add(botao);
        frame.add(label);
        
        frame.setSize(400,500);  
        frame.setLayout(null); 
        frame.setVisible(true); 
    }  
      
    public static void main(String[] args) {  
        new FrameElementos();  
    }  
 }  