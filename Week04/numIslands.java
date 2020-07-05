class Solution {
    int count = 0;
    int m =0;
        int n = 0;
    public int numIslands(char[][] grid) {
        m = grid.length;
        if (m ==0) return 0;
        n = grid[0].length;

        for(int i=0;i<m; i++){
            for(int j=0;j<n; j++) {
                if (grid[i][j] == '1') {
                    dfsMarking(grid,i,j);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfsMarking (char[][] grid,int i,int j) {
        if (i< 0 || j < 0 || i>= m|| j>= n || grid[i][j] != '1') {
            return;
        }

        grid[i][j] = '0';
        dfsMarking(grid,i+1,j);
        dfsMarking(grid,i-1,j);
        dfsMarking(grid,i,j+1);
        dfsMarking(grid,i,j-1);
    }
}