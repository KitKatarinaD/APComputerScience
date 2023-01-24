package Prog701g;

//Admin is a child of the parent class "Person"
public class Admin extends Person{
  private String myFavw;
  //interited myFirst and myLast from person

  public Admin(String f, String l, String fav) {
    super(f, l); //call constructor of 
    myFavw = fav;
    
  }
  public String getFavw() { return myFavw;}
}