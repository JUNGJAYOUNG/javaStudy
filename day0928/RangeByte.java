class RangeByte 
{
	public static void main(String[] args) 
	{     
		byte data;
		data = -128;
		System.out.println(data); //underFlow
		data = (byte)(data-1);
		System.out.println(data);
	}
}

/*
	byte data;
	data = 127;
	System.out.println(data);
	data = (byte)(data+1);		//overFlow
	System.out.println(data);


127
-128
*/