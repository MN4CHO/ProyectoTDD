package payment;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {
    @Test
    void given_payment_when_is_correct_the_OK() {
        PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
        PaymentProcessor processor = new PaymentProcessor(gateway);

        Mockito.when(gateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(processor.makePayment(100.0));
    }
}