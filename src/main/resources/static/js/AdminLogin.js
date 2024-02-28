
/**
 * 유효성 검사
 */
function AdminChk(){
    if(document.adminLogin.aid.value.length == 0){
        alert("아이디를 입력하세요!");
        adminLogin.aid.focus();
        return;
    }

    if(document.adminLogin.apassword.value.length == 0){
        alert("비밀번호를 입력하세요!");
        adminLogin.apassword.focus();
        return;
    }

    document.adminLogin.submit();
}
