/**
 * 
 */
package com.davide.parise.pesapal;

/**
 * @author Davide Parise mailto:bubini.mara5@gmail.com
 * Sep 13, 2014
 *
 *	PesaPal API methods
 *	This are all constants URL used by Pesapal API
 *
 *	Sorry but I prefer class and interface to enum
 *
 *	see http://developer.pesapal.com
 */
public class ApiUrlConstants {

	/**
	 * 
	 * @author Davide Parise mailto:bubini.mara5@gmail.com
	 * Sep 13, 2014
	 *
	 *	From Pesapal.com
	 *
	 *	PostPesapalDirectOrderV4
	 *	Use this to post a transaction to PesaPal. 
	 *  PesaPal will present the user with a page which contains the available payment options and will redirect 
	 *  to your site once the user has completed the payment process.
	 *  
	 *  A tracking id will be returned as a query parameter 
	 *  this can be used subsequently to track the payment status on pesapal for this transaction.
	 */
	public interface POST{
		public static final String url_demo = "http://demo.pesapal.com/api/PostPesapalDirectOrderV4";
		public static final String url_demo_mobile = "http://demo.pesapal.com/api/PostPesapalDirectOrderMobile";
		public static final String url_live = "https://pesapal.com/api/PostPesapalDirectOrderV4";
		public static final String url_live_mobile = "https://pesapal.com/api/PostPesapalDirectOrderMobile";
	};
	
	/**
	 *	From Pesapal.com
	 *
	 * QueryPaymentStatus
	 * Use this to query the status of the transaction. 
	 * When a transaction is posted to PesaPal, it may be in a PENDING, COMPLETED or FAILED state. 
	 * If the transaction is PENDING, the payment may complete or fail at a later stage.
	 * 
	 * Both the unique order id generated by your system and the pesapal tracking id are required as input parameters.
	 */
	public interface IPN_STATUS{
		public static final String url_live = "https://pesapal.com/api/querypaymentstatus";
		public static final String url_demo = "http://demo.pesapal.com/api/querypaymentstatus";
	};
	
	/**
	 *	From Pesapal.com
	 *
	 *	QueryPaymentStatusByMerchantRef
	 *	Same as QueryPaymentStatus, but only the unique order id genereated by your system is required as the input parameter.
	 */
	public interface IPN_STATUS_REF{
		public static final String url_live = "https://pesapal.com/api/querypaymentstatusbymerchantref";
		public static final String url_demo = "http://demo.pesapal.com/api/querypaymentstatusbymerchantref";		
	};
	
	/**
	 *	From Pesapal.com
	 *	QueryPaymentDetails
	 *	Same as QueryPaymentStatus, but additional information is returned.
	 */
	public interface IPN_STATUS_DETAIL{
		public static final String url_live = "https://pesapal.com/api/querypaymentdetails";
		public static final String url_demo = "http://demo.pesapal.com/api/querypaymentdetails";

	};
	
	/** 
	 *	This are the default callback set when post the request	
	 */
	public interface CALLBACK{
		public static final String callback_live = "https://pesapal.com/api/querypaymentstatus";
		public static final String callback_demo = "http://demo.pesapal.com/api/querypaymentstatus";
	}
}