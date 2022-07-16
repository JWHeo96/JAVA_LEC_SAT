/**
 * 다차원 배열
 * @author TJ
 *
 */
public class MultipleArrayExample {

	public static void main(String[] args) {
		
		// ex) 1차원 배열 선언
		int[] arrInt = new int[5];
		
		// 한층에 방5개 짜리, 3층 건물을 지어봅시다.
		// 생성 후 따로 넣기
		int[][] arrIntMulti = new int[3][5];
		arrIntMulti[0][0] =1;
		arrIntMulti[0][1] =100;	// .........
		
		// 생성과 동시에 방에 데이터 채원허기
		int[] arrInt3 = {10, 20, 30};
		
		int[][] arrIntMulti2 = {
				{1,2,3,4},
				{2,3,4},
				{4,5,6}
		};

		int[][] a = new int[3][5];
		
		int z=1;
		for(int x =0; x < a.length; x++) {		// a.length == 3
			for(int y=0;y < a[x].length; y++) {	// a[x].length == 3
				a[x][y] = z++;
				System.out.print(a[x][y] + "\t");
			}System.out.println("");
		}
		
		// 층만 정해놓고 값 입력
		int[][] arrInt5 = new int[3][];
		arrInt5[0] = new int[] {1};
		arrInt5[1] = new int[] {2, 3};
		arrInt5[2] = new int[] {4, 5, 6};
		
		
		
	}
}
