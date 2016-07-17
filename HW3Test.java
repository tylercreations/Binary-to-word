import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HW3Test {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		//Make arraylists for pos ints and RGBColors
		
		//Testing BinaryWord class
		System.out.println("Enter a word: ");
		String binaryWord;
		binaryWord = inp.next();
		Complementable binWord = new BinaryWord(binaryWord);
		binWord.complement();
		binWord.toString();
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		//Testing RGBColor class
		System.out.println();
		System.out.println();
		System.out.println("Enter color components as ints to get complements: ");
		
		ArrayList<Integer> rgbList = new ArrayList<Integer>();
		
		int count = 0;
		while(count < 3)
		{
			int color = inp.nextInt();
			rgbList.add(color);
			count++;
		}
		
		//Print components in arraylist
		RGBColor color = new RGBColor(0,0,0);
		for(int value : rgbList)
		{
			System.out.print(value + "/");
		}
		color.setX(rgbList.get(0));
		color.setY(rgbList.get(1));
		color.setZ(rgbList.get(2));
		
		color.complement();//Works!!!!
		
		
		
		
		//Testing combine() method
		System.out.println();
		System.out.println("Enter color components as ints to blend colors: ");
		System.out.println("Color 1(3 ints): ");
		RGBColor color2 = new RGBColor(0,0,0);
		ArrayList<Integer> colorList = new ArrayList<Integer>();
		
		int cu = 0;
		while(cu < 3)
		{
			int color1 = inp.nextInt();
			colorList.add(color1);
			cu++;
		}
		
		for(int value : colorList)
		{
			System.out.print(value + "/");
		}
		color2.setX(colorList.get(0));
		color2.setY(colorList.get(1));
		color2.setZ(colorList.get(2));
		
		System.out.println();
		System.out.println("Color 2(3 ints): ");
		RGBColor color3 = new RGBColor(0,0,0);
		ArrayList<Integer> secondColor = new ArrayList<Integer>();
		
		int temp = 0;
		while(temp < 3)
		{
			int secCol = inp.nextInt();
			secondColor.add(secCol);
			temp++;
		}
		
		for(int value : secondColor)
		{
			System.out.print(value + "/");
		}
		color3.setX(secondColor.get(0));
		color3.setY(secondColor.get(1));
		color3.setZ(secondColor.get(2));
		color2.operator(color3); //Works!!!!!
		
		
////////////////////////////////////////////////////////////////////		
		//Testing PositiveInt class
		System.out.println();
		System.out.println("Enter a few integers on one line, separated by a space, and I will add them for you:");
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<PositiveInteger> tempList = new ArrayList<PositiveInteger>();
		ArrayList<PositiveInteger> ints = new ArrayList<PositiveInteger>();
		Pattern delimit = Pattern.compile(System.getProperty("lineseparator")+"|\\s");
		inp.useDelimiter(delimit);
		
		inp.next();
		while(inp.hasNextInt())
		{
			int post = inp.nextInt();
			list.add(post);
		}
		
		System.out.println("\nYour numbers: \n");
		
		for(int value : list)
		{
			System.out.println(value);
			ints.add(new PositiveInteger(value));
		}
		
		for(int i = 0; i < ints.size(); i++)
			tempList.add(ints.get(i));
			
		PositiveInteger.combine(tempList); //works....
		
		inp.close();

	}

}
