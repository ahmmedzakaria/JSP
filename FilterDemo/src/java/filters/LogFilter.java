package filters;

import java.io.IOException;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author javaknowledge
 */
public class LogFilter implements Filter {

    protected FilterConfig config;
    private ServletContext context;
    private String filterName;

    public LogFilter() {
    }

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        context.log(req.getRemoteHost()
                + " tried to access "
                + req.getRequestURL()
                + " on " + new Date() + ". "
                + "(Reported by " + filterName + ".)");
        chain.doFilter(request, response);
    }

    /**
     * Destroy method for this filter 
     */
    public void destroy() {
    }

    /**
     * Init method for this filter 
     */
    public void init(FilterConfig filterConfig) {
        this.config = filterConfig; // In case it is needed by subclass.
        context = config.getServletContext();
        filterName = config.getFilterName();
    }
}
