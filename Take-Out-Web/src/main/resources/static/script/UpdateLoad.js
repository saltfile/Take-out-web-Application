$(function () {
    window.onload = function () {
        $.ajax({
            url: '/count/load',
            type: 'GET',
            data: {},
            success: function (res) {
                if (res.toString() == 'N') {
                    location.href = "../../login.html";
                }else {
                  getName();
                    if(document.getElementById("old_password") != null){
                        doEye();
                    }
                }
            }, error: function (res) {
                console.error("错误")
            }
        })
    }
})


function getName() {
    $.ajax({
        url: '/count/loadName',
        type: 'GET',
        data: {},
        success: function (res) {
            var x=document.getElementById("demoName");  // 找到元素
            x.innerHTML="<img src=\"./img/100.jpg\" class=\"layui-nav-img\">"+res;
            console.log("调用");
        }, error: function (res) {
            console.error("错误")
        }
    })
}


$(function () {
    $('#btn_up').on('click',function () {
        console.log("aaaa");
       var man = document.getElementById("man");
       var woman = document.getElementById("women");
       var sex = "";
       if(man.checked){
           console.log("男");
           sex+="man";
       }

       if(woman.checked){
           console.log("女");
           sex+="women";
       }


       if(sex != "" && $("#name").val() != "" &&$("#email").val() != ""){
           $.ajax({
               url: '/count/updateMes',
               type: 'GET',
               data: {emil:$("#email").val(),name:$("#name").val(),sex:sex},
               success: function (res) {
                   if(res == "Y")
                   location.replace(location);
               }, error: function (res) {
                   console.error("错误")
               }
           })
       }

    })
})

$(function () {
    $('#btn_up_user').on('click',function () {
        console.log("aaaa");
        var man = document.getElementById("man");
        var woman = document.getElementById("women");
        var sex = "";
        if(man.checked){
            console.log("男");
            sex+="man";
        }

        if(woman.checked){
            console.log("女");
            sex+="women";
        }


        if(sex != "" && $("#name").val() != "" &&$("#email").val() != ""&&$("#phone1").val()){
            $.ajax({
                url: '/count/updateMesUser',
                type: 'GET',
                data: {tel:$("#phone1").val(),emil:$("#email").val(),name:$("#name").val(),sex:sex},
                success: function (res) {
                    if(res == "Y")
                        location.replace(location);
                }, error: function (res) {
                    console.error("错误")
                }
            })
        }

    })
})



$(function () {
    $('#btn_down').on('click',function () {

        if($("#phone1").val() != "" && $("#old_password").val() != "" && $("#new_password").val() != ""){
            $.ajax({
                url: '/count/updatePwd',
                type: 'GET',
                data: { tel:$("#phone1").val(),old_password:$("#old_password").val(),new_password:$("#new_password").val()},
                success: function (res) {
                    console.log(res);
                    if(res == "Y")
                        location.replace(location);
                }, error: function (res) {
                    console.error("错误")
                }
            })
        }

    })
})






function doEye() {
    //获取元素（两种方式都可以）
    var input1 = document.getElementById('old_password');
    var imgs1 = document.getElementById('eyes1');
    //下面是一个判断每次点击的效果
    var flag1 = 0;
    imgs1.onclick = function () {
        if (flag1 === 0) {
            console.log("asd");
            input1.type = 'text';
            imgs1.src = '../../img/3.png';//睁眼图
            flag1 = 1;
        } else {
            input1.type = 'password';
            imgs1.src = '../../img/2.png';//闭眼图
            flag1 = 0;
        }
    }
    var input2 = document.getElementById('new_password')
    var imgs2 = document.getElementById('eyes2');
    //下面是一个判断每次点击的效果
    var flag2 = 0;
    imgs2.onclick = function () {
        if (flag2 === 0) {
            input2.type = 'text';
            imgs2.src = '../../img/3.png';//睁眼图
            flag2 = 1;
        } else {
            input2.type = 'password';
            imgs2.src = '../../img/2.png';//闭眼图
            flag2 = 0;
        }
    }
}
