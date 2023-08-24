package customTags;
import java.util.Calendar;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class MyTagHandler  extends TagSupport{
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub		
		try {
			// task done by tag
			JspWriter out = pageContext.getOut();
			out.println("<h1> this is inside myTagHandler class</h1>");
			out.println("<h2> this is my first tag</h2>");
			out.println("<h3>");
			out.println(Calendar.getInstance().getTime());
			out.println("</h3>");			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
