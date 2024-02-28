
/**
 * 유효성 검사
 */
function CategoryChk(){
    if(document.cRegister.code.value.length == 0){
        alert("코드를 입력하세요!");
        cRegister.code.focus();
        return;
    }

    if(document.cRegister.cname.value.length == 0){
        alert("카테고리 이름을 입력하세요!");
        cRegister.cname.focus();
        return;
    }

    document.cRegister.submit();
}


function cModifyChk(){
    if(document.cModify.code.value.length == 0){
        alert("코드를 입력하세요!");
        cModify.code.focus();
        return;
    }

    if(document.cModify.cname.value.length == 0){
        alert("카테고리 이름을 입력하세요!");
        cModify.cname.focus();
        return;
    }

    document.cModify.submit();
}
