package HR_assignment3;

public class Loop9059_ex05_1 {
    public static void main(String[] args) {
        char tmpStar ='*';
        String outputStar ="*";

        for(int i=0; i<5;i++){
            for(int j=i+1;j<5;j++){
                System.out.printf(" ");
            }
            System.out.println(outputStar);
            outputStar=outputStar+tmpStar+tmpStar;
        }

    }
}
