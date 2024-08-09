

public class QuickUnionUF {
	private int[] id; // holds all ID's 
	private int[] sz; //holds size of id[i] at sz[i]
	
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

		if (i == j) return;
		if (sz[i] < sz[j]) { id[i]  = j; sz[j] += sz[i]; }
		else 							 { id[j]  = i; sz[i] += sz[j]; }			
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

//no need to create root data stucture as it is just a single value
