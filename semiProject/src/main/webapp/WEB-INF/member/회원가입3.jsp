<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/회원가입(3).css">
    <script src="https://code.jquery.com/jquery-3.6.0.js" 
    integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" 
    crossorigin="anonymous"></script>

    <script src="https://kit.fontawesome.com/47910b9f42.js" crossorigin="anonymous"></script>
    
    <title>회원가입(3)</title>

</head>
<body>
    <div id="movieSourcing">
        <div id="layout">
            <div id="root">
                <header>
                    <div>
                        <a href="#" class="backpage">
                            <i class="fa-solid fa-chevron-left" id="backpageimg"></i>
                        </a>
                    </div>
                </header>
                <main id="contents">
                    <section class="signup">
                        <span class="top">회원 가입</span>

                    </section>
                    <section class="infomationbox">
                        <div class="infomation">
                            <div class="emailwrap">
                                <span>이메일</span>
                                <div class="email">
                                    <input type="text" id="email" placeholder="이메일 주소를 입력해주세요">
                                </div>
                            </div>
                            
                            <div class="certificationwrap">
                                <span>인증번호</span>
                                <div class="certification">
                                    <input type="text" id="id" placeholder="인증번호 숫자 6자리">
                                    <div class="certificationbox">
                                        <button id="certificationbtn"><span >인증번호 받기</span></button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                   

                    <section class="savebox">
                        <button><span>완료</span></button>
                    </section>
                </main>
            </div>
        </div>

    </div>
    <script src="/js/회원가입(2).js"></script>
</body>
</html>