package game;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

    public void game() {
        String randomNum = randomNum();

        String[] arrRandomNum = randomNum.split("");

        String memberNum = "123";

        String[] arrMemberNum = memberNum.split("");

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < arrRandomNum.length; i++) {

            strike += checkStrikeCount(arrRandomNum[i], arrMemberNum[i]);
            ball += checkBallCount(i, arrRandomNum[i], memberNum);

        }

        System.out.println("randomNum:: " + randomNum);
        System.out.println("memberNum:: " + memberNum);

        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }

        if (strike != 3) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }

    }

    public String randomNum() {

        Random r = new Random();

        String randomNum = "";

        while (randomNum.length() < 3){

            randomNum += randomNumPlus(randomNum, String.valueOf(r.nextInt(9) + 1));

        }

        return randomNum;
    }

    public int checkStrikeCount(String randomNowNum, String memberNowNum) {

        if(randomNowNum.equals(memberNowNum)) {
            return 1;
        }

        return 0;
    }

    public int checkBallCount(int location, String randomNowNum, String memberNowNum) {

        if (memberNowNum.contains(randomNowNum) && location != memberNowNum.indexOf(randomNowNum)) {
            return 1;
        }

        return 0;
    }

    public String randomNumPlus(String value, String randomNum) {

        if (value.contains(randomNum)) {
            return "";
        }

        return randomNum;
    }
}
