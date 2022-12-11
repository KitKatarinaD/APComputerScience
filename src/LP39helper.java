public class LP39helper {
    private int mybirth;
    private int mymonth;
    private int myday;
    private int mycuryr;
    private int mycurm;
    private int mycurd;
    private int mydaysalive;
    private int myhrsslept;

    public LP39helper(int birth, int month, int day, int curyr, int curm, int curd){
        mybirth = birth;
        mymonth = month;
        myday = day;
        mycuryr = curyr;
        mycurm = curm;
        mycurd = curd;
        mydaysalive = 0;
        myhrsslept = 0;
    }

    public void calc() {
        mydaysalive = (mycuryr-mybirth)*365 + 30*(Math.abs(mymonth-mycurm)) + (Math.abs(myday-mycurd));
        myhrsslept = 8 * mydaysalive;
    }

    public int getMybirth() { return mybirth;}
    public int getMymonth() {return mymonth;}
    public int getMyday() {return myday;}
    public int getMycuryr() {return mycuryr;}
    public int getMycurm() {return mycurm;}
    public int getMycurd() {return mycurd;}
    public int getMydaysalive() {return mydaysalive;}
    public int getMyhrsslept() {return myhrsslept;}


}
