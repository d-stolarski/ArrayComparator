public class ArrayComparator {
    public boolean compare(int[][] firstTab, int[][] secondTab) {

        boolean areEqual = false;

        if (firstTab.length != secondTab.length) {
            return areEqual;
        } else {
            for (int i = 0; i < firstTab.length; i++) {
                if (firstTab[i].length != secondTab[i].length) {
                    return areEqual;
                } else {
                    for (int j = 0; j < firstTab[i].length; j++) {
                        if (firstTab[i][j] != secondTab[i][j]) {
                            areEqual = false;
                            break;
                        } else {
                            areEqual = true;
                        }
                    }
                }
            }
        }
        return areEqual;
    }
}



