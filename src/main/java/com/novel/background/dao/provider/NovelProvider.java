package com.novel.background.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.novel.background.pojo.Novel;

/**
 * 生产动态sql
 * 
 * @author huayanh
 *
 */
public class NovelProvider {

	public String select(Novel novel) {
		return new SQL() {
			{
				SELECT("*");
				FROM("novel");
				if (novel.getId() != null) {
					WHERE("id=#{id}");
				}
				if (novel.getPath() != null) {
					WHERE("path=#{path}");
				}
				if (novel.getName() != null) {
					WHERE("name=#{name}");
				}
				if (novel.getAuthor() != null) {
					WHERE("author=#{author}");
				}
				if (novel.getTypeName() != null) {
					WHERE("typeName=#{typeName}");
				}
				if (novel.getDescription() != null) {
					WHERE("description=#{description}");
				}
				if (novel.getMainImage() != null) {
					WHERE("mainImage=#{mainImage}");
				}
				if (novel.getCreateTime() != null) {
					WHERE("createTime=#{createTime}");
				}
				if (novel.getUpdateTime() != null) {
					WHERE("updateTime=#{updateTime}");
				}
				if (novel.getUpdateTime() != null) {
					WHERE("updateTime=#{updateTime}");
				}
				if (novel.getClickView() != null) {
					WHERE("clickView=#{clickView}");
				}
				if (novel.getStatus() != null) {
					WHERE("status=#{status}");
				}
				if (novel.getDisplay() != null) {
					WHERE("display=#{display}");
				}
			}
		}.toString();
	}
}
