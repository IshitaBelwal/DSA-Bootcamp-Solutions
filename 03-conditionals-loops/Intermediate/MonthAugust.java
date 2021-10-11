public class MonthAugust {
    public static void main(String[] args) {
        // number of days in august = 31
        int n =31;
        int count =0;
        for (int i=1; i<=31;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("kunal can go out for "+ count + " days");
    }
}
