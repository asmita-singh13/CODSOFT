import java.util.*;
public class studentgrade {
    public static void main(String args[]){

    
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter no. of subjects:");
    int x= sc.nextInt();
    System.out.println();
    int sm=0;
    int y=0;
    for(int i=0;i<x; i++ ){
        System.out.println("Enter the marks-");
        y= sc.nextInt();
        sm+=y;

    }
   
    int av= sm/x;
    char grad=' ';
    if(av>90){
         grad='S';
    }
    else if (av>80){
         grad='A';
    }
    else if (av>70){
         grad='B';
    }
    else if (av>60){
         grad= 'C';
    }
    else if (av>50){
         grad= 'D';
    }
    else if (av>40){
         grad='E';
    }
    else{
        grad='F';
    }
    System.out.println("Total marks:"+ sm);
    System.out.println("Average marks:"+ av);
    System.out.println("Grade obtained:"+ grad);
    
}
}


