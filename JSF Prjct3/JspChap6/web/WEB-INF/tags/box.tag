<%@ attribute name="color" required="true" rtexprvalue="false" %>
<%@ attribute name="title" required="true" rtexprvalue="false" %>

<table width="260" bordercolor="${color}" border="1" cellpadding="4" cellspacing="0">
  <tr bgcolor="${color}" >
    <td class="boxHeader" color="#ffffff">
      ${title}
    </td>
  </tr>
  <tr>
    <td valign="top" class="boxText">
      <jsp:doBody/> 
    </td>
  </tr>
</table>
