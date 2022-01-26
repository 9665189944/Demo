import java.applet.Applet;
import java. awt.Graphics;
public class appletexample extends Applet{

String str;
public void init()
{
str=getParameter("string");
{
if(str=="")
str="JAVA";
else
str="Hello"+str;
}}

public void paint(Graphics g)
{
g.drawString(str,120,130);
}
}

Creation of HTML file:

<html>
<body bgcolor=cyan>
<Applet CODE="appletexample.class" height ="300" width="300"/>
<PARAM NAME="string" value=" ">
</Applet>
</body>
</html>