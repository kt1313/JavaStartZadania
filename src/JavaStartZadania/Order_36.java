package JavaStartZadania;

import java.util.Scanner;

class Order_36 {
    public static void main(String[] args) {

        OrderItem_36[] orders = createOrders();
        OrderStatus_36 orderStatus = readStatus();
        OrderItem_36[] sameOrders = sameOrder(orders, orderStatus);
        printOrders(sameOrders, orderStatus);

    }
        private static OrderItem_36[] createOrders() {
            OrderItem_36[] orders = new OrderItem_36[10];
            orders[0] = new OrderItem_36("PC  WEW3232", 1233, OrderStatus_36.PAID);
            orders[1] = new OrderItem_36("Mouse A4, 32U54", 32, OrderStatus_36.SHIPPED);
            orders[2] = new OrderItem_36("mouse LogiTech, MM2U24", 42, OrderStatus_36.PAID);
            orders[3] = new OrderItem_36("Mouse LogiTech, MM1U22", 38, OrderStatus_36.NEW);
            return orders;
        }

        private static OrderStatus_36 readStatus () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj status zamówień do wyświetlenia (");
            for (OrderStatus_36 os : OrderStatus_36.values()) {
                System.out.print(os.name() + " ");
            }
            System.out.println("):");
            String status = scanner.nextLine();
            return OrderStatus_36.valueOf(status);
        }


        private static int countOrderByStatus (OrderItem_36[]orders, OrderStatus_36 orderStatus){
            int count = 0;
            for (OrderItem_36 order : orders) {
                if (order.getStatus() == orderStatus)
                    count++;
            }
            return count;
        }



    private static OrderItem_36[] sameOrder(OrderItem_36[] orders, OrderStatus_36 orderStatus) {
        int size = countOrderByStatus(orders, orderStatus);
        OrderItem_36[] orderByStatus = new OrderItem_36[size];
        int counter = 0;
        for (OrderItem_36 order : orders) {
            if (order.getStatus() == orderStatus) {
                orderByStatus[counter] = order;
                counter++;
            }
        }
        return orderByStatus;
    }

    private static void printOrders(OrderItem_36[] sameOrders, OrderStatus_36 orderStatus) {
        System.out.println(" Lista zamówień ze statutem: " + orderStatus);
        for (OrderItem_36 order : sameOrders) {
            System.out.println(order);
        }
    }
}