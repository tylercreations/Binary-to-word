
public class BinaryToWord implements Complementable<Object>{
	
	public static String recieve;
	static byte[] bytes;
	static int bin;
	static String by;
	public static String result;
	

	public BinaryToWord(String recieve)
	{
		BinaryToWord.recieve = recieve;
		
		bytes = recieve.getBytes();
		
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
		
		
		for(int i = 0; i < bytes.length; i++)
		{
			bin = Integer.parseInt(Byte.toString(bytes[i]));
			result = Integer.toBinaryString((~bin) & 0xFF);
			System.out.println();
			
		
		}
	}
	
	


}
