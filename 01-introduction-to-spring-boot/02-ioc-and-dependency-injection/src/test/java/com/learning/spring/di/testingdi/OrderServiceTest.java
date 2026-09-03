package com.learning.spring.di.testingdi;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class OrderServiceTest {

    @Test
    public void shouldCreateOrderService() {
        /*
            NotificationService notificationService = new EmailNotificationService();
            OrderRepository orderRepository = new OrderRepository();
            OrderService orderService = new OrderService(List.of(notificationService), orderRepository);
            orderService.setAuditService(new AuditService());

            assertNotNull(orderService);
         */

        NotificationService notificationService = mock(NotificationService.class);
        OrderRepository orderRepository = mock(OrderRepository.class);
        AuditService auditService = mock(AuditService.class);
        OrderService orderService = new OrderService(List.of(notificationService), orderRepository);

        orderService.setAuditService(auditService);
        orderService.placeOrder();
        verify(orderRepository).save();

    }
}
