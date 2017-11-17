package cn.com.sinosoft.demo.domain.db;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 宠物
 * 
 * @author lizhiyong
 */
@Entity
@Table(name = "t_pet")
public class Pet implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;

	/**
	 * 父id
	 */
	private Long parId;

	/**
	 * 编号
	 */
	@Column(length = 20, unique = true, nullable = false)
	@NotEmpty
	private String no;

	/**
	 * 英文名
	 */
	@Column(length = 100, unique = true, nullable = false)
	@NotEmpty
	private String nameEn;

	/**
	 * 中文名
	 */
	@Column(length = 100, unique = true, nullable = false)
	@NotEmpty
	private String nameZhcn;

	/**
	 * 描述
	 */
	@Column(length = 500)
	private String description;

	/**
	 * JsonIgnore 不返回信息
	 */
	@Column(length = 100)
	@JsonIgnore
	private String privateInfo;

	/**
	 * 照片
	 */
	@Lob
	@Column(name = "photo")
	private Serializable photo;

	@Transient
	private int tempValue;

	/**
	 * 孩子
	 */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "parId")
	private Collection<Pet> children;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getPrivateInfo() {
		return privateInfo;
	}

	public void setPrivateInfo(String privateInfo) {
		this.privateInfo = privateInfo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Serializable getPhoto() {
		return photo;
	}

	public void setPhoto(Serializable photo) {
		this.photo = photo;
	}

	public String getNameZhcn() {
		return nameZhcn;
	}

	public void setNameZhcn(String nameZhcn) {
		this.nameZhcn = nameZhcn;
	}

	public Collection<Pet> getChildren() {
		return children;
	}

	public void setChildren(Collection<Pet> children) {
		this.children = children;
	}

	public int getTempValue() {
		return tempValue;
	}

	public void setTempValue(int tempValue) {
		this.tempValue = tempValue;
	}

	public Long getParId() {
		return parId;
	}

	public void setParId(Long parId) {
		this.parId = parId;
	}

}
