package Q3;

public class employee {
    private int myssn;
    private String myClass;
    private String mytype;
    private int mydept;


    public employee(int ssn, String Class, String type, int dept){
        myssn = ssn;
        myClass = Class;
        mytype = type;
        mydept = dept;
    }

    public int getMyssn() {return myssn;}
    public String getMyClass() {return myClass;}
    public String getMytype() {return mytype;}
    public int getMydept() {return mydept;}


}
