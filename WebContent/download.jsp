
<%-- <%@ page import="java.io.*,java.util.*" %> --%>
<%-- <%@ page import="javax.servlet.*,java.text.*" %> --%>
<%    
  String filename = "daywise.pdf";   
  String filepath = "d:\\";   
  response.setContentType("application/pdf");

  response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
  
  java.io.FileInputStream fileInputStream=new java.io.FileInputStream(filepath + filename);  
            
  int i;   
  while ((i=fileInputStream.read()) != -1) {  
    out.write(i);   
  }   
  fileInputStream.close();   
  
  /*String fileName ="daywise.pdf";
  ServletOutputStream stream = null;
  BufferedInputStream buf = null;
//PrintWriter  pw=response.getWriter();
try
{
    stream = response.getOutputStream();

String s1=getServletContext().getRealPath("/files/daywise.pdf");

 File doc = new File(s1);
 
 
  response.setContentType("application/pdf");
  
  response.addHeader(
    "Content-Disposition","attachment; filename="+fileName );

  response.setContentLength( (int) doc.length() );
  
 FileInputStream input = new FileInputStream(doc);
 buf = new BufferedInputStream(input);
 int readBytes = 0;

 while((readBytes = buf.read()) != -1)
    stream.write(readBytes);
}catch(Exception  e){ }
*/
%>
