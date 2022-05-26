

import java.util.UUID;

class UUIDMaker
{
	 public void run()
	 {
		for(int i=0; i<10; i++)
		{
			System.out.println(UUID.randomUUID());
		}
	 }
	 
	 public static void main(String[] args)
	 {
		(new UUIDMaker()).run();
	 }
}