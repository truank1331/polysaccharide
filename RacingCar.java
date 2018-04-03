import java.util.Scanner;
enum CarBrandName{
 ALFA_ROMEO, AUDI, BMW, FERRARI, LAMBORGHINI, MASERATI, PORSCHE, TESLA,
VOLKSWAGEN, VOLVO;
}
enum CarColorName{
 BLACK, BLUE, GRAY, GREEN, YELLOW, RED, WHITE, UNKNOWN;
}
public class RacingCar{
    int kuy;
 int kuyrai
    private String model;
    private CarBrandName brand;
    private CarColorName color;
    private float speed;
    private float width;
    private float length;
    private float height;
    public float cost;

    RacingCar(CarBrandName carBrandName,String model,CarColorName color,float speed,float width,float length,float height,float cost){
        this.brand=carBrandName;
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.width = width;
        this.length = length;
        this.height = height;
        this.cost = cost;
    }
    public  void printDetail(){
        System.out.println(brand+" ("+model+") - "+color+"");
        System.out.printf("SPEED: %.1f\n",speed);
        System.out.printf("SIZE: %.1f x %.1f x %.1f\n",width,length,height);
        System.out.printf("COST: $%.2f\n",cost);

    }
     float getVolumn(){
        
        return width*length*height;
    }
     void setCost(float icost){
         this.cost = icost;
     }

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String tmp = sc.nextLine();
 CarBrandName ibrand = CarBrandName.valueOf(tmp.toUpperCase());
 String imodel = sc.nextLine();
 int numb = sc.nextInt();
 CarColorName icolor;
 switch (numb){
 case 0: icolor = CarColorName.BLACK; break;
 case 1: icolor = CarColorName.BLUE; break;
 case 2: icolor = CarColorName.GRAY; break;
 case 3: icolor = CarColorName.GREEN; break;
 case 4: icolor = CarColorName.YELLOW; break;
 case 5: icolor = CarColorName.RED; break;
 case 6: icolor = CarColorName.WHITE; break;
 default: icolor = CarColorName.UNKNOWN;
 }
 float speed = sc.nextFloat();
 float width = sc.nextFloat();
 float length= sc.nextFloat();
 float height= sc.nextFloat();
 float cost = sc.nextFloat();
 RacingCar x = new 
 RacingCar(ibrand,imodel,icolor,speed,width,length,height,cost);
 int number = sc.nextInt();
 String command;
 int ipos,icmd;
 float icost;
 for (int i=0;i<number;i++){
 do{
 command = sc.nextLine();
 }while(command.length()==0);
 ipos = command.indexOf(" ");
 if (command.charAt(0)=='P'){
 icmd = Integer.parseInt(command.substring(ipos+1));
 switch (icmd){
 case 0: x.printDetail(); break;
 case 1: System.out.println("Brand:"+x.brand); break;
 case 2: System.out.println("Model:"+x.model); break;
 case 3: System.out.println("Color:"+x.color); break;
 case 4: System.out.printf("Speed: %.1f mps\n",x.speed); break;
 case 5: System.out.printf("Width: %.1f cm\n",x.width); break;
 case 6: System.out.printf("Length: %.1f cm\n",x.length); break;
 case 7: System.out.printf("Height: %.1f cm\n",x.height); break;
 case 8: System.out.printf("Size: %.1f cm3",x.getVolumn()); break;
 default: System.out.println("unidentifier");
 }
 }else if (command.charAt(0)=='U'){
 icost = Float.parseFloat(command.substring(ipos+1));
 x.setCost(icost);
 }
 }
 }
}
