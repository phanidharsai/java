package com.phanidharsai.lldpractice;

public abstract class AbstractPaymentValidator implements PaymentValidator {
    protected PaymentValidator nextPaymentValidator;
    public void setNext(PaymentValidator paymentValidator){
        this.nextPaymentValidator = paymentValidator;
    }

    public final boolean handle(PaymentRequest paymentRequest){
        // Calls the concrete subclass implementation
        if (!validate(paymentRequest)) {
            return false;
        }

        if (nextPaymentValidator != null) {
            return nextPaymentValidator.handle(paymentRequest);
        }

        return true;

    }
    protected abstract boolean validate(PaymentRequest request);

}
