 <%@include file="header_template.jsp" %>

    <h2><%=request.getParameter("hotelname") %></h2>
    
    <div id="detail_foto">
        <img src="bild.jpg">
  	</div>
  	
  	<div id="detail_summary">
	        <h4>Stadt:  <%=request.getParameter("city") %></h4><br>
	        <h4>Land:   <%=request.getParameter("country") %></h4><br>
	        <h4>Preis:  <%=request.getParameter("roomcost") %> EUR</h4><br>
  			<a id="buchenbutton" href="Buchen.jsp?hotelid=<%=request.getParameter("hotelid") %>&hotelname=<%=request.getParameter("hotelname") %>&city=<%=request.getParameter("city") %>&country=<%=request.getParameter("country") %>&roomnumber=<%=request.getParameter("roomnumber") %>&roomsize=<%=request.getParameter("roomsize") %>&roomcost=<%=request.getParameter("roomcost") %>&begindate=<%=request.getParameter("begindate") %>&enddate=<%=request.getParameter("enddate") %>">Buchen</a>
  	</div>

	<div id="hotel_detail">
		<h6>Das Hotel ist eines der besten F�nf-Sterne-Luxushotels der Stadt. Es befindet sich in idealer Lage im Stadtteil Floresta, das zugleich Gesch�ftsviertel und Wohngebiet ist und nur wenige Minuten vom Mariscal Sucre International Airport entfernt liegt. Zudem ist es in nur 45 Minuten vom Mitad del Mundo International Airport erreichbar. Dieser neue Flughafen soll im Februar 2013 er�ffnet werden.
		
		Alle 232 G�stezimmer und 43 Executive Apartments des Hotel sind mit einer Klimaanlage ausgestattet und modern eingerichtet. Die luxuri�se Ausstattung umfasst modernste Technologien sowie kostenlosen Internetzugang. Die Executive Zimmer und die Swiss Executive Club Lounge bieten h�chsten Komfort und Exklusivit�t.
		</h6>
	</div>

<%@include file="footer_template.jsp" %>