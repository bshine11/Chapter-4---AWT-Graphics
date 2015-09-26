

	// Lab04bvst.java
	// The AWT Graphics Program
	// This is the student, starting version of Lab04b.
	 /*************************************
		 *                                   *
		 * @author Brendan Shine             *
		 * Mr. Kiedes Period 2               *
		 * 9-25-15                           *
		 *                                   *
		 ************************************/
		import java.awt.*;
		import java.applet.*;


		public class AWTGraphicsProgram extends Applet
		{

			public void paint(Graphics g)
			{
				// DRAW CUBE
				g.drawLine(50,50,100,150); //left line top
				g.drawLine(300,50,350,150); //right line top
				g.drawRect(50, 50, 250, 250); //top box
				g.drawRect(100, 150, 250, 250); //bottom box
				g.drawLine(50,300,100,400); //left bottom line
				g.drawLine(300,300,350,400); //right bottom line
				
				// DRAW SPHERE
				g.drawOval(75,100,250,250); //big circle
				g.drawOval(100,100,200,250); //1st vertical
				g.drawOval(125,100,150,250); //2nd vertical
				g.drawOval(150,100,100,250); //3rd vertical
				g.drawOval(175,100,50,250); //4th vertical
				g.drawOval(75,125,250,200); //1st horizontal
				g.drawOval(75,150,250,150); //2nd horizontal
				g.drawOval(75,175,250,100); //3rd horizontal
				g.drawOval(75,200,250,50); //4th horizontal

				// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
				g.drawOval(700,350,250,250); //big circle
				g.drawOval(737,452,108,108); //little circle
				g.drawLine(700, 483, 925, 400); //top line
				g.drawLine(797, 595, 925, 400); //bottom line
				g.drawLine(701, 483, 797,595);//connecting line
				// DRAW APCS
				//A
				g.fillRect(50, 450, 75, 25); //top line
				g.fillRect(50, 450, 25, 125); //left line
				g.fillRect(100, 450, 25, 125); //right line
				g.fillRect(50, 500, 75, 25); //middle line
				
				//P
				g.fillRect(150, 450, 75, 25); //top line
				g.fillRect(150, 450, 25, 125); //left line
				g.fillRect(200, 450, 25, 50); //right line
				g.fillRect(150, 500, 75, 25); //middle line
				
				//C
				g.fillRect(250, 450, 75, 25); //top line
				g.fillRect(250, 450, 25, 125); //left line
				g.fillRect(250, 550, 75, 25); //middle line
				
				//S
				g.fillRect(350, 450, 75, 25); //top line
				g.fillRect(350, 450, 25, 50); //left line
				g.fillRect(400, 500, 25, 50); //right line
				g.fillRect(350, 500, 75, 25); //middle line
				g.fillRect(350, 550, 75, 25); //bottom line
				// DRAW PACMEN FLOWER
				g.fillArc(525,350,100,100,135,270); //top arc
				g.fillArc(590,410,100,100,45,270); //right arc
				g.fillArc(460,410,100,100,225,270); //left arc
				g.fillArc(525,475,100,100,315,270); //bottom arc
			}

		}


