$(document).ready(function(){
	
	var $top = $('.top_banner');
	var $header = $('.header');
	$(window).scroll(function(){
		if($(this).scrollTop() > 0){
			$top.stop().animate({height:'0px'});
			$header.addClass('active');
		}
		else{
			$top.stop().animate({height:'30px'});
			$header.removeClass('active');
		}
	});
	
	
	var visual = $('.mainVisual > ul > li');
	var button = $('.btnList > li');

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

	$('.main_visual_wrap').on({mouseover:function(){
	
		clearInterval(setIntervalId);
	
	},mouseout:function(){
	
		timer();
	
	}});


	button.on('click',function(){
	
		var tg = $(this);
		var i = tg.index();

		button.removeClass('on');
		tg.addClass('on');

		move1(i);
	
	});
	
	$(".product").hover(
		function(){
			$(this).find(".product_view").stop().slideDown(300);
		},
		function(){
			$(this).find(".product_view").stop().slideUp(300);
		}
	);
	
	$(".m_open").click(function(){        //.modalOpen을 클릭하면, 숨겨진 #modal이 보여진다.
	  $(".m_menu_wrap").fadeIn(300);                 //(공지사항 첫번째 콘텐츠)
	}); 	//modal close
	$(".m_btn_close").click(function(){      //.modalClose을 클릭하면, 보여진 #modal이 숨겨진다.
	  $(".m_menu_wrap").fadeOut(300);                  //(모달 닫기 버튼)
	});
});