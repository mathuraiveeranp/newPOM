package samplemaven.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderCreate {
	
	
	  	@JsonProperty("ClientInfo")
	    ClientInfo clientInfo;

	    @JsonProperty("AccountInfo")
	    AccountInfo accountInfo;

	    @JsonProperty("AccountPointTransferInfo")
	    AccountPointTransferInfo[] accountPointTransferInfo;

	    @JsonProperty("OrderInfo")
	    OrderInfo orderInfo;

	    @JsonProperty("FraudInfo")
	    String fraudInfo;

	    @JsonProperty("ChannelType")
	    String channelType;

	    @JsonProperty("version")
	    int version;
	    
	    public class ClientInfo{
	    	
	    	@JsonProperty("ApplicationCode")
	        String applicationCode;

	        @JsonProperty("PortfolioCode")
	        String portfolioCode;

	        @JsonProperty("SegmentCode")
	        String segmentCode;

	        @JsonProperty("ProgramCode")
	        String programCode;
	    }
	    
	    
	    public class AccountInfo{
	    	@JsonProperty("AccountIdentifierInfo")
	        AccountIdentifierInfo accountIdentifierInfo;

	        @JsonProperty("AccountDemographicInfo")
	        AccountDemographicInfo accountDemographicInfo;

	        @JsonProperty("AccountTestFlagInfo")
	        AccountTestFlagInfo accountTestFlagInfo;
	    }
	    
	    public class AccountIdentifierInfo{
	        @JsonProperty("AccountNumber")
	        String accountNumber;

	        @JsonProperty("SecondaryAccountNumber")
	        String secondaryAccountNumber;

	        @JsonProperty("MemberId")
	        String memberId;
	    }
	    
	    public class AccountDemographicInfo{
	        @JsonProperty("AccountNameInfo")
	        AccountNameInfo accountNameInfo;

	        @JsonProperty("AccountAddressInfo")
	        AccountAddressInfo accountAddressInfo;

	        @JsonProperty("AccountContactInfo")
	        AccountContactInfo accountContactInfo;

	        @JsonProperty("AccountDetailsInfo")
	        String accountDetailsInfo;
	    }
	    
	    public class AccountNameInfo{
	        @JsonProperty("Title")
	        String titleValue;

	        @JsonProperty("FirstName")
	        String firstName;

	        @JsonProperty("MiddleInitial")
	        String middleInitial;

	        @JsonProperty("LastName")
	        String lastName;
	    }

	    public class AccountAddressInfo{
	        @JsonProperty("AddressLine1")
	        String addressLine1;

	        @JsonProperty("AddressLine2")
	        String addressLine2;

	        @JsonProperty("AddressLine3")
	        String addressLine3;

	        @JsonProperty("AddressCity")
	        String addressCity;

	        @JsonProperty("AddressState")
	        String addressState;

	        @JsonProperty("AddressPostalCode")
	        String addressPostalCode;

	        @JsonProperty("AddressCountry")
	        String addressCountry;
	    }

	    public class AccountContactInfo{
	        @JsonProperty("DayPhone")
	        String dayPhone;

	        @JsonProperty("EveningPhone")
	        String eveningPhone;

	        @JsonProperty("MobilePhone")
	        String mobilePhone;

	        @JsonProperty("Email")
	        String emailValue;
	    }

	    public class AccountTestFlagInfo{
	        @JsonProperty("TestAccountFlag")
	        String testAccountFlag;
	    }

	    public class AccountPointTransferInfo{

	    }

	    public class OrderInfo{
	        @JsonProperty("OrderIdentifierInfo")
	        OrderIdentifierInfo orderIdentifierInfo;

	        @JsonProperty("OrderDateTimeInfo")
	        OrderDateTimeInfo orderDateTimeInfo;

	        @JsonProperty("OrderShippingInfo")
	        OrderShippingInfo[] orderShippingInfo;

	        @JsonProperty("OrderPaymentInfo")
	        OrderPaymentInfo orderPaymentInfo;

	        @JsonProperty("OrderPaymentCard")
	        String orderPaymentCard;

	        @JsonProperty("CreditCard")
	        String creditCard;

	    }

	    public class OrderIdentifierInfo{
	        @JsonProperty("OrderId")
	        String orderIdValue;

	        @JsonProperty("SecondaryOrderId")
	        String secondaryOrderId;

	        @JsonProperty("VendorOrderId")
	        String vendorOrderId;
	    }

	    public class OrderDateTimeInfo{
	        @JsonProperty("OrderDateTime")
	        String orderDateTime;
	    }

	    public class OrderShippingInfo{
	        @JsonProperty("DemographicsInfo")
	        DemographicsInfo demographicsInfo;

	        @JsonProperty("OrderGiftInfo")
	        String orderGiftInfo;

	        @JsonProperty("OrderLanguageInfo")
	        String orderLanguageInfo;

	        @JsonProperty("OrderLineInfo")
	        OrderLineInfo[] orderLineInfo;
	    }

	    public class DemographicsInfo{
	        @JsonProperty("OrderNameInfo")
	        OrderNameInfo orderNameInfo;

	        @JsonProperty("OrderShippingAddressInfo")
	        OrderShippingAddressInfo orderShippingAddressInfo;

	        @JsonProperty("OrderContactInfo")
	        OrderContactInfo orderContactInfo;


	    }

	    public class OrderNameInfo{
	        @JsonProperty("FirstName")
	        String firstName;

	        @JsonProperty("MiddleInitial")
	        String middleInitial;

	        @JsonProperty("LastName")
	        String lastName;
	    }

	    public class OrderShippingAddressInfo{
	        @JsonProperty("AddressLine1")
	        String addressLine1;

	        @JsonProperty("AddressLine2")
	        String addressLine2;

	        @JsonProperty("AddressLine3")
	        String addressLine3;

	        @JsonProperty("AddressCity")
	        String addressCity;

	        @JsonProperty("AddressState")
	        String addressState;

	        @JsonProperty("AddressPostalCode")
	        String addressPostalCode;

	        @JsonProperty("AddressCountry")
	        String addressCountry;

	        @JsonProperty("ShipCompanyName")
	        String shipCompanyName;
	    }

	    public class OrderContactInfo{
	        @JsonProperty("ContactPhone")
	        String contactPhone;

	        @JsonProperty("MobilePhone")
	        String mobilePhone;

	        @JsonProperty("Email")
	        String emailValue;
	    }

	    public class OrderLineInfo{
	        @JsonProperty("OrderLineIdentifierInfo")
	        OrderLineIdentifierInfo orderLineIdentifierInfo;

	        @JsonProperty("OrderLineSKUInfo")
	        OrderLineSKUInfo orderLineSKUInfo;

	        @JsonProperty("OrderLineQuantityInfo")
	        OrderLineQuantityInfo orderLineQuantityInfo;

	        @JsonProperty("OrderLineShippingMethodInfo")
	        String orderLineShippingMethodInfo;

	        @JsonProperty("OrderLineCheckInfo")
	        String orderLineCheckInfo;

	        @JsonProperty("OrderLinePayment")
	        String orderLinePayment;

	        @JsonProperty("OrderLineOccurrenceInfo")
	        OrderLineOccurrenceInfo[] orderLineOccurrenceInfo;

	        @JsonProperty("PaymentCardNumber")
	        String paymentCardNumber;

	        @JsonProperty("FirstName")
	        String firstName;

	        @JsonProperty("LastName")
	        String lastName;
	    }

	    public class OrderLineIdentifierInfo{
	        @JsonProperty("OrderLineID")
	        String orderLineID;
	    }

	    public class OrderLineSKUInfo{
	        @JsonProperty("SKUID")
	        String skuID;

	        @JsonProperty("SKUDescription")
	        String skuDescription;

	        @JsonProperty("SKUValue")
	        String skuValue;
	    }

	    public class OrderLineQuantityInfo{
	        @JsonProperty("Quantity")
	        String quantityValue;
	    }

	    public class OrderLineOccurrenceInfo{
	        @JsonProperty("OrderLineOccurrenceIdentifierInfo")
	        OrderLineOccurrenceIdentifierInfo orderLineOccurrenceIdentifierInfo;

	        @JsonProperty("OrderLineOccurrencePayment")
	        OrderLineOccurrencePayment orderLineOccurrencePayment;
	    }

	    public class OrderLineOccurrenceIdentifierInfo{
	        @JsonProperty("OrderOccurrenceID")
	        String orderOccurrenceID;
	    }

	    public class OrderLineOccurrencePayment{
	        @JsonProperty("PointAmount")
	        int pointAmount;

	        @JsonProperty("DollarAmount")
	        String dollarAmount;

	        @JsonProperty("TaxAmount")
	        String taxAmount;
	    }

	    public class OrderPaymentInfo{
	        @JsonProperty("SplitPay")
	        boolean splitPay;

	        @JsonProperty("PointAmount")
	        int pointAmount;

	        @JsonProperty("DollarAmount")
	        String dollarAmount;

	        @JsonProperty("TaxAmount")
	        String taxAmount;

	        @JsonProperty("TotalFaceValue")
	        String totalFaceValue;
	    }
}
