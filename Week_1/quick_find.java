public class quick_find {
    private int[] id;

    public quick_find(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q)
    {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if(id[i]==pid)
                id[i] = qid;
        }
    }
    public static void main(String[] args) {
        quick_find x = new quick_find(10);
        x.union(5, 7);
        x.union(7, 9);
        System.out.println(x.connected(5, 9));
        System.out.println(x.connected(5, 8));
    }
}