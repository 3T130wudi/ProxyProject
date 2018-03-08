package entity;

import java.util.Date;

public class FinancialStatements {
    private int id;
    private Users users_id;
    private CapitalSource approach_id;
    private float capital;
    private Date apply_date;
    private Date pass_date;
    private int disburse_income;
    private int verifier_id;
    private int accountBalance;
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsers_id() {
        return users_id;
    }

    public void setUsers_id(Users users_id) {
        this.users_id = users_id;
    }

    public CapitalSource getApproach_id() {
        return approach_id;
    }

    public void setApproach_id(CapitalSource approach_id) {
        this.approach_id = approach_id;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public Date getApply_date() {
        return apply_date;
    }

    public void setApply_date(Date apply_date) {
        this.apply_date = apply_date;
    }

    public Date getPass_date() {
        return pass_date;
    }

    public void setPass_date(Date pass_date) {
        this.pass_date = pass_date;
    }

    public int getDisburse_income() {
        return disburse_income;
    }

    public void setDisburse_income(int disburse_income) {
        this.disburse_income = disburse_income;
    }

    public int getVerifier_id() {
        return verifier_id;
    }

    public void setVerifier_id(int verifier_id) {
        this.verifier_id = verifier_id;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
}
