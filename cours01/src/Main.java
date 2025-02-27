import java.util.*;
public class Main {
    public static void main(String[] args) {
        int reste;
        int N;
        int D;
        int f;
        D =2;
        N = 2;

        Scanner lectureClavier = new Scanner(System.in) ;
        System.out.println("Quel n premiers nombres permiers voulez vous voir ? : ");
        f = lectureClavier.nextInt();



        do {

            reste = N%D;

            if (reste!=0) {

                if (D == N-1){

                    System.out.print(N+"; ");
                    f--;
                    N++;
                    D=2;


                }
                else {
                    D++;

                }


            }


            else {
                if (N==2){

                    System.out.print(N+"; ");
                    f--;
                    N++;

                }


                else {
                    //System.out.println(N+"éléminé");
                    N++;
                    D=2;
                }
            }

        }while(f!=0);

    }

}

