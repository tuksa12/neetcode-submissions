class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean horizontal;
        boolean vertical;

        Map<Character, List<Character>> mapColumn = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            horizontal = isValidHorizontal(board[i]);
            if (!horizontal) {
                return horizontal;
            }
            for (int j = 0; j < board[i].length; j++) {
                if (mapColumn.get(Character.forDigit(j, 10)) == null) {
                    List<Character> initial = new ArrayList<>();
                    initial.add(Character.valueOf(board[i][j]));
                    mapColumn.put(Character.forDigit(j, 10), initial);
                } else {
                    List<Character> list = new ArrayList<>();
                    list = mapColumn.get(Character.forDigit(j, 10));
                    list.add(board[i][j]);
                }
            }
        }
        for (int i = 0; i < mapColumn.size(); i++) {
            vertical = isValidVertical(mapColumn.get(Character.forDigit(i, 10)));
            if (!vertical) {
                return vertical;
            }
        }

        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                if (!isValidBox(board, row, col)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidVertical(List<Character> vertical) {
        Set<Character> set = new HashSet<>();
        for (Character character : vertical) {
            if (set.contains(character) && character != '.') {
                return false;
            } else {
                set.add(character);
            }
        }
        return true;
    }

    public boolean isValidHorizontal(char[] horizontal) {
        Set<Character> set = new HashSet<>();
        for (char character : horizontal) {
            if (set.contains(character) && character != '.') {
                return false;
            } else {
                set.add(character);
            }
        }
        return true;
    }

    public boolean isValidBox(char[][] board, int startRow, int startCol) {
        Set<Character> set = new HashSet<>();

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                char c = board[i][j];

                if (c == '.') {
                    continue;
                }

                if (set.contains(c)) {
                    return false;
                }

                set.add(c);
            }
        }
        return true;
    }
}
