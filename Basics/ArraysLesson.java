public class ArraysLesson {
    
    public static void main(String[] args) {
        

        int[][] scoreList = {{94,95,99},{93,99,93}};
        System.out.println(scoreList);


        String[][] students = {{"Marta","Jose","David"},{"Marcodes","Jennie","Pedro","Pablo"}};

        for(int i=0; i < students.length; ++i){
            for(int o=0; o<students[i].length; o++){
                System.out.println(students[i][o]);
            }
        }

    }

}
