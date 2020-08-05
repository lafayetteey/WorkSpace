function makeTable(elem){
	//var없이 변수 선언가능하다.
	$table = $("<table border=1>");
	
	for(var i=0; i<1; i++) {
		$tr = $("<tr>");
		for(var j=0; j<elem.eq(0).children().length; j++) {
			$td = $("<td>").append( elem.eq(0).children().eq(j).prop("tagName") ) ;
			$tr.append($td);
		}
		$table.append($tr);
	}
	for(var i=0; i<elem.length; i++) {
		$tr = $("<tr>");
		for(var j=0; j<elem.eq(i).children().length; j++){
			$td = $("<td>").append( elem.eq(i).children().eq(j).text());
			$tr.append($td);
		}
		$table.append($tr);
	}
	return $table;
}