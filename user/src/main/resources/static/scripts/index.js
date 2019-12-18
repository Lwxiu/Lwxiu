$(function () {

})
function zuijin(obj){
    document.getElementById("reMaiTuiJia").innerHTML='<h2>最近浏览</h2>\n' +
        '\t\t\t<dl class="clearfix">\n' +
        '\t\t\t\t<dt><a href="../htmlController/productView.do"><img src='+$(obj).attr("img")+' /></a></dt>\n' +
        '\t\t\t\t<dd><a href="../htmlController/productView.do">'+$(obj).attr("name")+'</a></dd>\n' +
        '\t\t\t</dl>'
    aa(obj);


}
function aa(obj){

    document.getElementById("product").innerHTML='<h1>'+$(obj).attr("name")+'</h1>\n' +
        '\t\t<div class="infos">\n' +
        '\t\t\t<div class="thumb"><img src='+$(obj).attr("img")+' /></div>\n' +
        '\t\t\t<div class="buy">\n' +
        '\t\t\t\t<p>商城价：<span class="price">'+$(obj).attr("goodPrice")+'</span></p>\n' +
        '\t\t\t\t<p>库　存：有货</p>\n' +
        '\t\t\t\t<p>库　存：有货</p>\n' +
        '\t\t\t\t<p>库　存：有货</p>\n' +
        '\t\t\t\t<p>库　存：有货</p>\n' +
        '\t\t\t\t<div class="button"><input type="button" name="button" value="" onclick="goBuy(1)" /><a href="#">放入购物车</a></div>\n' +
        '\t\t\t</div>\n' +
        '\t\t\t<div class="clear"></div>\n' +
        '\t\t</div>\n' +
        '\t\t<div class="introduce">\n' +
        '\t\t\t<h2><strong>商品详情</strong></h2>\n' +
        '\t\t\t<div class="text">\n' +
        '\t\t\t\tsdf<br />\n' +
        '\t\t\t\tsdf<br />\n' +
        '\t\t\t</div>\n' +
        '\t\t</div>'

}
