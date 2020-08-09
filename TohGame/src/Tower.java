
public class Tower {
	
	
	String name;
	
	public void draw()
	
	{
		drawPole();
        drawBase();
        drawTitile();
	}
	public void drawPole()
	
	{
		for(int i=0; i<4; i++){
            System.out.println("     |");
        }
	}
	
	public void drawBase()
	
	{
	 System.out.println("  ------------------");
	}
	
	public void drawTitile()
	
	{
		System.out.println("    " + name);
	}
	

}
