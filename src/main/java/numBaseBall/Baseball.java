package numBaseBall;

import java.util.*;

public class Baseball {
    private List<String> solutionBalls = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Integer digitNum;

    public Baseball(Integer digitNum) {
        this.digitNum = digitNum;
    }

    private void addBalls() {
        List<String> candiBalls = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            candiBalls.add(Integer.toString(i));
        }
        Collections.shuffle(candiBalls);
        solutionBalls.addAll(List.of(candiBalls.get(0), candiBalls.get(1), candiBalls.get(2)));
    }


    private boolean isThreeNum(String str) {
        return str.matches(String.format("^[1-9]{%d}$", digitNum));
    }

    private List<Integer> calcStrikeBall(List<String> inputBalls) {

        int strikeCount = 0;
        int ballCount = 0;

        for (int i=0; i <3; i++) {
            String inputBall = inputBalls.get(i);
            if (inputBall.equals(solutionBalls.get(i))) {
                strikeCount += 1;
            } else if (solutionBalls.contains(inputBall)) {
                ballCount += 1;
            }
        }
        return new ArrayList<>(List.of(strikeCount, ballCount));
    }

    private void play() {
        addBalls();
        System.out.println(solutionBalls);
        while (true) {
            System.out.printf("1-9사이의 숫자 %d개를 입력하세요%n", digitNum);
            String inputNumbers = sc.nextLine();

            if (!isThreeNum(inputNumbers)) {
                System.out.print("잘못된 형식입니다. ");
                continue;
            }

            List<String> inputBalls;
            inputBalls = new ArrayList<>(List.of(inputNumbers.split("")));

            List<Integer> strikeBall = calcStrikeBall(inputBalls);
            int strikeCount = strikeBall.get(0);
            int ballCount = strikeBall.get(1);


            if (strikeCount == digitNum) {
                System.out.println(inputNumbers + "  정답입니다.");
                return;
            } else if (strikeCount == 0 && ballCount == 0) {
                System.out.println(inputNumbers + "  Out입니다.");
            }
            else {
                System.out.println(inputNumbers + "   "+ strikeCount + " Strike " + ballCount + " Ball");
            }
        }
    }


    public static void main(String[] args) {
        Baseball game = new Baseball(3);
        game.play();
    }

}
