package samplemaven.example;

import samplemaven.example.OrderCreate.AccountAddressInfo;
import samplemaven.example.OrderCreate.AccountContactInfo;
import samplemaven.example.OrderCreate.AccountDemographicInfo;
import samplemaven.example.OrderCreate.AccountIdentifierInfo;
import samplemaven.example.OrderCreate.AccountInfo;
import samplemaven.example.OrderCreate.AccountNameInfo;
import samplemaven.example.OrderCreate.AccountPointTransferInfo;
import samplemaven.example.OrderCreate.AccountTestFlagInfo;
import samplemaven.example.OrderCreate.ClientInfo;
import samplemaven.example.OrderCreate.DemographicsInfo;
import samplemaven.example.OrderCreate.OrderContactInfo;
import samplemaven.example.OrderCreate.OrderDateTimeInfo;
import samplemaven.example.OrderCreate.OrderIdentifierInfo;
import samplemaven.example.OrderCreate.OrderInfo;
import samplemaven.example.OrderCreate.OrderLineIdentifierInfo;
import samplemaven.example.OrderCreate.OrderLineInfo;
import samplemaven.example.OrderCreate.OrderLineOccurrenceIdentifierInfo;
import samplemaven.example.OrderCreate.OrderLineOccurrenceInfo;
import samplemaven.example.OrderCreate.OrderLineOccurrencePayment;
import samplemaven.example.OrderCreate.OrderLineQuantityInfo;
import samplemaven.example.OrderCreate.OrderLineSKUInfo;
import samplemaven.example.OrderCreate.OrderNameInfo;
import samplemaven.example.OrderCreate.OrderPaymentInfo;
import samplemaven.example.OrderCreate.OrderShippingAddressInfo;
import samplemaven.example.OrderCreate.OrderShippingInfo;

public class APITest {
	
