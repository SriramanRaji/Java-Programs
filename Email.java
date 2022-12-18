import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.URLName;

public class Email {

	private static Session session;
	private static Store store;
	private static Folder folder;

	// hardcoding protocol and the folder
	// it can be parameterized and enhanced as required
	private static String protocol = "imaps";
	private static String file = "INBOX";

	public Email() {

	}

	public boolean isLoggedIn() {
		return store.isConnected();
	}

	/**
	 * to login to the mail host server
	 */
	public static void login(String host, String username, String password) throws Exception {
		URLName url = new URLName(protocol, host, 993, file, username, password);

		if (session == null) {
			Properties props = null;
			try {
				props = System.getProperties();
			} catch (SecurityException sex) {
				props = new Properties();
			}
			session = Session.getInstance(props, null);
		}
		store = session.getStore(url);
		store.connect();
		folder = store.getFolder(url);

		folder.open(Folder.READ_WRITE);
	}

	/**
	 * to logout from the mail host server
	 */
	public static void logout() throws MessagingException {
		folder.close(false);
		store.close();
		store = null;
		session = null;
	}

	public static int getMessageCount() {
		int messageCount = 0;
		try {
			messageCount = folder.getMessageCount();
		} catch (MessagingException me) {
			me.printStackTrace();
		}
		return messageCount;
	}

	public static Message[] getMessages() throws MessagingException {
		return folder.getMessages();
	}

	public static void main(String[] args) throws Exception {
		login("imap.gmail.com", "email", "password");
		System.out.println(getMessageCount());
		
		Message[] message = getMessages();
		
		for(Message m: message) {
			System.out.println(m.getSubject());
		}
		
		logout();
	}

}
