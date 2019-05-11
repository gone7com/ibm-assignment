class SecondFreqChar
{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		char []temp = str.toCharArray();
		int count = 0; int max1 = 0; int max2 = 0;
		char firstmax = 0; char secondmax = 0;
		for (int i = 0; i < temp.length ; i++ )
		{
			count = 0;
			for (int j = 0; j < temp.length ; j++ )
			{
				if(temp[i] == temp[j])
					count++;
			}

			if(count > max1)
			{
				max2 = max1;
				secondmax = firstmax;
				max1 = count;
				firstmax = temp[i];
			}
			else if(count < max1 && count > max2)
			{
				max2 = count;
				secondmax = temp[i];
			}

			System.out.println("firstmax: "+firstmax+" secondmax : "+secondmax);
		}

		System.out.println("Answer: "+secondmax);
	}
}
