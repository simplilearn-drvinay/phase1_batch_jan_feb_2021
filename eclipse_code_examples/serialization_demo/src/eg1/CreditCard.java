package eg1;

import java.io.Serializable;

public class CreditCard implements Serializable{

	/**
	 * 
	 */
	
	private long ccNumber;
	private String cardHolderName;
	private String cardType;
	private transient int cvv;
	//private String fanName;
	
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	public CreditCard(long ccNumber, String cardHolderName, String cardType, int cvv) {
		this.ccNumber = ccNumber;
		this.cardHolderName = cardHolderName;
		this.cardType = cardType;
		this.cvv = cvv;
	}

	public long getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(long ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
//	
//	@Override
//	public String toString() {
//		return "hello "+cardHolderName;
//	}

	@Override
	public String toString() {
		return "CreditCard [ccNumber=" + ccNumber + ", cardHolderName=" + cardHolderName + ", cardType=" + cardType
				+ ", cvv=" + cvv + "]";
	}
}
