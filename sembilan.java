/**
 * Created by tita on 3/24/2015.
 */
public class sembilan {
    public static void main(String[] args) {
        System.out.println(" ");
        int a=1;
        int ak=110;
        int b;
        for (a=1;a<=ak;a++){
            if (a % 5==0) {
                System.out.print("joni");
            }
            else{
                System.out.print(a);
            }
            if (a<ak){
                System.out.print(" ");
                if(a % 11 ==0){
                    System.out.print("\n");
                }
            }
        }
    }
}
