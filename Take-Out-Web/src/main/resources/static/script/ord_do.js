$(document).on('click','#ord_back',function(){
    window.location.href = "./index.html"
})


$(function(){
    set_data();
});
function set_data()
{
    var str = window.localStorage.getItem("nus");
   var j = window.sessionStorage.getItem("jin");
   // var str = $.query.get("nus");
   // var  j = $.query.get("jin");
   $("#meals").text(str);
   $("#jin").text(j);

}