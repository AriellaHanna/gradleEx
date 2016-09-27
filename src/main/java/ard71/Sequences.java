public class Sequences{

	public static void main(String[] args){
		if (args.length != 2)
			System.out.println("Error 3: Invalid number of arguments");
		else if(!args[0].equals("lazy") && !args[0].equals("triangle"))
			System.out.println("Error 1: Invalid argument");
		else {
			try {
				int num = Integer.parseInt(args[1]);
				if (args[0].equals("lazy"))
				{
					System.out.println("Lazy(" + num + ") = " + lazy(num));
				}
				else
					System.out.println("Tri(" + num + ") = " + tri(num));
			}
			catch (IllegalArgumentException e) {
				System.out.println("Error 2: Second argument not an int");
			}
		}
	}
	
	public static int tri(int n) {
		int result = 0;
		for (int i = n; n >0; n--)
		{
			result += n;
		}
		return result;
	}
	
	public  static int lazy(int n){
		return (n*n + n + 2)/2;
	}
}

