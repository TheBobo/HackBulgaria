import java.util.Date;


public class DateLogger  extends  Logger{
	public DateLogger() {
		super(0);
	}
	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub
		super.log(msg);
		Date dt = new Date();
		System.out.println(dt +" 3 =>" + msg );
	}

}
