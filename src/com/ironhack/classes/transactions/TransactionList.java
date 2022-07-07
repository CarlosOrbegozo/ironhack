package com.ironhack.classes.transactions;

import java.util.ArrayList;
import java.util.Date;

public interface TransactionList {
    Transaction getLastTransaction();
    void addTransaction (Transaction transaction);
    Transaction getTransactionByDate (Date date);
    ArrayList<Transaction> getAllTransactions();
}
