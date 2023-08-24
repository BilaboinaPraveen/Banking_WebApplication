package com.web.service;

import com.web.model.Banking;

public interface BankingService {
     public Banking saveaccount(Banking Banking);
     public Banking depositamount(Banking Banking);
     public Banking withdrawamount(Banking Banking);
     public Banking transferamount(Banking Banking);
     public Banking deleteaccount(Banking Banking);
     public Banking findbyid(Banking Banking);    
}
