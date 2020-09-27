 import java.util.Locale;
 import java.util.Date;
 
 import java.text.DateFormat;
 import java.text.NumberFormat;
 
import java.util.ResourceBundle; 
 public class Test{
	 public static void main(String[] args){
		 Locale l = new Locale("it","IT");
		 NumberFormat nf = NumberFormat.getInstance(l);
		 
		 System.out.println(nf.format(23333.44444));  
		 
		 DateFormat df = DateFormat.getDateInstance(1,l);
		 System.out.println(df.format(new Date()));
		 
		 ResourceBundle rb = ResourceBundle.getBundle("abc",l);
		 System.out.println(rb.getString("welcome"));
	 }
 }