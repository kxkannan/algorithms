
public class QuickUnionUF
{

  private int[] id;

  public QuickUnionUF(int N)
  {
    id = new int[N];
    for (int i=0; i < N; i++) id[i] = i;
  }

  private int root(int i)
  {
    while(i != id[i]) i = id[i];
    return i;
  }

  public boolean connected(int p, int q)
  {
    return root(p) == root(q);
  }

  public void union(int p, int q)
  {
    int i = root(p);
    int j = root(q);
    id[i] = j;
  }

  public static void main(String[] args) 
  {
     QuickUnionUF uf = new QuickUnionUF(10); 

     System.out.println("connected(0, 5) : " + uf.connected(0, 5));

     uf.union(0, 5);

     System.out.println("after union connected(0, 5) : " + uf.connected(0, 5));

   
    
  }

}
