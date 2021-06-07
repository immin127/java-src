$(document).ready(function(){

	
	
	var visual = $('.v_img');
	var button = $('.btn_list > li');
	var rightBtn = $('.next');
	var leftBtn = $('.prev');
	
	var current = 0;
	var setIntervalId;
	

	function move1(i){
	
		if(current === i) {
			return;
		}

		var currentEl = visual.eq(current);
		var nextEl = visual.eq(i);
	
		currentEl.css({left:0}).stop().animate({left:'-100%'});
		nextEl.css({left:'100%'}).stop().animate({left:0});
		
		current = i;
	
	}

	function move(tg, start, end){

		tg.css('left',start).stop().animate({left:end},{duration:500,ease:'easeOutCubic'});

	}

	function timer(){
	
		setIntervalId = setInterval(function(){

			var prev = visual.eq(current);	
			var pn = button.eq(current);

			move(prev, 0, '-100%');
				
			pn.removeClass('on');

			current++;

			if(current === visual.size()){
			
				current = 0;
			}

			var next = visual.eq(current);	
			var pnn = button.eq(current);

			move(next, '100%', 0);

			pnn.addClass('on');

		},5000);
	}


	timer();

	$('.visual_wrap').on({mouseover:function(){
	
		clearInterval(setIntervalId);
	
	},mouseout:function(){
	
		timer();
	
	}});


	
	rightBtn.click(function(){
		
		var prev = visual.eq(current);
		var pn = button.eq(current);
	
		move(prev, 0, '-100%');
		pn.removeClass('on');

		current++;

		if(current === visual.size()){
		
			current = 0;
		}

		var next = visual.eq(current);
		var pnn = button.eq(current);

		move(next, '100%', 0);

		pnn.addClass('on');

		return false;
	});


	leftBtn.click(function(){
		
		var prev = visual.eq(current);
		var pn = button.eq(current);
	
		move(prev, 0, '100%');
		pn.removeClass('on');

		current--;

		if(current === -visual.size()){
		
			current = 0;
		}

		var next = visual.eq(current);
		var pnn = button.eq(current);

		move(next, '-100%', 0);

		pnn.addClass('on');

		return false;
	});
	


//탭메뉴
	
	var targetLink = document.querySelectorAll('.tab_menu a')
	var tabContent = document.querySelectorAll('#tab_content > div');
	console.log(tabContent);
	
	for(var i = 0; i< targetLink.length; i++ ){
		
		targetLink[i].addEventListener('click',function(e){
			e.preventDefault();
			var orgTarget = e.target.getAttribute('href');
			/* console.log(orgTarget); */
			
			var tabTarget = orgTarget.replace('#','');
			
			for(var x = 0; x < tabContent.length ; x++){
				tabContent[x].style.display = 'none';
			};
			
			document.getElementById(tabTarget).style.display='block';
			
			for(var j = 0; j<targetLink.length; j++){
				targetLink[j].classList.remove('active');
				e.target.classList.add('active');
			}
		});
	}
	document.getElementById('tab01').style.display='block';
	
	//history box
	
	var swiper = new Swiper('.swiper-container', {
      slidesPerView: 1,
      spaceBetween: 30,
      pagination: {
        el: '.swiper-pagination',
        clickable: true,
      },
    });
	
	$(".m_menu").click(function(){        //.modalOpen을 클릭하면, 숨겨진 #modal이 보여진다.
	  $(".m_menu_wrap").fadeIn(300);                 //(공지사항 첫번째 콘텐츠)
	}); 	//modal close
	$(".m_close").click(function(){      //.modalClose을 클릭하면, 보여진 #modal이 숨겨진다.
	  $(".m_menu_wrap").fadeOut(300);                  //(모달 닫기 버튼)
	});
});