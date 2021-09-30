class DecimalOctalHexaBinary
{
	public static void main(String[] args) 
	{
		int a = 12;
		int b = 014; //10진수 앞에 0붙이면 8진수
		int c = 0xC; //표시하려는숫자 앞에 0x 붙이면 16진수
		int d = 0b1100; //2진수로 표현하려면 앞에 0b 붙이기

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
	}
}

/*
8진수   10진수	  16진수		2진수
-----------------------------------------------------------
0		0		0		0
1		1		1		1
2		2		2		10
3		3		3		11
4		4		4		100
5		5		5		101
6		6		6		110
7		7		7		111
10		8		8		1000	
11		9		9		1001
12		10		A		1010
13		11		B		1011
14		12		C		1100
		13		D
		14		E
		15		F
		16		10
		17		11

*/