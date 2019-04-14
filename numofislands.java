import java.util.*;


class numofislands {

 public int numIslands(char[][] grid) {

    int sum = 0;

    for(int i=0;i<grid.length; i++)
    {

        for(int j=0;j<grid[i].length; j++)
        {

            if(grid[i][j]=='1')
            {
                sum++;
                dfs(grid,i,j);
            }
            //System.out.print(grid[i][j]);
        }
       // System.out.println();

    }

    return sum;
    }

    public void dfs(char[][] grid,int i,int j)
    {
        if((i>=0 && i<grid.length) && (j>=0 && j<grid[i].length))
        if(grid[i][j]=='1')
        {
            grid[i][j]='0';
            dfs(grid,i,j+1);
            dfs(grid,i,j-1);
            dfs(grid,i+1,j);
            dfs(grid,i-1,j);
        }
    }


}