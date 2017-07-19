import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo3 extends JFrame
{
   // Declare application commands
  
   public static void main ( String [] args )
   {
      new MenuDemo3( );
   }

   public MenuDemo3( )
   { 
      // ** WINDOW
      super( "Menu Demo" );
      this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      // ** MENU BAR
      JMenuBar menuBar = new JMenuBar( ); // build 
      this.add( menuBar );
      menuBar.add( new FileMenu( menuBar ) );
      menuBar.add( new ColorMenu( menuBar ) );
      // Configure window and display
      this.setSize( 600, 300 );
      this.setVisible( true );
   }
}