class DisjointSet {
    int[] parent, rank;

    DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) parent[i] = i;
    }

    int find(int x) {
        if(parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    void union(int x, int y) {
        int px = find(x), py = find(y);
        if(px != py) {
            if(rank[px] < rank[py]) parent[px] = py;
            else if(rank[px] > rank[py]) parent[py] = px;
            else {
                parent[py] = px;
                rank[px]++;
            }
        }
    }
}

public class DisjointSetDemo {
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(5);
        ds.union(0, 1);
        ds.union(1, 2);
        ds.union(3, 4);
        System.out.println("Find 0: " + ds.find(0));
        System.out.println("Find 2: " + ds.find(2));
        System.out.println("Find 3: " + ds.find(3));
        System.out.println("Find 4: " + ds.find(4));
    }
}