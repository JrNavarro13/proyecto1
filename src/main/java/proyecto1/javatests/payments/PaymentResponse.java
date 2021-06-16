package proyecto1.javatests.payments;

public class PaymentResponse {

    private PaymentStatus{
        OK,ERROR
    }
    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
