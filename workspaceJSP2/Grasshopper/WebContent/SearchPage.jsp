<%@include file="header_template.jsp" %>

			

 <form action="Buchen" action="Buchen" method="post">
 	<div class="form_settings">

		<p><span>Hotel</span><input type="text" name="hotelname" value="${hotelname}" /></p>
     	<p><span>Von</span><input type="text" name="von" value="${von}" /></p>
		<p><span>Bis</span><input type="text" name="bis" value="${bis}" /></p>
       	<p><span>Maxkosten</span><input type="text" name="maxkosten" value="${kosten2}" /></p>
      	<p><span>Personen</span><input type="text" name="personen" value="${personen2}" /></p>

        <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="name" value="Buchen"></p>
     </div>
    </form>      

<%@include file="footer_template.jsp" %>

