

public class break_continue {
    public static void main(String args[]){
        for(int i = 1;i<=10;i++){
            System.out.println(i);
            if(i == 5){
                continue;
            }
            if(i == 8){
                break;
            }
        }
    }
}
