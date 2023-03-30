<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/css/semi-main copy.css">
    <script src="https://kit.fontawesome.com/0041fb1dcb.js" crossorigin="anonymous"></script>
    <title>semi-main</title>
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
    
</head>
<body>
    <main>
        <header id="head">

                <div class="main-image">
                    <ul class="main-slides">
                        <li><img src="${contextPath}/resources/images/bg_1.jpg" width="1920px" height="800px"></li>
                        <li><img src="${contextPath}/resources/images/bg_1.jpg" width="1920px" height="800px"></li>
                        <li><img src="${contextPath}/resources/images/bg_1.jpg" width="1920px" height="800px"></li>
                    </ul>
                </div>
            

                <div>
                    <a href="#"><img src="image/LogoMakr-9dgAJM.png" name="home-logo"></a>
                </div>

                <div>
                    <ul class="home-nav">
                        <li><a href="#" id="homebutton">홈</a></li>
                        <li><a href="#" id="janrbutton">장르 검색</a></li>
                        <li><a href="#">커뮤니티</a></li>
                        <li><a href="#">추천 시뮬레이션</a></li>
                    </ul>
                </div>

                <div class="head-right">

                    <div class="search-box">
                
                    <input type="text" class="search-txt" placeholder="영화제목,감독,배우" >
                    <a href="#" class="search-btn"><i class="fa-solid fa-magnifying-glass" ></i></a>
                    </div>

                    <div><a href="#"><i class="fa-solid fa-heart"></i></a></div>
                    <div><a href="#"><i class="fa-solid fa-user"></i></a></div>

                </div>

          
        </header>

        <section class="main">

            <!-- 영화 정보 -->
            <div class="movie">

                <span>
                    <p><i class="fa-solid fa-film"></i>회원맞춤 영화추천</p> 
                </span>

                <div class="slide_wrapper">
                    <ul class="slides">
                        <li class="mmovie"><img src="image/1987포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/검사외전포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/겨울왕국1 포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/곡성 포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/공조 포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/기생충 포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/마스터 포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/명량 포스터.jpeg" width="200px" height="300px"></li>
                    </ul>
                </div>
                <p class="controls">
                   
                    <span class="prev">prev</span>
                    <span class="next">next</span>
                </p>

                <span>
                    <p><i class="fa-regular fa-bookmark"></i>&nbsp새로운 컨텐츠</p>
                </span>

                
                <div class="slide_wrapper2">
                    
                    <ul class="slides2">
                        <li><img src="image/밀정 포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/백두산 포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/범죄도시1 포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/보헤미안 랩소디 포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/블랙위도우 포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/설국열차 포스터.jpg" width="200px" height="300px"></li>
                        <li><img src="image/수상한그녀 포스터.jpeg" width="200px" height="300px"></li>
                        <li><img src="image/어스파1 포스터.jpg" width="200px" height="300px"></li>
                    </ul>
                </div>
                <p class="controls2">
                   
                    <span class="prev2">prev</span>
                    <span class="next2">next</span>
                </p>

                <div class="chart">
                    <span>넷플릭스 랭킹</span>
                    <ul class="charts active">
                        <i class="fa-solid fa-1"></i><li><img src="image/어벤져스1 포스터.jpg" width="200px"></li>
                        <i class="fa-solid fa-2"></i><li><img src="image/어스파2 포스터.jpg" width="200px"></li>
                        <i class="fa-solid fa-3"></i><li><img src="image/최종병기 활 포스터.jpeg" width="200px"></li>
                        <i class="fa-solid fa-4"></i><li><img src="image/트랜스포머 포스터.jpg" width="200px"></li>
                        <i class="fa-solid fa-5"></i><li><img src="image/1987포스터.jpg" width="200px"></li>
                    </ul>
                </div>

                <div class="chart">
                    <span>왓챠 랭킹</span>
                    <ul class="charts">
                        <i class="fa-solid fa-1"></i><li><img src="image/어벤져스1 포스터.jpg" width="200px"></li>
                        <i class="fa-solid fa-2"></i><li><img src="image/어스파2 포스터.jpg" width="200px"></li>
                        <i class="fa-solid fa-3"></i><li><img src="image/최종병기 활 포스터.jpeg" width="200px"></li>
                        <i class="fa-solid fa-4"></i><li><img src="image/트랜스포머 포스터.jpg" width="200px"></li>
                        <i class="fa-solid fa-5"></i><li><img src="image/1987포스터.jpg" width="200px"></li>
                    </ul>
                </div>

                <div class="chart">
                    <span>디즈니+ 랭킹</span>
                    <ul class="charts">
                        <i class="fa-solid fa-1"></i><li><img src="image/어벤져스1 포스터.jpg" width="200px"></li>
                        <i class="fa-solid fa-2"></i><li><img src="image/어스파2 포스터.jpg" width="200px"></li>
                        <i class="fa-solid fa-3"></i><li><img src="image/최종병기 활 포스터.jpeg" width="200px"></li>
                        <i class="fa-solid fa-4"></i><li><img src="image/트랜스포머 포스터.jpg" width="200px"></li>
                        <i class="fa-solid fa-5"></i><li><img src="image/1987포스터.jpg" width="200px"></li>
                    </ul>
                </div>


                
              
                <div class="community">
                    <span><p><i class="fa-regular fa-comments"></i>&nbsp커뮤니티</p></span>
        
                    <div>
                        <div><img src="image/커뮤니티 글1.png" width="800px"></div>
                        <div><img src="image/커뮤니티 글2.png" width="800px"></div>
                    </div>
        
                </div>

                <div class="review">

                    <span><i class="fa-regular fa-circle-user"></i>회원들의 리뷰</span>
                   

                    <div>
                        <div><img src="image/리뷰 글1.png" width="800px"></div>
                        <div><img src="image/리뷰 글2.png" width="800px"></div>
                    </div>

                </div>

               <fieldset class="favorite" style="border: 2px solid rgb(41, 39, 39);">
                    <legend class="f-title"><i class="fa-regular fa-star"></i>인생영화관&nbsp&nbsp</legend>
                    <h4 style="color: white ; ">누누님의 인생영화</h4>
                    <div class="f-mlist1">
                       
                        <div><img src="image/블랙위도우 포스터.jpg" width="130px"></div>
                        <div><img src="image/1987포스터.jpg" width="130px"></div>
                        <div><img src="image/어스파2 포스터.jpg" width="130px"></div>
                        <div><img src="image/보헤미안 랩소디 포스터.jpg" width="130px"></div>
                        <div><img src="image/검사외전포스터.jpg" width="130px"></div>
                    </div>
                    <h4 style="color: white;">나나님의 인생영화</h4>
                    <div class="f-mlist2">
                        
                        <div><img src="image/블랙위도우 포스터.jpg" width="130px"></div>
                        <div><img src="image/1987포스터.jpg" width="130px"></div>
                        <div><img src="image/어스파2 포스터.jpg" width="130px"></div>
                        <div><img src="image/보헤미안 랩소디 포스터.jpg" width="130px"></div>
                        <div><img src="image/검사외전포스터.jpg" width="130px"></div>

                    </div>




               </fieldset>


            </div>

            <!-- 시뮬,인기검색어 -->
            <div class="side">
                <div class="side-1">
            
                    <div class="game">
                        <a href="#"><img src="image/추천영화테스트.png" width="200px"></a>
                    </div>
                    <div><a class="btn" onclick="top()" id="top"><i class="fa-solid fa-up-long"></i>top</a></div>
                </div>

                <div>
                    
                </div>

            </div>

            

            
        </section>

        
      
        
    </main>
    <footer>
        <p><a href="#">이용약관</a></p>
        <p><a href="#">개인정보처리방침</a></p>
        <p><a href="#">고객센터</a></p>
        <p><a href="#">(주)KH</a></p>

    </footer>

    <script src="semi-main copy.js"></script>

  
</body>
</html>