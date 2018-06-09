package com.bzh.dytt.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.support.annotation.VisibleForTesting
import com.bzh.dytt.vo.CategoryMap
import com.bzh.dytt.vo.CategoryPage
import com.bzh.dytt.vo.VideoDetail

@Database(
        entities = [VideoDetail::class, CategoryMap::class, CategoryPage::class],
        version = 4
)
@TypeConverters(DataTypeConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun videoDetailDAO(): VideoDetailDAO

    abstract fun categoryMapDAO(): CategoryMapDAO

    abstract fun categoryPageDAO(): CategoryPageDAO

    companion object {
        @VisibleForTesting
        val DATABASE_NAME = "dytt-data.db"
    }
}
