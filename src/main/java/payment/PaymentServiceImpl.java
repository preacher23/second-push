package payment;

import dao.PaymentDao;

@Service
public class PaymentServiceImpl implements PaymentService{
    @Autowired
    private PaymentDao paymentDao;
    public PaymentDao getPaymentDao() {
        return paymentDao;
    }

    public void setPaymentDao(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }


}
