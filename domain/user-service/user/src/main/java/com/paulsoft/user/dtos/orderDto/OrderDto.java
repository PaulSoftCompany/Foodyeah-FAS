package com.paulsoft.user.dtos.orderDto;

import com.paulsoft.user.dtos.orderDetailDto.OrderDetailDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.SecondaryTable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class OrderDto {
    private Long id;
    private Date date;
    private Double totalPrice;
    private List<OrderDetailDto> details;
    private Long customerId;
}
