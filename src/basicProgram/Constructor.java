package basicProgram;

public class Constructor {
	Constructor()
	{
		System.out.println("i love india");
	}
	Constructor(int a)
	{
		System.out.println("i hate pakistan");
	}
	Constructor(String s)
	{
	System.out.println("my computer name is hp");
	}
	public static void main(String[] args) {
		new Constructor();
		new Constructor(50);
		new Constructor("computer");

	}

}
