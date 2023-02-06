package prog875s;

public class Gene extends Fasta{
    private String organism;
    private String geneName;
    private String geneName;
    private String geneID;
    private String description;

    public Gene(String header, String sequence) {
        super(header, sequence);
        String[] headerParts = header.split(" "); //header has all stuff in it...headersplit splits it all
        geneID = headerParts[0];
        geneName = headerParts[1];
        organism = headerParts[2];
        organism = organism.substring(organism.indexOf("=")+1, organism.length()-1);
        description = headerParts[3];
    }
    public boolean compare(Gene other) {super.compare(other);}
    public String toString() {return geneID + " " + geneName + " "+organism+" "+description;}

    public int align(Gene other, int mismatchPenalty, int gapPenalty){
        //Needleman-Wunsch algorithm
        //initialize matrix; clamp to shoter sequence
        int len = Math.min(this.getSequance().length(), other.getSequance().length()) + 1;
        int[][] matrix = new int[len][len];

        //initialize first row and col
        for (int lcv= 0; lcv < matrix.length; lcv++){
            matrix[lcv][0] = lcv * gapPenalty;
            matrix[0][lcv] = lcv * gapPenalty;
        }
        int match = 0;
        int diag  =0;
        int left = 0;
        int up = 0;

        //Fill in the rest of the matrix
        for (int lcv = 1; lcv < matrix.length; lcv++){
            for (int lcv2 = 1; lcv2 < matrix[lcv].length; lcv2++) {
                match =0;
                if (!getSequance().substring(lcv-1, lcv).equals(other.getSequance().substring(lcv2-1, lcv2)))match = mismatchPenalty;
                diag = matrix[lcv-1][lcv2-1] + match;
                left = matrix[lcv][lcv2-1] + gapPenalty;
                up = matrix[lcv][lcv2] = Math.min(diag, Math.min(left, up));

            }
        }
        //traceback
        String alignment1 = "";
        String alignment2 = "";
        int i = matrix.length -1;
        int j = matrix[0].length -1;

        while (i > 0 && j > 0) {
            match = 0;
            if (!getSequance().substring(i-1, i).equals(other.getSequance().substring(j-1, j)))
                match = mismatchPenalty;
            diag = matrix[i-1][j-1] + match;
            left = matrix[i][j-1] + gapPenalty;
            up - matrix[i-1][j] + gapPenalty;

            if (matrix[i][j] == diag) {
                alignment1 = this.getSequance().substring(i-1, i) + alignment1;
                alignment2 = other.getSequance().substring(j-1, j) + alignment2;
                i--;
                j--;
            }
        }
        return -1;
    }
}
