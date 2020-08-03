package com.assess15.arch_paging3.paging3_room.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class Article(
    val curPage: Int,
    val datas: List<DataList>,
    val offset: Int,
    val over: Boolean,
    val pageCount: Int,
    val size: Int,
    val total: Int
)

//@Entity(tableName = "article")
data class DataList(
//    @PrimaryKey val id: Int,
//    @ColumnInfo(name = "title") val title: String,

    val id: Int,
    val title: String,

    val apkLink: String,
    val audit: Int,
    val author: String,
    val canEdit: Boolean,
    val chapterId: Int,
    val chapterName: String,
    val collect: Boolean,
    val courseId: Int,
    val desc: String,
    val descMd: String,
    val envelopePic: String,
    val fresh: Boolean,
    val link: String,
    val niceDate: String,
    val niceShareDate: String,
    val origin: String,
    val prefix: String,
    val projectLink: String,
    val publishTime: Long,
    val realSuperChapterId: Int,
    val selfVisible: Int,
    val shareDate: Long,
    val shareUser: String,
    val superChapterId: Int,
    val superChapterName: String,
    val tags: List<Tag>,
    val type: Int,
    val userId: Int,
    val visible: Int,
    val zan: Int
)

data class Tag(
    val name: String,
    val url: String
)