
public class Tower {
	
	
	String name;
	
	public void draw()
	
	{
		drawPole();
		
		// draw the small disk
        Disk small = new Disk(4);
        small.draw();

        // draw the medium disk
        Disk medium = new Disk(8);
        medium.draw();

        // draw the large disk
        Disk large = new Disk(12);
        large.draw();
        
        
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
