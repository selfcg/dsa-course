

public class QuickUnionUF {
	private int[] id; // holds all ID's 
	
	//Constructor, set id of each object(?) to itself 
	public QuickUnionUF(int N) {
		id = new int[N];
		System.out.println("Initialized new QuickUnion of size: " + N);
		for (int i = 0; i < N; i++) id[i] = i;
	}

	public int getRoot(int i) {
		while (id[i] != i) { i = id[i];}
		return i;
	}

	public void union(int p, int q) {
		int i = getRoot(p);
		int j = getRoot(q);
		id[i] = j;
		System.out.println("Created union between " + p + " and " + q);
	}

	public boolean connected(int p, int q){
		//check if p and q have the same root
		if (getRoot(p) == getRoot(q)) {
			System.out.println(p + " and " + q + " are connected");
		} else {
			System.out.println(p + " and " + q + " are not connected");
		}
		return getRoot(p) == getRoot(q);
	}

}
