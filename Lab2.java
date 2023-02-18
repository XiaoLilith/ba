bai 1
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Lab2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Double x;

        System.out.println("Mời bạn nhập số a: ");
        double a = scanner.nextDouble();

        System.out.println("Mời bạn nhập số b: ");
        double b = scanner.nextDouble();

        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                System.out.println("Phương trình có vô số nghiệm");
            }
        }else
            x = -b/(Double)a;
            System.out.println("Phương trình có nghiệm x = ");
        
        }
    }
    //////bai 2
    import java.util.Scanner;
    import javax.lang.model.util.ElementScanner14;
public class Lab2 {
    public static void main(String[] args) {
    double a,b,c,x1,x2,delta;
    Scanner sc= new Scanner(System.in)
    System.out.println("Nhap vao chu so a= ");
     double a=sc.nextDouble();
    System.out.println("Nhap vao chu so b= ");
    double b=sc.nextDouble();
    System.out.println("Nhap vao chu so a= ");
    double c=sc.nextDouble();
    delta=Math.pow(b, 2) - 4*a*c;
    if(a==0 & b==0){
        System.out.println("Phuong trinh vo nghiem");
    }else if( b==0 & c==0){
        System.out.println("phuong trinh co vo so nghiem");
    }else{
        System.out.println("nghiem cua ptrinh la ="+(-c/b));
        if(delta <0){
            System.out.println("phuong trinh vo nghiem");
           }else   if(delta == 0){
                System.out.println("Phuong trinh co nghiem kep" x=-b/(2*a));
            }else {
                x1= (-b + Math.sqrt(delta)) /(2*a);
                x2=(-b + Math.sqrt(delta)) /(2*a);
                System.out.println("2 nghiem phan biet");
                System.out.println(x1);
                System.out.println(x2);
            }
        }
    }

/////bai3
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
double Sodien= sc.nextDouble();
if(Sodien<50){
System.out.println("So dien se tra la: "+(Sodien*1000));

}else 
System.out.println("So dien se tra la: " +(50*1000+(Sodien-50)*1200));
sc.close();
}  
}
/////bai 2(cho them)
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
double diem= sc.nextDouble;
System.out.println("nhap so diem:")
if(diem<0){
System.out.println("xep loai kiem:");
}else if(diem<7){
System.out.println("Xep loai trung binh");
}else if(diem <8){
    Systeam.out.println("xep loai kha");
    else{
        Systeam.out.println("xep loai gioi")
    }
}
}
/////bai1 (phan cho them)
import java.util.Scanner;
public class Lab2 {
    public static void main(String[ ] args) {
        Scanner sc = new  Scanner(System.in);
        int sochinhphuong= sc.nextInt();
        double canbachai=Math.sqrt(sochinhphuong);
        System.out.println("Nhap so vao:");
        if(canbachai*canbachai==sochinhphuong){
            System.out.println("Day la so chinh phuong")
        }
        else{
            System.out,println("Khong phai la so chinh phuong");

        }
        }
        
    }
}
