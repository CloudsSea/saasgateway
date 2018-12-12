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
			//页面跳  ajax返回的数据已经是object格式
			//var jsonObj = JSON.parse(data);
			showPic(data.oriUrl,data.lastUrl);
		}
	});
}
function showPic(preUrl,afterUrl){
	var prsStri = '<img  style="width: 400px" alt="原图片" src="http://saaswork.oss-cn-beijing.aliyuncs.com/'+preUrl+'">';
	var afterStri = '<img  style="width: 400px" alt="处理图片" src="http://saaswork.oss-cn-beijing.aliyuncs.com/'+afterUrl+'">';
	$("#prePicTd").html(prsStri);
	$("#afterPicTd").html(afterStri);
}
function test(){
	var data = '{"result":"success","oriUrl":"f5WSztYyRE.jpg","lastUrl":"evbivnozwdqalszqnuyxlajawggzqotm.jpg"}';
	var jsonObj = JSON.parse(data);
	showPic(jsonObj.oriUrl,jsonObj.lastUrl);
}