package com.novel.background.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import com.novel.background.dao.provider.NovelChapterListProvider;
import com.novel.background.pojo.NovelChapterList;

@Mapper
@Repository
public interface NovelChapterListDao {

	@Insert("insert into novelchapterlist(novelId,chapterName,chapterLink) values(#{novelId},#{chapterName},#{chapterLink})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public void addNovelChapterList(NovelChapterList novelChapterList);

	@SelectProvider(type = NovelChapterListProvider.class, method = "select")
	public List<NovelChapterList> selectNovelChapterList(NovelChapterList chapterList);
}