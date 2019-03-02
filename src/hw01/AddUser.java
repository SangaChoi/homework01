package hw01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddUser
 */
//@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		String cName=req.getParameter("name");
		String cSex=req.getParameter("sex");
		String cYear=req.getParameter("year");
		String cBirthMonth=req.getParameter("bitrhMonth");
		String cBitrhDay=req.getParameter("birthDay");
		String cOccupation=req.getParameter("occupation");
		String cFirstNumberM=req.getParameter("firstNumberM");
		String cMiddleNumberM=req.getParameter("middleNumberM");
		String cLastNumberM=req.getParameter("lastNumberM");
		
		UserVO userVO=new UserVO();
		userVO.setName(cName);
		userVO.setSex(cSex);
		userVO.setYear(cYear);
		userVO.setBirthMonth(cBirthMonth);
		userVO.setBirthDay(cBitrhDay);
		userVO.setOccupation(cOccupation);
		userVO.setFirstNumberM(cFirstNumberM);
		userVO.setMiddleNumberM(cMiddleNumberM);
		userVO.setLastNumberM(cLastNumberM);
		
		UserDao userDao=new UserDao();
		userDao.addUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>가입 확인</h2>");
		
		if(userVO.isActive()) {
			out.println(cName+"님 환영합니다.");
			
			//////////////////Session
			req.getSession().setAttribute("userVO", userVO);
		}else {
			out.println("회원가입 실패");
		}
		
		out.println("<p><p><a href='/homework01/hw01/findUser.html'>내정보 보기 01</a>");
		out.println("</body>");
		out.println("</html>");
			
	}

}
