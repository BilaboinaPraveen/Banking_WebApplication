package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Repo.BankingRepo;
import com.web.controller.bankingController;
import com.web.model.Banking;
@Service
public class BankingServiceImp implements BankingService {
	@Autowired
	private BankingRepo repo;

	@Override
	public Banking saveaccount(Banking Banking) {
	Banking p=repo.save(Banking);
		return p;
	}

	@Override
	public Banking depositamount(Banking Banking) {
		Banking b=repo.findById(Banking.getAn()).get();
		if(Banking.getAn()==Banking.getAn()&&Banking.getPswd().equals(Banking.getPswd()));
		b.setAmount(Banking.getAmount()+b.getAmount());
		repo.save(Banking);
		return b;
	}

	@Override
	public Banking withdrawamount(Banking Banking) {
		Banking c=repo.findById(Banking.getAn()).get();
		if(Banking.getAn()==c.getAn()&&Banking.getUn().equals(c.getUn())&&Banking.getPswd().equals(c.getPswd()));
		c.setAmount(Banking.getAmount()-Banking.getAmount());
		Banking bank=new Banking();
		bank.setAn(bank.getAn());
		bank.setUn(bank.getUn());
		bank.setPswd(bank.getPswd());
		bank.setAmount(bank.getAmount());
		
		return c;
	}

	@Override
	public Banking transferamount(Banking Banking) {
		
		return null;
	}

	@Override
	public Banking deleteaccount(Banking Banking) {
		Banking b=repo.findById(Banking.getAn()).get();
		if (b.getAn()==Banking.getAn()&&b.getUn().equals(Banking.getUn())&&b.getPswd().equals(Banking.getPswd())) {
			repo.deleteById(Banking.getAn());
		}
        Banking bank=new Banking();
        bank.setAn(bank.getAn());
        bank.setUn(bank.getUn());
        bank.setPswd(bank.getPswd());
		return b;
	}

	@Override
	public Banking findbyid(Banking Banking) {
	Banking bal=repo.findById(Banking.getAn()).get();
	Banking bank=new Banking();
    bank.setAn(bank.getAn());
    bank.setUn(bank.getUn());
    bank.setPswd(bank.getPswd());
		return bal;
	}

}
