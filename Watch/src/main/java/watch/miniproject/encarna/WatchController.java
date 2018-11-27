package watch.miniproject.encarna;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WatchController {
	
	// proc.do 요청에 대해 적절한 형식의 날짜 문자열을 생성하고 곧바로 응답 (문자열은 응답 데이터의 영역에 포함)
   @ResponseBody
   @RequestMapping(value="/proc.do",method=RequestMethod.POST)
   public String proc()
   {
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String watch=formatter.format(new Date());
      
      return watch;
   }
   
   // watch.do 요청에 대해 watch.jsp 페이지로 맵핑
   @RequestMapping(value="/watch.do",method=RequestMethod.GET)
   public String watch(Model model)
   {
      return "watch";
   }
}