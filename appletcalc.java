import java.applet.*; import 
java.awt.*; 
public class appletcalc extends Applet{ public 
void paint(Graphics g){ int i = 
Integer.parseInt(getParameter("Value1")); int j= 
Integer.parseInt(getParameter("Value2")); int 
result=1; 
int ch= Integer.parseInt(getParameter("Choice")); 
if(ch==1){ 
result=i+j; } 
else if(ch==2){ 
result=i-j; } 
else if(ch==3){  
result=i*j; } 
else if(ch==4){ 
result =i/j; 
} 
String result1= Integer.toString(result); 
g.drawString("The result is "+result1, 100 ,100); 
} 
}
