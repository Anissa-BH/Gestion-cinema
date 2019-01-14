public class ExceptionStandard{
	private int[] tab=null;
	ExceptionStandard(int n)
	{
		tab=new int[n];
		for(int i=n-1;i>=0;i--)
			tab[i]=i;
	}
	public int sommeNPremierEntier(int n)
	{
		int res=0;
		for(int i=n-1;i>=0;i--)
			res +=tab[i];
		return res;
	}
	public static void main(String []args)
	{
		int dimmension=Integer.parseInt(arg[0]);
		ExceptionStandard ex=new ExceptionStandard(dimmension);
		int res=ex.sommeNPremierEntier(n);
		System.out.println(res);
	}
}