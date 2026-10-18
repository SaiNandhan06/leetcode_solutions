class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int x = 0;
        int y = 0;
        int rowRange = grid.length;
        int colRange = grid[0].length;

        boolean[][] visited = new boolean[rowRange][colRange];
        visited[x][y] = true;
        while(true){ 
            int nx = x;//next row 
            int ny = y;//next column
            if(grid[x][y] == 'R'){
                ny++;
            }else if(grid[x][y] == 'L'){
                ny--;
            }else if(grid[x][y] == 'U'){
                nx--;
            }else{
                nx++;
            }
            
            if(nx < 0 || nx >= rowRange || ny < 0 || ny >= colRange || visited[nx][ny]) break;

            x = nx;
            y = ny;
            visited[x][y] = true;
        }
        return new int[]{x,y};
    }
}
