package in.datashow.sover.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 抓取源原始分类
 * 
 * @author YY
 * 
 */
@Table(name = "native_catagory")
@Entity
public class NativeCatagory {
	private String uuid;
	private Category category;
	private String nativeName;
	private String nativeId;
	private VideoFetchSource fetchSource;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(strategy = "uuid", name = "system-uuid")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@ManyToOne(optional = true)
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(nullable = false)
	public String getNativeName() {
		return nativeName;
	}

	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}

	public String getNativeId() {
		return nativeId;
	}

	public void setNativeId(String nativeId) {
		this.nativeId = nativeId;
	}

	@ManyToOne(optional = false)
	public VideoFetchSource getFetchSource() {
		return fetchSource;
	}

	public void setFetchSource(VideoFetchSource fetchSource) {
		this.fetchSource = fetchSource;
	}

}
