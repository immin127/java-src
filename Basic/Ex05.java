package Basic;

public class Ex05 {
    public static void main(String[] args) {
        // switch문
        // switch(식) {
        // case 값1:
        //     식이 값1과 일치한 경우 처리
        //     break;
        // case 값2:
        //     식이 값2와 일치한 경우 처리
        //     break;

        // default:
        //     그 이외의 경우 처리
        // }

        int i = 10;
        switch(i){
        // i = 10인 경우
        case 10:
            System.out.println("10");
            break;

        // 그 이외의 경우
        default:
            System.out.println("10 이외");
        }

        // default는 생략 가능
        switch(i){
            case 10:
                System.out.println("10");
                break;
        }

        // break를 생략하면 다음 case문을 포함해서 실행한다.
        switch(i){
            // i = 5이거나 i = 10인 경우
            case 5:
            case 10:
                System.out.println("5이거나 10");
                break;
            default:
                System.out.println("그 이외");
        }

        // 식의 값이 null인 경우에는 NullPointerException이 발생함
        // 이 때는 null검사를 하여 if문과 else switch문을 조합해서 사용

        String str = null;

        if(str == null){
            System.out.println("str값이 null입니다.");
        } else {
            switch(str){
                case "spring":
                break;
            }
        }

    }
}
