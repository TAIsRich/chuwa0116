import java.util.*;



public class parking{
    private int row;
    private int col;
    private int num;
    private int[][] lot;
    parking(){
        this.row=1;
        this.col=1;
        lot=new int[row][col];
        this.num=this.row*this.col;
    }
    parking(int row,int col)
    {
        this.row=row;
        this.col=col;
        lot=new int[row][col];
        this.num=this.row*this.col;
    }
    public void park(int x,int y)
    {
        if(this.lot[x][y]==1)
        {
            System.out.println("Parking spot occupied");
            return ;
        }
        this.lot[x][y]=1;
        --this.num;
    }

    public void free(int x,int y)
    {
        if(this.lot[x][y]==0)
        {
            System.out.println("Parking spot already empty");
            return ;
        }
        this.lot[x][y]=0;
        ++this.num;
    }
    public int get_remaining(){
        return this.num;
    }

    public bool is_available(int x,int y)
    {
        return this.lot[x][y]==0;
    }

    public void show_lot(){
        for(int i=0;i<this.row;++i)
        {
            for(int j=0;j<this.col;++j)
            {
                System.out.print(this.lot[i][j]);
                System.put.print(" ");
            }
            System.out.println();
        }
    }
}