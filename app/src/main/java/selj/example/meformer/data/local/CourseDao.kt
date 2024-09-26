package selj.example.meformer.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import selj.example.meformer.data.model.Course

@Dao
interface CourseDao {

    @Query("SELECT * FROM courses WHERE courseId = :courseId")
    suspend fun getCourseById(courseId: Int): Course?

    @Query("SELECT * FROM courses WHERE subject = :subject")
    suspend fun getCoursesBySubject(subject: String): List<Course>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCourse(course: Course)

    @Query("DELETE FROM courses WHERE courseId = :courseId")
    suspend fun deleteCourseById(courseId: Int)
}
