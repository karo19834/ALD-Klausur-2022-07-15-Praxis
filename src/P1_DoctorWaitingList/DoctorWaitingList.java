package P1_DoctorWaitingList;

public class DoctorWaitingList {
    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public void addPatientAtLastPos(String name, String socialSecurityNo) {
        Node patient = new Node(name, socialSecurityNo);
        if (first == null) {
            first = patient;
            last = patient;
        } else {
            patient.setPrev(last);
            last.setNext(patient);
            last = patient;
        }
        //TODO: Implementierung hinzfuegen
    }
}

