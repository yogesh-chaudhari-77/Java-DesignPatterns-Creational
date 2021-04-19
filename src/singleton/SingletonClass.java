package singleton;

/**
 * This is a singleton class demo. 
 * Constructor has been made private to hide it from outside world. So no one will be able to create object using new Singleton();
 * public method is provided for getting the instance.
 * static so that it can be called without having the first instace in place.
 * The self reference is static as well to make sure that there is only one instance at any time.
 *  
 * @author Yogeshwar Chaudhari
 *
 */
public class SingletonClass {

	private static SingletonClass instance = null;
	private int i = 0;
	
	private SingletonClass() {
		System.out.println("This will be called only once. Subsequent calls will return same instance.");
	}
	
	
	// Public method for outside world
	// Static so that you can call it without that first object.
	public static SingletonClass getInstance() {
	
		if(instance == null) {
			instance = new SingletonClass();
		}
		
		return instance;
	}
	
}
