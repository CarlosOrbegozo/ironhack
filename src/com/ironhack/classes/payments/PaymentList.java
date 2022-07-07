package com.ironhack.classes.payments;

import com.ironhack.classes.transactions.Transaction;
import com.ironhack.classes.transactions.TransactionList;

import java.util.ArrayList;
import java.util.Date;

public class PaymentList implements TransactionList {
    private ArrayList<Transaction> transactions;

    @Override
    public Transaction getLastTransaction() {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {

    }

    @Override
    public Transaction getTransactionByDate(Date date) {
        return null;
    }

    @Override
    public ArrayList<Transaction> getAllTransactions() {
        return null;
    }

    public PaymentList(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}
