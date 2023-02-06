package prog875s;

public class Fasta implements Sequence {
        private String header;
        private String sequence;


        public  Fasta(String header, String sequence) {
            this.header = header;  //because these variables from classes have the same name,
            // this.  refers to the variable in this class

            this.sequence = sequence;

        }

        public boolean compare(Fasta other) {
            return this.header.equals(other.getHeader()) && this.sequence.equals(other.getSequance());
        }

        public String getHeader() { return header;}
        public String getSequence() { return sequence;}

    }