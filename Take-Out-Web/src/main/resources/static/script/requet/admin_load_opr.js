window.onload = function ()
{//收货地,货号,数量,状态,完成时间
    var start = 0;
    var size = 10;
    $.ajax({
        url: "/admin/selectAllOpertor",
        method: "post",
        data: {},
        xhrFields: {
            withCredentials: true //允许跨域带Cookie
        },
        success: function (result) {

            // $("#message").html(result);
            var result2=eval("("+result+")");
            console.error(result2);
            // $("#message").html(result);
            for (var i = 0; i < result2.length; i++) {
                var trTemp = $("<tr id='tr" + result2[i].oid+ "'></tr>");
                trTemp.append("<td>" + result2[i].oid+ "</td>");
                trTemp.append("<td>" + result2[i].accout+ "</td>");
                trTemp.append("<td>" + result2[i].weight+ "</td>");
                trTemp.append("</tr>");
                console.log(result2[i].timestemp)
                trTemp.appendTo("#in_table");
            }
        },
        error: function () {
            window.location.href = "./TestCors.html";
        }
    })
}