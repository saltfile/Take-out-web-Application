$(function () {
    $('#Us').on('click',function () {
    console.log("asdasdasdasd");
    alert("aaaa")
    })
})

$(function () {
    $('#Up_Btn').on('click',function () {
        alert("asdasdads");


    })})



/* <div class="right-con con-active" style="display: none;">
				<ul>

					<li>
						<div class="menu-img"><img src="image/img.jpg"></div>
						<div class="menu-txt">
							<h4 data-icon="01">辣子鸡</h4>
							<p class="list1">月销量：123</p>
							<p class="list2">
								<b>￥</b><b>3.00</b>
							</p>
							<div class="btn">
								<button class="minus"></button>
								<i>0</i>
								<button class="add"></button>
								<i class="price">3.00</i>
							</div>
						</div>
					</li>
				</ul>
			</div>*/

window.onload = function ()
{//收货地,货号,数量,状态,完成时间
   f();
}

function f() {
    id = "xxx"

    var trTemp = $("<div id='"+id+"' class="+"right-con con-active"+" style="+"display: none;"+"></div>");
    var ulTemp = $("<ul id='"+id+"1"+"' ></ul>")

    trTemp.appendTo("#muns")

    for (var i = 0;i < 5; i++) {
        ulTemp.append("<li>\n" +
            "\t\t\t\t\t\t<div class=\"menu-img\"><img src=\"image/img.jpg\"></div>\n" +
            "\t\t\t\t\t\t<div class=\"menu-txt\">\n" +
            "\t\t\t\t\t\t\t<h4 data-icon=\"00\">珍珠奶茶</h4>\n" +
            "\t\t\t\t\t\t\t<p class=\"list2\">\n" +
            "\t\t\t\t\t\t\t\t<b>￥</b><b>2.00</b>\n" +
            "\t\t\t\t\t\t\t</p>\n" +
            "\t\t\t\t\t\t\t<div class=\"btn\">\n" +
            "\t\t\t\t\t\t\t\t<button class=\"minus\"></button>\n" +
            "\t\t\t\t\t\t\t\t<i>0</i>\n" +
            "\t\t\t\t\t\t\t\t<button class=\"add\"></button>\n" +
            "\t\t\t\t\t\t\t\t<i class=\"price\">2.00</i>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</li>");

    }
    ulTemp.appendTo("#"+id)




    alert("asdasd")
}




function f1(id) {

}