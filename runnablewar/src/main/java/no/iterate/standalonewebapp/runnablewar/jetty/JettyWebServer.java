package no.iterate.standalonewebapp.runnablewar.jetty;

import java.security.ProtectionDomain;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyWebServer {

	public static void main(String[] args) throws Exception {

		Server server = new Server(8080);
        ProtectionDomain protectionDomain = JettyWebServer.class.getProtectionDomain();
        String warFile = protectionDomain.getCodeSource().getLocation().toExternalForm();

        WebAppContext context = new WebAppContext(warFile, "/myapp");
        context.setServer(server);

        server.setHandler(context);
        server.start();
        server.join();
	}
}
