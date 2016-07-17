package be.jidoka.clean.code.tell.dont.ask.domain;

import java.math.BigDecimal;

public class OrderLine {

    private final String productName;
    private BigDecimal price;
    private final int amount;

    public OrderLine(String productName, BigDecimal price, int amount) {
        this.productName = productName;
        this.price = price;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(BigDecimal newPrice) {
        this.price = newPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public BigDecimal calculateSubtotal() {
        return price.multiply(BigDecimal.valueOf(amount));
    }

}
