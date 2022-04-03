package com.desh.customer;

import lombok.*;

import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity

public class Customer {

    @javax.persistence.Id
    @SequenceGenerator(
            name = "Customer_Id_Sequence",
            sequenceName = "Customer_Id_Sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "customer_id_sequence"

    )
    private Integer Id;
    private String firstname;
    private String lastname;
    private String email;


}
