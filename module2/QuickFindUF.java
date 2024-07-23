public class QuickFindUF {

	private int[] id; // holds all ID's 
	
	//Constructor, set id of each object(?) to itself 
	public QuickFindUF(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++){
			id[i] = i;
		}
	}

	public void union(int p, int q) {
		//Assign all id[p] to id[q]
		int pid = id[p];
		int qid = id[q];
		for(int i = 0; i < id.length; i++){
			if (id[i] == pid) { 
				id[i] = qid;
			}
		}
	}

	public boolean find(int p, int q) {
		return id[p] == id[q];
	}
}
