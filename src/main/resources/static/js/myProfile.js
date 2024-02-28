$(".userDelete").hide();

$(".myProfileLi").click(function() {
    $(".myProfileLi").addClass("myPro-hover");
    $(".userDel").removeClass("myPro-hover");
    $(".profile").show();
    $(".userDelete").hide();
})

$(".userDel").click(function() {
    $(".userDel").addClass("myPro-hover");
    $(".myProfileLi").removeClass("myPro-hover");
    $(".userDelete").show();
    $(".profile").hide();
})