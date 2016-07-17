
//Complementable interface has the original binary version of the word == original
public class BinaryWord implements Complementable<Object>{
	
	public static String input;
	static byte[] bytes;
	static int bin;
	static String by;
	public static String result;
	
	//Changes word entered into binary in constructor
	public BinaryWord(String input)
	{
		BinaryWord.input = input;
		
		bytes = input.getBytes();
		
		for(int i = 0; i < bytes.length; i++)
		{
			 bin = Integer.parseInt(Byte.toString(bytes[i]));
			 by = Integer.toBinaryString(bin);
			System.out.print(by + " ");
		}
		System.out.println();
	}
	


	//Complement of binary word
	public void complement()
	{
		
		System.out.println("All complements start with '1'. Don't be alarmed."
				+ "The original bit is only 7 bits long.");
		
		
		for(int i = 0; i < bytes.length; i++)
		{
			bin = Integer.parseInt(Byte.toString(bytes[i]));
			result = Integer.toBinaryString((~bin) & 0xFF);
			System.out.println();
			
			System.out.print("Complement: " + result + " ");
		}
	}
	
	


}