	/*public void orders() {
		
		OrderCreate orderCreate = new OrderCreate();
		
		orderCreate.clientInfo=new ClientInfo();
		        orderCreate.clientInfo.applicationCode="FEDEX";
		        orderCreate.clientInfo.portfolioCode="FEDEX";
		        orderCreate.clientInfo.segmentCode="BASE";
		        orderCreate.clientInfo.programCode=null;

		        orderCreate.accountInfo=new AccountInfo();

		        orderCreate.accountInfo.accountIdentifierInfo=new AccountIdentifierInfo();
		        orderCreate.accountInfo.accountIdentifierInfo.accountNumber="";
		        orderCreate.accountInfo.accountIdentifierInfo.secondaryAccountNumber="";
		        orderCreate.accountInfo.accountIdentifierInfo.memberId=null;

		        orderCreate.accountInfo.accountDemographicInfo=new AccountDemographicInfo();

		        orderCreate.accountInfo.accountDemographicInfo.accountNameInfo=new AccountNameInfo();
		        orderCreate.accountInfo.accountDemographicInfo.accountNameInfo.titleValue=null;
		        orderCreate.accountInfo.accountDemographicInfo.accountNameInfo.firstName="TESTALL1";
		        orderCreate.accountInfo.accountDemographicInfo.accountNameInfo.middleInitial=null;
		        orderCreate.accountInfo.accountDemographicInfo.accountNameInfo.lastName="TESTALL1";

		        orderCreate.accountInfo.accountDemographicInfo.accountAddressInfo=new AccountAddressInfo();
		        orderCreate.accountInfo.accountDemographicInfo.accountAddressInfo.addressLine1="4445, LAKEFOREST DR";
		        orderCreate.accountInfo.accountDemographicInfo.accountAddressInfo.addressLine2=null;
		        orderCreate.accountInfo.accountDemographicInfo.accountAddressInfo.addressLine3=null;
		        orderCreate.accountInfo.accountDemographicInfo.accountAddressInfo.addressCity="CINCINNATI";
		        orderCreate.accountInfo.accountDemographicInfo.accountAddressInfo.addressState="OH";
		        orderCreate.accountInfo.accountDemographicInfo.accountAddressInfo.addressPostalCode="45242";
		        orderCreate.accountInfo.accountDemographicInfo.accountAddressInfo.addressCountry="US";

		        orderCreate.accountInfo.accountDemographicInfo.accountContactInfo=new AccountContactInfo();
		        orderCreate.accountInfo.accountDemographicInfo.accountContactInfo.dayPhone="5132482882";
		        orderCreate.accountInfo.accountDemographicInfo.accountContactInfo.eveningPhone=null;
		        orderCreate.accountInfo.accountDemographicInfo.accountContactInfo.mobilePhone="5132482882";
		        orderCreate.accountInfo.accountDemographicInfo.accountContactInfo.emailValue="testall1@testall1.com";

		        orderCreate.accountInfo.accountDemographicInfo.accountDetailsInfo=null;

		        orderCreate.accountInfo.accountTestFlagInfo=new AccountTestFlagInfo();
		        orderCreate.accountInfo.accountTestFlagInfo.testAccountFlag="N";

		        orderCreate.accountPointTransferInfo =new AccountPointTransferInfo[0];

		        orderCreate.orderInfo=new OrderInfo();

		        orderCreate.orderInfo.orderIdentifierInfo=new OrderIdentifierInfo();
		        orderCreate.orderInfo.orderIdentifierInfo.orderIdValue="123ABC";
		        orderCreate.orderInfo.orderIdentifierInfo.secondaryOrderId=null;
		        orderCreate.orderInfo.orderIdentifierInfo.vendorOrderId=null;

		        orderCreate.orderInfo.orderDateTimeInfo=new OrderDateTimeInfo();
		        orderCreate.orderInfo.orderDateTimeInfo.orderDateTime="20180910063811-0000";


		        orderCreate.orderInfo.orderShippingInfo=new OrderShippingInfo[1];
		        OrderShippingInfo orderShippingInfo1 = new OrderShippingInfo();
		        orderShippingInfo1.demographicsInfo=new DemographicsInfo();

		        orderShippingInfo1.demographicsInfo.orderNameInfo=new OrderNameInfo();
		        orderShippingInfo1.demographicsInfo.orderNameInfo.firstName="TESTALL1";
		        orderShippingInfo1.demographicsInfo.orderNameInfo.middleInitial=null;
		        orderShippingInfo1.demographicsInfo.orderNameInfo.lastName="TESTALL1";

		        orderShippingInfo1.demographicsInfo.orderShippingAddressInfo=new OrderShippingAddressInfo();
		        orderShippingInfo1.demographicsInfo.orderShippingAddressInfo.addressLine1="4445, LAKEFOREST DR";
		        orderShippingInfo1.demographicsInfo.orderShippingAddressInfo.addressLine2=null;
		        orderShippingInfo1.demographicsInfo.orderShippingAddressInfo.addressLine3="Alliance";
		        orderShippingInfo1.demographicsInfo.orderShippingAddressInfo.addressCity="CINCINNATI";
		        orderShippingInfo1.demographicsInfo.orderShippingAddressInfo.addressState="OH";
		        orderShippingInfo1.demographicsInfo.orderShippingAddressInfo.addressPostalCode="45242";
		        orderShippingInfo1.demographicsInfo.orderShippingAddressInfo.addressCountry="US";
		        orderShippingInfo1.demographicsInfo.orderShippingAddressInfo.shipCompanyName=null;

		        orderShippingInfo1.demographicsInfo.orderContactInfo=new OrderContactInfo();
		        orderShippingInfo1.demographicsInfo.orderContactInfo.contactPhone="5132482882";
		        orderShippingInfo1.demographicsInfo.orderContactInfo.mobilePhone="5132482882";
		        orderShippingInfo1.demographicsInfo.orderContactInfo.emailValue="testall1@testall1.com";

		        orderShippingInfo1.orderGiftInfo=null;
		        orderShippingInfo1.orderLanguageInfo=null;

		        orderShippingInfo1.orderLineInfo=new OrderLineInfo[1];
		        OrderLineInfo orderLineInfo1=new OrderLineInfo();

		        orderLineInfo1.orderLineIdentifierInfo=new OrderLineIdentifierInfo();
		        orderLineInfo1.orderLineIdentifierInfo.orderLineID="0";

		        orderLineInfo1.orderLineSKUInfo=new OrderLineSKUInfo();
		        orderLineInfo1.orderLineSKUInfo.skuID="sku123";
		        orderLineInfo1.orderLineSKUInfo.skuDescription=null;
		        orderLineInfo1.orderLineSKUInfo.skuValue=null;

		        orderLineInfo1.orderLineQuantityInfo=new OrderLineQuantityInfo();
		        orderLineInfo1.orderLineQuantityInfo.quantityValue="2";

		        orderLineInfo1.orderLineShippingMethodInfo=null;
		        orderLineInfo1.orderLineCheckInfo=null;
		        orderLineInfo1.orderLinePayment=null;

		        orderLineInfo1.orderLineOccurrenceInfo=new OrderLineOccurrenceInfo[1];
		        OrderLineOccurrenceInfo orderLineOccurrenceInfo1=new OrderLineOccurrenceInfo();

		        orderLineOccurrenceInfo1.orderLineOccurrenceIdentifierInfo=new OrderLineOccurrenceIdentifierInfo();
		        orderLineOccurrenceInfo1.orderLineOccurrenceIdentifierInfo.orderOccurrenceID="9191f0c5-4518-5h8a-9c22-cd486b398j68";

		        orderLineOccurrenceInfo1.orderLineOccurrencePayment=new OrderLineOccurrencePayment();
		        orderLineOccurrenceInfo1.orderLineOccurrencePayment.pointAmount=0;
		        orderLineOccurrenceInfo1.orderLineOccurrencePayment.dollarAmount=null;
		        orderLineOccurrenceInfo1.orderLineOccurrencePayment.taxAmount=null;

		        orderLineInfo1.orderLineOccurrenceInfo[0]=orderLineOccurrenceInfo1;

		        orderLineInfo1.paymentCardNumber = null;
		        orderLineInfo1.firstName=null;
		        orderLineInfo1.lastName=null;

		        orderShippingInfo1.orderLineInfo[0]=orderLineInfo1;
		        orderCreate.orderInfo.orderShippingInfo[0]=orderShippingInfo1;

		        orderCreate.orderInfo.orderPaymentInfo=new OrderPaymentInfo();
		        orderCreate.orderInfo.orderPaymentInfo.splitPay=false;
		        orderCreate.orderInfo.orderPaymentInfo.pointAmount=0;
		        orderCreate.orderInfo.orderPaymentInfo.dollarAmount=null;
		        orderCreate.orderInfo.orderPaymentInfo.taxAmount=null;
		        orderCreate.orderInfo.orderPaymentInfo.totalFaceValue=null;

		        orderCreate.orderInfo.orderPaymentCard=null;
		        orderCreate.orderInfo.creditCard=null;

		        orderCreate.fraudInfo=null;
		        orderCreate.channelType="WEBSERVICE";
		        orderCreate.version=1;
	}*/
	
	

}
