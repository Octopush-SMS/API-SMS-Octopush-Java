package octopushSms;

import java.util.ArrayList;
import java.util.Arrays;
 
public class ConfigFile {
	
public String DOMAIN = "http://www.octopush-dm.com";
public String PORT = "80";
public String PATH_SMS = "/api/sms";
public String PATH_BALANCE = "/api/balance";
public final String QUALITE_STANDARD = "XXX";
public final String QUALITE_PRO = "FR";
public final Integer INSTANTANE = 1;
public final Integer DIFFERE = 2;
public final String SIMULATION = "simu";
public final String REEL = "real";

public String _user_login = "************@***.***";
public String _api_key = "***************************";
public String _sms_text = "The text body of the sms message";

public ArrayList<String> _sms_recipients = new ArrayList<String>(Arrays.asList("+336000000000","+33699999999999"));
public ArrayList<String> _recipients_first_names = new ArrayList<String>(Arrays.asList("fn1", "fn2", "fn3"));
public ArrayList<String> _recipients_last_names = new ArrayList<String>(Arrays.asList("ln1", "ln2", "ln3"));
public ArrayList<String> _sms_fields_1 = new ArrayList<String>(Arrays.asList("1_field1", "1_field2", "1_field3"));
public ArrayList<String> _sms_fields_2 = new ArrayList<String>(Arrays.asList("2_field1", "2_field2", "2_field3"));
public ArrayList<String> _sms_fields_3 = new ArrayList<String>(Arrays.asList("3_field1", "3_field2", "3_field3"));


public String _request_mode = REEL;	// REEL or change to SIMULATION to test your code

public String _sms_type = QUALITE_PRO;	// QUALITE_PRO or change to QUALITE_STANDARD 

public Integer _sms_mode = INSTANTANE;	// INSTANTANE or change to DIFFERE for delay mode sending

// in "DIFFERE" change to correct value DAY_OF_MONTH, MONTH, HOUR_OF_DAY etc'
public int _sms_d = 16;	//	DAY_OF_MONTH
public int _sms_m = 12;	//	MONTH
public int _sms_h = 19;	//	HOUR_OF_DAY;
public int _sms_i = 54;	//	MINUTE;
public int _sms_y = 2013;	//	YEAR;

public String _sms_sender = "CORA";

public String _sms_ticket = "***********";

}


