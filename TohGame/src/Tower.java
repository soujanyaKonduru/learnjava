
public class Tower {
	
	
	String name;
	
	public void draw()
	
	{
		drawPole();
		
		// draw the small disk
        Disk small = new Disk(4);
        small.draw();

        // draw the medium disk
        Disk medium = new Disk(6);
        medium.draw();

        // draw the large disk
        Disk large = new Disk(8);
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
	 System.out.println(" ______________ ");
	}
	
	public void drawTitile()
	
	{
		System.out.println("    " + name);
	}
	

}
