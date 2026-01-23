import java.util.Scanner;
public class employee {
    public static void main(String[] args) {
        int salary,score;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary:");
        salary=sc.nextInt();
        System.out.println("Enter score");
         score= sc.nextInt();
         if((score>=90)&&(score<100)){
             System.out.println(salary*0.15+salary+" Rs High");
         }
        else if((score>=80)&&(score<90)){
            System.out.println(salary*0.12+salary+" Rs High");
        }
        else if((score>=70)&&(score<80)){
            System.out.println(salary*0.08+salary+" Rs High");
        }
        else if((score>=60)&&(score<70)){
            System.out.println(salary*0.05+salary+" Rs High");
        }
        else{
             System.out.println("No High");
         }
    }
}
