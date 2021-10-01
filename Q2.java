import java.util.*;
abstract class book {
    String title;
    abstract void setTitle(String s) ;
    String getTitle() {
        return title;
    }
}
class  Mybook extends book {
    void setTitle(String s) {
        title = s;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String title = sc.nextLine();
        Mybook new_novel = new Mybook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();

        }
    }

