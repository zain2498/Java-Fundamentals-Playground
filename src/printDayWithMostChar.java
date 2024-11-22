public class printDayWithMostChar {
    String dayWithMostCharacter = "";
        public void dayWithMostChar(String[] dayOfWeek){

            for(String day: dayOfWeek){
                if(day.length() > dayWithMostCharacter.length()){
                    dayWithMostCharacter = day;
                }
            }

            System.out.println("\nDay with most number of characters are : "+ dayWithMostCharacter +"\n");
            for(int i = dayOfWeek.length-1; i >= 0; i --){
                System.out.println(dayOfWeek[i]);
            }

        }

        public static void main(String args[]){
            printDayWithMostChar obj = new printDayWithMostChar();
            String[] dayOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
            obj.dayWithMostChar(dayOfWeek);
        }


}
