package oving2;

public class Task2 {
 // Lag et program som hjelper oss i forhold til følgende problemstilling: Kjøttdeig av merke A
    //koster kr 35,90 for 450 gram, mens kjøttdeig av merke B koster kr 39,50 for 500 gram.
    //Hvilket merke er billigst?

    double vektA, prisA, vektB, prisB;

    public Task2(double vektA, double prisA, double vektB, double prisB) {
        this.vektA = vektA;
        this.prisA = prisA;
        this.vektB = vektB;
        this.prisB = prisB;
    }


    public String finnBilligst(){

        double prisPerGramA = prisA / vektA;

        double prisPerGramB = prisB / vektB;

        if (prisPerGramA < prisPerGramB) {
            return("Merke A er billigere enn merke B");
        }
        else {
            return("Merke B er billigere enn merke A");
        }
    }


    public static void main(String[] args) {
        Task2 task = new Task2(450, 35.90, 500, 39.50);
        System.out.println(task.finnBilligst()); //heller ha innparametere inn i metoden?
    }



}
