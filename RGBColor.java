
@SuppressWarnings("rawtypes")
public class RGBColor extends Semigroup<RGBColor> implements Complementable{
	private int x;
	private int y;
	private int z;
	
	public RGBColor(int x, int y,int z)
	{
		//Make sure numbers are in range using check...
		if((x >= 0) & (x <= 255))
			this.x = x;
		else
			throw new IllegalArgumentException("Number must be"
					+ "between 0 and 255");
		
		if((y >= 0) & (y <= 255))
			this.y = y;
		else
			throw new IllegalArgumentException("Number must be"
					+ "between 0 and 255");
		
		if((z >= 0) & (z <= 255))
			this.z = z;
		else
			throw new IllegalArgumentException("Number must be"
					+ "between 0 and 255");
	} 

	
	//Complement method
	public void complement()
	{
		int newx = 255 - x;
		int newy = 255 - y;
		int newz = 255 - z;
		
		System.out.println("\nOriginal color components: " + x + "/"
				+ y + "/" + z + "\n" + "Complement: "+ newx + "/" + newy + "/" 
				+ newz);
		
	}
	
	@Override
	//Find average of each component
	public RGBColor operator(RGBColor input) {
		
		int col1X = this.getX(), col1Y= this.getY(), col1Z = this.getZ(),
				inputX = input.getX(), inputY = input.getY(), inputZ = input.getZ();
		int avgX = 0, avgY = 0, avgZ = 0;
		
		avgX = (col1X + inputX) / 2;
		avgY = (col1Y + inputY) / 2;
		avgZ = (col1Z + inputZ) / 2;
		
		RGBColor result = new RGBColor(avgX, avgY, avgZ);
		
		System.out.println();
		System.out.printf("Combination color: %d/%d/%d", avgX, avgY, avgZ);
		return result;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
