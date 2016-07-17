import java.util.Collection;

public abstract class Semigroup<T> {
	
	public abstract T operator(T reciever);
	
	
	public static <T extends Semigroup<T>> T combine(Collection<T> element)
	{
		//Pull first element
		T first = element.iterator().next();
		//Removing first element
		element.remove(first); 
		
		for(T recieve : element)
		{
			
			first = first.operator(recieve);
		}
	
		return first;
	}
	

		
	
}
