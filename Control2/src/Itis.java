public class Itis extends Student{
    Itis(){
        setInItis("ИТИС");
        setScore(0);
    }
    @Override
    protected void makeElecEngineering() {
        if (Math.random() > 0.5){
            this.setScore(getScore()+4);
        }else {this.setScore(getScore()+3);}
    }

    @Override
    protected void makeProgrammiring() {
            if (Math.random() > 0.5){
                this.setScore(getScore()+5);
            }else {this.setScore(getScore()+4);}

    }
}
