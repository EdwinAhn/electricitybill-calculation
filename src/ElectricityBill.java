import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        System.out.println("=".repeat(25));
        System.out.println(" 주택용 전기요금(저압) 계산기 ");
        System.out.println("=".repeat(25));
        System.out.println("전력사용량(kWh)를 입력하신 후 'Enter'를 누르세요.");

// 1. 100 이하인 경우 전력당 60.7 원이 부가됩니다. (사용한 전력 100 kWh 이하일 경)
// 2. 100 이하인 경우 전력당 60.7원 부과, 100 초과인 경우 125.9원 부과 (사용한 전력이 100 kWh 초과일 경우)
// 3. 200 초과 시 187.9원
// 4. 300 초과 시 280.6원
// 5. 400 초과 시 417.7원
// 6. 500 초과 시 670.6원
// 해당 전력 사용량의 구간별로 가격 책정
// Ex) 전력 사용량이 150kWh이면 100kWh까지는 kWh당 60.7원, 나머지 50kWh 사용량에 대해서는 125.9원을 책정해야함.

        Scanner s = new Scanner(System.in);

        double powerConsumption = s.nextDouble();
        double electricityBill = 0;

        if (powerConsumption <= 100) {
            electricityBill = powerConsumption * 60.7;
        }
        else if (powerConsumption > 100 && powerConsumption <= 200) {
            double cal = powerConsumption - 100;
            electricityBill = 100*60.7 + cal*125.9;
        }
        else if (powerConsumption > 200 && powerConsumption <= 300) {
            double cal = powerConsumption - 200;
            electricityBill = 100*60.7 + 100*125.9 + cal*187.9;
        }
        else if (powerConsumption > 300 && powerConsumption <= 400) {
            double cal = powerConsumption - 300;
            electricityBill = 100*60.7 + 100*125.9 + 100*187.9 + cal*280.6;
        }
        else if (powerConsumption > 400 && powerConsumption <= 500) {
            double cal = powerConsumption - 400;
            electricityBill = 100*60.7 + 100*125.9 + 100*187.9 + 100*280.6 + cal*417.7;
        }
        else if (powerConsumption > 500) {
            double cal = powerConsumption - 500;
            electricityBill = 100*60.7 + 100*125.9 + 100*187.9 + 100*280.6 + 100*417.7 + cal*670.6;
        }
        else System.out.println("잘못된 입력입니다.");
        System.out.println(powerConsumption + "kWh의 전기 요금은 " + electricityBill + "원 입니다.");

    }
}