package basics.impl;

public class Matrix {
	
	private double[][] matrix;
	
	public Matrix(int size){
		matrix = new double[size][size];
		for(int i = 0; i<size;i++){
			for(int j = 0; j<size;j++){
				matrix[i][j] = 1;
			}
		}
	}
	
	public Matrix(double[][] matrix){
		this.matrix = matrix;
	}
	
	public boolean isSquareMatrix(){
		return matrix.length == matrix[0].length;
	}
	
	public void transpose(){
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		double[][] transposed = new double[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				transposed[j][i] = matrix[i][j];
			}
		}
		
		matrix = transposed;
	}
	
	public Integer trace(){
		if(isSquareMatrix()){
			int sum = 0;
			
			for(int i=0;i<matrix.length;i++){
				sum += matrix[i][i];
			}
			return sum;
		}
		return null;
	}
	
	public void add(Matrix m){
		if(matrix.length == m.matrix.length && matrix[0].length == m.matrix[0].length){
			for(int i=0;i<matrix.length;i++){
				for(int j=0;j<matrix[0].length;j++){
					matrix[i][j] += m.matrix[i][j];
				}
			}
		}
	}
	
	@Override
	public boolean equals(Matrix m){
		boolean equal = true;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j] != m.matrix[i][j]){
					equal = false;
				}
			}
		}
		return equal;
	}
	
	@Override
    public int hashCode() {
        return matrix.hashCode();
    }
	
	@Override
    public String toString() {
        return matrix.toString();
    }
}