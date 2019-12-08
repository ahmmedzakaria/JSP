package com.apress.projsp;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateTimeTag extends SimpleTagSupport {
    @Override
  public void doTag() throws JspException, IOException {
    DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
        DateFormat.MEDIUM);
    SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd"); 
    // now write out the formatted date to the page
    getJspContext().getOut().write(format.format(new Date()));
  }
}