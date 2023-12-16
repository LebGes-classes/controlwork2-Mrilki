public class Main {
    public static void main(String[] args) {
        Student[] allStudent = new Student[100];
        Student[] allStudentSort = new Student[100];

        for (int i = 0; i < 50; i++) {
            allStudent[i] = new Itis();
        }
        for (int i = 50; i < 100; i++) {
            allStudent[i] = new Ivmit();
        }

        for (int i = 0; i < 100; i++) {
            allStudent[i].makeElecEngineering();
            allStudent[i].makeProgrammiring();
            allStudentSort = sorted(allStudent,9);
            System.out.println(allStudentSort[i].getisInItis() + " " + allStudentSort[i].getScore());
            //не смог сделать сортировку(

        }


    }
    public static Student[] sorted(Student[] allStudent, int maximum){
        Student[] sort = new Student[100];
        for (int i = maximum; i > 0; i--) {
            for (int j = 0; j < 100; j++) {
                if (i == allStudent[j].getScore()){
                    sort[j] = allStudent[j];

                }
            }
        }return sort;
    }
    public static int maxScore(Student[] allStudent){
        int maximum = 0;
        for (int i = 0; i < 100; i++) {
            if (allStudent[i].getScore() > maximum){
                maximum = allStudent[i].getScore();
            }
        }return maximum;
    }
}