
import java.util.*;

public class movietask {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        LinkedList<String> a= new LinkedList<String>();

        System.out.println("------Welcome to the Theater------");
        System.out.println("please select movie or webseries:");
        System.out.println();

switch(ch){

    case 1:
     LinkedList<String> movie= new LinkedList<String>();

        System.out.println("<---movie name is below--->");
        movie.add("RRR");
        movie.add("KGF 1");
        movie.add("KGF 2");
        movie.add("URI");
        movie.add("FIGHTER");
        System.out.println(movie);
        System.out.println();

        System.out.println("What do you want:");
        System.out.println("1.add");
        System.out.println("2.clear");
        System.out.println("3.remove");
        System.out.println("4.exit");
        System.out.println("please select one option:");
        int c = sc.nextInt();

switch(c){

    case 1:

        //System.out.println("select your option :");
        System.out.println("1.Last");
        System.out.println("2.particular");
        System.out.println("select one options");
        int k = sc.nextInt();

        switch(k){

            case 1:
              
              //System.out.println("add last");
              System.out.println(movie);
              System.out.println("add last movie name you want");
              String p = sc.next();
              movie.add(p);

              for(String last:movie){
              }
                 System.out.println(movie);
              
              break;

            case 2:

              //System.out.println("add particular:");
              System.out.println(movie);
              System.out.println("enter number you want to add movie");
              int i=sc.nextInt();
              System.out.println("add the movie name");
              String ii=sc.nextLine();

              if(i>=0 && i<=movie.size()){

                movie.add(i,ii);
              }
              else{

                System.out.println(movie.size());
              }
              for(String l:movie){

              }
              System.out.println(movie);
            default:
               break;

        }
        


    
}



       

        System.out.println("<---webseries name is below--->");
        web.add("DARK WATER");
        web.add("MUMBAI DIARIES");
        web.add("ASPIRANTS");
        web.add("AASHRAM");
        web.add("THE FREELANCER");
        System.out.println(web);
        System.out.println();

        System.out.print("enter the movie & webseries :");
        //sc.next();
        n = sc.nextInt();

        System.out.println();

     switch (n) {
            case 1:
               switch(n){
                  case 1:
                      System.out.println("select the movie" + movie);
                      break;

                    case 2:
                        //  for(String i :movie)
                        // {
                        //     System.out.println(i);
                        // }
                        movie.addLast("ddlj");
                        System.out.println(movie);
                        break;

                    case 3:
                        movie.set(2, "Solar");
                        System.out.println(movie);
                        break;

                     default:
                        System.out.println("Invalid");
                        break;
                     }
                   
        case 2:
                System.out.println("select the webseries" +web);
                break;
        
            default:
                System.out.println("Invalid");
                break;
        }


    }

}