class MatrixTest02
{
	public static void main(String[] args) 
	{
		int [][][]a;
		a = new int[2][3][4];	//[��][��][��]

		for(int i=0;i<2;i++){	//��:0,1
			for(int j=0;j<3;j++){	//��:0,1,2
				for(int k=0;k<4;k++){	//��:0,1,2,3
					a[i][j][k]=i+1;
				}
			}
		}

		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<4;k++){
					System.out.printf("%5d",a[i][j][k]); //%5d �������� 5ĭ�� ä���ش�(4ĭ�� �������)
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
