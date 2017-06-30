
public class Floyd {

	private GrafoPonderado g;
	
	public Floyd(GrafoPonderado g) {
		this.g = g;
	}
	
	
	public int [][] run(){
		int[][] m = g.getM();
		int N = g.getSize();
		
		for(int i=0;i<N; i++){
			for(int j=0;j<N; j++){
				for(int k=0;k<N; k++){
					int c = ((m[j][i]==-1 || m[i][k]==-1)? -1: m[j][i] + m[i][k]);
					if(c>-1 && (c < m[j][k] || m[j][k]==-1)){
						m[j][k]=c;
					}
				}
			}
		}
		
		return m;
	}
	
}
