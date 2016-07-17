import java.util.ArrayList;
import java.util.Scanner;


public class Project3 {

	
	//not sure why rawtypes is necessary
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Program beginning
		System.out.println("Please, enter a word: ");
		String binaryWord;
		binaryWord = input.next();
		
		
		//adding word to interface
		Complementable binWord = new BinaryWord(binaryWord);
		binWord.complement();
		binWord.toString();
		
		

		System.out.println("Enter color components as ints please,complementable will be printed: ");
		
		ArrayList<Integer> rgbList = new ArrayList<Integer>();
		
		int count = 0;
		while(count < 3)
		{
			int color = input.nextInt();
			rgbList.add(color);
			count++;
		}
		
		
		RGBColor color = new RGBColor(0,0,0);
		for(int value : rgbList)
		{
			System.out.print(value + "/");
		}
		
		//setting color components
		color.setX(rgbList.get(0));
		color.setY(rgbList.get(1));
		color.setZ(rgbList.get(2));
		
		color.complement();
		
		
		
		
		System.out.println();
		System.out.println("Enter color components as ints please: ");
		System.out.println("3 ints please: ");
		RGBColor color2 = new RGBColor(0,0,0);
		ArrayList<Integer> colorList = new ArrayList<Integer>();
		
		int current = 0;
		while(current < 3)
		{
			int color1 = input.nextInt();
			colorList.add(color1);
			current++;
		}
		
		for(int value : colorList)
		{
			System.out.print(value + "/");
		}
		color2.setX(colorList.get(0));
		color2.setY(colorList.get(1));
		color2.setZ(colorList.get(2));
		
		System.out.println();
		System.out.println("3 ints,please: ");
		RGBColor color3 = new RGBColor(0,0,0);
		ArrayList<Integer> secondColor = new ArrayList<Integer>();
		
		int temp = 0;
		while(temp < 3)
		{
			int secCol = input.nextInt();
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
		color2.operator(color3); 
		

		System.out.println();
		System.out.println("Enter a few integers, separated by a space please:");
		System.out.println("After entering the integers, enter a plus sign:");
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<PositiveInteger> tempList = new ArrayList<PositiveInteger>();
		ArrayList<PositiveInteger> ints = new ArrayList<PositiveInteger>();
	
		
		input.next();
		while(input.hasNextInt())
		{
			int post = input.nextInt();
			list.add(post);
		}
		
		
		
		for(int value : list)
		{
			System.out.println(value);
			ints.add(new PositiveInteger(value));
		}
		
		for(int i = 0; i < ints.size(); i++)
			tempList.add(ints.get(i));
			
		//continue adding to the list
		PositiveInteger.combine(tempList); 
		input.close();

	}

}
