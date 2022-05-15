package springjpa.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "BANK_ACCOUNT")
public class BankAccount {
    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "FULL_NAME", length = 128, nullable = false)
    private String fullName;

    @Column(name = "BALANCE", nullable = false)
    private double balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
