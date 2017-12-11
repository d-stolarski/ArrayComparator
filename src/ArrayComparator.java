public class ArrayComparator {

    public boolean compare(int[][] firstTab, int[][] secondTab) {
        boolean areEqual = true;
        for (int i = 0; i < firstTab.length; i++) {
            if (firstTab.length != secondTab.length || firstTab[i].length != secondTab[i].length) {
                return false;
            } else {
                for (int j = 0; j < firstTab[i].length; j++) {
                    if (firstTab[i][j] == secondTab[i][j] && firstTab[i].length == secondTab[j].length) {
                        continue;
                    } else {
                        areEqual = false;
                    }
                }
            }
        }
        return areEqual;
    }
}



