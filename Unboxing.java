package oops_skill;

public class Unboxing {
	public static void main(String[] args){
    Integer obj = Integer.valueOf(10);
    int x = obj; // unboxing
    System.out.println("objectcreation /cached object  "+obj);
    System.out.println("unboxing "+ x);
    }
}
