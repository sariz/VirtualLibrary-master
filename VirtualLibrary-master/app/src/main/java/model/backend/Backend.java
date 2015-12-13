package model.backend;

import entities.*;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by adina_000 on 09-Nov-15.
 */
public interface Backend {
    /**
     * book functions
     */
    public void addBook (Book book ,long userID ,long supplierID, Privilege privilege, int numOfCopies, double price) throws Exception;
    public void removeBook (long bookID, long userID ,Privilege privilege) throws Exception;
    public void updateBook (Book book , long userID ,Privilege privilege) throws Exception;
    public ArrayList<Book> getBookList() throws Exception;

    /**
     * supplier functions
     */
    public void addSupplier (Supplier supplier , Privilege privilege) throws Exception;
    public void removeSupplier (long supplierID, Privilege privilege) throws Exception;
    public void updateSupplier (Supplier supplier , Privilege privilege) throws Exception;
    public ArrayList<Supplier> getSupplierList() throws Exception;

    /**
     * order functions
     */
    public void addOrder (Order order, Privilege privilege) throws Exception;
    public void removeOrder (long orderID, Privilege privilege) throws Exception;
    public void updateOrder (Order order, Privilege privilege) throws Exception;
    public ArrayList<Order> getOrderList() throws Exception;

    /**
     * customer functions
     */
    public void addCustomer (Customer customer,Privilege privilege) throws Exception;
    public void removeCustomer (long customerID,Privilege privilege) throws Exception;
    public void updateCustomer (Customer customer,Privilege privilege) throws Exception;
    public ArrayList<Customer> getCustomerList(Privilege privilege) throws Exception;

    /**
     * opinion functions
     */
    public void addOpinion (Opinion opinion, Privilege privilege) throws Exception;
    public void removeOpinion (long opinionID, Privilege privilege) throws Exception;
    public void updateOpinion (Opinion opinion, Privilege privilege) throws Exception;
    public ArrayList<Opinion> getOpinionListOfBook(long bookID) throws Exception;

    /**
     * manger functions
     */
    public void addManger(Manager manager , Privilege privilege) throws Exception;
    public void removeManger (long mangerID , Privilege privilege) throws Exception;
    public void updateManger (Manager manager, Privilege privilege) throws Exception;
    public Manager getManger () throws Exception;

    /**
     * other functions
     */
    public ArrayList<Book> bookListSortedByCategory (Category category)throws Exception;
    public ArrayList<Book> bookListSortedByAuthors (String authorsName)throws Exception;
    public ArrayList<Book> bookListSortedByDate (Date start, Date end)throws Exception;
    public int getNumOfCopiesOfBook (long bookID)throws Exception;
    public double finishOrder (ArrayList<Order> orders)throws Exception;
    public void addMoreCopiesToBook (long bookID , int numOfCopies, long supplierID , Privilege privilege)throws Exception;
    public void customerVIP (Order order)throws Exception;
    public void updateBookRate (Book book)throws Exception;
    public Book bookOfTheStore ()throws Exception;
}
