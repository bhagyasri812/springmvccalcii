package springmvccalcii;


import javax.servlet.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller  
public class calciiController
{  
    @RequestMapping("/hello")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res)
    {  
        int a= Integer.parseInt(request.getParameter("t1"));  
        int b= Integer.parseInt(request.getParameter("t2"));  
       String c= request.getParameter("b1");  
        
     if(c.equals("add"))
        {  
        int message =   a+b;
        return new ModelAndView("hellopage", "message", message);  
        }  
        else if(c.equals("sub")){  
        	 int message =   a-b;
             return new ModelAndView("hellopage", "message", message);  
        } 
        else if(c.equals("div")){  
       	 int message =   a%b;
            return new ModelAndView("hellopage", "message", message);  
       } 
        else {
        	int message =   a*b;
            return new ModelAndView("hellopage", "message", message);
        }
     
        }
    }  

