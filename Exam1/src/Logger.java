
public class Logger {
 public Integer loggerLevel;
 public Logger(int level){
	 this.loggerLevel=level;
 }
 
 public void log(int levelMsg, String msg)
 {
	 if(this.loggerLevel>=levelMsg)
	 {
		 System.out.println(levelMsg + "=>" + msg);
	 }
 }
 
 public void log(String msg)
 {
	 int levelMsg=3;
	 if(this.loggerLevel>=levelMsg)
	 {
		 System.out.println(levelMsg + "=>" + msg);
	 }
 }
 
 public void setLevel(int newLevel){
	 this.loggerLevel = newLevel;
 }
 
}


 
