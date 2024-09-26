package selj.example.meformer.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import selj.example.meformer.data.model.Progress

@Dao
interface ProgressDao {

    @Query("SELECT * FROM progress WHERE studentId = :studentId AND courseId = :courseId")
    suspend fun getProgressByStudentAndCourse(studentId: Int, courseId: Int): Progress?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProgress(progress: Progress)

    @Query("DELETE FROM progress WHERE progressId = :progressId")
    suspend fun deleteProgressById(progressId: Int)
}
