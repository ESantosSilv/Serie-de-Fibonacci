public class main {
		  public static void main (String args []){
		  //Variables para guardar el dato nuevo y anterior.
			  int x=1;
			  int anterior=0;
			  int temp;
			  
			  while(true)
			  {
				  System.out.println(x);
				  temp =x;
				  x=x+anterior;
				  anterior=temp;
				  if(x>100)
				  {break;}
			  }	

		   }
	}
