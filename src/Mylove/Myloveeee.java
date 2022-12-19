package Mylove;

public class Myloveeee {
    public static void main(String[] args) throws InterruptedException {
        int count=0;
        for (float y=2.3f;y>-1.8f;y-=0.10f) {
            for (float x=-2.1f;x<2.1f;x+=0.039f){
                float a=x*x+y*y-2f;
                if ((a*a*a-x*x*y*y*y)<-0.0f){
                    String str="Yêu Mai ";
                    int num=count%str.length();
                    System.err.print(str.charAt(num));
                    count++;
                }else {
                    System.err.print(" ");
                }
            }
            System.err.println();
            Thread.sleep(100);
        }
        System.out.println("Gửi ny nè");
        System.out.println("LOVE YOU");
        System.out.println("By Mai Văn Thụn");
    }
}
