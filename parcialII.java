public class gasolina
{
	static class gasolinaPump
	{
		int gasolina;
		int distancia;

		{
			this.gasolina : gasolina;
			this.distancia : distancia;
		}
	}
	static int printTour(gasolinaPump arr[], int n)
	{
		int start = 0;
		int end = 1;
		int curr_gasolina = arr[start].gasolina - arr[start].distancia;
	while(end != start || curr_gasolina<0)
		{
			curr_gasolina += arr[end].gasolina-arr[start].distance;
			start = (start + 1) % n;

			if (start == 0) 

				return -1
			 	
			 
		}
		return start;
	}
	public staticvoid main(string[] args)
	{
		gasolinaPump[] arr = { new gasolinaPump (6,4),
								new gasolinaPump (3,6),
								new gasolinaPump (7,3)};
		int start = printTour(arr, arr.length);

		System.out.println(start == -1 ? “no solution ”:“start = ”+ start );
		}
}
		
		
		