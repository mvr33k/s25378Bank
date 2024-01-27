package org.example.s25378Bank;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
public class BankTest {
    private KlientStorage klientStorage;
    private TransakcjaService transakcjaService;
    @BeforeEach
    void setUp() {
        klientStorage=new KlientStorage();
        transakcjaService=new TransakcjaService();
    }
    @AfterEach
    void tearDown() {
        klientStorage.purgeList();
    }




}
/*


class OrderServiceTest {




    @Test
    void shouldFindOrder(){
        List<Component> componentList = new ArrayList<>();
        Component comp1 = new Component("pomidor",2);
        componentList.add(comp1);
        Order order = new Order(componentList,5,"park");

        orderService.addOrder(order);

        Order order1 = orderService.findOrderById(0);

        assertThat(order).isEqualTo(order1);
    }

    @Test
    void shouldNotFindOrder() {

        assertThrows(NoSuchElementException.class, () -> orderService.findOrderById(1));
    }
}
 */