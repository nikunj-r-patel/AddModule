package customTags;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class PrintTableTag extends TagSupport {
	public int number;
	public String color;
	public void setNumber(int number) {
		this.number = number;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try {
			JspWriter out = pageContext.getOut();
			out.print("<br>");
			out.print("<div class='inRow' style='background-color:"+color+"'>");
			for (int i = 1; i <= number; i++) {
				out.print("<div class='inColumn'>");
				for (int j = 1; j <= 10; j++) {
					out.println(i + " X " + j + " = " + i * j);
					out.print("<br>");
				}
				out.print("</div>");
			}
			out.print("</div>");
			for (int i = 1; i <=2; i++) {
				for (int j = 1; j <=4; j++) {	
					out.print("<br>");
				}
				out.print("<br>");
			}	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
