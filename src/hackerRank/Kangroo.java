package hackerRank;

public class Kangroo {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if(v1 == v2){
            return (x1 == x2) ? "YES" : "NO";
        }else {
            if((x2 - x1) % (v1 - v2) ==0){
                long meetingPoint = (x2 - x1) / (v1 - v2);
                return (meetingPoint >=0) ? "YES" : "NO";
            }else {
                return "NO";
            }
        }
    }

    public static void main(String[] args) {

        System.out.printf("%d + %d + %d = %d", 3, 4, 5, 3 + 4 + 5).println();
//        System.out.println(kangaroo(0,3,5,2));
    }
}
