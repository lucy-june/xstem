/*******************************************************************************
 * Copyright (c) 2018-2026 lucywu.com
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucy Wu - initial API and implementation
 *******************************************************************************/

package com.lucywu.xstem.entities;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Siva
 *
 */
public class TestPost
{
	private Integer id;
	private String title;
	private String content;
	private Timestamp createdOn;
	private List<TestComment> comments = new ArrayList<>();
	
	public TestPost()
	{
	}

	public TestPost(Integer postId)
	{
		this.id = postId;
	}
	
	public TestPost(Integer id, String title, String content, Timestamp createdOn)
	{
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.createdOn = createdOn;
	}

	@Override
	public String toString()
	{
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", createdOn=" + createdOn + "]";
	}

	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	public Timestamp getCreatedOn()
	{
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn)
	{
		this.createdOn = createdOn;
	}
	public List<TestComment> getComments()
	{
		return comments;
	}
	public void setComments(List<TestComment> comments)
	{
		this.comments = comments;
	}
	public void addComment(TestComment comment)
	{
		comment.setPost(this);
		this.comments.add(comment);
	}
	
}
