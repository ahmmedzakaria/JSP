<%@ page import="java.util.*,com.apress.projsp.store.*" %>


<%

    HashMap products = (HashMap) application.getAttribute("products");

    //  List the products, clickable to add to cart
    Iterator it = products.values().iterator();
    out.println("<table border='1' width='30%'>");
    while (it.hasNext()) {
        out.println("<tr>");
        Product product = (Product) it.next();

%>

<td>
    <a href='<%= request.getContextPath() %>/servlet/CartAction?add=true&id=<%=product.getId()%>'><%=product.getName()%></a>
</td>
<td>
    <%=product.getPrice()%>
</td>

</tr>
<%}%>
</table>
