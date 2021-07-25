package sekarre.com.data;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Id;

@Data
@Entity
@Table(name = "payments")
public class PaymentEntity implements Serializable {
    private static final long serialVersionUID = 5313493413859894403L;

    @Id
    private String paymentId;

    @Column
    public String orderId;


}