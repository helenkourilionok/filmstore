package by.training.filmstore.entity;

import java.io.Serializable;
import java.util.Date;

public class VerificationToken implements Serializable{
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 7433205547692671031L;
	
	private Long id;
    private String userEmail;
    private String token;
    private Date expiryDate;
    private Boolean verified;
 
    public VerificationToken() {
        super();
    }
    public VerificationToken(String userEmail,String token,Date expiryDate,Boolean verified) {
        super();
        this.token = token;
        this.userEmail = userEmail;
        this.expiryDate = expiryDate;
        this.verified = verified;
    }
 
    
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Boolean isVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((verified == null) ? 0 : verified.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VerificationToken other = (VerificationToken) obj;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (verified == null) {
			if (other.verified != null)
				return false;
		} else if (!verified.equals(other.verified))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "VerificationToken [id=" + id + ", userEmail=" + userEmail + ", token=" + token + ", expiryDate="
				+ expiryDate + ", verified=" + verified + "]";
	}

}
