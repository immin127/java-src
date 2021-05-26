package Ex05;

public class Q005 {
    public static void main(String[] args) {
        int[] score = {45,90,75,60,80};
        int[] rank = {1,4,2,3,0};

        System.out.println("----- 출석 번호 순 -----");
        //출석번호순으로
        for(int i=0; i<score.length; i++){
            System.out.println(i+1 + "번 : " + score[i] + " 점");
        }

        System.out.println("----- 득점 순 -----");
        //높은 점수 순으로
        for(int i=0; i<score.length; i++){
            for(int j = i+1; j<score.length; j++){
                if(score[i]<score[j]){
                    int lev = score[i];
                    score[i] = score[j];
                    score[j] = lev;
                }
            }
            System.out.println(i+1 + "위 : "+ score[i] + " 점");
        }

        for(int i = 0; i < score.length; i++){
            System.out.println((i+1) + " 번 " + score[rank[i]] + "점");
        }
    }
}
