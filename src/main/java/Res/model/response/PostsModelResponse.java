package Res.model.response;

import Res.enums.PostsStatusEnum;
import Res.model.BaseModel;

public class PostsModelResponse extends BaseModel {
	private String title;
	private String content;
	private PostsStatusEnum status;
	private String banner;
	private Long categoryId;
	private String categoryName;

	public PostsModelResponse() {
		super();
	}

	public PostsModelResponse(String title, String content, PostsStatusEnum status, String banner, Long categoryId) {
		super();
		this.title = title;
		this.content = content;
		this.status = status;
		this.banner = banner;
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public PostsStatusEnum getStatus() {
		return status;
	}

	public void setStatus(PostsStatusEnum status) {
		this.status = status;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
