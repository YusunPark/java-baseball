package baseball;

public class Application {

    static void startMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    static void getUserNumber() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        startMessage();
        getUserNumber();
    }
}
