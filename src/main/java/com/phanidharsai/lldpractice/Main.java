package com.phanidharsai.lldpractice;


public class Main {
            public static void main(String[] args) {
//                String type = "CREDIT_CARD";
//                PaymentStrategy credit = PaymentFactory.getStrategy(PaymentType.CREDIT_CARD);

                try {
                    PaymentValidator amountCheck = new AmountValidator();
                    PaymentRequest p1 = new PaymentRequest(59999,"123", PaymentType.UPI);
                    PaymentRequest p2 = new PaymentRequest(29999,"133", PaymentType.CREDIT_CARD);
//                    System.out.println(amountCheck.validate(p1));
//                    System.out.println(amountCheck.validate(p2));
                        PaymentService processor = new PaymentService(amountCheck);
                        PaymentResult result = processor.setPaymentMethod(p2.paymentType);
                        System.out.println(processor.processPayment(p2).getMessage());
//                        processor.setPaymentMethod(PaymentType.UPI);
//                        System.out.println(processor.processPayment(999999.123).isSuccess());
//                        processor.setPaymentMethod(PaymentType.PAYPAL);
//                        System.out.println(processor.processPayment(1199999.123).isSuccess());


                } catch (NullPointerException | IllegalStateException e) {
                    System.out.println("Main: Unable to process payment: "
                            + e.getMessage());
                }
            }
}
