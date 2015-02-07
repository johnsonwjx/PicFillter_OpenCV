function initWebParam(cookieStr){
    var txt=$.trim(cookieStr) ;
    if($.isEmptyObject(txt)){
        alert('请输入') ;
        return ;
    }
    $.get(path+"ActionServlet", {method:'initWeb'  ,cookieStr: txt },
        function(data){
            alert(data) ;
        });
}