package by.training.filmstore.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Comment implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8463944439900884800L;
	private int id;
	private String userEmail;
	private short filmId;
	private String content;
	private Timestamp date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public short getFilmId() {
		return filmId;
	}
	public void setFilmId(short filmId) {
		this.filmId = filmId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + filmId;
		result = prime * result + id;
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
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
		Comment other = (Comment) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (filmId != other.filmId)
			return false;
		if (id != other.id)
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", userEmail=" + userEmail + ", filmId=" + filmId + ", content=" + content
				+ ", date=" + date + "]";
	}
	
}
