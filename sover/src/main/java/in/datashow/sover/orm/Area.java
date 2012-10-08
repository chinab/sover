package in.datashow.sover.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Index;

/**
 * 地区
 * 
 * @author yangyan
 * 
 */
@Entity
@Table
public class Area {
	private int id;
	private String name;

	@Column(name = "area_id")
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "area_name", nullable = false)
	@Index(name = "index__area_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
