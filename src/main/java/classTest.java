import java.util.ArrayList;

/**
 * 
 */

/**
 * @author yolande.kegne
 *
 */
public class classTest {
	public class App 
	{
		

	    public App() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    public void m1() {
	    	String s="";
	    ArrayList<Object> list = new ArrayList<Object>();
	    	list.add(1);
	    	list=null;
	    	list.add(2);
	    	Object obj=getData();
	    	System.out.println(obj.toString());
	    }

		public Object getData() {
			// TODO Auto-generated method stub
			return null;
		}

		

		public void main( String[] args )
		
	    {
	        System.out.println( "Hello World!" );
	        App app=new App();
	        app.m1();
	    }
	}

}
