
/**
 * 유효성 검사
 */
function registerChk(){
    if(document.userRegister.username.value.length == 0){
        alert("아이디를 입력하세요!");
        userRegister.username.focus();
        return;
    }

    if(document.userRegister.password.value.length == 0){
        alert("비밀번호를 입력하세요!");
        userRegister.password.focus();
        return;
    }

    if(document.userRegister.name.value.length == 0){
        alert("이름을 입력하세요!");
        userRegister.name.focus();
        return;
    }

    if(document.userRegister.dob.value.length == 0){
        alert("생년월일을 입력하세요!");
        userRegister.dob.focus();
        return;
    }

    if(document.userRegister.tel.value.length == 0){
        alert("연락처를 입력하세요!");
        userRegister.tel.focus();
        return;
    }

    if(document.userRegister.email.value.length == 0){
        alert("이메일을 입력하세요!");
        userRegister.email.focus();
        return;
    }

    document.userRegister.submit();
}
