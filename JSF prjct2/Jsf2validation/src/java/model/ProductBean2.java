package model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
@SessionScoped
public class ProductBean2 {

    private String pid, pname, email;
    private double price, sprice;
    private int qty;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getSprice() {
        return sprice;
    }

    public void setSprice(double sprice) {
        this.sprice = sprice;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

//Action Controller
    public String doPurchase() {

        //apply business logic
        return ("show-purchase");

    }

    double pp;
    //custom validation method
    public void validatePurchasePrice(FacesContext context,
            UIComponent componentToValidate,
            Object value)
            throws ValidatorException {
        pp = ((Double) value).doubleValue();
    }
    //custom validation method
    public void validateSalePrice(FacesContext context,
            UIComponent componentToValidate,
            Object value)
            throws ValidatorException {
        double sp = ((Double) value).doubleValue();
        //int building = ((Integer) value).intValue();
        //double pp = ((Double) value2).doubleValue();
        System.out.println(sp +" "+pp );
        if (sp <= pp) {
            FacesMessage message =
                    new FacesMessage("Sale Price must be higher than  "
                    + "Purchase Price");
            throw new ValidatorException(message);
        }
    }
}
