package Projects_05.GameGuess;

public class CaseRunner {
    public static void main(String[] args) {

        Patient patient_1=new Patient();
        patient_1.setFirstName("Hasta");
        patient_1.setLastName("LastName");
        System.out.println(patient_1.getFirstName()+" "+ patient_1.getLastName());

        Case case_1=new Case();
        case_1.setActualCase("Covid 19");
        case_1.setTested(true);
        case_1.setConclusion("Tested Positive");

        if(case_1.getConclusion().toLowerCase().contains("negative")){
            System.out.println("You can go to work");
        }else{
            System.out.println("15 days quarantine");
        }


    }

}
