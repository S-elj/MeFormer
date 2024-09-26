package selj.example.meformer.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import selj.example.meformer.data.model.Enrollment

@Dao
interface EnrollmentDao {

    @Query("SELECT * FROM enrollments WHERE studentId = :studentId")
    suspend fun getEnrollmentsByStudentId(studentId: Int): List<Enrollment>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEnrollment(enrollment: Enrollment)

    @Query("DELETE FROM enrollments WHERE enrollmentId = :enrollmentId")
    suspend fun deleteEnrollmentById(enrollmentId: Int)
}
