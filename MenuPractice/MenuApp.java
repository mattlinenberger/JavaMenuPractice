import javax.swing.*;
import java.awt.*;

public class MenuApp extends JFrame
{
   public static void main ( String [] args )
   {
      new MenuApp( );
   }
   
   public MenuApp( )
   { 
      // ** WINDOW
      super( "Menu Demo" );
      this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      // ** MENU BAR
      JMenuBar menuBar = new JMenuBar( ); // build 
      this.setJMenuBar( menuBar );        // add to window
      // add menus
      FileMenu fileMenu = new FileMenu( );
      ColorMenu colorMenu = new ColorMenu( this );
      EditMenu editMenu =  new EditMenu( );
      menuBar.add( fileMenu );
      menuBar.add( colorMenu );
      menuBar.add( editMenu );
      this.getContentPane( ).setBackground( colorMenu.getSelectedColor( ) );
      // Configure window and display
      this.setSize( 600, 300 );
      this.setVisible( true );
   }
}