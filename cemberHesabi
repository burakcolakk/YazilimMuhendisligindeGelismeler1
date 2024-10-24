import java.util.Scanner;

public class Havelsanders {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double π =Math.PI;
        
        float sonuc = 0;
               
        while(true){   
            
            System.out.println("Lutfen bir yaricap degeri giriniz : ");
            float yaricap = scan.nextFloat();
        
            System.out.print("\nCevre hesabi icin 1'e, \nAlan hesabi icin 2'ye, \nCikis yapmak icin 0'a tiklayiniz!\nIsleminiz : ");
            float islem = scan.nextFloat();
                          
            if(islem == 1){
            
                sonuc +=(2*π*yaricap);
                System.out.println("\nIstenen cemberin cevresi = "+sonuc+"\n");
              
            }
            else if(islem == 2){
            
                sonuc += (π*yaricap*yaricap);
                System.out.println("\nIstenen cemberin alani = " + sonuc+"\n");
              
            }
            else if(islem == 0){
                System.out.println("Isleminiz sonlandirilmistir!!");
            break;
            }
        }        
    }  
}
