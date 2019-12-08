package filters;

import java.io.*;
import javax.servlet.*;

/** Helper class for StringWrapper.
 *  
 */

public class StringOutputStream
             extends ServletOutputStream {
  private StringWriter stringWriter;

  public StringOutputStream(StringWriter stringWriter) {
    this.stringWriter = stringWriter;
  }

  @Override
  public void write(int c) {
    stringWriter.write(c);
  }
}
