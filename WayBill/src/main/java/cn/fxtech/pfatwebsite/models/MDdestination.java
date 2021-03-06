package cn.fxtech.pfatwebsite.models;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "terminal_destination")
public class MDdestination {
	@Id
	private Integer id;
	private String destination;
	private String dtype;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id == null ? 0 : id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}
}
