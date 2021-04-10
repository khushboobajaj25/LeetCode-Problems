package LeetcodeProblems;

public class ValidSoduku {
}
class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] >= '0' && board[i][j] <= '9') {
                    boolean ans = check(board, i, board[i][j], j);
                    if (!ans) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean check(char[][] board, int row, char number, int col) {

        for (int k = 0; k < 9; k++) {
            if (k != col) {
                if (board[row][k] == number) {
                    return false;
                }
            }


        }
        for (int k = 0; k < 9; k++) {
            if (k != row) {
                if (board[k][col] == number) {
                    return false;
                }
            }

        }
        if (row < 3) {
            if (col < 3) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i != row && j != col) {
                            if (board[i][j] == number) {
                                return false;
                            }

                        }

                    }
                }
            } else if (col < 6) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 3; j < 6; j++) {
                        if (i != row || j != col) {

                            if (board[i][j] == number) {
                                return false;
                            }
                        }

                    }
                }
            } else if (col < 9) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 6; j < 9; j++) {
                        if (i != row || j != col) {

                            if (board[i][j] == number) {
                                return false;
                            }
                        }
                    }
                }
            }
        } else if (row < 6) {
            if (col < 3) {
                for (int i = 3; i < 6; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i != row || j != col) {

                            if (board[i][j] == number) {
                                return false;
                            }
                        }

                    }
                }
            } else if (col < 6) {
                for (int i = 3; i < 6; i++) {
                    for (int j = 3; j < 6; j++) {
                        if (i != row || j != col) {

                            if (board[i][j] == number) {
                                return false;
                            }
                        }
                    }
                }

            } else if (col < 9) {
                for (int i = 3; i < 6; i++) {
                    for (int j = 6; j < 9; j++) {
                        if (i != row || j != col) {

                            if (board[i][j] == number) {
                                return false;
                            }
                        }
                    }
                }
            }
        } else if (row < 9) {
            if (col < 3) {
                for (int i = 6; i < 9; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i != row || j != col) {

                            if (board[i][j] == number) {
                                return false;
                            }
                        }
                    }
                }
            } else if (col < 6) {
                for (int i = 6; i < 9; i++) {
                    for (int j = 3; j < 6; j++) {
                        if (i != row || j != col) {

                            if (board[i][j] == number) {
                                return false;
                            }
                        }
                    }
                }

            } else if (col < 9) {
                for (int i = 6; i < 9; i++) {
                    for (int j = 6; j < 9; j++) {
                        if (i != row || j != col) {

                            if (board[i][j] == number) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;


    }

}
