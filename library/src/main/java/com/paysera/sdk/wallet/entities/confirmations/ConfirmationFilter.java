package com.paysera.sdk.wallet.entities.confirmations;

import com.paysera.sdk.wallet.filters.BaseFilter;

public class ConfirmationFilter extends BaseFilter {
    private String orderBy;
    private String status;

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
