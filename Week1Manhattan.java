public class Week1Manhattan

{
	
	public static void main (String [] args)
	{
		int x = 3;
		int y = 4;
		int ysquare = y * y;
		int f = 3;
		
		int xclinic1 = 5;
		int yclinic1 = 2;
		int yclinic1square = yclinic1 * yclinic1;
		int fclinic1 = 1;
		
		int xclinic2 = 10;
		int yclinic2 = 30;
		int yclinic2square = yclinic2 * yclinic2;
		int fclinic2 = 9;
		
		int d1 = 0;
		int d2 = 0;
		
	d1 = (x-xclinic1) + (ysquare-yclinic1square) + f + fclinic1;
	d1 = Math.abs(d1);
	System.out.println(d1);
	
	d2 = (x-xclinic2) + (ysquare-yclinic2square) + f + fclinic2;
	d2 = Math.abs(d2);
	System.out.println(d2);
	
	if (d1 < d2)
		{
			System.out.println("Clinic1 is closest at " + d1);
		}
	else
		{
			System.out.println("Clinic2 is closest at " + d2);
		}
	}
	
}