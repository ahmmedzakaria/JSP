package com.example.javaknowledge;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class ParamBean implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * This method returns the myParamName parameter value.
     * @return
     */
    public String getContextParameter() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String myConstantValue =
                ctx.getExternalContext().getInitParameter("myParamName");
        return myConstantValue;
    }
}
