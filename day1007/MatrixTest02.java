class MatrixTest02
{
	public static void main(String[] args) 
	{
		int [][][]a;
		a = new int[2][3][4];	//[면][행][열]

		for(int i=0;i<2;i++){	//면:0,1
			for(int j=0;j<3;j++){	//행:0,1,2
				for(int k=0;k<4;k++){	//열:0,1,2,3
					a[i][j][k]=i+1;
				}
			}
		}

		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<4;k++){
					System.out.printf("%5d",a[i][j][k]); //%5d 숫자포함 5칸을 채워준다(4칸의 공백생김)
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
