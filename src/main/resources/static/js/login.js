
/**
 * 유효성 검사
 */
function inputChk(){

    if(document.login.username.value.length === 0){
        alert("아이디를 입력하세요!");
        login.username.focus();
        return;
    }

    if(document.login.password.value.length === 0){
        alert("비밀번호를 입력하세요!");
        login.password.focus();
        return;
    }

    document.login.submit();
}



