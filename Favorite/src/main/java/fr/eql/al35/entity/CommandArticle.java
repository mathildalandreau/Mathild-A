package fr.eql.al35.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class CommandArticle implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name = "size_label")
	private Size size;
	
	@ManyToOne
	@JoinColumn(name = "command_id")
	private Command command;
	
	@ManyToOne
	@JoinColumn(name = "article_reference")
	private Article article;
	
	@Override
	public String toString() {
		return "ArticleOrdered [id=" + id + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
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
		CommandArticle other = (CommandArticle) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}

	public CommandArticle(Integer quantity, Article article) {
		super();
		this.quantity = quantity;
		this.article = article;
	}
}
