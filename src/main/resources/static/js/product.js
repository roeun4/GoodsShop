
/**
 * 유효성 검사
 */
function productChk(){
    if(document.pRegister.pname.value.length == 0){
        alert("상품이름을 입력하세요!");
        pRegister.pname.focus();
        return;
    }

    if(document.pRegister.pcate_fk.value.length == 0){
        alert("카테고리를 선택하세요!");
        pRegister.pcate_fk.focus();
        return;
    }

    if(document.pRegister.pimage.value.length == 0){
    	alert("이미지를 첨부하세요!!");
    	pRegister.pimage.focus();
    	return;
    }

    if(document.pRegister.pcompany.value.length == 0){
        alert("제조회사를 입력하세요!");
        pRegister.pcompany.focus();
        return;
    }

    if(document.pRegister.delivery.value.length == 0){
        alert("배송비를 입력하세요!");
        pRegister.delivery.focus();
        return;
    }

    if(document.pRegister.price.value.length == 0){
        alert("가격을 입력하세요!");
        pRegister.price.focus();
        return;
    }

    if(document.pRegister.pcontent.value.length == 0){
        alert("상품상세를 입력하세요!");
        pRegister.pcontent.focus();
        return;
    }

    document.pRegister.submit();
}


/**
 * 유효성 검사
 */
function pModifyChk(){
    if(document.pModify.pname.value.length == 0){
        alert("상품이름을 입력하세요!");
        pModify.pname.focus();
        return;
    }

    if(document.pModify.pcate_fk.value.length == 0){
        alert("카테고리를 선택하세요!");
        pModify.pcate_fk.focus();
        return;
    }

    if(document.pModify.pimage.value.length == 0){
    	alert("이미지를 첨부하세요!!");
    	pModify.pimage.focus();
    	return;
    }

    if(document.pModify.pcompany.value.length == 0){
        alert("제조회사를 입력하세요!");
        pModify.pcompany.focus();
        return;
    }

    if(document.pModify.delivery.value.length == 0){
        alert("배송비를 입력하세요!");
        pModify.delivery.focus();
        return;
    }

    if(document.pModify.price.value.length == 0){
        alert("가격을 입력하세요!");
        pModify.price.focus();
        return;
    }

    if(document.pModify.pcontent.value.length == 0){
        alert("상품상세를 입력하세요!");
        pModify.pcontent.focus();
        return;
    }

    document.pModify.submit();
}

