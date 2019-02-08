package covariantreturntype;

class superclass{
	superclass get()
	{
		System.out.println("this is the superclass");
		return this;
	}
}
class subclass extends superclass
{
	subclass get()
	{
		System.out.println("this is the subclass");
		return this;
	}
}
public class CovariantReturnType {
	public static void main(String []args)
	{
		subclass s=new subclass();
		s.get();
	}

}
