
/**
 * 유효성 검사
 */
function noticeChk(){
    if(document.NoticeIn.title.value.length == 0){
        alert("제목을 입력하세요.");
        NoticeIn.title.focus();
        return;
    }

    if(document.NoticeIn.title.value.length >= 40){
        alert("제목은 40글자까지 입력가능합니다.");
        NoticeIn.title.focus();
        return;
    }

    if(document.NoticeIn.content.value.length == 0){
        alert("내용을 입력하세요.");
        NoticeIn.content.focus();
        return;
    }

    document.NoticeIn.submit();
}


/**
 * 유효성 검사
 */
function noticeModifyChk(){
    if(document.noticeModify.title.value.length == 0){
        alert("제목을 입력하세요.");
        noticeModify.title.focus();
        return;
    }

    if(document.noticeModify.title.value.length >= 40){
        alert("제목은 40글자까지 입력가능합니다.");
        noticeModify.title.focus();
        return;
    }

    if(document.noticeModify.content.value.length == 0){
        alert("내용을 입력하세요.");
        noticeModify.content.focus();
        return;
    }

    document.noticeModify.submit();
}

