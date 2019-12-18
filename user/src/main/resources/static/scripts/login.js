$(function () {
})
function aFa(){
	$.ajax({
		url: "../user/login.do",
		type:"post",
		data: $("#login_form").serialize(),//表单序列化提交
		async:false,//同步上传
		success:function (data){//成功回调函数
			console.log(data)
			if(data[0].tip == 1){
				alert("账号错误")
			}else if(data[0].tip == 2){
				alert("密码错误")
			}else{
				alert("登录成功")
				location.href="../user/listMenu.do"
			}
		},
		error :function(){//错误回调函数
			alert("登录错误,请联系管理员")
		}
	});

}
function registerHtml(){
	location.href="../htmlController/registerHtml.do"
}
function indexHtml(){
	location.href="../htmlController/loginHtml.do"
}
function registerUser(){
if($("#userNick").val() != "" && $("#userNick").val() != null){
	if($("#userPass").val() != "" && $("#userPass").val() != null){
		if($("#userPass2").val() != "" && $("#userPass2").val() != null){
			if($("#userPass2").val() == $("#userPass").val()){
				$.ajax({
					url: "../user/addUser.do",
					type:"put",
					data: $("#regForm").serialize(),//表单序列化提交
					async:false,//同步上传
					success:function (data){//成功回调函数
						console.log(data)
						if(data.tip == 1){
							alert("注册成功")
							location.href="../htmlController/loginHtml.do"
						}else if(data.tip == 2){
							alert("账号已存在")

						}
					},
					error :function(){//错误回调函数
						alert("注册错误,请联系管理员")
					}
				});
			}
		}
	}
}

}
function erWeiMa(){
	$.ajax({
		url: "../user/createCommonQRCode.do",
		type:"get",
		success:function (data){//成功回调函数
			console.log(data);
		},
		error :function(){//错误回调函数
			alert("登录错误,请联系管理员")
		}
	});
	// document.getElementById("login_form").innerHTML='<h4>\n' +
	// 	'        <a target="_blank" href="http://www.cnblogs.com/GoodHelper/">from\n' +
	// 	'            刘冬的博客</a>\n' +
	// 	'    </h4>\n' +
	// 	'    <img ng-show="src" ng-src="{{src}}" />'

	document.getElementById("login_form").innerHTML='<table>\n' +
		'\t<div id="login-erWeiMa">\n' +
		'\t\t<tr>\n' +
		'\t\t\t<td class="field"></td>\n' +
		'\t\t\t<td><img src="http://127.0.0.1:8080/user/createCommonQRCode.do?url=http://127.0.0.1:8080/htmlController/indexHtml.do" alt=""/><span></span></td>\n' +
		'\t\t</tr>\n' +
		'\t</div>\n' +
		'\t<tr>\n' +
		'\t\t<td></td>\n' +
		'\t\t<td><h4>扫码登录正在维护,于一个月后正常使用</h4></td>\n' +
		'</table>';

}