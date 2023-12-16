public class Ivmit extends Student {
    Ivmit(){
        setInItis("ИВМиТ");
        setScore(0);
    }
    @Override
    protected void makeElecEngineering() {
            if (Math.random() > 0.5){
                this.setScore(getScore()+5);
            }else {this.setScore(getScore()+4);}
    }

    @Override
    protected void makeProgrammiring() {
            if (Math.random() > 0.5){
                this.setScore(getScore()+4);
            }else {this.setScore(getScore()+3);}
        }
}
