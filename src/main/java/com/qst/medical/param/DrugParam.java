package com.qst.medical.param;

import com.qst.medical.domain.Drug;

public class DrugParam extends Drug {

    private Long[] saleIds; //售卖该药品的药店

    public Long[] getSaleIds() {
        return saleIds;
    }

    public void setSaleIds(Long[] saleIds) {
        this.saleIds = saleIds;
    }
}
