import java.lang.reflect.Array;


public class punkt_matrix {
		int[][] matrix;
		void punkt_matrix(punkt punkt){
			for(int i = 0; i <3; i++){
				for(int j = 0; j <3; j++){
					matrix[i][j] = 0;
				}
			}
			matrix[0][0] = punkt.x;
			matrix[1][1] = punkt.y;
			matrix[2][2] = punkt.z;
		}
		public int[][] getMatrix() {
			return matrix;
		}
		public void setMatrix(int[][] matrix) {
			this.matrix = matrix;
		}
	
}
