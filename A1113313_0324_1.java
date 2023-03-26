import java.util.*;

//------------------------------------------------------------------------------------------------
class animal{

    String name;
    double height=0,weight=0,speed=0;

    void show(){
        System.out.printf("name : %s\nheight : %3.2f(m)\nweight : %4.1f(Kg)\nspeed : %5.2f(m/min)\n\n",this.name,this.height,this.weight,this.speed);
    
    }

    double distance(double x,double y){
        double result=0;
        result = x*y*this.speed;
        return result;
    }
    double distance(double x){
        double result = 0;
        result = x*this.speed;
        return result;
    }
}
//-------------------------------------------------------------------------------------------------

public class A1113313_0324_1{
    public static void main(String[] argv){
        animal[] animals = new animal[4];
        double[][] stats ={{1.1,52,10},{1.5,99,200},{1.7,48,120},{1.7,50,120}};

//設定資料 -------------------------------------------------------------------------       
        for(int i=0;i<animals.length;i++){
            animals[i]=new animal();
            animals[i].height=stats[i][0];
            animals[i].weight=stats[i][1];
            animals[i].speed=stats[i][2];
        }
        animals[0].name="雪寶";
        animals[1].name="驢子";
        animals[2].name="安娜";
        animals[3].name="愛莎";

//輸出資料show()迴圈---------------------------------------------------------------------------------
        int o=0;                    
        do{
            animals[o].show();
            o++;
        }while(o<animals.length);

//輸入加速度、時間資料--------------------------------------------------------------------------------

        Scanner input = new Scanner(System.in);
        double[] a =new double[4];
        double[] t =new double[4];
        

        for(int i=0;i<animals.length;i++){
            
            System.out.printf("請輸入%s經過的時間 : ",animals[i].name);
            t[i]=input.nextFloat();

            System.out.printf("請輸入%s的加速度(若無則輸入0) : ",animals[i].name);
            a[i]=input.nextFloat();

            if(a[i]==0){
                System.out.printf("1.%s的移動距離為%f\n\n",animals[i].name,animals[i].distance(t[i]));
            }else{
                System.out.printf("2.%s的移動距離為%f\n\n",animals[i].name,animals[i].distance(t[i],a[i]));
            }
        }
    }
}