package numBaseBall;

import java.util.*;

public class Baseball {
    private List<String> solutionBalls = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);


    private void addBalls() {
        List<String> candiBalls = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            candiBalls.add(Integer.toString(i));
        }
        Collections.shuffle(candiBalls);
        solutionBalls.addAll(List.of(candiBalls.get(0), candiBalls.get(1), candiBalls.get(2)));
    }


    private boolean isThreeNum(String str) {
        return str.matches("^[1-9]{3}$");
    }


    private void play() {
        addBalls();
        System.out.println(solutionBalls);
        while (true) {
            System.out.println("1-9사이의 숫자 3개를 입력하세요");
            String inputNumbers = sc.nextLine();

            if (!isThreeNum(inputNumbers)) {
                System.out.print("잘못된 형식입니다. ");
                continue;
            }

            List<String> inputBalls;
            inputBalls = new ArrayList<>(List.of(inputNumbers.split("")));
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

            if (strikeCount == 3) {
                System.out.println(inputNumbers + "  정답입니다.");
                return;
            } else if (strikeCount == 0 && ballCount == 0) {
                System.out.println(inputNumbers + "  3Out입니다.");
            }
            else {
                System.out.println(inputNumbers + "   "+ strikeCount + " Strike " + ballCount + " Ball");
            }
        }
    }


    public static void main(String[] args) {
        Baseball game = new Baseball();
        game.play();
    }

}
