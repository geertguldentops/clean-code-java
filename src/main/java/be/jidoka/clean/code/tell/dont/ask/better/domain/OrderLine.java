package be.jidoka.clean.code.tell.dont.ask.better.domain;

import java.math.BigDecimal;

/**
 * OrderLine is now completely encapsulated by the Order it is in!
 */
class OrderLine {

    private final String productName;
    private BigDecimal price;
    private final int amount;

    OrderLine(String productName, BigDecimal price, int amount) {
        this.productName = productName;
        this.price = price;
        this.amount = amount;
    }

    String getProductName() {
        return productName;
    }

    void setPrice(BigDecimal newPrice) {
        this.price = newPrice;
    }

    BigDecimal getPrice() {
        return price;
    }

    int getAmount() {
        return amount;
    }

    BigDecimal calculateSubtotal() {
        return price.multiply(BigDecimal.valueOf(amount));
    }

    void applyDiscount(BigDecimal discount) {
        setPrice(price.subtract(price.multiply(discount)));
    }

}
