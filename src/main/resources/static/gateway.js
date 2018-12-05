function addToGateWay(fileName) {
	var userId = 1;
	$.ajax({
		type : "post",
		url : "pic",
		data : {
			userId : userId,
			fileName : fileName
		},
		dataType : "json",
		success : function(data) {
			console.log(132)
		}
	});
}