public class Solution {
    public void solve(char[][] board) {
        if (board.length == 0)
            return;

        int m = board.length;       // Row
        int n = board[0].length;    // Column

        // Mark border-connected 'O's with '*'
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                // i == 0 || i == m - 1 -> Traverse First row & Last row 
                // j == 0 || j == n - 1 -> Traverse First col & Last col 
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    dfs(board, i, j);
                }
            }
        }

        // Flip all 'O' to 'X' and '*' back to 'O'
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    // Depth-first search to mark border-connected 'O's
    private void dfs(char[][] board, int i, int j) {
        // Handling index out of bound and X
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = '*'; // Temporarily mark as '*'
        dfs(board, i + 1, j); // Down
        dfs(board, i - 1, j); // Up
        dfs(board, i, j + 1); // Right
        dfs(board, i, j - 1); // Left
    }
}
