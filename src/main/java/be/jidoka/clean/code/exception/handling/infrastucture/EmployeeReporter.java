package be.jidoka.clean.code.exception.handling.infrastucture;

public interface EmployeeReporter {

    void generatePDFReportFor(String firstName, String lastName, int currentWager);

}
