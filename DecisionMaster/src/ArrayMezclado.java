import java.util.Random;

public class ArrayMezclado {
	
	public String[] pasaArray ()
	{
		String[] arrayNuevo ={"H","I","J","K","L","M","N","O" };
		return arrayNuevo;
	}
	
	public void mezclaArray(int[] array)
	{
	    int index;
	    int temp;
	    Random random = new Random();
	    
	    for (int i = array.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = array[index];
	        array[index] = array[i];
	        array[i] = temp;
	    }
	    
	}
}
